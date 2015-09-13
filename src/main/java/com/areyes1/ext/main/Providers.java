package com.areyes1.ext.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.areyes1.ext.factory.DefaultExtractProvider;
import com.areyes1.ext.factory.ExtractProvider;

/**
 * The Class Providers.
 */
@Configuration
public class Providers {
	
	/**
	 * Gets the default extract provider.
	 *
	 * @return the default extract provider
	 */
	@SuppressWarnings("rawtypes")
	@Bean(name="defaultExtractFactory")
	public ExtractProvider getDefaultExtractProvider() {
		return new DefaultExtractProvider();
	}
}
