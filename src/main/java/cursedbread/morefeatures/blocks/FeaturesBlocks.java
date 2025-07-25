package cursedbread.morefeatures.blocks;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.colored.workbench.BlockLogicColoredWorkbench;
import cursedbread.morefeatures.blocks.flux.BlockLogicCropsFlux;
import cursedbread.morefeatures.blocks.colored.glass.BlockLogicColoredGlass;
import cursedbread.morefeatures.blocks.colored.glass.BlockLogicColoredGlassTrapdoor;
import cursedbread.morefeatures.blocks.colored.glowstone.BlockLogicColoredGlowstone;
import cursedbread.morefeatures.blocks.ores.*;
import cursedbread.morefeatures.blocks.ores.deep.*;
import cursedbread.morefeatures.blocks.other.BlockLogicBurnedLog;
import cursedbread.morefeatures.blocks.other.BlockLogicGilder;
import cursedbread.morefeatures.blocks.other.BlockLogicHam;
import cursedbread.morefeatures.blocks.colored.paperwall.BlockLogicColoredPaperwall;
import cursedbread.morefeatures.blocks.other.BlockLogicMeshWood;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.MaterialColor;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockLadder;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;
import static net.minecraft.core.item.tool.ItemToolPickaxe.miningLevels;

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

	public static int coloredGlowstoneEnabled;
	public static Block<?> vanilla_Colored_Glowstone;
	public static Block<?> noname_Colored_Glowstone;
	public static int coloredPaperwallEnabled;
	public static Block<?> vanilla_Colored_Paperwall;
	public static Block<?> noname_Colored_Paperwall;
	public static int coloredGlassEnabled;
	public static Block<?> vanilla_Colored_Glass;
	public static Block<?> vanilla_Colored_Glass_Trapdoor;
	public static Block<?> noname_Colored_Glass;
	public static Block<?> noname_Colored_Glass_Trapdoor;

	public static int gildingTableEnabled;
	public static Block<?> gilding_Table;
	public static int hamEnabled;
	public static Block<?> ham;
	public static Block<?> ham_Cooked;
	public static int burnedLogEnabled;
	public static Block<?> burned_Log;

	public static int rainbowFlowerEnabled;
	public static Block<BlockLogicFlowerStackable> rainbow_Flower;
	public static int rainbowFlowerChance;
	public static int fluxCropsEnabled;
	public static Block<?> flux_Cropws;

	public static int superoresEnabled;
	public static Block<?> super_Coal_Stone_Ore;
	public static Block<?> super_Coal_Basalt_Ore;
	public static Block<?> super_Coal_Limestone_Ore;
	public static Block<?> super_Coal_Granite_Ore;
	public static Block<?> super_Coal_Permafrost_Ore;

	public static Block<?> super_Iron_Stone_Ore;
	public static Block<?> super_Iron_Basalt_Ore;
	public static Block<?> super_Iron_Limestone_Ore;
	public static Block<?> super_Iron_Granite_Ore;
	public static Block<?> super_Iron_Permafrost_Ore;

	public static Block<?> super_Gold_Stone_Ore;
	public static Block<?> super_Gold_Basalt_Ore;
	public static Block<?> super_Gold_Limestone_Ore;
	public static Block<?> super_Gold_Granite_Ore;
	public static Block<?> super_Gold_Permafrost_Ore;

	public static Block<?> super_Lapis_Stone_Ore;
	public static Block<?> super_Lapis_Basalt_Ore;
	public static Block<?> super_Lapis_Limestone_Ore;
	public static Block<?> super_Lapis_Granite_Ore;
	public static Block<?> super_Lapis_Permafrost_Ore;

	public static Block<?> super_Redstone_Stone_Ore;
	public static Block<?> super_Redstone_Basalt_Ore;
	public static Block<?> super_Redstone_Limestone_Ore;
	public static Block<?> super_Redstone_Granite_Ore;
	public static Block<?> super_Redstone_Permafrost_Ore;

	public static Block<?> super_Redstone_Glowing_Stone_Ore;
	public static Block<?> super_Redstone_Glowing_Basalt_Ore;
	public static Block<?> super_Redstone_Glowing_Limestone_Ore;
	public static Block<?> super_Redstone_Glowing_Granite_Ore;
	public static Block<?> super_Redstone_Glowing_Permafrost_Ore;

	public static Block<?> super_Diamond_Stone_Ore;
	public static Block<?> super_Diamond_Basalt_Ore;
	public static Block<?> super_Diamond_Limestone_Ore;
	public static Block<?> super_Diamond_Granite_Ore;
	public static Block<?> super_Diamond_Permafrost_Ore;

	public static Block<?> super_Nether_Coal_Ore;

	public static Block<?> super_Rhodonite_Ore;

	public static Block<?> super_Amethyst_Stone_Ore;
	public static Block<?> super_Amethyst_Basalt_Ore;
	public static Block<?> super_Amethyst_Limestone_Ore;
	public static Block<?> super_Amethyst_Granite_Ore;
	public static Block<?> super_Amethyst_Permafrost_Ore;

	public static Block<?> super_Silver_Stone_Ore;
	public static Block<?> super_Silver_Basalt_Ore;
	public static Block<?> super_Silver_Limestone_Ore;
	public static Block<?> super_Silver_Granite_Ore;
	public static Block<?> super_Silver_Permafrost_Ore;
	public static Block<?> super_Silver_Netherrack_Ore;

	public static Block<?> super_Uranium_Stone_Ore;
	public static Block<?> super_Uranium_Basalt_Ore;
	public static Block<?> super_Uranium_Limestone_Ore;
	public static Block<?> super_Uranium_Granite_Ore;
	public static Block<?> super_Uranium_Permafrost_Ore;

	public static Block<?> super_Lead_Stone_Ore;
	public static Block<?> super_Lead_Basalt_Ore;
	public static Block<?> super_Lead_Limestone_Ore;
	public static Block<?> super_Lead_Granite_Ore;
	public static Block<?> super_Lead_Permafrost_Ore;

	public static Block<?> super_Topaz_Ore;

	public static int netherGravelEnabled;
	public static Block<?> netherrack_Gravel;

	public static int coloredLadderEnabled;
	public static Block<?> vanilla_Colored_Ladder;

	public static int coloredWorkbenchEnabled;
	public static Block<?> vanilla_Colored_Workbench;

	public static int newFlowersEnabled;
	public static Block<BlockLogicFlowerStackable> white_Flower;
	public static Block<BlockLogicFlowerStackable> magenta_Flower;
	public static Block<BlockLogicFlowerStackable> lime_Flower;
	public static Block<BlockLogicFlowerStackable> gray_Flower;
	public static Block<BlockLogicFlowerStackable> silver_Flower;
	public static Block<BlockLogicFlowerStackable> cyan_Flower;
	public static Block<BlockLogicFlowerStackable> blue_Flower;
	public static Block<BlockLogicFlowerStackable> brown_Flower;
	public static Block<BlockLogicFlowerStackable> green_Flower;
	public static Block<BlockLogicFlowerStackable> black_Flower;

	public static int woodMeshEnabled;
	public static Block<?> wood_Mesh;

	private void initializeBlockDetails() {
		miningLevels.put(super_Coal_Stone_Ore, 0);
		miningLevels.put(super_Coal_Basalt_Ore, 0);
		miningLevels.put(super_Coal_Limestone_Ore, 0);
		miningLevels.put(super_Coal_Granite_Ore, 0);
		miningLevels.put(super_Coal_Permafrost_Ore, 0);

		miningLevels.put(super_Iron_Stone_Ore, 1);
		miningLevels.put(super_Iron_Basalt_Ore, 1);
		miningLevels.put(super_Iron_Limestone_Ore, 1);
		miningLevels.put(super_Iron_Granite_Ore, 1);
		miningLevels.put(super_Iron_Permafrost_Ore, 1);

		miningLevels.put(super_Gold_Stone_Ore, 2);
		miningLevels.put(super_Gold_Basalt_Ore, 2);
		miningLevels.put(super_Gold_Limestone_Ore, 2);
		miningLevels.put(super_Gold_Granite_Ore, 2);
		miningLevels.put(super_Gold_Permafrost_Ore, 2);

		miningLevels.put(super_Lapis_Stone_Ore, 1);
		miningLevels.put(super_Lapis_Basalt_Ore, 1);
		miningLevels.put(super_Lapis_Limestone_Ore, 1);
		miningLevels.put(super_Lapis_Granite_Ore, 1);
		miningLevels.put(super_Lapis_Permafrost_Ore, 1);

		miningLevels.put(super_Redstone_Stone_Ore, 2);
		miningLevels.put(super_Redstone_Basalt_Ore, 2);
		miningLevels.put(super_Redstone_Limestone_Ore, 2);
		miningLevels.put(super_Redstone_Granite_Ore, 2);
		miningLevels.put(super_Redstone_Permafrost_Ore, 2);
		miningLevels.put(super_Redstone_Glowing_Stone_Ore, 2);
		miningLevels.put(super_Redstone_Glowing_Basalt_Ore, 2);
		miningLevels.put(super_Redstone_Glowing_Limestone_Ore, 2);
		miningLevels.put(super_Redstone_Glowing_Granite_Ore, 2);
		miningLevels.put(super_Redstone_Glowing_Permafrost_Ore, 2);

		miningLevels.put(super_Diamond_Stone_Ore, 2);
		miningLevels.put(super_Diamond_Basalt_Ore, 2);
		miningLevels.put(super_Diamond_Limestone_Ore, 2);
		miningLevels.put(super_Diamond_Granite_Ore, 2);
		miningLevels.put(super_Diamond_Permafrost_Ore, 2);

		miningLevels.put(super_Nether_Coal_Ore, 2);

		if (FeaturesMain.deepOn){
			miningLevels.put(super_Rhodonite_Ore, 2);

			miningLevels.put(super_Amethyst_Stone_Ore, 2);
			miningLevels.put(super_Amethyst_Basalt_Ore, 2);
			miningLevels.put(super_Amethyst_Limestone_Ore, 2);
			miningLevels.put(super_Amethyst_Granite_Ore, 2);
			miningLevels.put(super_Amethyst_Permafrost_Ore, 2);

			miningLevels.put(super_Silver_Stone_Ore, 2);
			miningLevels.put(super_Silver_Basalt_Ore, 2);
			miningLevels.put(super_Silver_Limestone_Ore, 2);
			miningLevels.put(super_Silver_Granite_Ore, 2);
			miningLevels.put(super_Silver_Permafrost_Ore, 2);
			miningLevels.put(super_Silver_Netherrack_Ore, 2);

			miningLevels.put(super_Uranium_Stone_Ore, 2);
			miningLevels.put(super_Uranium_Basalt_Ore, 2);
			miningLevels.put(super_Uranium_Limestone_Ore, 2);
			miningLevels.put(super_Uranium_Granite_Ore, 2);
			miningLevels.put(super_Uranium_Permafrost_Ore, 2);

			miningLevels.put(super_Lead_Stone_Ore, 1);
			miningLevels.put(super_Lead_Basalt_Ore, 1);
			miningLevels.put(super_Lead_Limestone_Ore, 1);
			miningLevels.put(super_Lead_Granite_Ore, 1);
			miningLevels.put(super_Lead_Permafrost_Ore, 1);

			miningLevels.put(super_Topaz_Ore, 2);
		}
	}

	public void initilizeBlocks() {
		if (coloredGlowstoneEnabled == 1) {
			vanilla_Colored_Glowstone = glowstoneBlock
				.build("vanilla.colored.glowstone", blockId++, b -> new BlockLogicColoredGlowstone(b, Material.glass))
				.withDisabledNeighborNotifyOnMetadataChange()
				.setBlockItem((b) -> {return new ItemBlockPainted<>(b, false);});
		}

		if (coloredPaperwallEnabled == 1) {
			vanilla_Colored_Paperwall = paperwallBlock
					.build("vanilla.paperwall", blockId++, b -> new BlockLogicColoredPaperwall(b, Material.wood))
				.setBlockItem((b) -> {return new ItemBlockPainted<>(b, false);});
		}

		if (coloredGlassEnabled == 1) {
			vanilla_Colored_Glass = coloredglass
				.build("vanilla.colored.glass", blockId++, b -> new BlockLogicColoredGlass(b, Material.glass)).withTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.EXTENDS_MOTION_SENSOR_RANGE)
				.setBlockItem((b) -> {return new ItemBlockPainted<>(b, false);});
			vanilla_Colored_Glass_Trapdoor = coloredglasstrapdoors
				.build("vanilla.colored.glasstrapdoor", blockId++, b -> new BlockLogicColoredGlassTrapdoor(b, Material.glass)).withDisabledNeighborNotifyOnMetadataChange().setBlockItem((bl) -> new ItemBlockPainted<>(bl, true));
		}

		if (gildingTableEnabled == 1) {
			gilding_Table = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
				.setHardness(5f)
				.build("gilder", blockId++, b -> new BlockLogicGilder(b));
		}

		if (rainbowFlowerEnabled == 1) {
			rainbow_Flower = crossedBlock
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.build("flower.rainbow", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());
		}

		if (hamEnabled == 1) {
			ham = fullBlock
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_SWORD)
				.setHardness(0.1f)
				.build("ham", blockId++, b -> new BlockLogicHam(b, Material.stone));

			ham_Cooked = fullBlock
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_SWORD)
				.setHardness(0.1f)
				.build("cookedham", blockId++, b -> new BlockLogic(b, Material.stone));
		}

		if (superoresEnabled == 1) {
			super_Coal_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.stone", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			super_Coal_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.basalt", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			super_Coal_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.limestone", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			super_Coal_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.granite", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);
			super_Coal_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.coal.permafrost", blockId++, b -> new BlockLogicSuperOreCoal(b)).withBlastResistance(5.0F);

			super_Iron_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.stone", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			super_Iron_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.basalt", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			super_Iron_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.limestone", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			super_Iron_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.granite", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);
			super_Iron_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.iron.permafrost", blockId++, b -> new BlockLogicSuperOreIron(b)).withBlastResistance(5.0F);

			super_Gold_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.stone", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			super_Gold_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.basalt", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			super_Gold_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.limestone", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			super_Gold_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.granite", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);
			super_Gold_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.gold.permafrost", blockId++, b -> new BlockLogicSuperOreGold(b)).withBlastResistance(5.0F);

			super_Lapis_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.stone", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			super_Lapis_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.basalt", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			super_Lapis_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.limestone", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			super_Lapis_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.granite", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);
			super_Lapis_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.lapis.permafrost", blockId++, b -> new BlockLogicSuperOreLapis(b)).withBlastResistance(5.0F);

			super_Redstone_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.stone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.STONE, Material.stone, false, FeaturesBlocks.super_Redstone_Stone_Ore, FeaturesBlocks.super_Redstone_Glowing_Stone_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone);
			super_Redstone_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.basalt", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.BASALT, Material.stone, false, FeaturesBlocks.super_Redstone_Basalt_Ore, FeaturesBlocks.super_Redstone_Glowing_Basalt_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone);
			super_Redstone_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.limestone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.LIMESTONE, Material.stone, false, FeaturesBlocks.super_Redstone_Limestone_Ore, FeaturesBlocks.super_Redstone_Glowing_Limestone_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone);
			super_Redstone_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.granite", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.GRANITE, Material.stone, false, FeaturesBlocks.super_Redstone_Granite_Ore, FeaturesBlocks.super_Redstone_Glowing_Granite_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone);
			super_Redstone_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.permafrost", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.PERMAFROST, Material.stone, false, FeaturesBlocks.super_Redstone_Permafrost_Ore, FeaturesBlocks.super_Redstone_Glowing_Permafrost_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone);

			super_Redstone_Glowing_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.stone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.STONE, Material.stone, true, FeaturesBlocks.super_Redstone_Stone_Ore, FeaturesBlocks.super_Redstone_Glowing_Stone_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.basalt", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.BASALT, Material.stone, true, FeaturesBlocks.super_Redstone_Basalt_Ore, FeaturesBlocks.super_Redstone_Glowing_Basalt_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.limestone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.LIMESTONE, Material.stone, true, FeaturesBlocks.super_Redstone_Limestone_Ore, FeaturesBlocks.super_Redstone_Glowing_Limestone_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.granite", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.GRANITE, Material.stone, true, FeaturesBlocks.super_Redstone_Granite_Ore, FeaturesBlocks.super_Redstone_Glowing_Granite_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.permafrost", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.PERMAFROST, Material.stone, true, FeaturesBlocks.super_Redstone_Permafrost_Ore, FeaturesBlocks.super_Redstone_Glowing_Permafrost_Ore)).withBlastResistance(2.0F).withOverrideColor(MaterialColor.redstone).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();

			super_Diamond_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.stone", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			super_Diamond_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.basalt", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			super_Diamond_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.limestone", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			super_Diamond_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.granite", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);
			super_Diamond_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.diamond.permafrost", blockId++, b -> new BlockLogicSuperOreDiamond(b)).withBlastResistance(5.0F);

			super_Nether_Coal_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.nether.coal.netherrack", blockId++, b -> new BlockLogicSuperOreNetherCoal(b)).withBlastResistance(5.0F).withLightEmission(1.0F);
		}

		if (fluxCropsEnabled == 1) {
			flux_Cropws = fullBlock
				.setBlockSound(BlockSounds.GRASS)
				.setHardness(0.0F)
				.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
				.build("crops.flux", blockId++, b -> new BlockLogicCropsFlux(b))
				.withDisabledNeighborNotifyOnMetadataChange()
				.setStatParent(() -> {
					return FeaturesItems.flux_Seed;
				});
		}

		if (burnedLogEnabled == 1){
			burned_Log = fullBlock
				.build("burned.log", blockId++, b -> new BlockLogicBurnedLog(b))
				.withSound(BlockSounds.WOOD)
				.withHardness(2.0F)
				.withDisabledNeighborNotifyOnMetadataChange()
				.withTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE);
		}

		if (netherGravelEnabled == 1) {
			netherrack_Gravel = fullBlock
				.build("netherrack.gravel", blockId++, b -> new BlockLogicGravel(b))
				.withSound(BlockSounds.GRAVEL)
				.withHardness(0.6F)
				.withTags(BlockTags.MINEABLE_BY_SHOVEL);
		}

		if (coloredWorkbenchEnabled == 1){
			vanilla_Colored_Workbench = new BlockBuilder(MOD_ID)
				.setBlockSound(BlockSounds.WOOD)
				.setHardness(2.5F)
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
				.build("vanilla.colored.workbench", blockId++, b -> new BlockLogicColoredWorkbench(b))
				.setBlockItem(b -> new ItemBlockPainted<>(b, false));
		}

		if (newFlowersEnabled == 1){
			white_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.white", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			magenta_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.magenta", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			lime_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.lime", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			gray_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.gray", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			silver_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.silver", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			cyan_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.cyan", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			blue_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.blue", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			brown_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.brown", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			green_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.green", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());

			black_Flower = new BlockBuilder(MOD_ID)
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
				.build("flower.black", blockId++,
					b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setKilledByWeather().setBonemealable());
		}

		if (woodMeshEnabled == 1) {
			wood_Mesh = new BlockBuilder(MOD_ID)
				.setBlockSound(BlockSounds.WOOD)
				.setHardness(1.5F)
				.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.CAN_HANG_OFF)
				.build("mesh.wood", blockId++, b -> new BlockLogicMeshWood(b));
		}

		if (FeaturesMain.deepOn){
			if (superoresEnabled == 1){
				super_Rhodonite_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.setLuminance(15)
					.build("superore.rhodonite.netherrack", blockId++, b -> new BlockLogicSuperOreRhodonite(b))
					.withBlastResistance(5.0F);

				super_Amethyst_Stone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.amethyst.stone", blockId++, b -> new BlockLogicSuperOreAmethyst(b))
					.withBlastResistance(5.0F);
				super_Amethyst_Basalt_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.amethyst.basalt", blockId++, b -> new BlockLogicSuperOreAmethyst(b))
					.withBlastResistance(5.0F);
				super_Amethyst_Limestone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.amethyst.limestone", blockId++, b -> new BlockLogicSuperOreAmethyst(b))
					.withBlastResistance(5.0F);
				super_Amethyst_Granite_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.amethyst.granite", blockId++, b -> new BlockLogicSuperOreAmethyst(b))
					.withBlastResistance(5.0F);
				super_Amethyst_Permafrost_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.amethyst.permafrost", blockId++, b -> new BlockLogicSuperOreAmethyst(b))
					.withBlastResistance(5.0F);

				super_Silver_Stone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.silver.stone", blockId++, b -> new BlockLogicSuperOreSilver(b))
					.withBlastResistance(5.0F);
				super_Silver_Basalt_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.silver.basalt", blockId++, b -> new BlockLogicSuperOreSilver(b))
					.withBlastResistance(5.0F);
				super_Silver_Limestone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.silver.limestone", blockId++, b -> new BlockLogicSuperOreSilver(b))
					.withBlastResistance(5.0F);
				super_Silver_Granite_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.silver.granite", blockId++, b -> new BlockLogicSuperOreSilver(b))
					.withBlastResistance(5.0F);
				super_Silver_Permafrost_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.silver.permafrost", blockId++, b -> new BlockLogicSuperOreSilver(b))
					.withBlastResistance(5.0F);
				super_Silver_Netherrack_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.silver.netherrack", blockId++, b -> new BlockLogicSuperOreSilver(b))
					.withBlastResistance(5.0F);

				super_Uranium_Stone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.uranium.stone", blockId++, b -> new BlockLogicSuperOreUranium(b))
					.withBlastResistance(5.0F);
				super_Uranium_Basalt_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.uranium.basalt", blockId++, b -> new BlockLogicSuperOreUranium(b))
					.withBlastResistance(5.0F);
				super_Uranium_Limestone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.uranium.limestone", blockId++, b -> new BlockLogicSuperOreUranium(b))
					.withBlastResistance(5.0F);
				super_Uranium_Granite_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.uranium.granite", blockId++, b -> new BlockLogicSuperOreUranium(b))
					.withBlastResistance(5.0F);
				super_Uranium_Permafrost_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.uranium.permafrost", blockId++, b -> new BlockLogicSuperOreUranium(b))
					.withBlastResistance(5.0F);

				super_Lead_Stone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.lead.stone", blockId++, b -> new BlockLogicSuperOreLead(b))
					.withBlastResistance(5.0F);
				super_Lead_Basalt_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.lead.basalt", blockId++, b -> new BlockLogicSuperOreLead(b))
					.withBlastResistance(5.0F);
				super_Lead_Limestone_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.lead.limestone", blockId++, b -> new BlockLogicSuperOreLead(b))
					.withBlastResistance(5.0F);
				super_Lead_Granite_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.lead.granite", blockId++, b -> new BlockLogicSuperOreLead(b))
					.withBlastResistance(5.0F);
				super_Lead_Permafrost_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.build("superore.lead.permafrost", blockId++, b -> new BlockLogicSuperOreLead(b))
					.withBlastResistance(5.0F);

				super_Topaz_Ore = fullBlock
					.setTags(BlockTags.MINEABLE_BY_PICKAXE)
					.setHardness(3f)
					.setLuminance(6)
					.build("superore.topaz.netherrack", blockId++, b -> new BlockLogicSuperOreTopaz(b))
					.withBlastResistance(5.0F);
			}
		}

		initializeBlockDetails();
	}
}

