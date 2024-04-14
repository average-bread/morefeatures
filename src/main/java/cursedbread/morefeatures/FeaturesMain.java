package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.VanilaBlockColoredLadder;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.material.ArmorMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class FeaturesMain implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "morefeatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static BlockBuilder ladderBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(8))
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
	public static Block vanillaColoredLadder;

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
    @Override
    public void onInitialize() {
        LOGGER.info("Adding some stuff");
    }

	private void initializeBlockDetails() {
		Item.itemsList[vanillaColoredLadder.id] = new ItemBlockPainted(vanillaColoredLadder, false);
		}

	@Override
	public void beforeGameStart() {
		vanillaColoredLadder = ladderBlock
			.setTextures("ladder/black_ladder.png").setTextures("ladder/red_ladder.png").setTextures("ladder/green_ladder.png").setTextures("ladder/brown_ladder.png").setTextures("ladder/blue_ladder.png").setTextures("ladder/purple_ladder.png").setTextures("ladder/cyan_ladder.png").setTextures("ladder/silver_ladder.png")
			.setTextures("ladder/gray_ladder.png").setTextures("ladder/pink_ladder.png").setTextures("ladder/lime_ladder.png").setTextures("ladder/yellow_ladder.png").setTextures("ladder/lightblue_ladder.png").setTextures("ladder/magenta_ladder.png").setTextures("ladder/orange_ladder.png").setTextures("ladder/white_ladder.png")
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new VanilaBlockColoredLadder("vanilla.colored.Ladder", blockId++));

		dandelionCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.dandeline", itemId++, dandelionArmor, 0), "dandeline_helmet.png");
		roseCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.rose", itemId++, roseArmor, 0), "rose_helmet.png");
		cherryCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.cherry", itemId++, cherryArmor, 0), "cherry_helmet.png");
		deadbushCrown = ItemHelper.createItem(MOD_ID, new ItemArmor("crown.deadbush", itemId++, deadbushArmor, 0), "deadbush_helmet.png");

		bedrockHelmet = ItemHelper.createItem(MOD_ID, new ItemArmor("helmet.bedrock", itemId++, bedrockArmor, 0), "bedrock_helmet.png");
		bedrockChestplate = ItemHelper.createItem(MOD_ID, new ItemArmor("chestplate.bedrock", itemId++, bedrockArmor, 1), "bedrock_chestplate.png");
		bedrockLeggings = ItemHelper.createItem(MOD_ID, new ItemArmor("leggings.bedrock", itemId++, bedrockArmor, 2), "bedrock_leggings.png");
		bedrockBoots = ItemHelper.createItem(MOD_ID, new ItemArmor("boots.bedrock", itemId++, bedrockArmor, 3), "bedrock_boots.png");
	}

	@Override
	public void afterGameStart() {

	}
}
