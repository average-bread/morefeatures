package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.FeaturesItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.*;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class FeaturesMain implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "morefeatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static boolean nonamedyesOn = ModVersionHelper.isModPresent("nonamedyes");
	public static int paperWallAlt;
	public static int newDungeonsEnabled;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2200");
		prop.setProperty("starting_item_id","17890");
		prop.setProperty("painted_or_alt_or_colored_paper_walls_texture_(0_or_1_or_2)","0");

		prop.setProperty("Add_colored_glowstone_blocks", "1");
		prop.setProperty("Add_colored_paper_wall_blocks", "1");
		prop.setProperty("Add_gilding_table", "1");
		prop.setProperty("Add_rainbow_flower", "1");
		prop.setProperty("Chance_to_rainbow_a_flower", "5");
		prop.setProperty("Add_colored_glass_blocks", "1");
		prop.setProperty("Add_ham_blocks", "1");
		prop.setProperty("Add_super_ores", "0");

		prop.setProperty("Comment", "yes_is_1|no_is_0");
		prop.setProperty("Add_flower_crowns", "1");
		prop.setProperty("Add_regular_crowns", "1");
		prop.setProperty("Add_bedrock_armor", "1");
		prop.setProperty("Add_plate_armor", "1");
		prop.setProperty("Add_studded_armor", "1");
		prop.setProperty("Add_stone_armor", "1");
		prop.setProperty("Add_olivine_armor", "1");
		prop.setProperty("Add_quartz_armor", "1");
		prop.setProperty("Add_bomb_quivers", "1");
		prop.setProperty("Add_workbench_on_a_stick", "1");
		prop.setProperty("Add_mob_soul", "1");
		prop.setProperty("Add_paxels", "1");

		prop.setProperty("Add_new_dungeons", "1");
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
		FeaturesBlocks.rainbowflowerEnabled = config.getInt("Add_rainbow_flower");
		FeaturesBlocks.rainbowFlowerChance = Math.max(Math.min(config.getInt("Chance_to_rainbow_a_flower"), 100), 1);
		FeaturesBlocks.hamEnabled = config.getInt("Add_ham_blocks");
		FeaturesBlocks.superoresEnabled = config.getInt("Add_super_ores");
		//Items
		FeaturesItems.flowerCrownEnabled = config.getInt("Add_flower_crowns");
		FeaturesItems.regularCrownEnabled = config.getInt("Add_regular_crowns");
		FeaturesItems.bedrockArmorEnabled = config.getInt("Add_bedrock_armor");
		FeaturesItems.plateArmorEnabled = config.getInt("Add_plate_armor");
		FeaturesItems.leatherchainArmorEnabled = config.getInt("Add_studded_armor");
		FeaturesItems.stoneArmorEnabled = config.getInt("Add_stone_armor");
		FeaturesItems.olivineArmorEnabled = config.getInt("Add_olivine_armor");
		FeaturesItems.quartzArmorEnabled = config.getInt("Add_quartz_armor");
		FeaturesItems.bombQuibersEnabled = config.getInt("Add_bomb_quivers");
		FeaturesItems.workbenchonstickEnabled = config.getInt("Add_workbench_on_a_stick");
		FeaturesItems.soulEnabled = config.getInt("Add_mob_soul");
		FeaturesItems.paxelsEnabled = config.getInt("Add_paxels");
		//Extra
		newDungeonsEnabled = config.getInt("Add_new_dungeons");
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
}
