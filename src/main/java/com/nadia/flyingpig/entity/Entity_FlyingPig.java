package com.nadia.flyingpig.entity;



import com.nadia.flyingpig.FlyingPigItems;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/*
 * Special Pigs are Fast Flying Creatures that Spawn, rarely, in the sky.  
 * They occassionally drop zircon, like chickens drop eggs.  
 * 
 * Currently the AI is really der.  Also it doesnt drop zircon yet.
 */

public class Entity_FlyingPig extends EntityBat {

	public Entity_FlyingPig(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}


    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        //this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10D);
    }
    
    @Override
    public int getTotalArmorValue()
    {
        return 2;
    }
    
 
    
    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);
        int z = this.rand.nextInt(2) + this.rand.nextInt(1+par2*2); 

        for (int k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_porkchop, 1);
            }
            else
            {
                this.dropItem(Items.porkchop, 1);
            }
        }

        for (int k = 0; k < z; ++k)
        {
            this.dropItem(FlyingPigItems.zircon, 1);
        }
        
    }

    
    public Entity_FlyingPig createChild(EntityAgeable par1EntityAgeable)
    {
        return new Entity_FlyingPig(this.worldObj);
    }
    
    
    /**
     * 
     * Taken from EntityFlying
     * 
     */
    
    
    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    /**
    public void moveEntityWithHeading(float par1, float par2)
    {
        if (this.isInWater())
        {
            this.moveFlying(par1, par2, 0.02F);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.800000011920929D;
            this.motionY *= 0.800000011920929D;
            this.motionZ *= 0.800000011920929D;
        }
        else if (this.handleLavaMovement())
        {
            this.moveFlying(par1, par2, 0.02F);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.5D;
            this.motionY *= 0.5D;
            this.motionZ *= 0.5D;
        }
        else
        {
            float f2 = 0.91F;

            if (this.onGround)
            {
                f2 = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ)).slipperiness * 0.91F;
            }

            float f3 = 0.16277136F / (f2 * f2 * f2);
            this.moveFlying(par1, par2, this.onGround ? 0.1F * f3 : 0.02F);
            f2 = 0.91F;

            if (this.onGround)
            {
                f2 = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ)).slipperiness * 0.91F;
            }

            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double)f2;
            this.motionY *= (double)f2;
            this.motionZ *= (double)f2;
        }

        this.prevLimbSwingAmount = this.limbSwingAmount;
        double d1 = this.posX - this.prevPosX;
        double d0 = this.posZ - this.prevPosZ;
        float f4 = MathHelper.sqrt_double(d1 * d1 + d0 * d0) * 4.0F;

        if (f4 > 1.0F)
        {
            f4 = 1.0F;
        }

        this.limbSwingAmount += (f4 - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;
    }
    **/
    
    
    /**
     * returns true if this entity is by a ladder, false otherwise
     */
}



