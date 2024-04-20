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

	public static ArmorMaterial dandelionArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/dandeline", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial roseArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/rose", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherryArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/cherry", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbushArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial bedrockArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial plateArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/plate_armor", 240, 58f, 58f, 58f, 58f);
	public static ArmorMaterial leatherExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/cloth_crown", 180, 20f, 20f, 20f, 120f);
	public static ArmorMaterial chainExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/chain_crown", 240, 120f, 35f, 35f, 35f);
	public static ArmorMaterial ironExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/iron_crown", 200, 45f, 45f, 45f, 45f);
	public static ArmorMaterial goldExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/gold_crown", 120, 70f, 70f, 70f, 70f);
	public static ArmorMaterial diamondExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/diamond_crown", 800, 65f, 65f, 125f, 65f);
	public static ArmorMaterial steelExtraArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/steel_crown", 1200, 55f, 150f, 55f, 55f);
	public static ArmorMaterial leatherChainArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/leatherchain", 360, 120f, 30f, 30f, 120f);
	public static ArmorMaterial stoneArmor = ArmorHelper.createArmorMaterial(MOD_ID, "extra_armor/stone", 190, 30f, 30f, 30f, 30f);


	public static Item dandelionCrown;
	public static Item roseCrown;
	public static Item cherryCrown;
	public static Item deadbushCrown;
	public static Item leatherCrown;
	public static Item chainCrown;
	public static Item ironCrown;
	public static Item goldCrown;
	public static Item diamondCrown;
	public static Item steelCrown;

	public static Item bedrockHelmet;
	public static Item bedrockChestplate;
	public static Item bedrockLeggings;
	public static Item bedrockBoots;

	public static Item stoneHelmet;
	public static Item stoneChestplate;
	public static Item stoneLeggings;
	public static Item stoneBoots;

	public static Item leatherChainHelmet;
	public static Item leatherChainChestplate;
	public static Item leatherChainLeggings;
	public static Item leatherChainBoots;

	public static Item plateHelmet;
	public static Item plateChestplate;

	public static Item workbenchOnStick;
	public static Item bombBag;
	public static Item bombBagGold;

	public void initilizeItems() {

		//items
		TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra/bomb_bag_empty.png");
		TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra/bomb_bag_full.png");


		dandelionCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.dandeline", itemId++, dandelionArmor, 0), "crown/dandeline_helmet.png");
		roseCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.rose", itemId++, roseArmor, 0), "crown/rose_helmet.png");
		cherryCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.cherry", itemId++, cherryArmor, 0), "crown/cherry_helmet.png");
		deadbushCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.deadbush", itemId++, deadbushArmor, 0), "crown/deadbush_helmet.png");
		leatherCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.leather", itemId++, leatherExtraArmor, 0), "crown/leather_crown.png");
		chainCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.chain", itemId++, chainExtraArmor, 0), "crown/chain_crown.png");
		ironCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.iron", itemId++, ironExtraArmor, 0), "crown/iron_crown.png");
		goldCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.gold", itemId++, goldExtraArmor, 0), "crown/gold_crown.png");
		diamondCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.diamond", itemId++, diamondExtraArmor, 0), "crown/diamond_crown.png");
		steelCrown= ItemHelper.createItem(MOD_ID, new ItemArmor("crown.steel", itemId++, steelExtraArmor, 0), "crown/steel_crown.png");

		bedrockHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.bedrock", itemId++, bedrockArmor, 0), "armoritem/bedrock_helmet.png");
		bedrockChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.bedrock", itemId++, bedrockArmor, 1), "armoritem/bedrock_chestplate.png");
		bedrockLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.bedrock", itemId++, bedrockArmor, 2), "armoritem/bedrock_leggings.png");
		bedrockBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.bedrock", itemId++, bedrockArmor, 3), "armoritem/bedrock_boots.png");

		plateHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.plate", itemId++, plateArmor, 0), "armoritem/plate_helmet.png");
		plateChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.plate", itemId++, plateArmor, 1), "armoritem/plate_chestplate.png");

		leatherChainHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.leatherchain", itemId++, leatherChainArmor, 0), "armoritem/leatherchain_helmet.png");
		leatherChainChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.leatherchain", itemId++, leatherChainArmor, 1), "armoritem/leatherchain_chestplate.png");
		leatherChainLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.leatherchain", itemId++, leatherChainArmor, 2), "armoritem/leatherchain_leggings.png");
		leatherChainBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.leatherchain", itemId++, leatherChainArmor, 3), "armoritem/leatherchain_boots.png");

		stoneHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.stone", itemId++, stoneArmor, 0), "armoritem/stone_helmet.png");
		stoneChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.stone", itemId++, stoneArmor, 1), "armoritem/stone_chestplate.png");
		stoneLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.stone", itemId++, stoneArmor, 2), "armoritem/stone_leggings.png");
		stoneBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.stone", itemId++, stoneArmor, 3), "armoritem/stone_boots.png");

		bombBag = ItemHelper.createItem(MOD_ID, new ItemBombQuiver("bag.normal", itemId++), "extra/bomb_bag_empty.png");
		bombBagGold = ItemHelper.createItem(MOD_ID, new ItemBombQuiverEndless("bag.gold", itemId++), "extra/bomb_bag_gold.png");

		workbenchOnStick = ItemHelper.createItem(MOD_ID, new StickWorkbench("stick.workbench", itemId++), "extra/workbench_on_stick.png");
	}
}
