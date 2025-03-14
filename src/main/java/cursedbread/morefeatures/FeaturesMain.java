package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.FeaturesItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.*;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.ModelEntrypoint;

import java.util.Properties;


public class FeaturesMain implements ModInitializer, GameStartEntrypoint, ClientModInitializer {
    public static final String MOD_ID = "morefeatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//public static boolean nonamedyesOn = ModVersionHelper.isModPresent("nonamedyes");
	public static int paperWallAlt;
	public static int newDungeonsEnabled;
	public static int superoreChance;
	public static int newGenerators;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2200");
		prop.setProperty("starting_item_id","17890");

		prop.setProperty("painted_or_alt_or_colored_paper_walls_texture_(0_or_1_or_2)","0");

		prop.setProperty("Comment", "yes_is_1|no_is_0");

		prop.setProperty("Add_colored_glowstone_blocks", "1");
		prop.setProperty("Add_colored_paper_wall_blocks", "1");
		prop.setProperty("Add_gilding_table", "1");
		prop.setProperty("Plants", "1");
		prop.setProperty("Chance_to_rainbow_a_flower", "5");
		prop.setProperty("Chance_to_rainbow_a_super_ore", "5");
		prop.setProperty("Add_colored_glass_blocks", "1");
		prop.setProperty("Add_ham_blocks", "1");
		prop.setProperty("Add_super_ores", "1");

		prop.setProperty("Crowns", "1");
		prop.setProperty("Block_armor", "1");
		prop.setProperty("Old_armor", "1");
		prop.setProperty("Misc_armor", "1");
		prop.setProperty("Bomb_bags", "1");
		prop.setProperty("New_tools", "1");
		prop.setProperty("Misc_items", "1");

		prop.setProperty("New_structures", "1");
		prop.setProperty("New_block_generators", "1");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);


		//Meta
		FeaturesBlocks.blockId = config.getInt("starting_block_id");
		FeaturesItems.itemId = config.getInt("starting_item_id");
		paperWallAlt = config.getInt("painted_or_alt_or_colored_paper_walls_texture_(0_or_1_or_2)");

		//Blocks
		FeaturesBlocks.glowstoneEnabled = config.getInt("Add_colored_glowstone_blocks");
		FeaturesBlocks.paperwallEnabled = config.getInt("Add_colored_paper_wall_blocks");
		FeaturesBlocks.gildingtableEnabled = config.getInt("Add_gilding_table");
		FeaturesBlocks.glassEnabled = config.getInt("Add_colored_glass_blocks");
		FeaturesBlocks.plantEnabled = config.getInt("Plants");
		FeaturesBlocks.rainbowFlowerChance = Math.max(Math.min(config.getInt("Chance_to_rainbow_a_flower"), 100), 1);
		superoreChance = Math.max(Math.min(config.getInt("Chance_to_rainbow_a_super_ore"), 100), 1);
		FeaturesBlocks.hamEnabled = config.getInt("Add_ham_blocks");
		FeaturesBlocks.superoresEnabled = config.getInt("Add_super_ores");
		//Items
		FeaturesItems.crownsEnabled = config.getInt("Crowns");
		FeaturesItems.blockArmorEnabled = config.getInt("Block_armor");
		FeaturesItems.oldArmorEnabled = config.getInt("Old_armor");
		FeaturesItems.miscArmorEnabled = config.getInt("Misc_armor");
		FeaturesItems.bombQuibersEnabled = config.getInt("Bomb_bags");
		FeaturesItems.newToolsEnabled = config.getInt("New_tools");
		FeaturesItems.miscItemsEnabled = config.getInt("Misc_items");
		//Extra
		newDungeonsEnabled = config.getInt("New_structures");
		newGenerators = config.getInt("New_block_generators");
	}
    @Override
    public void onInitialize() {
        LOGGER.info("Adding some stuff");
		new FeaturesBlocks().initilizeBlocks();
		new FeaturesItems().initilizeItems();
    }

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {
	}

	@Override
	public void onInitializeClient() {
		new FeatureModel();
	}
}
