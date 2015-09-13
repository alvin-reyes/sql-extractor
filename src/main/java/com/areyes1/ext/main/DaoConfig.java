package com.areyes1.ext.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.areyes1.ext.dao.DataExtractDao;
import com.areyes1.ext.dao.DataExtractDaoImpl;

/**
 * The Class DaoConfig.
 */
@Configuration
public class DaoConfig {
	
	/**
	 * Gets the data extract dao.
	 *
	 * @return the data extract dao
	 */
	@Bean(name="dataExtractDao")
	public DataExtractDao getDataExtractDao() {
		return new DataExtractDaoImpl();
	}
}
