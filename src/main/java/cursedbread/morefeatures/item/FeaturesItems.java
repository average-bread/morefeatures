package cursedbread.morefeatures.item;

import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.stitcher.TextureRegistry;

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
			    .setIcon("morefeatures:item/crown_dandeline_helmet")
			    .build(new ItemArmor("crown.dandeline", itemId++, dandelionArmor, 0));

			roseCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_rose_helmet")
			    .build(new ItemArmor("crown.rose", itemId++, roseArmor, 0));

			cherryCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_cherry_helmet")
			    .build(new ItemArmor("crown.cherry", itemId++, cherryArmor, 0));

			deadbushCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_deadbush_helmet")
			    .build(new ItemArmor("crown.deadbush", itemId++, deadbushArmor, 0));

			orchidCrown = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/crown_orchid_helmet")
				.build(new ItemArmor("crown.orchid", itemId++, orchidArmor, 0));

			heatherCrown = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/crown_heather_helmet")
				.build(new ItemArmor("crown.heather", itemId++, heatherArmor, 0));

			bluebellCrown = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/crown_bluebell_helmet")
				.build(new ItemArmor("crown.bluebell", itemId++, bluebellArmor, 0));

			marigoldCrown = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/crown_marigold_helmet")
				.build(new ItemArmor("crown.marigold", itemId++, marigoldArmor, 0));
		}

		if (regularCrownEnabled == 1) {
			leatherCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_leather_crown")
			    .build(new ItemArmor("crown.leather", itemId++, leatherExtraArmor, 0));

			chainCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_chain_crown")
			    .build(new ItemArmor("crown.chain", itemId++, chainExtraArmor, 0));

			ironCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_iron_crown")
			    .build(new ItemArmor("crown.iron", itemId++, ironExtraArmor, 0));

			goldCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_gold_crown")
			    .build(new ItemArmor("crown.gold", itemId++, goldExtraArmor, 0));

			diamondCrown = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_diamond_crown")
			    .build(new ItemArmor("crown.diamond", itemId++, diamondExtraArmor, 0));

			steelCrown= new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/crown_steel_crown")
			    .build(new ItemArmor("crown.steel", itemId++, steelExtraArmor, 0));

			if (stoneArmorEnabled == 1) {
				stoneCrown = new ItemBuilder(MOD_ID)
				    .setIcon("morefeatures:item/crown_stone_crown")
				    .build(new ItemArmor("crown.stone", itemId++, stoneExtraArmor, 0));
			}

			if (olivineArmorEnabled == 1) {
				olivineCrown = new ItemBuilder(MOD_ID)
				    .setIcon("morefeatures:item/crown_olivine_crown")
				    .build(new ItemArmor("crown.olivine", itemId++, olivineExtraArmor, 0));
			}

			if (bedrockArmorEnabled == 1) {
				bedrockCrown = new ItemBuilder(MOD_ID)
				    .setIcon("morefeatures:item/crown_bedrock_crown")
				    .build(new ItemArmor("crown.bedrock", itemId++, bedrockExtraArmor, 0));
			}

			if (plateArmorEnabled == 1) {
				plateCrown = new ItemBuilder(MOD_ID)
				    .setIcon("morefeatures:item/crown_plate_crown")
				    .build(new ItemArmor("crown.plate", itemId++, plateExtraArmor, 0));
			}

			if (leatherchainArmorEnabled == 1) {
				leatherChainCrown = new ItemBuilder(MOD_ID)
				    .setIcon("morefeatures:item/crown_leatherchain_crown")
				    .build(new ItemArmor("crown.leatherchain", itemId++, leatherChainExtraArmor, 0));
			}

			if (quartzArmorEnabled == 1) {
				quartzCrown = new ItemBuilder(MOD_ID)
				    .setIcon("morefeatures:item/crown_quartz_crown")
				    .build(new ItemArmor("crown.quartz", itemId++, quartzExtraArmor, 0));
			}
		}

		if (bedrockArmorEnabled == 1) {
			bedrockHelmet = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_bedrock_helmet")
			    .build(new ItemArmor("helmet.bedrock", itemId++, bedrockArmor, 0));

			bedrockChestplate = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_bedrock_chestplate")
			    .build(new ItemArmor("chestplate.bedrock", itemId++, bedrockArmor, 1));

			bedrockLeggings = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_bedrock_leggings")
			    .build(new ItemArmor("leggings.bedrock", itemId++, bedrockArmor, 2));

			bedrockBoots = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_bedrock_boots")
			    .build(new ItemArmor("boots.bedrock", itemId++, bedrockArmor, 3));
		}

		if (plateArmorEnabled == 1) {
			plateHelmet = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_plate_helmet")
			    .build(new ItemArmor("helmet.plate", itemId++, plateArmor, 0));

			plateChestplate = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_plate_chestplate")
			    .build(new ItemArmor("chestplate.plate", itemId++, plateArmor, 1));
		}

		if (leatherchainArmorEnabled == 1) {
			leatherChainHelmet = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_leatherchain_helmet")
			    .build(new ItemArmor("helmet.leatherchain", itemId++, leatherChainArmor, 0));

			leatherChainChestplate = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_leatherchain_chestplate")
			    .build(new ItemArmor("chestplate.leatherchain", itemId++, leatherChainArmor, 1));

			leatherChainLeggings = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_leatherchain_leggings")
			    .build(new ItemArmor("leggings.leatherchain", itemId++, leatherChainArmor, 2));

			leatherChainBoots = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_leatherchain_boots")
			    .build(new ItemArmor("boots.leatherchain", itemId++, leatherChainArmor, 3));
		}

		if (stoneArmorEnabled == 1) {
			stoneHelmet = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_stone_helmet")
			    .build(new ItemArmor("helmet.stone", itemId++, stoneArmor, 0));

			stoneChestplate = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_stone_chestplate")
			    .build(new ItemArmor("chestplate.stone", itemId++, stoneArmor, 1));

			stoneLeggings = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_stone_leggings")
			    .build(new ItemArmor("leggings.stone", itemId++, stoneArmor, 2));

			stoneBoots = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_stone_boots")
			    .build(new ItemArmor("boots.stone", itemId++, stoneArmor, 3));
		}

		if (olivineArmorEnabled == 1) {
			olivineHelmet = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_olivine_helmet")
			    .build(new ItemArmor("helmet.olivine", itemId++, olivineArmor, 0));

			olivineChestplate = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_olivine_chestplate")
			    .build(new ItemArmor("chestplate.olivine", itemId++, olivineArmor, 1));

			olivineLeggings = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_olivine_leggings")
			    .build(new ItemArmor("leggings.olivine", itemId++, olivineArmor, 2));

			olivineBoots = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_olivine_boots")
			    .build(new ItemArmor("boots.olivine", itemId++, olivineArmor, 3));
		}

		if (quartzArmorEnabled == 1) {
			quartzHelmet = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_quartz_helmet")
			    .build(new ItemArmor("helmet.quartz", itemId++, quartzArmor, 0));

			quartzChestplate = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_quartz_chestplate")
			    .build(new ItemArmor("chestplate.quartz", itemId++, quartzArmor, 1));

			quartzLeggings = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_quartz_leggings")
			    .build(new ItemArmor("leggings.quartz", itemId++, quartzArmor, 2));

			quartzBoots = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/armoritem_quartz_boots")
			    .build(new ItemArmor("boots.quartz", itemId++, quartzArmor, 3));
		}

		if (bombQuibersEnabled == 1) {
			bombBag = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/extra_item_bomb_bag_empty")
			    .setItemModel(item -> new ItemModelBombQuiver(item, "morefeatures"))
			    .build(new ItemBombQuiver("bag.normal", itemId++));

			bombBagGold = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/extra_item_bomb_bag_gold")
			    .build(new ItemBombQuiverEndless("bag.gold", itemId++));
		}

		if (workbenchonstickEnabled == 1) {
			workbenchOnStick = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/extra_item_workbench_on_stick")
			    .setItemModel(item -> new ItemModelStandard(item, "morefeatures").setFull3D())
			    .build(new StickWorkbench("stick.workbench", itemId++));
		}

		if (soulEnabled == 1) {
			mobSoul = new ItemBuilder(MOD_ID)
			    .setIcon("morefeatures:item/extra_item_soul")
			    .build(new Item("soul", itemId++));
		}

		if (paxelsEnabled == 1){
			paxelWood = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/tool_paxel_wood")
				.setItemModel(item -> new ItemModelStandard(item, "morefeatures").setFull3D())
				.build(new ItemToolPaxel("paxel.wood", itemId++, ToolMaterial.wood));

			paxelStone = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/tool_paxel_stone")
				.setItemModel(item -> new ItemModelStandard(item, "morefeatures").setFull3D())
				.build(new ItemToolPaxel("paxel.stone", itemId++, ToolMaterial.stone));

			paxelIron = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/tool_paxel_iron")
				.setItemModel(item -> new ItemModelStandard(item, "morefeatures").setFull3D())
				.build(new ItemToolPaxel("paxel.iron", itemId++, ToolMaterial.iron));

			paxelGold = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/tool_paxel_gold")
				.setItemModel(item -> new ItemModelStandard(item, "morefeatures").setFull3D())
				.build(new ItemToolPaxel("paxel.gold", itemId++, ToolMaterial.gold));

			paxelDiamond = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/tool_paxel_diamond")
				.setItemModel(item -> new ItemModelStandard(item, "morefeatures").setFull3D())
				.build(new ItemToolPaxel("paxel.diamond", itemId++, ToolMaterial.diamond));

			paxelSteel = new ItemBuilder(MOD_ID)
				.setIcon("morefeatures:item/tool_paxel_steel")
				.setItemModel(item -> new ItemModelStandard(item, "morefeatures").setFull3D())
				.build(new ItemToolPaxel("paxel.steel", itemId++, ToolMaterial.steel));
		}
	}
}
