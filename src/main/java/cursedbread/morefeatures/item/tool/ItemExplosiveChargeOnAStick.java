package cursedbread.morefeatures.item.tool;

import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemExplosiveChargeOnAStick extends Item {
	public ItemExplosiveChargeOnAStick(String translationKey, String namespaceId, int id) {
		super(translationKey, namespaceId, id);
		this.setMaxStackSize(16);
	}

	public boolean hitEntity(ItemStack itemstack, Mob target, Mob attacker) {
		Player player = (Player) attacker;
		if (player == null || player.getGamemode().consumeBlocks()) {
			--itemstack.stackSize;
		}
		World world = attacker.world;
		assert world != null;
		world.createExplosion(attacker, (attacker.x + target.x)/2, (attacker.y + target.y)/2, (attacker.z + target.z)/2, 1.5F, false, true);
		world.spawnParticle("largesmoke", (attacker.x + target.x)/2, (attacker.y + target.y)/2, (attacker.z + target.z)/2, 0.0, 0.0, 0.0, 0);
		return true;
	}

	public boolean onUseItemOnBlock(ItemStack itemstack, Player entityplayer, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		if (entityplayer == null || entityplayer.getGamemode().consumeBlocks()) {
			--itemstack.stackSize;
		}
		assert world != null;
		world.createExplosion(entityplayer, entityplayer.x, entityplayer.y-1, entityplayer.z, 1.5F, false, true);
		world.spawnParticle("largesmoke", x, y, z, 0.0, 0.0, 0.0, 0);
		return true;
	}
}
