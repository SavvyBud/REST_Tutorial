package com.scopekya.tutorial;



import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;


public class TutorialApplication extends Application {

	@Override
	public Restlet createInboundRoot() {
		getLogger().info("Creating inbound root " );
		StatusResource.init();
		Context ctx = getContext();
		Router router = new Router(ctx);
		router.attach("/status",StatusResource.class);
		return router;
	}

	@Override
	public synchronized void start() throws Exception {
		super.start();
		getLogger().info("Starting tutorial application " );
	}

	

	@Override
	public synchronized void stop() throws Exception {
		super.stop();
		getLogger().info("Stopping tutorial application " );
	}
}
