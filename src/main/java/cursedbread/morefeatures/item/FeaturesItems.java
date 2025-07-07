package cursedbread.morefeatures.item;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.artifacts.ItemBombQuiver;
import cursedbread.morefeatures.item.artifacts.ItemBombQuiverEndless;
import cursedbread.morefeatures.item.other.ItemFertilizeBag;
import cursedbread.morefeatures.item.tool.*;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemBucket;
import net.minecraft.core.item.ItemSeeds;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.item.tool.ItemToolSword;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import useless.moonsteel.MoonSteelItems;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesItems {
	public static int itemId;

	public static ArmorMaterial dandelion_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_dandelion", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial rose_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_rose", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherry_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_cherry", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbush_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial orchid_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_orchid", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial heather_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_heather", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial bluebell_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_bluebell", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial marigold_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_marigold", 0, 0f, 0f, 0f, 0f);

	public static ArmorMaterial daisy_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_daisy", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial delphiniums_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_delphiniums", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial angelica_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_angelica", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial allium_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_allium", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial dustymiller_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_dustymiller", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cyanrose_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_cyanrose", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial bluepoppy_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_bluepoppy", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial dahlia_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_dahlia", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial barrelcactus_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_barrelcactus", 0, 0f, 0f, 0f, 0f);
	public static ArmorMaterial blacktulip_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_blacktulip", 0, 0f, 0f, 0f, 0f);


	public static ArmorMaterial bedrock_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock/armor_bedrock", 0, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial bedrock_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock/extra_armor_bedrock", 0, 999999999f, 999999999f, 999999999f, 999999999f);
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

	public static ArmorMaterial cat_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "other/cat", 0, 0f, 0f, 0f, 0f);

	public static ToolMaterial glassTool = new ToolMaterial().setDurability(1).setDamage(10);

	public static ArmorMaterial moonsteel_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/moonsteel/extra_armor_moonsteel", 800, 51f, 45f, 45f, 100f);
	public static ArmorMaterial amethyst_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/deep/extra_armor_amethyst", 55, 80.0F, 80.0F, 80.0F, 80.0F);
	public static ArmorMaterial silver_Extra_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/deep/extra_armor_silver", 160, 60.0F, 50.0F, 50.0F, 40.0F);

	public static ToolMaterial amethyst = new ToolMaterial().setDurability(96).setEfficiency(55.0F, 100.0F).setMiningLevel(3).setDamage(5).setBlockHitDelay(0);
	public static ToolMaterial silver = new ToolMaterial().setDurability(512).setEfficiency(4.0F, 9.0F).setMiningLevel(2).setSilkTouch(true);
	public static ToolMaterial lead = new ToolMaterial().setDurability(512).setEfficiency(7.0F, 10.0F).setMiningLevel(2);


	public static int flowercrownsEnabled;
	public static Item dandelion_Crown;
	public static Item rose_Crown;
	public static Item cherry_Crown;
	public static Item deadbush_Crown;
	public static Item orchid_Crown;
	public static Item heather_Crown;
	public static Item bluebell_Crown;
	public static Item marigold_Crown;

	public static Item daisy_Crown;
	public static Item delphiniums_Crown;
	public static Item angelica_Crown;
	public static Item allium_Crown;
	public static Item dustymiller_Crown;
	public static Item cyanrose_Crown;
	public static Item bluepoppy_Crown;
	public static Item dahlia_Crown;
	public static Item barrelcactus_Crown;
	public static Item blacktulip_Crown;

	public static int normalCrownsEnabled;
	public static Item leather_Crown;
	public static Item chain_Crown;
	public static Item iron_Crown;
	public static Item gold_Crown;
	public static Item diamond_Crown;
	public static Item steel_Crown;
	public static Item bedrock_Crown;
	public static Item stone_Crown;
	public static Item olivine_Crown;
	public static Item quartz_Crown;
	public static Item leather_Chain_Crown;
	public static Item plate_Crown;

	public static Item moonsteel_Crown;
	public static Item amethyst_Crown;
	public static Item silver_Crown;

	public static int bedrockArmorEnabled;
	public static Item bedrock_Helmet;
	public static Item bedrock_Chestplate;
	public static Item bedrock_Leggings;
	public static Item bedrock_Boots;

	public static int stoneArmorEnabled;
	public static Item stone_Helmet;
	public static Item stone_Chestplate;
	public static Item stone_Leggings;
	public static Item stone_Boots;

	public static int studdedArmorEnabled;
	public static Item leather_Chain_Helmet;
	public static Item leather_Chain_Chestplate;
	public static Item leather_Chain_Leggings;
	public static Item leather_Chain_Boots;

	public static int plateArmorEnabled;
	public static Item plate_Helmet;
	public static Item plate_Chestplate;

	public static int olivineArmorEnabled;
	public static Item olivine_Helmet;
	public static Item olivine_Chestplate;
	public static Item olivine_Leggings;
	public static Item olivine_Boots;

	public static int quartzArmorEnabled;
	public static Item quartz_Helmet;
	public static Item quartz_Chestplate;
	public static Item quartz_Leggings;
	public static Item quartz_Boots;

	public static int bombBagEnabled;
	public static Item bomb_Bag;
	public static Item bomb_Bag_Gold;

	public static int cathelmetEnabled;
	public static Item cat_Helmet;

	public static int mobSoulEnabled;
	public static Item mob_Soul;

	public static Item flux_Seed;

	public static int ferlilizerBagEnabled;
	public static Item fertilizer_Bag;

	public static int workbenchOnStickEnabled;
	public static Item workbench_On_Stick;

	public static int paxelsEnabled;
	public static Item paxel_Wood;
	public static Item paxel_Stone;
	public static Item paxel_Iron;
	public static Item paxel_Gold;
	public static Item paxel_Diamond;
	public static Item paxel_Steel;

	public static Item paxel_Moonsteel;
	public static Item paxel_Amethyst;
	public static Item paxel_Silver;
	public static Item paxel_Lead;

	public static int climbPickaxesEnabled;
	public static Item climb_Pickaxe_Wood;
	public static Item climb_Pickaxe_Stone;
	public static Item climb_Pickaxe_Iron;
	public static Item climb_Pickaxe_Gold;
	public static Item climb_Pickaxe_Diamond;
	public static Item climb_Pickaxe_Steel;

	public static Item climb_pickaxe_Monnsteel;
	public static Item climb_pickaxe_Amethyst;
	public static Item climb_pickaxe_Silver;
	public static Item climb_pickaxe_Lead;

	public static int miningHammersEnabled;
	public static Item mining_Hammer_Wood;
	public static Item mining_Hammer_Stone;
	public static Item mining_Hammer_Iron;
	public static Item mining_Hammer_Gold;
	public static Item mining_Hammer_Diamond;
	public static Item mining_Hammer_Steel;

	public static Item mining_hammer_MoonSteel;
	public static Item mining_hammer_Amethyst;
	public static Item mining_hammer_Silver;
	public static Item mining_hammer_Lead;

	public static int glassSwordEnabled;
	public static Item glass_Sword;

	public void initilizeItems() {
		//items
		if (flowercrownsEnabled == 1) {
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

			if (FeaturesBlocks.newFlowersEnabled == 1){
				daisy_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.daisy", "morefeatures:item/armor/crown/daisy_crown", itemId++,daisy_Armor, 3));

				delphiniums_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.delphiniums", "morefeatures:item/armor/crown/delphiniums_crown", itemId++,delphiniums_Armor, 3));

				angelica_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.angelica", "morefeatures:item/armor/crown/angelica_crown", itemId++,angelica_Armor, 3));

				allium_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.allium", "morefeatures:item/armor/crown/allium_crown", itemId++,allium_Armor, 3));

				dustymiller_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.dustymiller", "morefeatures:item/armor/crown/dustymiller_crown", itemId++,dustymiller_Armor, 3));

				cyanrose_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.cyanrose", "morefeatures:item/armor/crown/cyanrose_crown", itemId++,cyanrose_Armor, 3));

				bluepoppy_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.bluepoppy", "morefeatures:item/armor/crown/bluepoppy_crown", itemId++,bluepoppy_Armor, 3));

				dahlia_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.dahlia", "morefeatures:item/armor/crown/dahlia_crown", itemId++,dahlia_Armor, 3));

				barrelcactus_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.barrelcactus", "morefeatures:item/armor/crown/barrelcactus_crown", itemId++,barrelcactus_Armor, 3));

				blacktulip_Crown = new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.blacktulip", "morefeatures:item/armor/crown/blacktulip_crown", itemId++,blacktulip_Armor, 3));
			}
		}

		if (normalCrownsEnabled == 1) {
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

			if (stoneArmorEnabled == 1) {
				stone_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.stone", "morefeatures:item/armor/crown/stone_crown", itemId++, stone_Extra_Armor, 3));
			}

			if (olivineArmorEnabled == 1) {
				olivine_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.olivine", "morefeatures:item/armor/crown/olivine_crown", itemId++, olivine_Extra_Armor, 3));
			}

			if (bedrockArmorEnabled == 1) {
				bedrock_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.bedrock", "morefeatures:item/armor/crown/bedrock_crown", itemId++, bedrock_Extra_Armor, 3));
			}

			if (plateArmorEnabled == 1) {
				plate_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.plate", "morefeatures:item/armor/crown/plate_crown", itemId++, plate_Extra_Armor, 3));
			}

			if (studdedArmorEnabled == 1) {
				leather_Chain_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.leatherchain", "morefeatures:item/armor/crown/leatherchain_crown", itemId++, leather_Chain_Extra_Armor, 3));
			}

			if (quartzArmorEnabled == 1) {
				quartz_Crown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.quartz", "morefeatures:item/armor/crown/quartz_crown", itemId++, quartz_Extra_Armor, 3));
			}
		}

		if (bedrockArmorEnabled == 1) {
			bedrock_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.bedrock", "morefeatures:item/armor/bedrock/bedrock_helmet", itemId++, bedrock_Armor, 3));
			bedrock_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.bedrock", "morefeatures:item/armor/bedrock/bedrock_chestplate", itemId++, bedrock_Armor, 2));
			bedrock_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.bedrock", "morefeatures:item/armor/bedrock/bedrock_leggings", itemId++, bedrock_Armor, 1));
			bedrock_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.bedrock", "morefeatures:item/armor/bedrock/bedrock_boots", itemId++, bedrock_Armor, 0));
		}

		if (plateArmorEnabled == 1) {
			plate_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.plate", "morefeatures:item/armor/plate/plate_helmet", itemId++, plate_Armor, 3));
			plate_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.plate", "morefeatures:item/armor/plate/plate_chestplate", itemId++, plate_Armor, 2));
		}

		if (studdedArmorEnabled == 1) {
			leather_Chain_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_helmet", itemId++, leather_Chain_Armor, 3));
			leather_Chain_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_chestplate", itemId++, leather_Chain_Armor, 2));
			leather_Chain_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_leggings", itemId++, leather_Chain_Armor, 1));
			leather_Chain_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_boots", itemId++, leather_Chain_Armor, 0));
		}

		if (stoneArmorEnabled == 1) {
			stone_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.stone", "morefeatures:item/armor/stone/stone_helmet", itemId++, stone_Armor, 3));
			stone_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.stone", "morefeatures:item/armor/stone/stone_chestplate", itemId++, stone_Armor, 2));
			stone_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.stone", "morefeatures:item/armor/stone/stone_leggings", itemId++, stone_Armor, 1));
			stone_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.stone", "morefeatures:item/armor/stone/stone_boots", itemId++, stone_Armor, 0));
		}

		if (olivineArmorEnabled == 1) {
			olivine_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.olivine", "morefeatures:item/armor/olivine/olivine_helmet", itemId++, olivine_Armor, 3));
			olivine_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.olivine", "morefeatures:item/armor/olivine/olivine_chestplate", itemId++, olivine_Armor, 2));
			olivine_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.olivine", "morefeatures:item/armor/olivine/olivine_leggings", itemId++, olivine_Armor, 1));
			olivine_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.olivine", "morefeatures:item/armor/olivine/olivine_boots", itemId++, olivine_Armor, 0));
		}

		if (quartzArmorEnabled == 1) {
			quartz_Helmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.quartz", "morefeatures:item/armor/quartz/quartz_helmet", itemId++, quartz_Armor, 3));
			quartz_Chestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.quartz", "morefeatures:item/armor/quartz/quartz_chestplate", itemId++, quartz_Armor, 2));
			quartz_Leggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.quartz", "morefeatures:item/armor/quartz/quartz_leggings", itemId++, quartz_Armor, 1));
			quartz_Boots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.quartz", "morefeatures:item/armor/quartz/quartz_boots", itemId++, quartz_Armor, 0));
		}

		if (bombBagEnabled == 1) {
			bomb_Bag = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiver("bag.normal", "morefeatures:item/armor/artifacts/bomb_bag_empty", itemId++));
			bomb_Bag_Gold = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiverEndless("bag.gold", "morefeatures:item/armor/artifacts/bomb_bag_gold", itemId++));
		}

		if (workbenchOnStickEnabled == 1) {
			workbench_On_Stick = new ItemBuilder(MOD_ID)
			    .build(new StickWorkbench("stick.workbench", "morefeatures:item/tool/workbench_on_stick", itemId++));
		}

		if (mobSoulEnabled == 1) {
			mob_Soul = new ItemBuilder(MOD_ID)
			    .build(new Item("soul","morefeatures:item/other/soul", itemId++));
		}

		if (paxelsEnabled == 1){
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
		}

		if (climbPickaxesEnabled == 1) {
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
		}

		if (miningHammersEnabled == 1){
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

		if (FeaturesBlocks.fluxCropsEnabled == 1){
			flux_Seed = new ItemBuilder(MOD_ID)
				.build(new ItemSeeds("flux.seed", "morefeatures:item/other/seed_flux", itemId++, FeaturesBlocks.flux_Cropws));
		}

		if (cathelmetEnabled == 1){
			cat_Helmet = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("cat.helmet", "morefeatures:item/armor/artifacts/armor_helmet_cat", itemId++, cat_Armor, 3));
		}

		if (ferlilizerBagEnabled == 1){
			fertilizer_Bag = new ItemBuilder(MOD_ID)
				.build(new ItemFertilizeBag("fertilizer.bag", "morefeatures:item/other/fertilizer_bag/fertilizer_bag_empty", itemId++));
		}

		if (glassSwordEnabled == 1){
			glass_Sword = new ItemBuilder(MOD_ID)
				.build(new ItemToolGlassSword("tool.sword.glass", "morefeatures:item/tool/tool_sword_glass", itemId++, glassTool)).withTags(new Tag[]{ItemTags.PREVENT_CREATIVE_MINING});
		}

		if (FeaturesMain.moonmoonmoonOn){
			if (normalCrownsEnabled == 1){
				moonsteel_Crown= new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.moonsteel", "morefeatures:item/armor/crown/moonsteel/moonsteel_crown", itemId++, moonsteel_Extra_Armor, 3));
			}
			if (paxelsEnabled == 1){
				paxel_Moonsteel = new ItemBuilder(MOD_ID)
					.build(new ItemToolPaxel("paxel.moonsteel", "morefeatures:item/tool/paxel/moonsteel/paxel_moonsteel", itemId++, MoonSteelItems.moonSteelTool));
			}
			if (climbPickaxesEnabled == 1){
				climb_pickaxe_Monnsteel = new ItemBuilder(MOD_ID)
					.build(new ItemToolClimbingPickaxe("climbpickaxe.moonsteel", "morefeatures:item/tool/climbing_pickaxe/moonsteel/climbing_pickaxe_moonsteel", itemId++, MoonSteelItems.moonSteelTool));
			}
			if (miningHammersEnabled == 1){
				mining_hammer_MoonSteel = new ItemBuilder(MOD_ID)
					.build(new ItemToolMiningHammer("mininghammer.moonsteel", "morefeatures:item/tool/mining_hammer/moonsteel/mining_hammer_moonsteel", itemId++, MoonSteelItems.moonSteelTool));
			}
		}

		if (FeaturesMain.deepOn){
			if (normalCrownsEnabled == 1){
				amethyst_Crown= new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.amethyst", "morefeatures:item/armor/crown/deep/amethyst_crown", itemId++, amethyst_Extra_Armor, 3));
				silver_Crown= new ItemBuilder(MOD_ID)
					.build(new ItemArmor("crown.silver", "morefeatures:item/armor/crown/deep/silver_crown", itemId++, silver_Extra_Armor, 3));
			}
			if (paxelsEnabled == 1){
				paxel_Amethyst = new ItemBuilder(MOD_ID)
					.build(new ItemToolPaxel("paxel.amethyst", "morefeatures:item/tool/paxel/deep/paxel_amethyst", itemId++, amethyst));
				paxel_Silver = new ItemBuilder(MOD_ID)
					.build(new ItemToolPaxel("paxel.silver", "morefeatures:item/tool/paxel/deep/paxel_silver", itemId++, silver));
				paxel_Lead = new ItemBuilder(MOD_ID)
					.build(new ItemToolPaxel("paxel.lead", "morefeatures:item/tool/paxel/deep/paxel_lead", itemId++, lead));
			}
			if (climbPickaxesEnabled == 1){
				climb_pickaxe_Amethyst = new ItemBuilder(MOD_ID)
					.build(new ItemToolClimbingPickaxe("climbpickaxe.amethyst", "morefeatures:item/tool/climbing_pickaxe/deep/climbing_pickaxe_amethyst", itemId++, amethyst));
				climb_pickaxe_Silver = new ItemBuilder(MOD_ID)
					.build(new ItemToolClimbingPickaxe("climbpickaxe.silver", "morefeatures:item/tool/climbing_pickaxe/deep/climbing_pickaxe_silver", itemId++, silver));
				climb_pickaxe_Lead = new ItemBuilder(MOD_ID)
					.build(new ItemToolClimbingPickaxe("climbpickaxe.lead", "morefeatures:item/tool/climbing_pickaxe/deep/climbing_pickaxe_lead", itemId++, lead));
			}
			if (miningHammersEnabled == 1){
				mining_hammer_Amethyst = new ItemBuilder(MOD_ID)
					.build(new ItemToolMiningHammer("mininghammer.amethyst", "morefeatures:item/tool/mining_hammer/deep/mining_hammer_amethyst", itemId++, amethyst));
				mining_hammer_Silver = new ItemBuilder(MOD_ID)
					.build(new ItemToolMiningHammer("mininghammer.silver", "morefeatures:item/tool/mining_hammer/deep/mining_hammer_silver", itemId++, silver));
				mining_hammer_Lead = new ItemBuilder(MOD_ID)
					.build(new ItemToolMiningHammer("mininghammer.lead", "morefeatures:item/tool/mining_hammer/deep/mining_hammer_lead", itemId++, lead));
			}
		}
	}
}
