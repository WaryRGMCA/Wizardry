package electroblob.wizardry.entity.construct;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntityLightningPulse extends EntityMagicConstruct {

	public EntityLightningPulse(World world){
		super(world);
		this.setSize(6, 0.2f);
	}

	public EntityLightningPulse(World world, double x, double y, double z, EntityLivingBase caster, int lifetime,
			float damageMultiplier){
		super(world, x, y, z, caster, lifetime, damageMultiplier);
		this.setSize(6, 0.2f);
	}

	/**
	 * Return whether this entity should be rendered as on fire.
	 */
	public boolean canRenderOnFire(){
		return false;
	}

}
