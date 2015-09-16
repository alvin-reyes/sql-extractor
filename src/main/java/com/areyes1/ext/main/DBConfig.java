package com.areyes1.ext.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.areyes1.ext.obj.DatabaseConfiguration;
import com.areyes1.ext.util.EnDecrypt;

/**
 * The Class DBConfig.
 */
@Configuration
public class DBConfig {

	/** The xml location config. */
	@Autowired
	@Qualifier("xmlLocationConfig")
	private String xmlLocationConfig;
	
	/**
	 * Gets the data source.
	 *
	 * @return the data source
	 */
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		return dataSource;
	}
	
	/**
	 * Gets the all data source from config.
	 *
	 * @return the all data source from config
	 */
	@Bean(name="dataSourceList")
	public Map<String,DataSource> getDataSourceList() {
		Map<String, DataSource> allDataSource =  new HashMap<String, DataSource>();
		DriverManagerDataSource driverDataSource;
		for(DatabaseConfiguration dbConfig:getAllDatabaseConfig()) 	{
			driverDataSource = new DriverManagerDataSource();
			driverDataSource.setUrl(dbConfig.getDbConnUrl());
			driverDataSource.setPassword(dbConfig.getDbPassword());
			driverDataSource.setUsername(dbConfig.getDbUserName());
			driverDataSource.setDriverClassName(dbConfig.getDriver());
			allDataSource.put(dbConfig.getId(), driverDataSource);
		}
		return allDataSource;
	}
	
	/**
	 * Gets the all database config.
	 *
	 * @return the all database config
	 */
	private List<DatabaseConfiguration> getAllDatabaseConfig() {
		
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(this.xmlLocationConfig);
		List<DatabaseConfiguration> arrList = new ArrayList<DatabaseConfiguration>();
		try {

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement().getChild("databases");
			@SuppressWarnings("unchecked")
			List<Element> list = rootNode.getChildren("database");
			
			for (int i = 0; i < list.size(); i++) {
				try {
					DatabaseConfiguration dbConfig = new DatabaseConfiguration();
					Element node = (Element) list.get(i);				
					dbConfig.setId(node.getChildText("id"));
					dbConfig.setDatabase(node.getChildText("name"));
					dbConfig.setDbConnUrl(node.getChildText("url"));
					dbConfig.setDbUserName(node.getChildText("username"));					
					dbConfig.setDbPassword(EnDecrypt.decrypt(node.getChildText("password")));
					dbConfig.setDriver(node.getChildText("driver"));
					arrList.add(dbConfig);		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
		return arrList;
	}
}

