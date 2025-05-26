package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.blocks.colored.ladder.BlockModelColoredLadder;
import cursedbread.morefeatures.blocks.colored.workbench.BlockModelColoredWorkbench;
import cursedbread.morefeatures.blocks.flux.BlockModelCropsFlux;
import cursedbread.morefeatures.blocks.colored.glass.BlockModelColoredGlass;
import cursedbread.morefeatures.blocks.colored.glass.BlockModelColoredGlassTrapdoor;
import cursedbread.morefeatures.blocks.colored.glowstone.BlockModelColoredGlowstone;
import cursedbread.morefeatures.blocks.colored.paperwall.BlockModelColoredPaperwall;
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
		if (FeaturesBlocks.coloredGlowstoneEnabled == 1) {
			ModelHelper.setBlockModel(
				FeaturesBlocks.vanilla_Colored_Glowstone,
				() -> new BlockModelColoredGlowstone<>(FeaturesBlocks.vanilla_Colored_Glowstone,
					false));
		}

		if (FeaturesBlocks.coloredPaperwallEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.vanilla_Colored_Paperwall,
				() -> new BlockModelColoredPaperwall<>(FeaturesBlocks.vanilla_Colored_Paperwall, FeaturesMain.paperWallAlt,
					false));
		}

		if (FeaturesBlocks.coloredGlassEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.vanilla_Colored_Glass,
				() -> new BlockModelColoredGlass<>(FeaturesBlocks.vanilla_Colored_Glass, true,
					false)
					.onRenderLayer(1)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.vanilla_Colored_Glass_Trapdoor,
				() -> new BlockModelColoredGlassTrapdoor<>(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor,
					false)
					.onRenderLayer(1)
			);
		}

		if (FeaturesBlocks.rainbowFlowerEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.rainbow_Flower,
				() -> new BlockModelFlowerStackable<>(FeaturesBlocks.rainbow_Flower,
					"morefeatures:block/flower_rainbow/")
			);
		}

		if (FeaturesBlocks.fluxCropsEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.flux_Cropws,
				() -> new BlockModelCropsFlux<>(FeaturesBlocks.flux_Cropws));
		}

		if (FeaturesBlocks.gildingTableEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.gilding_Table,
				() -> new BlockModelStandard<>(FeaturesBlocks.gilding_Table)
					.setTex(0,"morefeatures:block/extra_block_gilding_table", Side.sides)
					.setTex(0,"minecraft:block/block_gold/top", Side.TOP)
					.setTex(0,"minecraft:block/slate_top", Side.BOTTOM)
			);
		}

		if (FeaturesBlocks.hamEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.ham,
				() -> new BlockModelStandard<>(FeaturesBlocks.ham)
					.setTex(0, "morefeatures:block/extra_block_ham_block", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.ham_Cooked,
				() -> new BlockModelStandard<>(FeaturesBlocks.ham_Cooked)
					.setTex(0, "morefeatures:block/extra_block_ham_cooked_block", Side.sides)
			);
		}

		if (FeaturesBlocks.burnedLogEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.burned_Log,
				() -> new BlockModelAxisAligned<>(FeaturesBlocks.burned_Log)
					.setTex(0, "morefeatures:block/logs/burned_side", Side.sides)
					.setTex(0, "morefeatures:block/logs/burned_top", Side.TOP)
					.setTex(0, "morefeatures:block/logs/burned_top", Side.BOTTOM)
			);
		}

		if (FeaturesBlocks.superoresEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Coal_Stone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Coal_Stone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_coal_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Coal_Basalt_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Coal_Basalt_Ore)
					.setTex(0, "morefeatures:block/ores/superore_coal_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Coal_Limestone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Coal_Limestone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_coal_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Coal_Granite_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Coal_Granite_Ore)
					.setTex(0, "morefeatures:block/ores/superore_coal_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Coal_Permafrost_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Coal_Permafrost_Ore)
					.setTex(0, "morefeatures:block/ores/superore_coal_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Iron_Stone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Iron_Stone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_iron_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Iron_Basalt_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Iron_Basalt_Ore)
					.setTex(0, "morefeatures:block/ores/superore_iron_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Iron_Limestone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Iron_Limestone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_iron_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Iron_Granite_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Iron_Granite_Ore)
					.setTex(0, "morefeatures:block/ores/superore_iron_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Iron_Permafrost_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Iron_Permafrost_Ore)
					.setTex(0, "morefeatures:block/ores/superore_iron_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Gold_Stone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Gold_Stone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_gold_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Gold_Basalt_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Gold_Basalt_Ore)
					.setTex(0, "morefeatures:block/ores/superore_gold_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Gold_Limestone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Gold_Limestone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_gold_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Gold_Granite_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Gold_Granite_Ore)
					.setTex(0, "morefeatures:block/ores/superore_gold_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Gold_Permafrost_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Gold_Permafrost_Ore)
					.setTex(0, "morefeatures:block/ores/superore_gold_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Lapis_Stone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Lapis_Stone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_lapis_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Lapis_Basalt_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Lapis_Basalt_Ore)
					.setTex(0, "morefeatures:block/ores/superore_lapis_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Lapis_Limestone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Lapis_Limestone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_lapis_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Lapis_Granite_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Lapis_Granite_Ore)
					.setTex(0, "morefeatures:block/ores/superore_lapis_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Lapis_Permafrost_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Lapis_Permafrost_Ore)
					.setTex(0, "morefeatures:block/ores/superore_lapis_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Stone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Stone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Basalt_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Basalt_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Limestone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Limestone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Granite_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Granite_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Permafrost_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Permafrost_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Glowing_Stone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Glowing_Stone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Glowing_Basalt_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Glowing_Basalt_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Glowing_Limestone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Glowing_Limestone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Glowing_Granite_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Glowing_Granite_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Redstone_Glowing_Permafrost_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Redstone_Glowing_Permafrost_Ore)
					.setTex(0, "morefeatures:block/ores/superore_redstone_glowing_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Diamond_Stone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Diamond_Stone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_diamond_stone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Diamond_Basalt_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Diamond_Basalt_Ore)
					.setTex(0, "morefeatures:block/ores/superore_diamond_basalt", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Diamond_Limestone_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Diamond_Limestone_Ore)
					.setTex(0, "morefeatures:block/ores/superore_diamond_limestone", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Diamond_Granite_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Diamond_Granite_Ore)
					.setTex(0, "morefeatures:block/ores/superore_diamond_granite", Side.sides)
			);
			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Diamond_Permafrost_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Diamond_Permafrost_Ore)
					.setTex(0, "morefeatures:block/ores/superore_diamond_permafrost", Side.sides)
			);

			ModelHelper.setBlockModel(
				FeaturesBlocks.super_Nether_Coal_Ore,
				() -> new BlockModelStandard<>(FeaturesBlocks.super_Nether_Coal_Ore)
					.setTex(0, "morefeatures:block/ores/superore_nethercoal_netherrack", Side.sides)
			);
		}

		if (FeaturesBlocks.netherGravelEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.netherrack_Gravel,
				() -> new BlockModelStandard<>(FeaturesBlocks.netherrack_Gravel)
					.setTex(0,"morefeatures:block/nether_update_blocks/netherrack_gravel", Side.sides)
			);
		}

		if (FeaturesBlocks.coloredLadderEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.vanilla_Colored_Ladder,
				() -> new BlockModelColoredLadder<>(FeaturesBlocks.vanilla_Colored_Ladder, false)
			);
		}

		if (FeaturesBlocks.coloredWorkbenchEnabled == 1){
			ModelHelper.setBlockModel(
				FeaturesBlocks.vanilla_Colored_Workbench,
				() -> new BlockModelColoredWorkbench<>(FeaturesBlocks.vanilla_Colored_Workbench, false)
			);
		}
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		if (FeaturesItems.flowercrownsEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.dandelion_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.dandelion_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.dandelion_Crown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.rose_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.rose_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.rose_Crown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.cherry_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.cherry_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.cherry_Crown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.deadbush_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.deadbush_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.deadbush_Crown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.orchid_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.orchid_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.orchid_Crown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.heather_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.heather_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.heather_Crown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.bluebell_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bluebell_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bluebell_Crown.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.marigold_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.marigold_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.marigold_Crown.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.normalCrownsEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.leather_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leather_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leather_Crown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.chain_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.chain_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.chain_Crown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.iron_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.iron_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.iron_Crown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.gold_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.gold_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.gold_Crown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.diamond_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.diamond_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.diamond_Crown.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.steel_Crown,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.steel_Crown, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.steel_Crown.namespaceID);
					return model;
				});

			if (FeaturesItems.stoneArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.stone_Crown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.stone_Crown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.stone_Crown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.olivineArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.olivine_Crown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivine_Crown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.olivine_Crown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.bedrockArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.bedrock_Crown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrock_Crown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.bedrock_Crown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.plateArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.plate_Crown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.plate_Crown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.plate_Crown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.studdedArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.leather_Chain_Crown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.leather_Chain_Crown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.leather_Chain_Crown.namespaceID);
						return model;
					});
			}
			if (FeaturesItems.quartzArmorEnabled == 1) {
				ModelHelper.setItemModel(FeaturesItems.quartz_Crown,
					() -> {
						ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartz_Crown, MOD_ID);
						model.icon = TextureRegistry.getTexture(FeaturesItems.quartz_Crown.namespaceID);
						return model;
					});
			}
		}

		if (FeaturesItems.bedrockArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.bedrock_Helmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrock_Helmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrock_Helmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bedrock_Chestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrock_Chestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrock_Chestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bedrock_Leggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrock_Leggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrock_Leggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bedrock_Boots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bedrock_Boots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bedrock_Boots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.plateArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.plate_Helmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.plate_Helmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.plate_Helmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.plate_Chestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.plate_Chestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.plate_Chestplate.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.studdedArmorEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.leather_Chain_Helmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leather_Chain_Helmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leather_Chain_Helmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.leather_Chain_Chestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leather_Chain_Chestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leather_Chain_Chestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.leather_Chain_Leggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leather_Chain_Leggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leather_Chain_Leggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.leather_Chain_Boots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.leather_Chain_Boots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.leather_Chain_Boots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.stoneArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.stone_Helmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stone_Helmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stone_Helmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.stone_Chestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stone_Chestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stone_Chestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.stone_Leggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stone_Leggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stone_Leggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.stone_Boots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.stone_Boots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.stone_Boots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.olivineArmorEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.olivine_Helmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivine_Helmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivine_Helmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.olivine_Chestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivine_Chestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivine_Chestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.olivine_Leggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivine_Leggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivine_Leggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.olivine_Boots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.olivine_Boots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.olivine_Boots.namespaceID);
					return model;
				});

			ModelHelper.setItemModel(FeaturesItems.quartz_Helmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartz_Helmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartz_Helmet.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.quartz_Chestplate,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartz_Chestplate, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartz_Chestplate.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.quartz_Leggings,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartz_Leggings, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartz_Leggings.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.quartz_Boots,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.quartz_Boots, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.quartz_Boots.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.bombBagEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.bomb_Bag,
				() -> {
					ItemModelStandard model = new ItemModelBombQuiver(FeaturesItems.bomb_Bag, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bomb_Bag.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.bomb_Bag_Gold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.bomb_Bag_Gold, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.bomb_Bag_Gold.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.cathelmetEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.cat_Helmet,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.cat_Helmet, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.cat_Helmet.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.mobSoulEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.mob_Soul,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mob_Soul, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.mob_Soul.namespaceID);
					return model;
				});
		}

		if (FeaturesBlocks.fluxCropsEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.flux_Seed,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.flux_Seed, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.flux_Seed.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.ferlilizerBagEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.fertilizer_Bag,
				() -> {
					ItemModelStandard model = new ItemModelFertilizerBag(FeaturesItems.fertilizer_Bag, MOD_ID);
					model.icon = TextureRegistry.getTexture(FeaturesItems.fertilizer_Bag.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.workbenchOnStickEnabled == 1) {
			ModelHelper.setItemModel(FeaturesItems.workbench_On_Stick,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.workbench_On_Stick, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.workbench_On_Stick.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.paxelsEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.paxel_Wood,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxel_Wood, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxel_Wood.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxel_Stone,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxel_Stone, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxel_Stone.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxel_Iron,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxel_Iron, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxel_Iron.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxel_Gold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxel_Gold, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxel_Gold.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxel_Diamond,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxel_Diamond, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxel_Diamond.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.paxel_Steel,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.paxel_Steel, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.paxel_Steel.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.climbPickaxesEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.climb_Pickaxe_Wood,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climb_Pickaxe_Wood, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climb_Pickaxe_Wood.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climb_Pickaxe_Stone,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climb_Pickaxe_Stone, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climb_Pickaxe_Stone.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climb_Pickaxe_Iron,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climb_Pickaxe_Iron, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climb_Pickaxe_Iron.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climb_Pickaxe_Gold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climb_Pickaxe_Gold, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climb_Pickaxe_Gold.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climb_Pickaxe_Diamond,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climb_Pickaxe_Diamond, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climb_Pickaxe_Diamond.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.climb_Pickaxe_Steel,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.climb_Pickaxe_Steel, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.climb_Pickaxe_Steel.namespaceID);
					return model;
				});
		}

		if (FeaturesItems.miningHammersEnabled == 1){
			ModelHelper.setItemModel(FeaturesItems.mining_Hammer_Wood,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mining_Hammer_Wood, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.mining_Hammer_Wood.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.mining_Hammer_Stone,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mining_Hammer_Stone, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.mining_Hammer_Stone.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.mining_Hammer_Iron,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mining_Hammer_Iron, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.mining_Hammer_Iron.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.mining_Hammer_Gold,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mining_Hammer_Gold, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.mining_Hammer_Gold.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.mining_Hammer_Diamond,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mining_Hammer_Diamond, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.mining_Hammer_Diamond.namespaceID);
					return model;
				});
			ModelHelper.setItemModel(FeaturesItems.mining_Hammer_Steel,
				() -> {
					ItemModelStandard model = new ItemModelStandard(FeaturesItems.mining_Hammer_Steel, MOD_ID).setFull3D();
					model.icon = TextureRegistry.getTexture(FeaturesItems.mining_Hammer_Steel.namespaceID);
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
