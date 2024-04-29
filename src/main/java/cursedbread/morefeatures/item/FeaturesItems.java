package cursedbread.morefeatures.item;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesItems {
	public static int itemId;

	public static ArmorMaterial dandelionArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/dandeline", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial roseArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/rose", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherryArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/cherry", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbushArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial bedrockArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor/bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial bedrockExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/bedrock_extra", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial plateArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor/plate", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial plateExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/plate_extra", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial leatherExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/cloth_extra", 180, 20f, 20f, 20f, 120f);
	public static ArmorMaterial chainExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/chain_extra", 240, 120f, 35f, 35f, 35f);
	public static ArmorMaterial ironExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/iron_extra", 200, 45f, 45f, 45f, 45f);
	public static ArmorMaterial goldExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/gold_extra", 120, 70f, 70f, 70f, 70f);
	public static ArmorMaterial diamondExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/diamond_extra", 800, 65f, 65f, 125f, 65f);
	public static ArmorMaterial steelExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/steel_extra", 1200, 55f, 150f, 55f, 55f);
	public static ArmorMaterial leatherChainArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor/leatherchain", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial leatherChainExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/leatherchain_extra", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial stoneArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor/stone", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial stoneExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/stone_extra", 190, 30f, 30f, 30f, 30f);
	public static ArmorMaterial olivineArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor/olivine", 200, 0f, 0f, 0f, 0f);
	public static ArmorMaterial olivineExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/olivine_extra", 200, 0f, 0f, 0f, 0f);
	public static ArmorMaterial quartzArmor = ArmorHelper.createArmorMaterial(MOD_ID, "armor/quartz", 200, 10f, 0f, 20f, 30f);
	public static ArmorMaterial quartzExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/quartz_extra", 200, 10f, 0f, 20f, 30f);


	public static Item dandelionCrown;
	public static Item roseCrown;
	public static Item cherryCrown;
	public static Item deadbushCrown;

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

	public void initilizeItems() {

		//items
		if (flowerCrownEnabled == 1) {
			dandelionCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.dandeline", itemId++, dandelionArmor, 0), "crown/dandeline_helmet.png");
			roseCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.rose", itemId++, roseArmor, 0), "crown/rose_helmet.png");
			cherryCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.cherry", itemId++, cherryArmor, 0), "crown/cherry_helmet.png");
			deadbushCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.deadbush", itemId++, deadbushArmor, 0), "crown/deadbush_helmet.png");
		}
		if (regularCrownEnabled == 1) {
			leatherCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.leather", itemId++, leatherExtraArmor, 0), "crown/leather_crown.png");
			chainCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.chain", itemId++, chainExtraArmor, 0), "crown/chain_crown.png");
			ironCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.iron", itemId++, ironExtraArmor, 0), "crown/iron_crown.png");
			goldCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.gold", itemId++, goldExtraArmor, 0), "crown/gold_crown.png");
			diamondCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.diamond", itemId++, diamondExtraArmor, 0), "crown/diamond_crown.png");
			steelCrown= ItemHelper.createItem(MOD_ID, new ItemArmor("crown.steel", itemId++, steelExtraArmor, 0), "crown/steel_crown.png");
			if (stoneArmorEnabled == 1) {
				stoneCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.stone", itemId++, stoneExtraArmor, 0), "crown/stone_crown.png");
			}
			if (olivineArmorEnabled == 1) {
				olivineCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.olivine", itemId++, olivineExtraArmor, 0), "crown/olivine_crown.png");
			}
			if (bedrockArmorEnabled == 1) {
				bedrockCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.bedrock", itemId++, bedrockExtraArmor, 0), "crown/bedrock_crown.png");
			}
			if (plateArmorEnabled == 1) {
				plateCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.plate", itemId++, plateExtraArmor, 0), "crown/plate_crown.png");
			}
			if (leatherchainArmorEnabled == 1) {
				leatherChainCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.leatherchain", itemId++, leatherChainExtraArmor, 0), "crown/leatherchain_crown.png");
			}
			if (quartzArmorEnabled == 1) {
				quartzCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.quartz", itemId++, quartzExtraArmor, 0), "crown/quartz_crown.png");
			}
		}

		if (bedrockArmorEnabled == 1) {
			bedrockHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.bedrock", itemId++, bedrockArmor, 0), "armoritem/bedrock_helmet.png");
			bedrockChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.bedrock", itemId++, bedrockArmor, 1), "armoritem/bedrock_chestplate.png");
			bedrockLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.bedrock", itemId++, bedrockArmor, 2), "armoritem/bedrock_leggings.png");
			bedrockBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.bedrock", itemId++, bedrockArmor, 3), "armoritem/bedrock_boots.png");
		}

		if (plateArmorEnabled == 1) {
			plateHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.plate", itemId++, plateArmor, 0), "armoritem/plate_helmet.png");
			plateChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.plate", itemId++, plateArmor, 1), "armoritem/plate_chestplate.png");
		}

		if (leatherchainArmorEnabled == 1) {
			leatherChainHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.leatherchain", itemId++, leatherChainArmor, 0), "armoritem/leatherchain_helmet.png");
			leatherChainChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.leatherchain", itemId++, leatherChainArmor, 1), "armoritem/leatherchain_chestplate.png");
			leatherChainLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.leatherchain", itemId++, leatherChainArmor, 2), "armoritem/leatherchain_leggings.png");
			leatherChainBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.leatherchain", itemId++, leatherChainArmor, 3), "armoritem/leatherchain_boots.png");
		}

		if (stoneArmorEnabled == 1) {
			stoneHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.stone", itemId++, stoneArmor, 0), "armoritem/stone_helmet.png");
			stoneChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.stone", itemId++, stoneArmor, 1), "armoritem/stone_chestplate.png");
			stoneLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.stone", itemId++, stoneArmor, 2), "armoritem/stone_leggings.png");
			stoneBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.stone", itemId++, stoneArmor, 3), "armoritem/stone_boots.png");
		}

		if (olivineArmorEnabled == 1) {
			olivineHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.olivine", itemId++, olivineArmor, 0), "armoritem/olivine_helmet.png");
			olivineChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.olivine", itemId++, olivineArmor, 1), "armoritem/olivine_chestplate.png");
			olivineLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.olivine", itemId++, olivineArmor, 2), "armoritem/olivine_leggings.png");
			olivineBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.olivine", itemId++, olivineArmor, 3), "armoritem/olivine_boots.png");
		}

		if (quartzArmorEnabled == 1) {
			quartzHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.quartz", itemId++, quartzArmor, 0), "armoritem/quartz_helmet.png");
			quartzChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.quartz", itemId++, quartzArmor, 1), "armoritem/quartz_chestplate.png");
			quartzLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.quartz", itemId++, quartzArmor, 2), "armoritem/quartz_leggings.png");
			quartzBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.quartz", itemId++, quartzArmor, 3), "armoritem/quartz_boots.png");
		}


		if (bombQuibersEnabled == 1) {
			TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra_item/bomb_bag_empty.png");
			TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra_item/bomb_bag_full.png");
			bombBag = ItemHelper.createItem(MOD_ID, new ItemBombQuiver("bag.normal", itemId++), "extra_item/bomb_bag_empty.png");
			bombBagGold = ItemHelper.createItem(MOD_ID, new ItemBombQuiverEndless("bag.gold", itemId++), "extra_item/bomb_bag_gold.png");
		}

		if (workbenchonstickEnabled == 1) {
			workbenchOnStick = ItemHelper.createItem(MOD_ID, new StickWorkbench("stick.workbench", itemId++), "extra_item/workbench_on_stick.png");
		}

		if (soulEnabled == 1){
			mobSoul = ItemHelper.createItem(MOD_ID, new Item("soul", itemId++), "extra_item/soul.png");
		}
	}
}
