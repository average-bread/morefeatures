package cursedbread.morefeatures.blocks.other;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicMesh;
import net.minecraft.core.block.BlockLogicTransparent;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biomes;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class BlockLogicMeshWood extends BlockLogicTransparent {
	int water;
	ItemStack meshloot;
	public BlockLogicMeshWood(Block<?> block) {
		super(block, Material.wood);
		block.setTicking(true);
	}

	public boolean isCubeShaped() {
		return false;
	}

	public boolean canPlaceOnSurface() {
		return true;
	}

	public boolean collidesWithEntity(Entity entity, World world, int x, int y, int z) {
		return !(entity instanceof EntityItem);
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		int random = rand.nextInt(100);
		int randomloot = rand.nextInt(100);
		water = 0;
		for (int i = -1; i <= 1; i++){
			for (int j = -1; j <= 1; j++){
				for (int k = 0; k <= 1; k++){
					if (world.getBlockId(x+i, y+k, z+j) == Blocks.FLUID_WATER_STILL.id()){
						water++;
					}
				}
			}
		}
		if (water >= 16){
			if (random < 50) {
				if (randomloot <= 10 && randomloot > 0 &&
					(world.getBlockBiome(x, y, z) == Biomes.OVERWORLD_SWAMPLAND ||
						world.getBlockBiome(x, y, z) == Biomes.OVERWORLD_SWAMPLAND_MUDDY)){
					meshloot = new ItemStack(Blocks.ALGAE);
				} else if (randomloot <= 20 && randomloot > 10){
					meshloot = new ItemStack(Items.DYE, 1, 0);
				} else if (randomloot <= 22 && randomloot > 20){
					meshloot = new ItemStack(Blocks.SPONGE_WET);
				} else if (randomloot <= 32 && randomloot > 22){
					meshloot = new ItemStack(Items.LEATHER);
				} else if (randomloot <= 37 && randomloot > 32){
					meshloot = new ItemStack(Items.ARMOR_BOOTS_LEATHER, 1, rand.nextInt(Items.ARMOR_BOOTS_LEATHER.getMaxDamage()));
				} else if (randomloot <= 42 && randomloot > 37){
					meshloot = new ItemStack(Items.TOOL_FISHINGROD, 1, rand.nextInt(Items.TOOL_FISHINGROD.getMaxDamage()));
				} else {
					meshloot = new ItemStack(Items.FOOD_FISH_RAW);
				}
				EntityItem entityitem = world.dropItem(x, y, z, meshloot);
				entityitem.yd *= 0.0f;
				entityitem.xd *= 0.0f;
				entityitem.zd *= 0.0f;
				water = 0;
			}
		}
	}

	public void onBlockPlacedByMob(World world, int x, int y, int z, @NotNull Side side, Mob mob, double xPlaced, double yPlaced) {
		world.scheduleBlockUpdate(x, y, z, this.id(), 1);
	}
	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this.id(), 1);
	}
}
