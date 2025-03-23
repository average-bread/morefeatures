package cursedbread.morefeatures.blocks;

import cursedbread.morefeatures.blocks.flux.BlockLogicCropsFlux;
import cursedbread.morefeatures.blocks.glass.*;
import cursedbread.morefeatures.blocks.glowstone.*;
import cursedbread.morefeatures.blocks.ores.*;
import cursedbread.morefeatures.blocks.other.BlockLogicBurnedLog;
import cursedbread.morefeatures.blocks.other.BlockLogicGilder;
import cursedbread.morefeatures.blocks.other.BlockLogicHam;
import cursedbread.morefeatures.blocks.paperwall.*;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesBlocks {

	public static BlockBuilder fullBlock = new BlockBuilder(MOD_ID);

	public static BlockBuilder crossedBlock = new BlockBuilder(MOD_ID);

	public static final BlockBuilder coloredglass = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setUseInternalLight();
	public static final BlockBuilder coloredglasstrapdoors = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setUseInternalLight();
	public static final BlockBuilder coloredglassdoors = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setUseInternalLight();
	public static BlockBuilder glowstoneBlock = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.5f);

	public static BlockBuilder paperwallBlock = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.CLOTH)
		.setHardness(0.5f);

	public static int blockId;

	public static int coloredBlocksEnabled;
	public static Block<?> vanillaColoredGlowstone;
	public static Block<?> nonameColoredGlowstone;
	public static Block<?> vanillaColoredPaperwall;
	public static Block<?> nonameColoredPaperwall;
	public static Block<?> vanillaColoredGlass;
	public static Block<?> vanillaColoredGlassTrapdoor;
	public static Block<?> nonameColoredGlass;
	public static Block<?> nonameColoredGlassTrapdoor;

	public static int miscBlocksEnabled;
	public static Block<?> gildingTable;
	public static Block<?> ham;
	public static Block<?> cookedham;
	public static Block<?> burnedLog;

	public static int plantEnabled;
	public static Block<BlockLogicFlowerStackable> rainbowFlower;
	public static int rainbowFlowerChance;
	public static Block<?> fluxCropws;

	public static int superoresEnabled;
	public static Block<?> superCoalStoneOre;
	public static Block<?> superCoalBasaltOre;
	public static Block<?> superCoalLimestoneOre;
	public static Block<?> superCoalGraniteOre;
	public static Block<?> superCoalPermafrostOre;

	public static Block<?> superIronStoneOre;
	public static Block<?> superIronBasaltOre;
	public static Block<?> superIronLimestoneOre;
	public static Block<?> superIronGraniteOre;
	public static Block<?> superIronPermafrostOre;

	public static Block<?> superGoldStoneOre;
	public static Block<?> superGoldBasaltOre;
	public static Block<?> superGoldLimestoneOre;
	public static Block<?> superGoldGraniteOre;
	public static Block<?> superGoldPermafrostOre;

	public static Block<?> superLapisStoneOre;
	public static Block<?> superLapisBasaltOre;
	public static Block<?> superLapisLimestoneOre;
	public static Block<?> superLapisGraniteOre;
	public static Block<?> superLapisPermafrostOre;

	public static Block<?> superRedstoneStoneOre;
	public static Block<?> superRedstoneBasaltOre;
	public static Block<?> superRedstoneLimestoneOre;
	public static Block<?> superRedstoneGraniteOre;
	public static Block<?> superRedstonePermafrostOre;

	public static Block<?> superRedstoneGlowingStoneOre;
	public static Block<?> superRedstoneGlowingBasaltOre;
	public static Block<?> superRedstoneGlowingLimestoneOre;
	public static Block<?> superRedstoneGlowingGraniteOre;
	public static Block<?> superRedstoneGlowingPermafrostOre;

	public static Block<?> superDiamondStoneOre;
	public static Block<?> superDiamondBasaltOre;
	public static Block<?> superDiamondLimestoneOre;
	public static Block<?> superDiamondGraniteOre;
	public static Block<?> superDiamondPermafrostOre;

	public static Block<?> superNetherCoalOre;

	public static Block<?> netherrackGravel;

	private void initializeBlockDetails() {
		int color;
		if (coloredBlocksEnabled == 1) {
			Item.itemsList[vanillaColoredGlowstone.id()] = new ItemBlockPainted<>(vanillaColoredGlowstone, false);
			for (color = 1; color < 16; color++) {
				CreativeHelper.setParent(vanillaColoredGlowstone, color, vanillaColoredGlowstone, color-1);
			}
		}
		if (coloredBlocksEnabled == 1) {
			Item.itemsList[vanillaColoredPaperwall.id()] = new ItemBlockPainted<>(vanillaColoredPaperwall, false);
			for (color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredPaperwall, color - 1, vanillaColoredPaperwall, 0);
			}
		}
		if (coloredBlocksEnabled == 1) {
			Item.itemsList[vanillaColoredGlass.id()] = new ItemBlockPainted<>(vanillaColoredGlass, false);
			for (color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredGlass, color - 1, vanillaColoredGlass, color);
			}
			Item.itemsList[vanillaColoredGlassTrapdoor.id()] = new ItemBlockPainted<>(vanillaColoredGlassTrapdoor, true);
			for (color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredGlassTrapdoor, color - 1, vanillaColoredGlassTrapdoor, color);
			}
		}
	}

	public void initilizeBlocks() {
		if (coloredBlocksEnabled == 1) {
			vanillaColoredGlowstone = glowstoneBlock
				.build("vanilla.colored.glowstone", blockId++, b -> new BlockLogicColoredGlowstone(b, Material.glass))
				.withDisabledNeighborNotifyOnMetadataChange();
		}

		if (coloredBlocksEnabled == 1) {
			vanillaColoredPaperwall = paperwallBlock
					.build("vanilla.paperwall", blockId++, b -> new BlockLogicColoredPaperwall(b, Material.wood));
		}
		if (coloredBlocksEnabled == 1) {
			vanillaColoredGlass = coloredglass
				.build("vanilla.colored.glass", blockId++, b -> new BlockLogicColoredGlass(b, Material.glass)).withTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.EXTENDS_MOTION_SENSOR_RANGE);
			vanillaColoredGlassTrapdoor = coloredglasstrapdoors
				.build("vanilla.colored.glasstrapdoor", blockId++, b -> new BlockLogicColoredGlassTrapdoor(b, Material.glass)).withDisabledNeighborNotifyOnMetadataChange().setBlockItem((bl) -> new ItemBlockPainted<>(bl, true));
		}

		if (miscBlocksEnabled == 1) {
			gildingTable = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
				.setHardness(5f)
				.build("gilder", blockId++, b -> new BlockLogicGilder(b));
		}

		if (plantEnabled == 1) {
			rainbowFlower = crossedBlock
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.build("flower.rainbow", blockId++, b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());
		}

		if (miscBlocksEnabled == 1) {
			ham = fullBlock
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_SWORD)
				.setHardness(0.1f)
				.build("ham", blockId++, b -> new BlockLogicHam(b, Material.stone));

			cookedham = fullBlock
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_SWORD)
				.setHardness(0.1f)
				.build("cookedham", blockId++, b -> new BlockLogic(b, Material.stone));
		}

		if (superoresEnabled == 1) {
			superCoalStoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.stone", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			superCoalBasaltOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.basalt", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			superCoalLimestoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.limestone", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			superCoalGraniteOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.granite", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			superCoalPermafrostOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.permafrost", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);

			superIronStoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.stone", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			superIronBasaltOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.basalt", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			superIronLimestoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.limestone", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			superIronGraniteOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.granite", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			superIronPermafrostOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.permafrost", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);

			superGoldStoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.stone", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			superGoldBasaltOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.basalt", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			superGoldLimestoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.limestone", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			superGoldGraniteOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.granite", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			superGoldPermafrostOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.permafrost", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);

			superLapisStoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.stone", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			superLapisBasaltOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.basalt", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			superLapisLimestoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.limestone", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			superLapisGraniteOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.granite", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			superLapisPermafrostOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.permafrost", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);

			superRedstoneStoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.stone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.STONE, Material.stone, false, FeaturesBlocks.superRedstoneStoneOre, FeaturesBlocks.superRedstoneGlowingStoneOre)).withBlastResistance(2.0F);
			superRedstoneBasaltOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.basalt", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.BASALT, Material.stone, false, FeaturesBlocks.superRedstoneBasaltOre, FeaturesBlocks.superRedstoneGlowingBasaltOre)).withBlastResistance(2.0F);
			superRedstoneLimestoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.limestone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.LIMESTONE, Material.stone, false, FeaturesBlocks.superRedstoneLimestoneOre, FeaturesBlocks.superRedstoneGlowingLimestoneOre)).withBlastResistance(2.0F);
			superRedstoneGraniteOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.granite", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.GRANITE, Material.stone, false, FeaturesBlocks.superRedstoneGraniteOre, FeaturesBlocks.superRedstoneGlowingGraniteOre)).withBlastResistance(2.0F);
			superRedstonePermafrostOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.permafrost", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.PERMAFROST, Material.stone, false, FeaturesBlocks.superRedstonePermafrostOre, FeaturesBlocks.superRedstoneGlowingPermafrostOre)).withBlastResistance(2.0F);

			superRedstoneGlowingStoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.stone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.STONE, Material.stone, true, FeaturesBlocks.superRedstoneStoneOre, FeaturesBlocks.superRedstoneGlowingStoneOre)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			superRedstoneGlowingBasaltOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.basalt", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.BASALT, Material.stone, true, FeaturesBlocks.superRedstoneBasaltOre, FeaturesBlocks.superRedstoneGlowingBasaltOre)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			superRedstoneGlowingLimestoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.limestone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.LIMESTONE, Material.stone, true, FeaturesBlocks.superRedstoneLimestoneOre, FeaturesBlocks.superRedstoneGlowingLimestoneOre)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			superRedstoneGlowingGraniteOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.granite", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.GRANITE, Material.stone, true, FeaturesBlocks.superRedstoneGraniteOre, FeaturesBlocks.superRedstoneGlowingGraniteOre)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			superRedstoneGlowingPermafrostOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.permafrost", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.PERMAFROST, Material.stone, true, FeaturesBlocks.superRedstonePermafrostOre, FeaturesBlocks.superRedstoneGlowingPermafrostOre)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();

			superDiamondStoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.stone", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			superDiamondBasaltOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.basalt", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			superDiamondLimestoneOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.limestone", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			superDiamondGraniteOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.granite", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			superDiamondPermafrostOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.permafrost", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);

			superNetherCoalOre = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.nether.coal.netherrack", blockId++, b -> new BlockLogicSuperOreNetherCoal(b)).withBlastResistance(5.0F).withLightEmission(1.0F);
		}

		if (plantEnabled == 1) {
			fluxCropws = fullBlock
				.setBlockSound(BlockSounds.GRASS)
				.setHardness(0.0F)
				.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
				.build("crops.flux", blockId++, b -> new BlockLogicCropsFlux(b))
				.withDisabledNeighborNotifyOnMetadataChange()
				.setStatParent(() -> {
					return FeaturesItems.fluxSeed;
				});
		}


		if (miscBlocksEnabled == 1){
			burnedLog = fullBlock
				.build("burned.log", blockId++, b -> new BlockLogicBurnedLog(b))
				.withSound(BlockSounds.WOOD)
				.withHardness(2.0F)
				.withDisabledNeighborNotifyOnMetadataChange()
				.withTags(new Tag[]{BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE});
		}

		netherrackGravel = fullBlock
			.build("netherrack.gravel", blockId++, b ->new BlockLogicGravel(b))
			.withSound(BlockSounds.GRAVEL)
			.withHardness(0.6F)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_SHOVEL});
	}
}

