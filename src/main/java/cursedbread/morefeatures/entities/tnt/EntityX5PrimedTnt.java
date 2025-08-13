package cursedbread.morefeatures.entities.tnt;

import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityPrimedTNT;
import net.minecraft.core.world.World;

public class EntityX5PrimedTnt extends EntityPrimedTNT {
	public EntityX5PrimedTnt(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	public void tick() {
		this.checkOnWater(true);
		this.checkOnWater(true);
		this.pushTime *= 0.98F;
		if (this.pushTime < 0.05F || (double)this.pushTime < 0.25 && this.onGround) {
			this.pushTime = 0.0F;
		}

		this.xo = this.x;
		this.yo = this.y;
		this.zo = this.z;
		this.yd -= 0.04;
		this.move(this.xd, this.yd, this.zd);
		this.xd *= 0.98;
		this.yd *= 0.98;
		this.zd *= 0.98;
		if (this.onGround) {
			this.xd *= 0.7;
			this.zd *= 0.7;
			this.yd *= -0.5;
		}

		if (this.fuse-- <= 0) {
			if (!this.world.isClientSide) {
				this.remove();
				this.world.createExplosion((Entity)null, this.x, this.y + 0.5, this.z, 4.0F * 5);
			} else {
				this.remove();
			}
		} else {
			this.world.spawnParticle("smoke", this.x, this.y + 0.5, this.z, 0.0, 0.0, 0.0, 0);
		}

	}
}
