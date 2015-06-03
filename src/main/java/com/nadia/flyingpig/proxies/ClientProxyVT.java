package com.nadia.flyingpig.proxies;



import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.passive.EntityPig;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.nadia.flyingpig.entity.FlyingPig;
import com.nadia.flyingpig.render.RenderFlyingPig;


public class ClientProxyVT extends CommonProxyVT
{
@Override
    public void registerEntityRenders()

/*
 * This is the Entity Registration section. This is the clientside registry that tells the game how to "display" models from a certain entity.
 * 
 */
    {
	
	/*
	 * 		RenderingRegistry.registerEntityRenderingHandler(EntitySapphireCreeper.class, new RenderSapphireCreeper());
	 * 		RenderingRegistry.registerEntityRenderingHandler(EntityWerewolf.class, new RenderVTMob(new ModelWerewolf(), 0.5F, "textures/models/WereWolf.png"));
	 */
	
	RenderingRegistry.registerEntityRenderingHandler(FlyingPig.class, new RenderFlyingPig(Minecraft.getMinecraft().getRenderManager(), new ModelPig(0.5F), 0.7F));
			//RenderFlyingPig(new ModelPig(), new ModelPig(0.5F), 0.7F));
	

	
    }

@Override
public void registerBlockRenders()
    {

    }
}

