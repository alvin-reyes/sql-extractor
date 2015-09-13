package com.areyes1.ext.main;

import org.junit.Test;
import org.mockito.Mockito;

public class AppConfigEntryTest {

	/**
	 * Sample in
	 * -DinputPropertiesConfig="/Users/alvinreyes/EclipseProjects/JavaAlgo/simple-sql-extractor/src/main/resources/sample.properties" 
	 * -DxmlDatabaseConfig="/Users/alvinreyes/EclipseProjects/JavaAlgo/simple-sql-extractor/src/main/resources/dbconfig/db-config.xml" 
	 * -DextractToWhere="/User/alvinreyes/EclipseProjects/JavaAlgo/simple-sql-extractor/src/main/resources"
	 * 
	 */
	@Test
	public void testAppConfigEntry() {
		System.setProperty("inputPropertiesConfig", "src/test/resources/sample.properties");
		System.setProperty("xmlDatabaseConfig", "classpath:dbconfig/db-config.xml");
		System.setProperty("extractToWhere", "classpath:resources");
		Mockito.mock(AppConfig.class).main(null);
	}
	
}
