package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.blocks.flux.BlockModelCropsFlux;
import cursedbread.morefeatures.blocks.glass.BlockModelColoredGlass;
import cursedbread.morefeatures.blocks.glass.BlockModelColoredGlassTrapdoor;
import cursedbread.morefeatures.blocks.glowstone.BlockModelColoredGlowstone;
import cursedbread.morefeatures.blocks.paperwall.BlockModelPaperwall;
import cursedbread.morefeatures.item.FeaturesItems;
import cursedbread.morefeatures.item.artifacts.ItemModelBombQuiver;
import cursedbread.morefeatures.item.other.ItemModelFertilizerBag;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

@Environment(EnvType.CLIENT)
public class FeatureModel implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		if (FeaturesBlocks.coloredBlocksEnabled == 1) {
			ModelHelper.setBlockModel(
				FeaturesBlocks.vanillaColoredGlowstone,
				() -> new BlockModelColoredGlowstone<>(FeaturesBlocks.vanillaColoredGlowstone,
					false));

			ModelHelper.setBlockModel(
				FeaturesBlocks.vanillaColoredPaperwall,
				() -> new BlockModelPaperwall<>(FeaturesBlocks.vanillaColoredPaperwall, FeaturesMain.paperWallAlt,
					false));

			ModelHelper.setBlockModel(
				FeaturesBlocks.vanillaColoredGlass,
				() -> new BlockModelColoredGlass<>(FeaturesBlocks.vanillaColoredGlass, true,
					false)
					.onRenderLayer(1)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.vanillaColoredGlassTrapdoor,
				() -> new BlockModelColoredGlassTrapdoor<>(FeaturesBlocks.vanillaColoredGlassTrapdoor,
					false)
					.onRenderLayer(1)
			);
		}

		if (FeaturesBlocks.plantEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.rainbowFlower,
				() -> new BlockModelFlowerStackable<>(FeaturesBlocks.rainbowFlower,
					"morefeatures:block/flower_rainbow/")
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.fluxCropws,
				() -> new BlockModelCropsFlux<>(FeaturesBlocks.fluxCropws));
		}

		if (FeaturesBlocks.miscBlocksEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.gildingTable,
				() -> new BlockModelStandard<>(FeaturesBlocks.gildingTable)
					.setTex(0,"morefeatures:block/extra_block_gilding_table", Side.sides)
					.setTex(0,"minecraft:block/block_gold/top", Side.TOP)
					.setTex(0,"minecraft:block/slate_top", Side.BOTTOM)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.ham,
				() -> new BlockModelStandard<>(FeaturesBlocks.ham)
					.setTex(0, "morefeatures:block/extra_block_ham_block", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.cookedham,
				() -> new BlockModelStandard<>(FeaturesBlocks.cookedham)
					.setTex(0, "morefeatures:block/extra_block_ham_cooked_block", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.burnedLog,
				() -> new BlockModelAxisAligned<>(FeaturesBlocks.burnedLog)
					.setTex(0, "morefeatures:block/logs/burned_side", Side.sides)
					.setTex(0, "morefeatures:block/logs/burned_top", Side.TOP)
					.setTex(0, "morefeatures:block/logs/burned_top", Side.BOTTOM)
			);
		}

		if (FeaturesBlocks.superoresEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.superCoalStoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superCoalStoneOre)
					.setTex(0, "morefeatures:block/ores/superore_coal_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superCoalBasaltOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superCoalBasaltOre)
					.setTex(0, "morefeatures:block/ores/superore_coal_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superCoalLimestoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superCoalLimestoneOre)
					.setTex(0, "morefeatures:block/ores/superore_coal_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superCoalGraniteOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superCoalGraniteOre)
					.setTex(0, "morefeatures:block/ores/superore_coal_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superCoalPermafrostOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superCoalPermafrostOre)
					.setTex(0, "morefeatures:block/ores/superore_coal_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.superIronStoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superIronStoneOre)
					.setTex(0, "morefeatures:block/ores/superore_iron_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superIronBasaltOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superIronBasaltOre)
					.setTex(0, "morefeatures:block/ores/superore_iron_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superIronLimestoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superIronLimestoneOre)
					.setTex(0, "morefeatures:block/ores/superore_iron_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superIronGraniteOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superIronGraniteOre)
					.setTex(0, "morefeatures:block/ores/superore_iron_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superIronPermafrostOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superIronPermafrostOre)
					.setTex(0, "morefeatures:block/ores/superore_iron_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.superGoldStoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superGoldStoneOre)
					.setTex(0, "morefeatures:block/ores/superore_gold_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superGoldBasaltOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superGoldBasaltOre)
					.setTex(0, "morefeatures:block/ores/superore_gold_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superGoldLimestoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superGoldLimestoneOre)
					.setTex(0, "morefeatures:block/ores/superore_gold_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superGoldGraniteOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superGoldGraniteOre)
					.setTex(0, "morefeatures:block/ores/superore_gold_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superGoldPermafrostOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superGoldPermafrostOre)
					.setTex(0, "morefeatures:block/ores/superore_gold_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.superLapisStoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superLapisStoneOre)
					.setTex(0, "morefeatures:block/ores/superore_lapis_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superLapisBasaltOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superLapisBasaltOre)
					.setTex(0, "morefeatures:block/ores/superore_lapis_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superLapisLimestoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superLapisLimestoneOre)
					.setTex(0, "morefeatures:block/ores/superore_lapis_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superLapisGraniteOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superLapisGraniteOre)
					.setTex(0, "morefeatures:block/ores/superore_lapis_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superLapisPermafrostOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superLapisPermafrostOre)
					.setTex(0, "morefeatures:block/ores/superore_lapis_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneStoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneStoneOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneBasaltOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneBasaltOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneLimestoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneLimestoneOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneGraniteOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneGraniteOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstonePermafrostOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstonePermafrostOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneGlowingStoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneGlowingStoneOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneGlowingBasaltOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneGlowingBasaltOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneGlowingLimestoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneGlowingLimestoneOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneGlowingGraniteOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneGlowingGraniteOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superRedstoneGlowingPermafrostOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superRedstoneGlowingPermafrostOre)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.superDiamondStoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superDiamondStoneOre)
					.setTex(0, "morefeatures:block/ores/superore_diamond_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superDiamondBasaltOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superDiamondBasaltOre)
					.setTex(0, "morefeatures:block/ores/superore_diamond_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superDiamondLimestoneOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superDiamondLimestoneOre)
					.setTex(0, "morefeatures:block/ores/superore_diamond_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superDiamondGraniteOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superDiamondGraniteOre)
					.setTex(0, "morefeatures:block/ores/superore_diamond_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.superDiamondPermafrostOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superDiamondPermafrostOre)
					.setTex(0, "morefeatures:block/ores/superore_diamond_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.superNetherCoalOre,
				() -> new BlockModelStandard<>(FeaturesBlocks.superNetherCoalOre)
					.setTex(0, "morefeatures:block/ores/superore_nethercoal_netherrack", Side.sides)
			);
		}

		ModelHelper.setBlockModel(
			FeaturesBlocks.netherrackGravel,
			() -> new BlockModelStandard<>(FeaturesBlocks.netherrackGravel)
				.setTex(0,"morefeatures:block/nether_update_blocks/netherrack_gravel", Side.sides)
		);
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		if (FeaturesItems.crownsEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.dandelionCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.dandelionCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.dandelionCrown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.roseCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.roseCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.roseCrown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.cherryCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.cherryCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.cherryCrown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.deadbushCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.deadbushCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.deadbushCrown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.orchidCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.orchidCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.orchidCrown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.heatherCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.heatherCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.heatherCrown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.bluebellCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bluebellCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bluebellCrown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.marigoldCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.marigoldCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.marigoldCrown.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.crownsEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.leatherCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leatherCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leatherCrown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.chainCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.chainCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.chainCrown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.ironCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.ironCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.ironCrown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.goldCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.goldCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.goldCrown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.diamondCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.diamondCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.diamondCrown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.steelCrown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.steelCrown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.steelCrown.namespaceID);
					return model;
				});

			if (FeaturesItems.blockArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.stoneCrown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.stoneCrown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.stoneCrown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.miscArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.olivineCrown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivineCrown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.olivineCrown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.blockArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.bedrockCrown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrockCrown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.bedrockCrown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.oldArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.plateCrown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.plateCrown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.plateCrown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.oldArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.leatherChainCrown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.leatherChainCrown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.leatherChainCrown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.miscArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.quartzCrown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartzCrown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.quartzCrown.namespaceID);
						return model;
					});
			}
		}

		if (FeaturesItems.blockArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.bedrockHelmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrockHelmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrockHelmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bedrockChestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrockChestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrockChestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bedrockLeggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrockLeggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrockLeggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bedrockBoots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrockBoots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrockBoots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.oldArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.plateHelmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.plateHelmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.plateHelmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.plateChestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.plateChestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.plateChestplate.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.oldArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.leatherChainHelmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leatherChainHelmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leatherChainHelmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.leatherChainChestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leatherChainChestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leatherChainChestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.leatherChainLeggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leatherChainLeggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leatherChainLeggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.leatherChainBoots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leatherChainBoots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leatherChainBoots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.blockArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.stoneHelmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stoneHelmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stoneHelmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.stoneChestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stoneChestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stoneChestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.stoneLeggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stoneLeggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stoneLeggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.stoneBoots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stoneBoots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stoneBoots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.miscArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.olivineHelmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivineHelmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivineHelmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.olivineChestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivineChestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivineChestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.olivineLeggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivineLeggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivineLeggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.olivineBoots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivineBoots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivineBoots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.miscArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.quartzHelmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartzHelmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartzHelmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.quartzChestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartzChestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartzChestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.quartzLeggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartzLeggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartzLeggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.quartzBoots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartzBoots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartzBoots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.treasureEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.bombBag,
				() -> {
					ItemModelStandard model = new ItemModelBombQuiver(FeaturesItems.bombBag, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bombBag.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bombBagGold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bombBagGold, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bombBagGold.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.catHelmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.catHelmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.catHelmet.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.newToolsEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.workbenchOnStick,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.workbenchOnStick, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.workbenchOnStick.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.miscItemsEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.mobSoul,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mobSoul, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.mobSoul.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.fluxSeed,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.fluxSeed, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.fluxSeed.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.fertilizerBag,
				() -> {
					ItemModelStandard model = new ItemModelFertilizerBag(FeaturesItems.fertilizerBag, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.fertilizerBag.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.newToolsEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.paxelWood,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxelWood, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxelWood.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxelStone,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxelStone, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxelStone.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxelIron,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxelIron, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxelIron.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxelGold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxelGold, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxelGold.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxelDiamond,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxelDiamond, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxelDiamond.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxelSteel,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxelSteel, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxelSteel.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.climbPickaxeWood,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climbPickaxeWood, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climbPickaxeWood.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climbPickaxeStone,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climbPickaxeStone, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climbPickaxeStone.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climbPickaxeIron,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climbPickaxeIron, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climbPickaxeIron.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climbPickaxeGold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climbPickaxeGold, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climbPickaxeGold.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climbPickaxeDiamond,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climbPickaxeDiamond, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climbPickaxeDiamond.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climbPickaxeSteel,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climbPickaxeSteel, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climbPickaxeSteel.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.miningHammerWood,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.miningHammerWood, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.miningHammerWood.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.miningHammerStone,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.miningHammerStone, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.miningHammerStone.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.miningHammerIron,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.miningHammerIron, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.miningHammerIron.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.miningHammerGold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.miningHammerGold, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.miningHammerGold.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.miningHammerDiamond,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.miningHammerDiamond, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.miningHammerDiamond.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.miningHammerSteel,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.miningHammerSteel, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.miningHammerSteel.namespaceID);
					return model;
				});
		}
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
