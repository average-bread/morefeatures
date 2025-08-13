package cursedbread.morefeatures.entities.tnt;

import com.mojang.nbt.tags.CompoundTag;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityPrimedTNT;
import net.minecraft.core.net.entity.EntityTracker;
import net.minecraft.core.net.entity.EntityTrackerEntry;
import net.minecraft.core.net.entity.ITrackedEntry;
import net.minecraft.core.net.entity.IVehicleEntry;
import net.minecraft.core.net.packet.PacketAddEntity;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NetEntryX5PrimedTnt implements IVehicleEntry<EntityX5PrimedTnt>, ITrackedEntry<EntityX5PrimedTnt> {
	public NetEntryX5PrimedTnt() {
	}

	public @NotNull Class<EntityX5PrimedTnt> getAppliedClass() {
		return EntityX5PrimedTnt.class;
	}

	public int getTrackingDistance() {
		return 160;
	}

	public int getPacketDelay() {
		return 10;
	}

	public boolean sendMotionUpdates() {
		return true;
	}

	public void onEntityTracked(EntityTracker tracker, EntityTrackerEntry trackerEntry, EntityX5PrimedTnt trackedObject) {
	}

	public Entity getEntity(World world, double x, double y, double z, int metadata, boolean hasVelocity, double xd, double yd, double zd, Entity owner, @Nullable CompoundTag tag) {
		return new EntityPrimedTNT(world, x, y, z);
	}

	public PacketAddEntity getSpawnPacket(EntityTrackerEntry tracker, EntityX5PrimedTnt trackedObject) {
		return new PacketAddEntity(trackedObject);
	}
}
