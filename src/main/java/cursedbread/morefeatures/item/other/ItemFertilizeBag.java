package cursedbread.morefeatures.item.other;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntityActivator;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemQuiver;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.player.inventory.slot.Slot;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.*;
import net.minecraft.core.world.season.Seasons;
import net.minecraft.core.world.type.WorldTypes;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Random;

import static net.minecraft.core.block.BlockLogicLeavesCacao.getGrowthRate;
import static net.minecraft.core.block.BlockLogicLeavesCacao.setGrowthRate;

public class ItemFertilizeBag extends ItemQuiver {
	public ItemFertilizeBag(String name, String namespaceId, int id) {
		super(name, namespaceId, id);
		this.setMaxStackSize(1);
		this.setMaxDamage(192);
	}

	@Override
	public boolean hasInventoryInteraction() {
		return true;
	}

	@Override
	public ItemStack onInventoryInteract(Player player, Slot slot, ItemStack stackInSlot, boolean isItemGrabbed) {
		ItemStack bagItem;
		if (isItemGrabbed) {
			bagItem = player.inventory.getHeldItemStack();
		} else {
			bagItem = stackInSlot;
		}

		int totalSpace = this.getMaxDamage();
		int boneMealCount = this.getboneMealCount(bagItem);
		int freeSpace = totalSpace - boneMealCount;
		if (isItemGrabbed) {
			int amount;
			if (stackInSlot == null) {
				amount = Math.min(64, boneMealCount);
				if (amount > 0) {
					ItemStack bombStack = new ItemStack(Items.DYE, amount, 15);
					if (slot.mayPlace(bombStack)) {
						this.setboneMealCount(bagItem, boneMealCount - amount);
						stackInSlot = bombStack;
					}
				}
			} else if (stackInSlot != null && stackInSlot.itemID == Items.DYE.id) {
				amount = Math.min(freeSpace, stackInSlot.stackSize);
				if (amount > 0) {
					this.setboneMealCount(bagItem, boneMealCount + amount);
					stackInSlot.stackSize -= amount;
				}
			}
		} else {
			ItemStack grabbedItem = player.inventory.getHeldItemStack();
			int amount;
			if (grabbedItem != null && grabbedItem.itemID == Items.DYE.id) {
				amount = Math.min(grabbedItem.stackSize, freeSpace);
				if (amount > 0) {
					grabbedItem.stackSize -= amount;
					this.setboneMealCount(bagItem, boneMealCount + amount);
					if (grabbedItem.stackSize <= 0) {
						player.inventory.setHeldItemStack((ItemStack)null);
					}
				}
			} else if (grabbedItem == null) {
				amount = Math.min(64, boneMealCount);
				if (amount > 0) {
					this.setboneMealCount(bagItem, boneMealCount - amount);
					player.inventory.setHeldItemStack(new ItemStack(Items.DYE, amount, 15));
				}
			}
		}

		return stackInSlot;
	}

	private int getboneMealCount(ItemStack stack) {
		return stack.getMaxDamage() - stack.getMetadata();
	}

	private void setboneMealCount(ItemStack stack, int count) {
		stack.setMetadata(stack.getMaxDamage() - count);
	}

	@Override
	public boolean showFullDurability() {
		return true;
	}

	public void onUseByActivator(ItemStack itemStack, TileEntityActivator activatorBlock, World world, Random random, int blockX, int blockY, int blockZ, double offX, double offY, double offZ, Direction direction) {
		this.onUseItemOnBlock(itemStack, (Player)null, world, blockX + direction.getOffsetX(), blockY + direction.getOffsetY(), blockZ + direction.getOffsetZ(), direction.getSide(), 0.5, 0.5);
	}

	public boolean onUseItemOnBlock(ItemStack itemstack, @Nullable Player player, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		//normal blocks
		assert player != null;
		int times = 0;
		for (int addx = -1; addx < 2; addx++){
			for (int addz = -1; addz < 2; addz++){
				if (Objects.requireNonNull(player.getHeldItem()).getMetadata() < 192) {
					int id = world.getBlockId(blockX + addx, blockY, blockZ + addz);
					int j1;
					if (id == Blocks.DIRT.id()) {
						if (!world.isClientSide && Blocks.lightBlock[world.getBlockId(blockX, blockY + 1, blockZ)] <= 2) {
							j1 = Blocks.GRASS.id();
							if (world.dimensionData.getWorldType() == WorldTypes.OVERWORLD_RETRO) {
								j1 = Blocks.GRASS_RETRO.id();
							}

							if ((world.getBlockId(blockX + addx, blockY+1, blockZ + addz) == 0 ||
								!world.getBlock(blockX + addx, blockY+1, blockZ + addz).blocksLight())){
								world.setBlockWithNotify(blockX + addx, blockY, blockZ + addz, j1);
								if (player.getGamemode().consumeBlocks()) {
									player.getHeldItem().damageItem(1, player);
								}
							}
						}
						times++;
					}


					else if (id == Blocks.DIRT_SCORCHED.id()) {
						if (!world.isClientSide && Blocks.lightBlock[world.getBlockId(blockX, blockY + 1, blockZ)] <= 2) {
							j1 = Blocks.GRASS_SCORCHED.id();
							if ((world.getBlockId(blockX + addx, blockY+1, blockZ + addz) == 0 ||
								!world.getBlock(blockX + addx, blockY+1, blockZ + addz).blocksLight())){
								world.setBlockWithNotify(blockX + addx, blockY, blockZ + addz, j1);
								if (player.getGamemode().consumeBlocks()) {
									player.getHeldItem().damageItem(1, player);
								}
							}
						}
						times++;
					}


					else if (Blocks.blocksList[id] != null && Blocks.blocksList[id].hasTag(BlockTags.GROWS_FLOWERS)) {
						if (!world.isClientSide) {
							if (player == null || player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}

							label169:
							for(j1 = 0; j1 < 128; ++j1) {
								int k1 = blockX + addx;
								int l1 = blockY + 1;
								int i2 = blockZ + addz;

								int r;
								for(r = 0; r < j1 / 16; ++r) {
									k1 += itemRand.nextInt(3) - 1;
									l1 += (itemRand.nextInt(3) - 1) * itemRand.nextInt(3) / 2;
									i2 += itemRand.nextInt(3) - 1;
									int id1 = world.getBlockId(k1, l1 - 1, i2);
									if (Blocks.blocksList[id1] == null || !Blocks.blocksList[id1].hasTag(BlockTags.GROWS_FLOWERS)) {
										continue label169;
									}
								}

								if (world.getBlockId(k1, l1, i2) == 0) {
									if (itemRand.nextInt(10) != 0) {
										if (world.getBlockId(k1, l1 - 1, i2) != Blocks.DIRT_SCORCHED.id() && world.getBlockId(k1, l1 - 1, i2) != Blocks.DIRT_SCORCHED_RICH.id()) {
											world.setBlockWithNotify(k1, l1, i2, Blocks.TALLGRASS.id());
										} else {
											world.setBlockWithNotify(k1, l1, i2, Blocks.SPINIFEX.id());
										}
									} else {
										r = itemRand.nextInt(12);
										Biome biome = world.getBlockBiome(k1, l1, i2);
										if (r < 1) {
											world.setBlockWithNotify(k1, l1, i2, Blocks.FLOWER_YELLOW.id());
										} else if (r < 2) {
											world.setBlockWithNotify(k1, l1, i2, Blocks.FLOWER_RED.id());
										} else if (r < 4 && (biome == Biomes.OVERWORLD_BIRCH_FOREST || biome == Biomes.OVERWORLD_SEASONAL_FOREST)) {
											world.setBlockWithNotify(k1, l1, i2, Blocks.FLOWER_PINK.id());
										} else if (r < 6 && (biome == Biomes.OVERWORLD_MEADOW || biome == Biomes.OVERWORLD_BOREAL_FOREST || biome == Biomes.OVERWORLD_SHRUBLAND)) {
											world.setBlockWithNotify(k1, l1, i2, Blocks.FLOWER_PURPLE.id());
										} else if (r >= 8 || biome != Biomes.OVERWORLD_FOREST && biome != Biomes.OVERWORLD_SWAMPLAND && biome != Biomes.OVERWORLD_RAINFOREST && biome != Biomes.OVERWORLD_GRASSLANDS && biome != Biomes.OVERWORLD_CAATINGA) {
											if (r < 10 && (biome == Biomes.OVERWORLD_PLAINS || biome == Biomes.OVERWORLD_GRASSLANDS || biome == Biomes.OVERWORLD_OUTBACK || biome == Biomes.OVERWORLD_OUTBACK_GRASSY)) {
												world.setBlockWithNotify(k1, l1, i2, Blocks.FLOWER_ORANGE.id());
											}
										} else {
											world.setBlockWithNotify(k1, l1, i2, Blocks.FLOWER_LIGHT_BLUE.id());
										}
									}
								}
							}
						}
						times++;
					}


					//crops
					else if (id == Blocks.CROPS_WHEAT.id()){
						if (world.getBlockMetadata(blockX + addx, blockY, blockZ + addz) >= 7) {
							return false;
						} else {
							if (!world.isClientSide) {
								world.setBlockMetadataWithNotify(blockX + addx, blockY, blockZ + addz, 7);
								if (player == null || player.getGamemode().consumeBlocks()) {
									player.getHeldItem().damageItem(1, player);
								}
							}

							times++;
						}
					}


					else if (id == Blocks.CROPS_PUMPKIN.id()){
						if (world.getBlockMetadata(blockX + addx, blockY, blockZ + addz) >= 5) {
							return false;
						} else {
							if (!world.isClientSide) {
								world.setBlockWithNotify(blockX + addx, blockY, blockZ + addz, Blocks.PUMPKIN.id());
								if (player == null || player.getGamemode().consumeBlocks()) {
									player.getHeldItem().damageItem(1, player);
								}
							}

							times++;
						}
					}


					else if (id == FeaturesBlocks.fluxCropws.id()){
						if (world.getBlockMetadata(blockX + addx, blockY, blockZ + addz) >= 7) {
							return false;
						} else {
							if (!world.isClientSide) {
								world.setBlockMetadataWithNotify(blockX + addx, blockY, blockZ + addz, 7);
								if (player == null || player.getGamemode().consumeBlocks()) {
									player.getHeldItem().damageItem(1, player);
								}
							}

							times++;
						}
					}


					//leaves
					else if (id == Blocks.LEAVES_CACAO.id()){
						int meta = world.getBlockMetadata(blockX + addx, blockY, blockZ + addz);
						if (getGrowthRate(meta) >= 4) {
							return false;
						} else {
							if (!world.isClientSide) {
								if (world.getSeasonManager().getCurrentSeason() != Seasons.OVERWORLD_SUMMER) {
									times++;
								}

								world.setBlockMetadataWithNotify(blockX + addx, blockY, blockZ + addz, setGrowthRate(meta, 4));
								if (player == null || player.getGamemode().consumeBlocks()) {
									player.getHeldItem().damageItem(1, player);
								}
							}

							times++;
						}
					}


					else if (id == Blocks.LEAVES_CHERRY_FLOWERING.id()){
						int meta = world.getBlockMetadata(blockX + addx, blockY, blockZ + addz);
						if (getGrowthRate(meta) != 0) {
							return false;
						} else {
							if (!world.isClientSide) {
								if (world.getSeasonManager().getCurrentSeason() != Seasons.OVERWORLD_SPRING) {
									times++;
								}

								world.setBlockMetadataWithNotify(blockX + addx, blockY, blockZ + addz, setGrowthRate(meta, 1));
								if (player == null || player.getGamemode().consumeBlocks()) {
									player.getHeldItem().damageItem(1, player);
								}
							}

							times++;
						}
					}


					//plant blocks
					else if (id == Blocks.CACTUS.id()){
						if (!world.isClientSide) {
							int l;
							for(l = 1; world.getBlockId(blockX + addx, blockY + l, blockZ + addz) == Blocks.CACTUS.id(); ++l) {
							}

							if (world.isAirBlock(blockX + addx, blockY + l, blockZ + addz)) {
								world.setBlockWithNotify(blockX + addx, blockY + l, blockZ + addz, Blocks.CACTUS.id());
							}
							if (player == null || player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}
						}

						times++;
					}


					else if (id == Blocks.SUGARCANE.id()){
						if (!world.isClientSide) {
							int l;
							for(l = 1; world.getBlockId(blockX + addx, blockY + l, blockZ + addz) == Blocks.SUGARCANE.id(); ++l) {
							}

							if (world.isAirBlock(blockX + addx, blockY + l, blockZ + addz)) {
								world.setBlockWithNotify(blockX + addx, blockY + l, blockZ + addz, Blocks.SUGARCANE.id());
							}
							if (player == null || player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}
						}

						times++;
					}


					//multiple blocks with one blocklogic
					else if (world.getBlockLogic(blockX + addx, blockY, blockZ + addz, BlockLogicFlowerStackable.class) != null){
						Random rand = world.rand;
						if (!world.isClientSide) {
							if (player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}

							label38:
							for(j1 = 0; j1 < 128; ++j1) {
								int k1 = blockX + addx;
								int l1 = blockY;
								int i2 = blockZ + addz;

								for(int j2 = 0; j2 < j1 / 16; ++j2) {
									k1 += rand.nextInt(3) - 1;
									l1 += (rand.nextInt(3) - 1) * rand.nextInt(3) / 2;
									i2 += rand.nextInt(3) - 1;
									int id1 = world.getBlockId(k1, l1 - 1, i2);
									if (Blocks.blocksList[id1] == null || !Blocks.blocksList[id1].hasTag(BlockTags.GROWS_FLOWERS)) {
										continue label38;
									}
								}

								if (world.getBlockId(k1, l1, i2) == 0 && (double)rand.nextFloat() > 0.75) {
									world.setBlockWithNotify(k1, l1, i2, world.getBlockId(blockX + addx, blockY, blockZ + addz));
								}
							}

							times++;
						}
					}


					else if (world.getBlockLogic(blockX + addx, blockY, blockZ + addz, BlockLogicMoss.class) != null){
						if (!world.isClientSide) {
							if (player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}

							for(j1 = 0; j1 < 32; ++j1) {
								int k1 = blockX + addx;
								int l1 = blockY;
								int i2 = blockZ + addz;

								int blockId;
								for(blockId = 0; blockId < j1 / 16; ++blockId) {
									k1 += world.rand.nextInt(3) - 1;
									l1 += (world.rand.nextInt(3) - 1) * world.rand.nextInt(3) / 2;
									i2 += world.rand.nextInt(3) - 1;
								}

								if (!Block.isBuried(world, k1, l1, i2) && world.getBlockLightValue(k1, l1 + 1, i2) <= 5 && world.getBlockLightValue(k1, l1 - 1, i2) <= 5 && world.getBlockLightValue(k1 + 1, l1, i2) <= 5 && world.getBlockLightValue(k1 - 1, l1, i2) <= 5 && world.getBlockLightValue(k1, l1, i2 - 1) <= 5 && world.getBlockLightValue(k1, l1, i2 + 1) <= 5) {
									blockId = world.getBlockId(k1, l1, i2);
									if (blockId == Blocks.STONE.id()) {
										world.setBlockWithNotify(k1, l1, i2, Blocks.MOSS_STONE.id());
									} else if (blockId == Blocks.LIMESTONE.id()) {
										world.setBlockWithNotify(k1, l1, i2, Blocks.MOSS_LIMESTONE.id());
									} else if (blockId == Blocks.GRANITE.id()) {
										world.setBlockWithNotify(k1, l1, i2, Blocks.MOSS_GRANITE.id());
									} else if (blockId == Blocks.BASALT.id()) {
										world.setBlockWithNotify(k1, l1, i2, Blocks.MOSS_BASALT.id());
									} else if (blockId == Blocks.COBBLE_STONE.id()) {
										world.setBlockWithNotify(k1, l1, i2, Blocks.COBBLE_STONE_MOSSY.id());
									} else if (blockId == Blocks.BRICK_STONE_POLISHED.id()) {
										world.setBlockWithNotify(k1, l1, i2, Blocks.BRICK_STONE_POLISHED_MOSSY.id());
									} else if (blockId == Blocks.LOG_OAK.id()) {
										world.setBlockWithNotify(k1, l1, i2, Blocks.LOG_OAK_MOSSY.id());
									}
								}
							}
						}

						times++;
					}


					//saplings
					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_OAK.id()){
						if (!world.isClientSide) {
							WorldFeature treeBig = new WorldFeatureTreeFancy(Blocks.LEAVES_OAK.id(), Blocks.LOG_OAK.id());
							WorldFeature treeSmall = new WorldFeatureTree(Blocks.LEAVES_OAK.id(), Blocks.LOG_OAK.id(), 4);
							world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
							if (!((WorldFeature)treeSmall).place(world, world.rand, blockX + addx, blockY, blockZ + addz) && !((WorldFeature)treeBig).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
								world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_OAK.id());
							}
							if (player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}
						}

						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_BIRCH.id()){
						if (!world.isClientSide) {
							WorldFeature treeBig = new WorldFeatureTreeFancy(Blocks.LEAVES_BIRCH.id(), Blocks.LOG_BIRCH.id());
							WorldFeature treeSmall = new WorldFeatureTree(Blocks.LEAVES_BIRCH.id(), Blocks.LOG_BIRCH.id(), 5);
							world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
							if (!((WorldFeature)treeSmall).place(world, world.rand, blockX + addx, blockY, blockZ + addz) && !((WorldFeature)treeBig).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
								world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_BIRCH.id());
							}
							if (player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}
						}

						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_CACAO.id()){
						if (!world.isClientSide) {
							WorldFeature treeBig = new WorldFeatureTreeFancy(Blocks.LEAVES_CACAO.id(), Blocks.LOG_OAK_MOSSY.id());
							WorldFeature treeSmall = new WorldFeatureTree(Blocks.LEAVES_CACAO.id(), Blocks.LOG_OAK_MOSSY.id(), 4);
							world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
							if (!((WorldFeature)treeSmall).place(world, world.rand, blockX + addx, blockY, blockZ + addz) && !((WorldFeature)treeBig).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
								world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_CACAO.id());
							}
							if (player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}
						}

						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_CHERRY.id()){
						if (!world.isClientSide) {
							WorldFeature treeBig = new WorldFeatureTreeFancy(Blocks.LEAVES_CHERRY.id(), Blocks.LOG_CHERRY.id());
							WorldFeature treeSmall = new WorldFeatureTree(Blocks.LEAVES_CHERRY.id(), Blocks.LOG_CHERRY.id(), 4);
							world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
							if (!((WorldFeature)treeSmall).place(world, world.rand, blockX + addx, blockY, blockZ + addz) && !((WorldFeature)treeBig).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
								world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_CHERRY.id());
							}
							if (player.getGamemode().consumeBlocks()) {
								player.getHeldItem().damageItem(1, player);
							}
						}
						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_EUCALYPTUS.id()){
						world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
						WorldFeature tree = new WorldFeatureTreeEucalyptus(Blocks.LEAVES_EUCALYPTUS.id(), Blocks.LOG_EUCALYPTUS.id());
						((WorldFeature)tree).init(1.0, 1.0, 1.0);
						if (!((WorldFeature)tree).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
							world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_EUCALYPTUS.id());
						}

						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_PALM.id()){
						boolean big = world.getBlockId(blockX + addx, blockY - 1, blockZ + addz) != Blocks.SAND.id();
						(new WorldFeatureTreePalm(Blocks.LOG_PALM, Blocks.LEAVES_PALM, big, true, false)).place(world, world.rand, blockX + addx, blockY, blockZ + addz);

						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_PINE.id()){
						WorldFeature treeBig = new WorldFeatureTreeTaigaTall(Blocks.LEAVES_PINE.id(), Blocks.LOG_PINE.id());
						WorldFeature treeSmall = new WorldFeatureTreeTaigaBushy(Blocks.LEAVES_PINE.id(), Blocks.LOG_PINE.id());
						world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
						if (!((WorldFeature)treeSmall).place(world, world.rand, blockX + addx, blockY, blockZ + addz) && !((WorldFeature)treeBig).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
							world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_PINE.id());
						}
						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_OAK_RETRO.id()){
						WorldFeature treeBig = new WorldFeatureTreeFancy(Blocks.LEAVES_OAK_RETRO.id(), Blocks.LOG_OAK.id());
						WorldFeature treeSmall = new WorldFeatureTree(Blocks.LEAVES_OAK_RETRO.id(), Blocks.LOG_OAK.id(), 4);
						world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
						if (!((WorldFeature)treeSmall).place(world, world.rand, blockX + addx, blockY, blockZ + addz) && !((WorldFeature)treeBig).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
							world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_OAK_RETRO.id());
						}
						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_SHRUB.id()){
						world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
						WorldFeature tree = new WorldFeatureTreeShrub(Blocks.LEAVES_SHRUB.id(), Blocks.LOG_OAK.id());
						if (!((WorldFeature)tree).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
							world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_SHRUB.id());
						}
						times++;
					}

					else if (world.getBlockId(blockX + addx, blockY, blockZ + addz) == Blocks.SAPLING_THORN.id()){
						if (!world.isClientSide) {
							world.setBlock(blockX + addx, blockY, blockZ + addz, 0);
							WorldFeature treeFeature = new WorldFeatureTreeThorn(1, Blocks.LOG_THORN.id(), 0, Blocks.LEAVES_THORN.id(), 0);
							if (!((WorldFeature)treeFeature).place(world, world.rand, blockX + addx, blockY, blockZ + addz)) {
								world.setBlock(blockX + addx, blockY, blockZ + addz, Blocks.SAPLING_THORN.id());
							}
						}
						times++;
					}


				}
			}
		}

		//farmland not done
		return false;
	}
}
