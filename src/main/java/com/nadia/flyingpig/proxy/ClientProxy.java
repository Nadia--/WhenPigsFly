package com.nadia.flyingpig.proxy;

import com.nadia.flyingpig.FlyingPigItems;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders() {
		FlyingPigItems.registerRenders();
	}

}
