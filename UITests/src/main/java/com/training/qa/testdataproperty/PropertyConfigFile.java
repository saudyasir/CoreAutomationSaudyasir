package com.training.qa.testdataproperty;

import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Config;

@Sources({ "classpath:testdata/${env}.properties" }) // default path is src/main/resources/config.properties for other
														// path use @Sources

public interface PropertyConfigFile extends Config {

	/*
	 * Creating ConfigFacotry for accessing .properties file as we can pass the env
	 * dynamically There are other ways to get data from .properties file but this
	 * is more effective
	 */

	//@Key ("url")
	@DefaultValue("www.gmail.com") //If key is not present in .properties file this default value will be passed
	String url();

}
