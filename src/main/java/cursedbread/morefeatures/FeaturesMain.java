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
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

import java.util.Properties;


public class FeaturesMain implements ModInitializer, GameStartEntrypoint, ClientModInitializer {
    public static final String MOD_ID = "morefeatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//public static boolean nonamedyesOn = ModVersionHelper.isModPresent("nonamedyes");
	public static int paperWallAlt;
	public static int newLabyrinthsEnabled;
	public static int newDungeonsEnabled;
	public static int superoreChance;
	public static int newGenerators;

	private static final Toml TOML = new Toml("1 is enabled, 0 is disabled");
	public static final TomlConfigHandler CFG;

	static {
		TOML.addCategory("IDs")
			.addEntry("Starting_item_id", 19000)
			.addEntry("Starting_block_id", 11000);

		TOML.addCategory("Meta_Stuff")
			.addEntry("Painted_or_alt_or_colored_paper_walls_texture", "(0_or_1_or_2)", 0)
			.addEntry("Chance_to_rainbow_a_flower", 5)
			.addEntry("Chance_to_generate_a_super_ore", 5);

		TOML.addCategory("Blocks")
			.addEntry("Colored_glowstone", 1)
			.addEntry("Colored_paperwalls", 1)
			.addEntry("Colored_glass", 1)
			.addEntry("Gilding_table", 1)
			.addEntry("Ham", 1)
			.addEntry("Burned_log", 1)
			.addEntry("Rainbow_flower", 1)
			.addEntry("Flux_crops", 1)
			.addEntry("Super_ores", 1)
			.addEntry("Nether_gravel", 1)
			.addEntry("Colored_workbench", 1);

		TOML.addCategory("Items")
			.addEntry("Flower_crowns", 1)
			.addEntry("Crowns",1)
			.addEntry("Bedrock_armor", 1)
			.addEntry("Plate_armor", 1)
			.addEntry("Studded_armor", 1)
			.addEntry("Stone_armor", 1)
			.addEntry("Olivine_armor", 1)
			.addEntry("Quartz_armor", 1)
			.addEntry("Bomb_bag", 1)
			.addEntry("Workbench_on_a_stick", 1)
			.addEntry("Mob_soul", 1)
			.addEntry("Paxels", 1)
			.addEntry("Climbing_pickaxes", 1)
			.addEntry("Mining_hammer", 1)
			.addEntry("Cat_helmet", 1)
			.addEntry("Fertilizing_bag", 1);

		TOML.addCategory("Generation")
			.addEntry("New_labyrinths", 1)
			.addEntry("Nre_dungeons", 1)
			.addEntry("New_block_generators",1);

		CFG = new TomlConfigHandler(MOD_ID, TOML);

		FeaturesBlocks.blockId = CFG.getInt("IDs.Starting_block_id");
		FeaturesItems.itemId = CFG.getInt("IDs.Starting_item_id");

		paperWallAlt = CFG.getInt("Meta_Stuff.Painted_or_alt_or_colored_paper_walls_texture");
		FeaturesBlocks.rainbowFlowerChance = CFG.getInt("Meta_Stuff.Chance_to_rainbow_a_flower");
		superoreChance = CFG.getInt("Meta_Stuff.Chance_to_generate_a_super_ore");

		FeaturesBlocks.coloredGlowstoneEnabled = CFG.getInt("Blocks.Colored_glowstone");
		FeaturesBlocks.coloredPaperwallEnabled = CFG.getInt("Blocks.Colored_paperwalls");
		FeaturesBlocks.coloredGlassEnabled = CFG.getInt("Blocks.Colored_glass");
		FeaturesBlocks.gildingTableEnabled = CFG.getInt("Blocks.Gilding_table");
		FeaturesBlocks.hamEnabled = CFG.getInt("Blocks.Ham");
		FeaturesBlocks.burnedLogEnabled = CFG.getInt("Blocks.Burned_log");
		FeaturesBlocks.rainbowFlowerEnabled = CFG.getInt("Blocks.Rainbow_flower");
		FeaturesBlocks.fluxCropsEnabled = CFG.getInt("Blocks.Flux_crops");
		FeaturesBlocks.superoresEnabled = CFG.getInt("Blocks.Super_ores");
		FeaturesBlocks.netherGravelEnabled = CFG.getInt("Blocks.Nether_gravel");
		FeaturesBlocks.coloredWorkbenchEnabled = CFG.getInt("Blocks.Colored_workbench");

		FeaturesItems.flowercrownsEnabled = CFG.getInt("Items.Flower_crowns");
		FeaturesItems.normalCrownsEnabled = CFG.getInt("Items.Crowns");
		FeaturesItems.bedrockArmorEnabled = CFG.getInt("Items.Bedrock_armor");
		FeaturesItems.plateArmorEnabled = CFG.getInt("Items.Plate_armor");
		FeaturesItems.studdedArmorEnabled = CFG.getInt("Items.Studded_armor");
		FeaturesItems.stoneArmorEnabled = CFG.getInt("Items.Stone_armor");
		FeaturesItems.olivineArmorEnabled = CFG.getInt("Items.Olivine_armor");
		FeaturesItems.quartzArmorEnabled = CFG.getInt("Items.Quartz_armor");
		FeaturesItems.bombBagEnabled = CFG.getInt("Items.Bomb_bag");
		FeaturesItems.workbenchOnStickEnabled = CFG.getInt("Items.Workbench_on_a_stick");
		FeaturesItems.mobSoulEnabled = CFG.getInt("Items.Mob_soul");
		FeaturesItems.paxelsEnabled = CFG.getInt("Items.Paxels");
		FeaturesItems.climbPickaxesEnabled = CFG.getInt("Items.Climbing_pickaxes");
		FeaturesItems.miningHammersEnabled = CFG.getInt("Items.Mining_hammer");
		FeaturesItems.cathelmetEnabled = CFG.getInt("Items.Cat_helmet");
		FeaturesItems.ferlilizerBagEnabled = CFG.getInt("Items.Fertilizing_bag");

		newLabyrinthsEnabled = CFG.getInt("Generation.New_labyrinths");
		newDungeonsEnabled = CFG.getInt("Generation.Nre_dungeons");
		newGenerators = CFG.getInt("Generation.New_block_generators");
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
