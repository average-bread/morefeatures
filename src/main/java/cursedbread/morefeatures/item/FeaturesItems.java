package cursedbread.morefeatures.item;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.artifacts.ItemArmorUnbreakable;
import cursedbread.morefeatures.item.artifacts.ItemBombQuiver;
import cursedbread.morefeatures.item.artifacts.ItemBombQuiverEndless;
import cursedbread.morefeatures.item.other.ItemFertilizeBag;
import cursedbread.morefeatures.item.tool.ItemToolClimbingPickaxe;
import cursedbread.morefeatures.item.tool.ItemToolMiningHammer;
import cursedbread.morefeatures.item.tool.ItemToolPaxel;
import cursedbread.morefeatures.item.tool.StickWorkbench;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemSeeds;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesItems {
	public static int itemId;

	public static ArmorMaterial dandelion_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_dandelion", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial rose_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_rose", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherry_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_cherry", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbush_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial orchid_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_orchid", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial heather_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_heather", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial bluebell_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_bluebell", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial marigold_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_marigold", 27, 0f, 0f, 0f, 0f);


	public static ArmorMaterial bedrock_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock/armor_bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial bedrock_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock/extra_armor_bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial plate_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "plate/armor_plate", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial plate_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "plate/extra_armor_plate", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial leather_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_cloth", 180, 20f, 20f, 20f, 120f);
	public static ArmorMaterial chain_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_chain", 240, 120f, 35f, 35f, 35f);
	public static ArmorMaterial iron_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_iron", 200, 45f, 45f, 45f, 45f);
	public static ArmorMaterial gold_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_gold", 120, 70f, 70f, 70f, 70f);
	public static ArmorMaterial diamond_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_diamond", 800, 65f, 65f, 125f, 65f);
	public static ArmorMaterial steel_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_steel", 1200, 55f, 150f, 55f, 55f);
	public static ArmorMaterial leather_Chain_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "leatherchain/armor_leatherchain", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial leather_Chain_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "leatherchain/extra_armor_leatherchain", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial stone_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "stone/armor_stone", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial stone_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "stone/extra_armor_stone", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial olivine_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "olivine/armor_olivine", 200, 10f, 60f, 20f, 0f);
	public static ArmorMaterial olivine_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "olivine/extra_armor_olivine", 200, 10f, 60f, 20f, 0f);
	public static ArmorMaterial quartz_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "quartz/armor_quartz", 200, 10f, 0f, 20f, 30f);
	public static ArmorMaterial quartz_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "quartz/extra_armor_quartz", 200, 10f, 0f, 20f, 30f);

	public static ArmorMaterial cat_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "other/cat", 200, 0f, 0f, 0f, 0f);


	public static int crownsEnabled;
	//flower
	public static Item dandelion_Crown;
	public static Item rose_Crown;
	public static Item cherry_Crown;
	public static Item deadbush_Crown;
	public static Item orchid_Crown;
	public static Item heather_Crown;
	public static Item bluebell_Crown;
	public static Item marigold_Crown;
	//vanilla armor
	public static Item leather_Crown;
	public static Item chain_Crown;
	public static Item iron_Crown;
	public static Item gold_Crown;
	public static Item diamond_Crown;
	public static Item steel_Crown;
	//mf armor
	public static Item bedrock_Crown;
	public static Item stone_Crown;
	public static Item olivine_Crown;
	public static Item quartz_Crown;
	public static Item leather_Chain_Crown;
	public static Item plate_Crown;

	public static int blockArmorEnabled;
	//bedrock
	public static Item bedrock_Helmet;
	public static Item bedrock_Chestplate;
	public static Item bedrock_Leggings;
	public static Item bedrock_Boots;
	//stone
	public static Item stone_Helmet;
	public static Item stone_Chestplate;
	public static Item stone_Leggings;
	public static Item stone_Boots;

	public static int oldArmorEnabled;
	//studded
	public static Item leather_Chain_Helmet;
	public static Item leather_Chain_Chestplate;
	public static Item leather_Chain_Leggings;
	public static Item leather_Chain_Boots;
	//plate
	public static Item plate_Helmet;
	public static Item plate_Chestplate;

	public static int miscArmorEnabled;
	//olivine
	public static Item olivine_Helmet;
	public static Item olivine_Chestplate;
	public static Item olivine_Leggings;
	public static Item olivine_Boots;
	//quartz
	public static Item quartz_Helmet;
	public static Item quartz_Chestplate;
	public static Item quartz_Leggings;
	public static Item quartz_Boots;

	public static int treasureEnabled;
	public static Item bomb_Bag;
	public static Item bomb_Bag_Gold;
	public static Item cat_Helmet;

	public static int miscItemsEnabled;
	public static Item mob_Soul;
	public static Item flux_Seed;
	public static Item fertilizer_Bag;

	public static int newToolsEnabled;
	//workbench
	public static Item workbench_On_Stick;
	//paxels
	public static Item paxel_Wood;
	public static Item paxel_Stone;
	public static Item paxel_Iron;
	public static Item paxel_Gold;
	public static Item paxel_Diamond;
	public static Item paxel_Steel;
	//climbing pickaxe
	public static Item climb_Pickaxe_Wood;
	public static Item climb_Pickaxe_Stone;
	public static Item climb_Pickaxe_Iron;
	public static Item climb_Pickaxe_Gold;
	public static Item climb_Pickaxe_Diamond;
	public static Item climb_Pickaxe_Steel;
	//mining hammer
	public static Item mining_Hammer_Wood;
	public static Item mining_Hammer_Stone;
	public static Item mining_Hammer_Iron;
	public static Item mining_Hammer_Gold;
	public static Item mining_Hammer_Diamond;
	public static Item mining_Hammer_Steel;

	public void initilizeItems() {
		//items
		if (crownsEnabled == 1) {
			dandelion_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.dandeline", "morefeatures:item/armor/crown/dandeline_crown", itemId++, dandelion_Armor, 3));
			rose_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.rose", "morefeatures:item/armor/crown/rose_crown", itemId++, rose_Armor, 3));
			cherry_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.cherry", "morefeatures:item/armor/crown/cherry_crown", itemId++, cherry_Armor, 3));
			deadbush_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.deadbush", "morefeatures:item/armor/crown/deadbush_crown", itemId++, deadbush_Armor, 3));
			orchid_Crown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.orchid", "morefeatures:item/armor/crown/orchid_crown", itemId++, orchid_Armor, 3));
			heather_Crown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.heather", "morefeatures:item/armor/crown/heather_crown", itemId++, heather_Armor, 3));
			bluebell_Crown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.bluebell", "morefeatures:item/armor/crown/bluebell_crown", itemId++, bluebell_Armor, 3));
			marigold_Crown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.marigold", "morefeatures:item/armor/crown/marigold_crown", itemId++, marigold_Armor, 3));
		}

		if (crownsEnabled == 1) {
			leather_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.leather", "morefeatures:item/armor/crown/leather_crown", itemId++, leather_Extra_Armor, 3));
			chain_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.chain", "morefeatures:item/armor/crown/chain_crown", itemId++, chain_Extra_Armor, 3));
			iron_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.iron", "morefeatures:item/armor/crown/iron_crown", itemId++, iron_Extra_Armor, 3));
			gold_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.gold", "morefeatures:item/armor/crown/gold_crown", itemId++, gold_Extra_Armor, 3));
			diamond_Crown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.diamond", "morefeatures:item/armor/crown/diamond_crown", itemId++, diamond_Extra_Armor, 3));
			steel_Crown= new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.steel", "morefeatures:item/armor/crown/steel_crown", itemId++, steel_Extra_Armor, 3));

			if (blockArmorEnabled == 1) {
				stone_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.stone", "morefeatures:item/armor/crown/stone_crown", itemId++, stone_Extra_Armor, 3));
			}

			if (miscArmorEnabled == 1) {
				olivine_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.olivine", "morefeatures:item/armor/crown/olivine_crown", itemId++, olivine_Extra_Armor, 3));
			}

			if (blockArmorEnabled == 1) {
				bedrock_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmorUnbreakable("crown.bedrock", "morefeatures:item/armor/crown/bedrock_crown", itemId++, bedrock_Extra_Armor, 3));
			}

			if (oldArmorEnabled == 1) {
				plate_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.plate", "morefeatures:item/armor/crown/plate_crown", itemId++, plate_Extra_Armor, 3));
			}

			if (oldArmorEnabled == 1) {
				leather_Chain_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.leatherchain", "morefeatures:item/armor/crown/leatherchain_crown", itemId++, leather_Chain_Extra_Armor, 3));
			}

			if (miscArmorEnabled == 1) {
				quartz_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.quartz", "morefeatures:item/armor/crown/quartz_crown", itemId++, quartz_Extra_Armor, 3));
			}
		}

		if (blockArmorEnabled == 1) {
			bedrock_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("helmet.bedrock", "morefeatures:item/armor/bedrock/bedrock_helmet", itemId++, bedrock_Armor, 3));
			bedrock_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("chestplate.bedrock", "morefeatures:item/armor/bedrock/bedrock_chestplate", itemId++, bedrock_Armor, 2));
			bedrock_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("leggings.bedrock", "morefeatures:item/armor/bedrock/bedrock_leggings", itemId++, bedrock_Armor, 1));
			bedrock_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("boots.bedrock", "morefeatures:item/armor/bedrock/bedrock_boots", itemId++, bedrock_Armor, 0));
		}

		if (oldArmorEnabled == 1) {
			plate_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.plate", "morefeatures:item/armor/plate/plate_helmet", itemId++, plate_Armor, 3));
			plate_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.plate", "morefeatures:item/armor/plate/plate_chestplate", itemId++, plate_Armor, 2));
		}

		if (oldArmorEnabled == 1) {
			leather_Chain_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_helmet", itemId++, leather_Chain_Armor, 3));
			leather_Chain_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_chestplate", itemId++, leather_Chain_Armor, 2));
			leather_Chain_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_leggings", itemId++, leather_Chain_Armor, 1));
			leather_Chain_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_boots", itemId++, leather_Chain_Armor, 0));
		}

		if (blockArmorEnabled == 1) {
			stone_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.stone", "morefeatures:item/armor/stone/stone_helmet", itemId++, stone_Armor, 3));
			stone_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.stone", "morefeatures:item/armor/stone/stone_chestplate", itemId++, stone_Armor, 2));
			stone_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.stone", "morefeatures:item/armor/stone/stone_leggings", itemId++, stone_Armor, 1));
			stone_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.stone", "morefeatures:item/armor/stone/stone_boots", itemId++, stone_Armor, 0));
		}

		if (miscArmorEnabled == 1) {
			olivine_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.olivine", "morefeatures:item/armor/olivine/olivine_helmet", itemId++, olivine_Armor, 3));
			olivine_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.olivine", "morefeatures:item/armor/olivine/olivine_chestplate", itemId++, olivine_Armor, 2));
			olivine_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.olivine", "morefeatures:item/armor/olivine/olivine_leggings", itemId++, olivine_Armor, 1));
			olivine_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.olivine", "morefeatures:item/armor/olivine/olivine_boots", itemId++, olivine_Armor, 0));
		}

		if (miscArmorEnabled == 1) {
			quartz_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.quartz", "morefeatures:item/armor/quartz/quartz_helmet", itemId++, quartz_Armor, 3));
			quartz_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.quartz", "morefeatures:item/armor/quartz/quartz_chestplate", itemId++, quartz_Armor, 2));
			quartz_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.quartz", "morefeatures:item/armor/quartz/quartz_leggings", itemId++, quartz_Armor, 1));
			quartz_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.quartz", "morefeatures:item/armor/quartz/quartz_boots", itemId++, quartz_Armor, 0));
		}

		if (treasureEnabled == 1) {
			bomb_Bag = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiver("bag.normal", "morefeatures:item/armor/artifacts/bomb_bag_empty", itemId++));
			bomb_Bag_Gold = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiverEndless("bag.gold", "morefeatures:item/armor/artifacts/bomb_bag_gold", itemId++));
		}

		if (newToolsEnabled == 1) {
			workbench_On_Stick = new ItemBuilder(MOD_ID)
			    .build(new StickWorkbench("stick.workbench", "morefeatures:item/tool/workbench_on_stick", itemId++));
		}

		if (miscItemsEnabled == 1) {
			mob_Soul = new ItemBuilder(MOD_ID)
			    .build(new Item("soul","morefeatures:item/other/soul", itemId++));
		}

		if (newToolsEnabled == 1){
			paxel_Wood = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.wood", "morefeatures:item/tool/paxel/paxel_wood", itemId++, ToolMaterial.wood));
			paxel_Stone = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.stone", "morefeatures:item/tool/paxel/paxel_stone", itemId++, ToolMaterial.stone));
			paxel_Iron = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.iron", "morefeatures:item/tool/paxel/paxel_iron", itemId++, ToolMaterial.iron));
			paxel_Gold = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.gold", "morefeatures:item/tool/paxel/paxel_gold", itemId++, ToolMaterial.gold));
			paxel_Diamond = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.diamond", "morefeatures:item/tool/paxel/paxel_diamond", itemId++, ToolMaterial.diamond));
			paxel_Steel = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.steel", "morefeatures:item/tool/paxel/paxel_steel", itemId++, ToolMaterial.steel));

			climb_Pickaxe_Wood = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.wood", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_wood", itemId++, ToolMaterial.wood));
			climb_Pickaxe_Stone = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.stone", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_stone", itemId++, ToolMaterial.stone));
			climb_Pickaxe_Iron = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.iron", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_iron", itemId++, ToolMaterial.iron));
			climb_Pickaxe_Gold = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.gold", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_gold", itemId++, ToolMaterial.gold));
			climb_Pickaxe_Diamond = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.diamond", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_diamond", itemId++, ToolMaterial.diamond));
			climb_Pickaxe_Steel = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.steel", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_steel", itemId++, ToolMaterial.steel));

			mining_Hammer_Wood = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.wood", "morefeatures:item/tool/mining_hammer/mining_hammer_wood", itemId++, ToolMaterial.wood));
			mining_Hammer_Stone = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.stone", "morefeatures:item/tool/mining_hammer/mining_hammer_stone", itemId++, ToolMaterial.stone));
			mining_Hammer_Iron = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.iron", "morefeatures:item/tool/mining_hammer/mining_hammer_iron", itemId++, ToolMaterial.iron));
			mining_Hammer_Gold = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.gold", "morefeatures:item/tool/mining_hammer/mining_hammer_gold", itemId++, ToolMaterial.gold));
			mining_Hammer_Diamond = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.diamond", "morefeatures:item/tool/mining_hammer/mining_hammer_diamond", itemId++, ToolMaterial.diamond));
			mining_Hammer_Steel = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.steel", "morefeatures:item/tool/mining_hammer/mining_hammer_steel", itemId++, ToolMaterial.steel));
		}

		if (miscItemsEnabled == 1){
			flux_Seed = new ItemBuilder(MOD_ID)
				.build(new ItemSeeds("flux.seed", "morefeatures:item/other/seed_flux", itemId++, FeaturesBlocks.flux_Cropws));
		}

		if (treasureEnabled == 1){
			cat_Helmet = new ItemBuilder(MOD_ID)
				.build(new ItemArmorUnbreakable("cat.helmet", "morefeatures:item/armor/artifacts/armor_helmet_cat", itemId++, cat_Armor, 3));
		}

		if (miscItemsEnabled == 1){
			fertilizer_Bag = new ItemBuilder(MOD_ID)
				.build(new ItemFertilizeBag("fertilizer.bag", "morefeatures:item/other/fertilizer_bag/fertilizer_bag_empty", itemId++));
		}
	}
}
