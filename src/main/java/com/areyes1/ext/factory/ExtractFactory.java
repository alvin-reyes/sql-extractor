package com.areyes1.ext.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * A factory for creating Extract objects.
 */
@Service
public class ExtractFactory<T,E> {

	/** The Constant DEFAULT_PROVIDER. */
	public static final String DEFAULT_PROVIDER = "DEFAULT_PROVIDER";

	/** The extract providers. */
	@SuppressWarnings("rawtypes")
	private static Map<String, ExtractProvider> extractProviders = new HashMap<String, ExtractProvider>();

	/**
	 * Instantiates a new extract factory.
	 */
	public ExtractFactory() {
	}

	static {
		extractProviders.put(DEFAULT_PROVIDER, new DefaultExtractProvider());
	}

	/**
	 * Register extract provider.
	 *
	 * @param name the name
	 * @param extractProvider the extract provider
	 */
	public static void registerExtractProvider(String name,
			ExtractProvider extractProvider) {
		extractProviders.put(name, extractProvider);
	}

	/**
	 * Removes the extract provider.
	 *
	 * @param name the name
	 */
	public static void removeExtractProvider(String name) {
		extractProviders.remove(name);
	}

	/**
	 * Gets the extract fatory.
	 *
	 * @param name the name
	 * @return the extract fatory
	 */
	public static ExtractProvider getExtractProvider(String name) {
		return extractProviders.get(name);
	}

}
