package com.redhat.fuse.sample.mq.consumer;

import org.apache.camel.spring.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Starter {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Starter.class);
	
	public static void main(String[] ars) throws Exception {
		try {
			Main main = new Main();
	        main.setApplicationContextUri("META-INF/camelContext.xml");
	        main.enableHangupSupport();       
	        main.run();
		}
        catch (Exception e) {
			LOGGER.error("Couldn't start service", e);
			e.printStackTrace();
		}

	}
	
}
