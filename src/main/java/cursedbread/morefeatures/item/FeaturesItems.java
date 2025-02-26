package cursedbread.morefeatures.item;

import net.minecraft.client.render.TextureManager;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import net.minecraft.client.render.item.model.ItemModelStandard;
import turniplabs.halplibe.helper.ModelHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesItems {
	public static int itemId;

	public static ArmorMaterial dandelionArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_dandeline", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial roseArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_rose", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherryArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_cherry", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbushArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial orchidArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_orchid", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial heatherArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_heather", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial bluebellArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_bluebell", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial marigoldArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_marigold", 27, 0f, 0f, 0f, 0f);


	public static ArmorMaterial bedrockArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor_bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial bedrockExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_bedrock_extra", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial plateArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor_plate", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial plateExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_plate_extra", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial leatherExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_cloth_extra", 180, 20f, 20f, 20f, 120f);
	public static ArmorMaterial chainExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_chain_extra", 240, 120f, 35f, 35f, 35f);
	public static ArmorMaterial ironExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_iron_extra", 200, 45f, 45f, 45f, 45f);
	public static ArmorMaterial goldExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_gold_extra", 120, 70f, 70f, 70f, 70f);
	public static ArmorMaterial diamondExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_diamond_extra", 800, 65f, 65f, 125f, 65f);
	public static ArmorMaterial steelExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_steel_extra", 1200, 55f, 150f, 55f, 55f);
	public static ArmorMaterial leatherChainArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor_leatherchain", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial leatherChainExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_leatherchain_extra", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial stoneArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor_stone", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial stoneExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_stone_extra", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial olivineArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor_olivine", 200, 10f, 60f, 20f, 0f);
	public static ArmorMaterial olivineExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_olivine_extra", 200, 10f, 60f, 20f, 0f);
	public static ArmorMaterial quartzArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor_quartz", 200, 10f, 0f, 20f, 30f);
	public static ArmorMaterial quartzExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor_quartz_extra", 200, 10f, 0f, 20f, 30f);


	public static Item dandelionCrown;
	public static Item roseCrown;
	public static Item cherryCrown;
	public static Item deadbushCrown;
	public static Item orchidCrown;
	public static Item heatherCrown;
	public static Item bluebellCrown;
	public static Item marigoldCrown;

	public static int flowerCrownEnabled;
	public static Item leatherCrown;
	public static Item chainCrown;
	public static Item ironCrown;
	public static Item goldCrown;
	public static Item diamondCrown;
	public static Item steelCrown;

	public static int regularCrownEnabled;

	public static Item bedrockHelmet;
	public static Item bedrockChestplate;
	public static Item bedrockLeggings;
	public static Item bedrockBoots;

	public static Item bedrockCrown;

	public static int bedrockArmorEnabled;

	public static Item stoneHelmet;
	public static Item stoneChestplate;
	public static Item stoneLeggings;
	public static Item stoneBoots;

	public static Item stoneCrown;

	public static int stoneArmorEnabled;

	public static Item olivineHelmet;
	public static Item olivineChestplate;
	public static Item olivineLeggings;
	public static Item olivineBoots;

	public static Item olivineCrown;

	public static int olivineArmorEnabled;

	public static Item quartzHelmet;
	public static Item quartzChestplate;
	public static Item quartzLeggings;
	public static Item quartzBoots;

	public static Item quartzCrown;

	public static int quartzArmorEnabled;

	public static Item leatherChainHelmet;
	public static Item leatherChainChestplate;
	public static Item leatherChainLeggings;
	public static Item leatherChainBoots;

	public static Item leatherChainCrown;

	public static int leatherchainArmorEnabled;

	public static Item plateHelmet;
	public static Item plateChestplate;

	public static Item plateCrown;

	public static int plateArmorEnabled;

	public static Item workbenchOnStick;

	public static int workbenchonstickEnabled;
	public static Item bombBag;
	public static Item bombBagGold;

	public static int bombQuibersEnabled;

	public static Item mobSoul;

	public static int soulEnabled;

	public static int paxelsEnabled;
	public static Item paxelWood;
	public static Item paxelStone;
	public static Item paxelIron;
	public static Item paxelGold;
	public static Item paxelDiamond;
	public static Item paxelSteel;

	public void initilizeItems() {
		//items
		if (flowerCrownEnabled == 1) {
			dandelionCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.dandeline", "morefeatures:item/crown_dandeline_helmet", itemId++, dandelionArmor, 3));

			roseCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.rose", "morefeatures:item/crown_rose_helmet", itemId++, roseArmor, 3));

			cherryCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.cherry", "morefeatures:item/crown_cherry_helmet", itemId++, cherryArmor, 3));

			deadbushCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.deadbush", "morefeatures:item/crown_deadbush_helmet", itemId++, deadbushArmor, 3));

			orchidCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.orchid", "morefeatures:item/crown_orchid_helmet", itemId++, orchidArmor, 3));

			heatherCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.heather", "morefeatures:item/crown_heather_helmet", itemId++, heatherArmor, 3));

			bluebellCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.bluebell", "morefeatures:item/crown_bluebell_helmet", itemId++, bluebellArmor, 3));

			marigoldCrown = new ItemBuilder(MOD_ID)
				.build(new ItemArmor("crown.marigold", "morefeatures:item/crown_marigold_helmet", itemId++, marigoldArmor, 3));
		}

		if (regularCrownEnabled == 1) {
			leatherCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.leather", "morefeatures:item/crown_leather_crown", itemId++, leatherExtraArmor, 3));

			chainCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.chain", "morefeatures:item/crown_chain_crown", itemId++, chainExtraArmor, 3));

			ironCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.iron", "morefeatures:item/crown_iron_crown", itemId++, ironExtraArmor, 3));

			goldCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.gold", "morefeatures:item/crown_gold_crown", itemId++, goldExtraArmor, 3));

			diamondCrown = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.diamond", "morefeatures:item/crown_diamond_crown", itemId++, diamondExtraArmor, 3));

			steelCrown= new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("crown.steel", "morefeatures:item/crown_steel_crown", itemId++, steelExtraArmor, 3));

			if (stoneArmorEnabled == 1) {
				stoneCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.stone", "morefeatures:item/crown_stone_crown", itemId++, stoneExtraArmor, 3));
			}

			if (olivineArmorEnabled == 1) {
				olivineCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.olivine", "morefeatures:item/crown_olivine_crown", itemId++, olivineExtraArmor, 3));
			}

			if (bedrockArmorEnabled == 1) {
				bedrockCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.bedrock", "morefeatures:item/crown_bedrock_crown", itemId++, bedrockExtraArmor, 3));
			}

			if (plateArmorEnabled == 1) {
				plateCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.plate", "morefeatures:item/crown_plate_crown", itemId++, plateExtraArmor, 3));
			}

			if (leatherchainArmorEnabled == 1) {
				leatherChainCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.leatherchain", "morefeatures:item/crown_leatherchain_crown", itemId++, leatherChainExtraArmor, 3));
			}

			if (quartzArmorEnabled == 1) {
				quartzCrown = new ItemBuilder(MOD_ID)
				    .build(new ItemArmor("crown.quartz", "morefeatures:item/crown_quartz_crown", itemId++, quartzExtraArmor, 3));
			}
		}

		if (bedrockArmorEnabled == 1) {
			bedrockHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.bedrock", "morefeatures:item/armoritem_bedrock_helmet", itemId++, bedrockArmor, 3));

			bedrockChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.bedrock", "morefeatures:item/armoritem_bedrock_chestplate", itemId++, bedrockArmor, 2));

			bedrockLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.bedrock", "morefeatures:item/armoritem_bedrock_leggings", itemId++, bedrockArmor, 1));

			bedrockBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.bedrock", "morefeatures:item/armoritem_bedrock_boots", itemId++, bedrockArmor, 0));
		}

		if (plateArmorEnabled == 1) {
			plateHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.plate", "morefeatures:item/armoritem_plate_helmet", itemId++, plateArmor, 3));

			plateChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.plate", "morefeatures:item/armoritem_plate_chestplate", itemId++, plateArmor, 2));
		}

		if (leatherchainArmorEnabled == 1) {
			leatherChainHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.leatherchain", "morefeatures:item/armoritem_leatherchain_helmet", itemId++, leatherChainArmor, 3));

			leatherChainChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.leatherchain", "morefeatures:item/armoritem_leatherchain_chestplate", itemId++, leatherChainArmor, 2));

			leatherChainLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.leatherchain", "morefeatures:item/armoritem_leatherchain_leggings", itemId++, leatherChainArmor, 1));

			leatherChainBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.leatherchain", "morefeatures:item/armoritem_leatherchain_boots", itemId++, leatherChainArmor, 0));
		}

		if (stoneArmorEnabled == 1) {
			stoneHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.stone", "morefeatures:item/armoritem_stone_helmet", itemId++, stoneArmor, 3));

			stoneChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.stone", "morefeatures:item/armoritem_stone_chestplate", itemId++, stoneArmor, 2));

			stoneLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.stone", "morefeatures:item/armoritem_stone_leggings", itemId++, stoneArmor, 1));

			stoneBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.stone", "morefeatures:item/armoritem_stone_boots", itemId++, stoneArmor, 0));
		}

		if (olivineArmorEnabled == 1) {
			olivineHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.olivine", "morefeatures:item/armoritem_olivine_helmet", itemId++, olivineArmor, 3));

			olivineChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.olivine", "morefeatures:item/armoritem_olivine_chestplate", itemId++, olivineArmor, 2));

			olivineLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.olivine", "morefeatures:item/armoritem_olivine_leggings", itemId++, olivineArmor, 1));

			olivineBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.olivine", "morefeatures:item/armoritem_olivine_boots", itemId++, olivineArmor, 0));
		}

		if (quartzArmorEnabled == 1) {
			quartzHelmet = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("helmet.quartz", "morefeatures:item/armoritem_quartz_helmet", itemId++, quartzArmor, 3));

			quartzChestplate = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("chestplate.quartz", "morefeatures:item/armoritem_quartz_chestplate", itemId++, quartzArmor, 2));

			quartzLeggings = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("leggings.quartz", "morefeatures:item/armoritem_quartz_leggings", itemId++, quartzArmor, 1));

			quartzBoots = new ItemBuilder(MOD_ID)
			    .build(new ItemArmor("boots.quartz", "morefeatures:item/armoritem_quartz_boots", itemId++, quartzArmor, 0));
		}

		if (bombQuibersEnabled == 1) {
			bombBag = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiver("bag.normal", "morefeatures:item/extra_item_bomb_bag_empty", itemId++));

			bombBagGold = new ItemBuilder(MOD_ID)
			    .build(new ItemBombQuiverEndless("bag.gold", "morefeatures:item/extra_item_bomb_bag_gold", itemId++));
		}

		if (workbenchonstickEnabled == 1) {
			workbenchOnStick = new ItemBuilder(MOD_ID)
			    .build(new StickWorkbench("stick.workbench", "morefeatures:item/extra_item_workbench_on_stick", itemId++));
		}

		if (soulEnabled == 1) {
			mobSoul = new ItemBuilder(MOD_ID)
			    .build(new Item("soul","morefeatures:item/extra_item_soul", itemId++));
		}

		if (paxelsEnabled == 1){
			paxelWood = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.wood", "morefeatures:item/tool_paxel_wood", itemId++, ToolMaterial.wood));

			paxelStone = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.stone", "morefeatures:item/tool_paxel_stone", itemId++, ToolMaterial.stone));

			paxelIron = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.iron", "morefeatures:item/tool_paxel_iron", itemId++, ToolMaterial.iron));

			paxelGold = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.gold", "morefeatures:item/tool_paxel_gold", itemId++, ToolMaterial.gold));

			paxelDiamond = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.diamond", "morefeatures:item/tool_paxel_diamond", itemId++, ToolMaterial.diamond));

			paxelSteel = new ItemBuilder(MOD_ID)
				.build(new ItemToolPaxel("paxel.steel", "morefeatures:item/tool_paxel_steel", itemId++, ToolMaterial.steel));
		}
	}
}
