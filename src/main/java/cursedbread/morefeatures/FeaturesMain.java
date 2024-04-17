package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.VanilaBlockColoredGlowstone;
import cursedbread.morefeatures.blocks.VanilaBlockColoredPaperwall;
import cursedbread.morefeatures.item.ItemBombQuiver;
import cursedbread.morefeatures.item.ItemBombQuiverEndless;
import cursedbread.morefeatures.item.StickWorkbench;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.*;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class FeaturesMain implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "morefeatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static BlockBuilder glowstoneBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setLuminance(15)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.5f);

	public static BlockBuilder paperwallBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setBlockSound(BlockSounds.CLOTH)
		.setHardness(0.5f);

	public static BlockBuilder fireBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(3))
		.setLuminance(15)
		.setHardness(0.1f);

	public static int blockId;
	public static int itemId;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2000");
		prop.setProperty("starting_item_id","17000");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");
		itemId = config.getInt("starting_item_id");

		config.updateConfig();
	}
	public static Block vanillaColoredGlowstone;
	public static Block vanillaColoredPaperwall;

	public static ArmorMaterial dandelionArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/dandeline", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial roseArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/rose", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherryArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/cherry", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbushArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial bedrockArmor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock_armor/bedrock", 999999999, 999999999f, 999999999f, 999999999f, 999999999f);
	public static ArmorMaterial leatherCrownArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/cloth_crown", 180, 20f, 20f, 20f, 120f);
	public static ArmorMaterial chainCrownArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/chain_crown", 240, 120f, 35f, 35f, 35f);
	public static ArmorMaterial ironCrownArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/iron_crown", 200, 45f, 45f, 45f, 45f);
	public static ArmorMaterial goldCrownArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/gold_crown", 120, 70f, 70f, 70f, 70f);
	public static ArmorMaterial diamondCrownArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/diamond_crown", 800, 65f, 65f, 125f, 65f);
	public static ArmorMaterial steelCrownArmor = ArmorHelper.createArmorMaterial(MOD_ID, "crown/steel_crown", 1200, 55f, 150f, 55f, 55f);
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

	public static Item workbenchOnStick;
	public static Item bombBag;
	public static Item bombBagGold;
    @Override
    public void onInitialize() {
        LOGGER.info("Adding some stuff");
    }

	private void initializeBlockDetails() {
		Item.itemsList[vanillaColoredGlowstone.id] = new ItemBlockPainted(vanillaColoredGlowstone, false);
		Item.itemsList[vanillaColoredPaperwall.id] = new ItemBlockPainted(vanillaColoredPaperwall, false);
		for (int color = 2; color < 17; color++) {
			CreativeHelper.setParent(vanillaColoredGlowstone, color - 1, FeaturesMain.vanillaColoredGlowstone, 0);
		}
		for (int color = 2; color < 17; color++) {
			CreativeHelper.setParent(vanillaColoredPaperwall, color - 1, FeaturesMain.vanillaColoredPaperwall, 0);
		}
	}

	@Override
	public void beforeGameStart() {
		TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra/bomb_bag_empty.png");
		TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra/bomb_bag_full.png");
		vanillaColoredGlowstone = glowstoneBlock
			.setTextures("glowstone/black_glowstone.png").setTextures("glowstone/red_glowstone.png").setTextures("glowstone/green_glowstone.png").setTextures("glowstone/brown_glowstone.png").setTextures("glowstone/blue_glowstone.png").setTextures("glowstone/purple_glowstone.png").setTextures("glowstone/cyan_glowstone.png").setTextures("glowstone/silver_glowstone.png")
			.setTextures("glowstone/gray_glowstone.png").setTextures("glowstone/pink_glowstone.png").setTextures("glowstone/lime_glowstone.png").setTextures("glowstone/yellow_glowstone.png").setTextures("glowstone/lightblue_glowstone.png").setTextures("glowstone/magenta_glowstone.png").setTextures("glowstone/orange_glowstone.png").setTextures("glowstone/white_glowstone.png")
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new VanilaBlockColoredGlowstone("vanilla.colored.glowstone", blockId++, Material.glass));

		vanillaColoredGlowstone = glowstoneBlock
			.setTextures("paperwall/black_paperwall.png").setTextures("paperwall/red_paperwall.png").setTextures("paperwall/green_paperwall.png").setTextures("paperwall/brown_paperwall.png").setTextures("paperwall/blue_paperwall.png").setTextures("paperwall/purple_paperwall.png").setTextures("paperwall/cyan_paperwall.png").setTextures("paperwall/silver_paperwall.png")
			.setTextures("paperwall/gray_paperwall.png").setTextures("paperwall/pink_paperwall.png").setTextures("paperwall/lime_paperwall.png").setTextures("paperwall/yellow_paperwall.png").setTextures("paperwall/lightblue_paperwall.png").setTextures("paperwall/magenta_paperwall.png").setTextures("paperwall/orange_paperwall.png").setTextures("paperwall/white_paperwall.png")
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new VanilaBlockColoredPaperwall("vanilla.colored.paperwall", blockId++, Material.glass));

		dandelionCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.dandeline", itemId++, dandelionArmor, 0), "crown/dandeline_helmet.png");
		roseCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.rose", itemId++, roseArmor, 0), "crown/rose_helmet.png");
		cherryCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.cherry", itemId++, cherryArmor, 0), "crown/cherry_helmet.png");
		deadbushCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.deadbush", itemId++, deadbushArmor, 0), "crown/deadbush_helmet.png");
		leatherCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.leather", itemId++, leatherCrownArmor, 0), "crown/leather_crown.png");
		chainCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.chain", itemId++, chainCrownArmor, 0), "crown/chain_crown.png");
		ironCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.iron", itemId++, ironCrownArmor, 0), "crown/iron_crown.png");
		goldCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.gold", itemId++, goldCrownArmor, 0), "crown/gold_crown.png");
		diamondCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.diamond", itemId++, diamondCrownArmor, 0), "crown/diamond_crown.png");
		steelCrown= ItemHelper.createItem(MOD_ID, new ItemArmor("crown.steel", itemId++, steelCrownArmor, 0), "crown/steel_crown.png");

		bedrockHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.bedrock", itemId++, bedrockArmor, 0), "bedrock/bedrock_helmet.png");
		bedrockChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.bedrock", itemId++, bedrockArmor, 1), "bedrock/bedrock_chestplate.png");
		bedrockLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.bedrock", itemId++, bedrockArmor, 2), "bedrock/bedrock_leggings.png");
		bedrockBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.bedrock", itemId++, bedrockArmor, 3), "bedrock/bedrock_boots.png");

		bombBag = ItemHelper.createItem(MOD_ID, new ItemBombQuiver("bag.normal", itemId++), "extra/bomb_bag_empty.png");
		bombBagGold = ItemHelper.createItem(MOD_ID, new ItemBombQuiverEndless("bag.gold", itemId++), "extra/bomb_bag_gold.png");

		workbenchOnStick = ItemHelper.createItem(MOD_ID, new StickWorkbench("stick.workbench", itemId++), "extra/workbench_on_stick.png");
		initializeBlockDetails();
	}

	@Override
	public void afterGameStart() {

	}
}
