package cursedbread.morefeatures.blocks;

import cursedbread.morefeatures.blocks.colored.workbench.BlockLogicColoredWorkbench;
import cursedbread.morefeatures.blocks.flux.BlockLogicCropsFlux;
import cursedbread.morefeatures.blocks.colored.glass.BlockLogicColoredGlass;
import cursedbread.morefeatures.blocks.colored.glass.BlockLogicColoredGlassTrapdoor;
import cursedbread.morefeatures.blocks.colored.glowstone.BlockLogicColoredGlowstone;
import cursedbread.morefeatures.blocks.ores.*;
import cursedbread.morefeatures.blocks.other.BlockLogicBurnedLog;
import cursedbread.morefeatures.blocks.other.BlockLogicGilder;
import cursedbread.morefeatures.blocks.other.BlockLogicHam;
import cursedbread.morefeatures.blocks.colored.paperwall.BlockLogicColoredPaperwall;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

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

	public static int netherGravelEnabled;
	public static Block<?> netherrack_Gravel;

	public static int coloredLadderEnabled;
	public static Block<?> vanilla_Colored_Ladder;

	public static int coloredWorkbenchEnabled;
	public static Block<?> vanilla_Colored_Workbench;

	private void initializeBlockDetails() {

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
				.build("superore.redstone.stone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.STONE, Material.stone, false, FeaturesBlocks.super_Redstone_Stone_Ore, FeaturesBlocks.super_Redstone_Glowing_Stone_Ore)).withBlastResistance(2.0F);
			super_Redstone_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.basalt", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.BASALT, Material.stone, false, FeaturesBlocks.super_Redstone_Basalt_Ore, FeaturesBlocks.super_Redstone_Glowing_Basalt_Ore)).withBlastResistance(2.0F);
			super_Redstone_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.limestone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.LIMESTONE, Material.stone, false, FeaturesBlocks.super_Redstone_Limestone_Ore, FeaturesBlocks.super_Redstone_Glowing_Limestone_Ore)).withBlastResistance(2.0F);
			super_Redstone_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.granite", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.GRANITE, Material.stone, false, FeaturesBlocks.super_Redstone_Granite_Ore, FeaturesBlocks.super_Redstone_Glowing_Granite_Ore)).withBlastResistance(2.0F);
			super_Redstone_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build("superore.redstone.permafrost", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.PERMAFROST, Material.stone, false, FeaturesBlocks.super_Redstone_Permafrost_Ore, FeaturesBlocks.super_Redstone_Glowing_Permafrost_Ore)).withBlastResistance(2.0F);

			super_Redstone_Glowing_Stone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.stone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.STONE, Material.stone, true, FeaturesBlocks.super_Redstone_Stone_Ore, FeaturesBlocks.super_Redstone_Glowing_Stone_Ore)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Basalt_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.basalt", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.BASALT, Material.stone, true, FeaturesBlocks.super_Redstone_Basalt_Ore, FeaturesBlocks.super_Redstone_Glowing_Basalt_Ore)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Limestone_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.limestone", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.LIMESTONE, Material.stone, true, FeaturesBlocks.super_Redstone_Limestone_Ore, FeaturesBlocks.super_Redstone_Glowing_Limestone_Ore)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Granite_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.granite", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.GRANITE, Material.stone, true, FeaturesBlocks.super_Redstone_Granite_Ore, FeaturesBlocks.super_Redstone_Glowing_Granite_Ore)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			super_Redstone_Glowing_Permafrost_Ore = fullBlock
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build("superore.redstone.glowing.permafrost", blockId++, b -> new BlockLogicSuperOreRedstone(b, Blocks.PERMAFROST, Material.stone, true, FeaturesBlocks.super_Redstone_Permafrost_Ore, FeaturesBlocks.super_Redstone_Glowing_Permafrost_Ore)).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();

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

//		if (coloredLadderEnabled == 1){
//			vanilla_Colored_Ladder = new BlockBuilder(MOD_ID)
//				.build("vanilla.colored.ladder", blockId++, b -> new BlockLogicColoredLadder(b))
//				.withSound(BlockSounds.WOOD)
//				.withHardness(0.4F)
//				.withDisabledNeighborNotifyOnMetadataChange()
//				.setBlockItem(ItemBlockLadder::new)
//				.withTags(new Tag[]{BlockTags.MINEABLE_BY_AXE});
//		}

		if (coloredWorkbenchEnabled == 1){
			vanilla_Colored_Workbench = new BlockBuilder(MOD_ID)
				.setBlockSound(BlockSounds.WOOD)
				.setHardness(2.5F)
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
				.build("vanilla.colored.workbench", blockId++, b -> new BlockLogicColoredWorkbench(b))
				.setBlockItem((b) -> {return new ItemBlockPainted<>(b, false);});
		}
		initializeBlockDetails();
	}
}

