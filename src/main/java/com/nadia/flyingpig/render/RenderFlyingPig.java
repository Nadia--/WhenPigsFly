package com.nadia.flyingpig.render;

import com.nadia.flyingpig.WhenPigsFlyMod;
import com.nadia.flyingpig.entity.FlyingPig;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFlyingPig extends RenderPig {
	private static final ResourceLocation texture = new ResourceLocation(WhenPigsFlyMod.MODID, "textures/models/model_special_pig.png");
	
	public RenderFlyingPig(RenderManager p_i46149_1_, ModelBase p_i46149_2_,
			float p_i46149_3_) {
		super(p_i46149_1_, p_i46149_2_, p_i46149_3_);
		// TODO Auto-generated constructor stub
	}

	protected ResourceLocation getEntityTexture(FlyingPig endy) {
		return texture;
	}
	
	protected ResourceLocation getEntityTexture(Entity en) {
		return this.getEntityTexture((FlyingPig) en);
	}
	

}
