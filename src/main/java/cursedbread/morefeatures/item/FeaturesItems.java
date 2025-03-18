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

	public static ArmorMaterial dandelionArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_dandelion", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial roseArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_rose", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherryArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_cherry", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbushArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial orchidArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_orchid", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial heatherArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_heather", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial bluebellArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_bluebell", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial marigoldArmor = ArmorHelper.createArmorMaterial(MOD_ID, "flowercrown/armor_marigold", 27, 0f, 0f, 0f, 0f);


	public static ArmorMaterial bedrockArmor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock/armor_bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial bedrockExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock/extra_armor_bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial plateArmor = ArmorHelper.createArmorMaterial(MOD_ID, "plate/armor_plate", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial plateExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "plate/extra_armor_plate", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial leatherExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_cloth", 180, 20f, 20f, 20f, 120f);
	public static ArmorMaterial chainExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_chain", 240, 120f, 35f, 35f, 35f);
	public static ArmorMaterial ironExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_iron", 200, 45f, 45f, 45f, 45f);
	public static ArmorMaterial goldExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_gold", 120, 70f, 70f, 70f, 70f);
	public static ArmorMaterial diamondExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_diamond", 800, 65f, 65f, 125f, 65f);
	public static ArmorMaterial steelExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/extra_armor_steel", 1200, 55f, 150f, 55f, 55f);
	public static ArmorMaterial leatherChainArmor = ArmorHelper.createArmorMaterial(MOD_ID, "leatherchain/armor_leatherchain", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial leatherChainExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "leatherchain/extra_armor_leatherchain", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial stoneArmor = ArmorHelper.createArmorMaterial(MOD_ID, "stone/armor_stone", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial stoneExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "stone/extra_armor_stone", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial olivineArmor = ArmorHelper.createArmorMaterial(MOD_ID, "olivine/armor_olivine", 200, 10f, 60f, 20f, 0f);
	public static ArmorMaterial olivineExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "olivine/extra_armor_olivine", 200, 10f, 60f, 20f, 0f);
	public static ArmorMaterial quartzArmor = ArmorHelper.createArmorMaterial(MOD_ID, "quartz/armor_quartz", 200, 10f, 0f, 20f, 30f);
	public static ArmorMaterial quartzExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "quartz/extra_armor_quartz", 200, 10f, 0f, 20f, 30f);

	public static ArmorMaterial catArmor = ArmorHelper.createArmorMaterial(MOD_ID, "other/cat", 200, 0f, 0f, 0f, 0f);


	public static int crownsEnabled;
	//flower
	public static Item dandelionCrown;
	public static Item roseCrown;
	public static Item cherryCrown;
	public static Item deadbushCrown;
	public static Item orchidCrown;
	public static Item heatherCrown;
	public static Item bluebellCrown;
	public static Item marigoldCrown;
	//vanilla armor
	public static Item leatherCrown;
	public static Item chainCrown;
	public static Item ironCrown;
	public static Item goldCrown;
	public static Item diamondCrown;
	public static Item steelCrown;
	//mf armor
	public static Item bedrockCrown;
	public static Item stoneCrown;
	public static Item olivineCrown;
	public static Item quartzCrown;
	public static Item leatherChainCrown;
	public static Item plateCrown;

	public static int blockArmorEnabled;
	//bedrock
	public static Item bedrockHelmet;
	public static Item bedrockChestplate;
	public static Item bedrockLeggings;
	public static Item bedrockBoots;
	//stone
	public static Item stoneHelmet;
	public static Item stoneChestplate;
	public static Item stoneLeggings;
	public static Item stoneBoots;

	public static int oldArmorEnabled;
	//studded
	public static Item leatherChainHelmet;
	public static Item leatherChainChestplate;
	public static Item leatherChainLeggings;
	public static Item leatherChainBoots;
	//plate
	public static Item plateHelmet;
	public static Item plateChestplate;

	public static int miscArmorEnabled;
	//olivine
	public static Item olivineHelmet;
	public static Item olivineChestplate;
	public static Item olivineLeggings;
	public static Item olivineBoots;
	//quartz
	public static Item quartzHelmet;
	public static Item quartzChestplate;
	public static Item quartzLeggings;
	public static Item quartzBoots;

	public static int treasureEnabled;
	public static Item bombBag;
	public static Item bombBagGold;
	public static Item catHelmet;

	public static int miscItemsEnabled;
	public static Item mobSoul;
	public static Item fluxSeed;
	public static Item fertilizerBag;

	public static int newToolsEnabled;
	//workbench
	public static Item workbenchOnStick;
	//paxels
	public static Item paxelWood;
	public static Item paxelStone;
	public static Item paxelIron;
	public static Item paxelGold;
	public static Item paxelDiamond;
	public static Item paxelSteel;
	//climbing pickaxe
	public static Item climbPickaxeWood;
	public static Item climbPickaxeStone;
	public static Item climbPickaxeIron;
	public static Item climbPickaxeGold;
	public static Item climbPickaxeDiamond;
	public static Item climbPickaxeSteel;
	//mining hammer
	public static Item miningHammerWood;
	public static Item miningHammerStone;
	public static Item miningHammerIron;
	public static Item miningHammerGold;
	public static Item miningHammerDiamond;
	public static Item miningHammerSteel;

	public void initilizeItems() {
		//items
		if (crownsEnabled == 1) {
			dandelionCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.dandeline", "morefeatures:item/armor/crown/dandeline_crown", itemId++, dandelionArmor, 3));
			roseCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.rose", "morefeatures:item/armor/crown/rose_crown", itemId++, roseArmor, 3));
			cherryCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.cherry", "morefeatures:item/armor/crown/cherry_crown", itemId++, cherryArmor, 3));
			deadbushCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.deadbush", "morefeatures:item/armor/crown/deadbush_crown", itemId++, deadbushArmor, 3));
			orchidCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.orchid", "morefeatures:item/armor/crown/orchid_crown", itemId++, orchidArmor, 3));
			heatherCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.heather", "morefeatures:item/armor/crown/heather_crown", itemId++, heatherArmor, 3));
			bluebellCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.bluebell", "morefeatures:item/armor/crown/bluebell_crown", itemId++, bluebellArmor, 3));
			marigoldCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.marigold", "morefeatures:item/armor/crown/marigold_crown", itemId++, marigoldArmor, 3));
		}

		if (crownsEnabled == 1) {
			leatherCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.leather", "morefeatures:item/armor/crown/leather_crown", itemId++, leatherExtraArmor, 3));
			chainCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.chain", "morefeatures:item/armor/crown/chain_crown", itemId++, chainExtraArmor, 3));
			ironCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.iron", "morefeatures:item/armor/crown/iron_crown", itemId++, ironExtraArmor, 3));
			goldCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.gold", "morefeatures:item/armor/crown/gold_crown", itemId++, goldExtraArmor, 3));
			diamondCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.diamond", "morefeatures:item/armor/crown/diamond_crown", itemId++, diamondExtraArmor, 3));
			steelCrown= new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.steel", "morefeatures:item/armor/crown/steel_crown", itemId++, steelExtraArmor, 3));

			if (blockArmorEnabled == 1) {
				stoneCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.stone", "morefeatures:item/armor/crown/stone_crown", itemId++, stoneExtraArmor, 3));
			}

			if (miscArmorEnabled == 1) {
				olivineCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.olivine", "morefeatures:item/armor/crown/olivine_crown", itemId++, olivineExtraArmor, 3));
			}

			if (blockArmorEnabled == 1) {
				bedrockCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.bedrock", "morefeatures:item/armor/crown/bedrock_crown", itemId++, bedrockExtraArmor, 3));
			}

			if (oldArmorEnabled == 1) {
				plateCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.plate", "morefeatures:item/armor/crown/plate_crown", itemId++, plateExtraArmor, 3));
			}

			if (oldArmorEnabled == 1) {
				leatherChainCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.leatherchain", "morefeatures:item/armor/crown/leatherchain_crown", itemId++, leatherChainExtraArmor, 3));
			}

			if (miscArmorEnabled == 1) {
				quartzCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.quartz", "morefeatures:item/armor/crown/quartz_crown", itemId++, quartzExtraArmor, 3));
			}
		}

		if (blockArmorEnabled == 1) {
			bedrockHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("helmet.bedrock", "morefeatures:item/armor/bedrock/bedrock_helmet", itemId++, bedrockArmor, 3));
			bedrockChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("chestplate.bedrock", "morefeatures:item/armor/bedrock/bedrock_chestplate", itemId++, bedrockArmor, 2));
			bedrockLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("leggings.bedrock", "morefeatures:item/armor/bedrock/bedrock_leggings", itemId++, bedrockArmor, 1));
			bedrockBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmorUnbreakable("boots.bedrock", "morefeatures:item/armor/bedrock/bedrock_boots", itemId++, bedrockArmor, 0));
		}

		if (oldArmorEnabled == 1) {
			plateHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.plate", "morefeatures:item/armor/plate/plate_helmet", itemId++, plateArmor, 3));
			plateChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.plate", "morefeatures:item/armor/plate/plate_chestplate", itemId++, plateArmor, 2));
		}

		if (oldArmorEnabled == 1) {
			leatherChainHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_helmet", itemId++, leatherChainArmor, 3));
			leatherChainChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_chestplate", itemId++, leatherChainArmor, 2));
			leatherChainLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_leggings", itemId++, leatherChainArmor, 1));
			leatherChainBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.leatherchain", "morefeatures:item/armor/leatherchain/leatherchain_boots", itemId++, leatherChainArmor, 0));
		}

		if (blockArmorEnabled == 1) {
			stoneHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.stone", "morefeatures:item/armor/stone/stone_helmet", itemId++, stoneArmor, 3));
			stoneChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.stone", "morefeatures:item/armor/stone/stone_chestplate", itemId++, stoneArmor, 2));
			stoneLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.stone", "morefeatures:item/armor/stone/stone_leggings", itemId++, stoneArmor, 1));
			stoneBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.stone", "morefeatures:item/armor/stone/stone_boots", itemId++, stoneArmor, 0));
		}

		if (miscArmorEnabled == 1) {
			olivineHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.olivine", "morefeatures:item/armor/olivine/olivine_helmet", itemId++, olivineArmor, 3));
			olivineChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.olivine", "morefeatures:item/armor/olivine/olivine_chestplate", itemId++, olivineArmor, 2));
			olivineLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.olivine", "morefeatures:item/armor/olivine/olivine_leggings", itemId++, olivineArmor, 1));
			olivineBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.olivine", "morefeatures:item/armor/olivine/olivine_boots", itemId++, olivineArmor, 0));
		}

		if (miscArmorEnabled == 1) {
			quartzHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.quartz", "morefeatures:item/armor/quartz/quartz_helmet", itemId++, quartzArmor, 3));
			quartzChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.quartz", "morefeatures:item/armor/quartz/quartz_chestplate", itemId++, quartzArmor, 2));
			quartzLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.quartz", "morefeatures:item/armor/quartz/quartz_leggings", itemId++, quartzArmor, 1));
			quartzBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.quartz", "morefeatures:item/armor/quartz/quartz_boots", itemId++, quartzArmor, 0));
		}

		if (treasureEnabled == 1) {
			bombBag = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiver("bag.normal", "morefeatures:item/armor/artifacts/bomb_bag_empty", itemId++));
			bombBagGold = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiverEndless("bag.gold", "morefeatures:item/armor/artifacts/bomb_bag_gold", itemId++));
		}

		if (newToolsEnabled == 1) {
			workbenchOnStick = new ItemBuilder(MOD_ID)
			    .build(new StickWorkbench("stick.workbench", "morefeatures:item/tool/workbench_on_stick", itemId++));
		}

		if (miscItemsEnabled == 1) {
			mobSoul = new ItemBuilder(MOD_ID)
			    .build(new Item("soul","morefeatures:item/other/soul", itemId++));
		}

		if (newToolsEnabled == 1){
			paxelWood = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.wood", "morefeatures:item/tool/paxel/paxel_wood", itemId++, ToolMaterial.wood));
			paxelStone = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.stone", "morefeatures:item/tool/paxel/paxel_stone", itemId++, ToolMaterial.stone));
			paxelIron = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.iron", "morefeatures:item/tool/paxel/paxel_iron", itemId++, ToolMaterial.iron));
			paxelGold = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.gold", "morefeatures:item/tool/paxel/paxel_gold", itemId++, ToolMaterial.gold));
			paxelDiamond = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.diamond", "morefeatures:item/tool/paxel/paxel_diamond", itemId++, ToolMaterial.diamond));
			paxelSteel = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.steel", "morefeatures:item/tool/paxel/paxel_steel", itemId++, ToolMaterial.steel));

			climbPickaxeWood = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.wood", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_wood", itemId++, ToolMaterial.wood));
			climbPickaxeStone = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.stone", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_stone", itemId++, ToolMaterial.stone));
			climbPickaxeIron = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.iron", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_iron", itemId++, ToolMaterial.iron));
			climbPickaxeGold = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.gold", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_gold", itemId++, ToolMaterial.gold));
			climbPickaxeDiamond = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.diamond", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_diamond", itemId++, ToolMaterial.diamond));
			climbPickaxeSteel = new ItemBuilder(MOD_ID)
				.build(new ItemToolClimbingPickaxe("climbpickaxe.steel", "morefeatures:item/tool/climbing_pickaxe/climbing_pickaxe_steel", itemId++, ToolMaterial.steel));

			miningHammerWood = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.wood", "morefeatures:item/tool/mining_hammer/mining_hammer_wood", itemId++, ToolMaterial.wood));
			miningHammerStone = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.stone", "morefeatures:item/tool/mining_hammer/mining_hammer_stone", itemId++, ToolMaterial.stone));
			miningHammerIron = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.iron", "morefeatures:item/tool/mining_hammer/mining_hammer_iron", itemId++, ToolMaterial.iron));
			miningHammerGold = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.gold", "morefeatures:item/tool/mining_hammer/mining_hammer_gold", itemId++, ToolMaterial.gold));
			miningHammerDiamond = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.diamond", "morefeatures:item/tool/mining_hammer/mining_hammer_diamond", itemId++, ToolMaterial.diamond));
			miningHammerSteel = new ItemBuilder(MOD_ID)
				.build(new ItemToolMiningHammer("mininghammer.steel", "morefeatures:item/tool/mining_hammer/mining_hammer_steel", itemId++, ToolMaterial.steel));
		}

		if (miscItemsEnabled == 1){
			fluxSeed = new ItemBuilder(MOD_ID)
				.build(new ItemSeeds("flux.seed", "morefeatures:item/other/seed_flux", itemId++, FeaturesBlocks.fluxCropws));
		}

		if (treasureEnabled == 1){
			catHelmet = new ItemBuilder(MOD_ID)
				.build(new ItemArmorUnbreakable("cat.helmet", "morefeatures:item/armor/artifacts/armor_helmet_cat", itemId++, catArmor, 3));
		}

		if (miscItemsEnabled == 1){
			fertilizerBag = new ItemBuilder(MOD_ID)
				.build(new ItemFertilizeBag("fertilizer.bag", "morefeatures:item/other/fertilizer_bag/fertilizer_bag_empty", itemId++));
		}
	}
}
