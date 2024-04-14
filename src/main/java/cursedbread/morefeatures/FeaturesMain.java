package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.VanilaBlockColoredGlowstone;
import cursedbread.morefeatures.item.StickWorkbench;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.material.ArmorMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class FeaturesMain implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "morefeatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static BlockBuilder glowstoneBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setLuminance(15)
		.setHardness(0.5f);

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

	public static ArmorMaterial dandelionArmor = ArmorHelper.createArmorMaterial(MOD_ID, "dandeline", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial roseArmor = ArmorHelper.createArmorMaterial(MOD_ID, "rose", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial cherryArmor = ArmorHelper.createArmorMaterial(MOD_ID, "cherry", 27, 0f, 0f, 0f, 0f);
	public static ArmorMaterial deadbushArmor = ArmorHelper.createArmorMaterial(MOD_ID, "deadbush", 1, -1000f, -1000f, -1000f, -1000f);
	public static ArmorMaterial bedrockArmor = ArmorHelper.createArmorMaterial(MOD_ID, "bedrock", 999999999, 100f, 100f, 100f, 100f);
	public static Item dandelionCrown;
	public static Item roseCrown;
	public static Item cherryCrown;
	public static Item deadbushCrown;

	public static Item bedrockHelmet;
	public static Item bedrockChestplate;
	public static Item bedrockLeggings;
	public static Item bedrockBoots;

	public static Item workbenchOnStick;
    @Override
    public void onInitialize() {
        LOGGER.info("Adding some stuff");
    }

	private void initializeBlockDetails() {
		Item.itemsList[vanillaColoredGlowstone.id] = new ItemBlockPainted(vanillaColoredGlowstone, false);
		for (int color = 2; color < 17; color++) {
			CreativeHelper.setParent(vanillaColoredGlowstone, color - 1, FeaturesMain.vanillaColoredGlowstone, 0);
		}
	}

	@Override
	public void beforeGameStart() {
		vanillaColoredGlowstone = glowstoneBlock
			.setTextures("glowstone/black_glowstone.png").setTextures("glowstone/red_glowstone.png").setTextures("glowstone/green_glowstone.png").setTextures("glowstone/brown_glowstone.png").setTextures("glowstone/blue_glowstone.png").setTextures("glowstone/purple_glowstone.png").setTextures("glowstone/cyan_glowstone.png").setTextures("glowstone/silver_glowstone.png")
			.setTextures("glowstone/gray_glowstone.png").setTextures("glowstone/pink_glowstone.png").setTextures("glowstone/lime_glowstone.png").setTextures("glowstone/yellow_glowstone.png").setTextures("glowstone/lightblue_glowstone.png").setTextures("glowstone/magenta_glowstone.png").setTextures("glowstone/orange_glowstone.png").setTextures("glowstone/white_glowstone.png")
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new VanilaBlockColoredGlowstone("vanilla.colored.glowstone", blockId++, Material.glass));

		dandelionCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.dandeline", itemId++, dandelionArmor, 0), "crown/dandeline_helmet.png");
		roseCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.rose", itemId++, roseArmor, 0), "crown/rose_helmet.png");
		cherryCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.cherry", itemId++, cherryArmor, 0), "crown/cherry_helmet.png");
		deadbushCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.deadbush", itemId++, deadbushArmor, 0), "crown/deadbush_helmet.png");

		bedrockHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.bedrock", itemId++, bedrockArmor, 0), "bedrock/bedrock_helmet.png");
		bedrockChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.bedrock", itemId++, bedrockArmor, 1), "bedrock/bedrock_chestplate.png");
		bedrockLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.bedrock", itemId++, bedrockArmor, 2), "bedrock/bedrock_leggings.png");
		bedrockBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.bedrock", itemId++, bedrockArmor, 3), "bedrock/bedrock_boots.png");

		workbenchOnStick = ItemHelper.createItem(MOD_ID, new StickWorkbench("stick.workbench", itemId++), "station_on_stick/workbench_on_stick.png");
		initializeBlockDetails();
	}

	@Override
	public void afterGameStart() {

	}
}
