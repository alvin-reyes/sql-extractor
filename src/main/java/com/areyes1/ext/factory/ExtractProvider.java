package com.areyes1.ext.factory;

import com.areyes1.ext.obj.ExtractConfigLine;


/**
 * The Interface ExtractProvider.
 */
public interface ExtractProvider<E> {

	/**
	 * Gets the extract.
	 *
	 * @param name the name
	 * @return the extract
	 */
	public E getExtract(ExtractConfigLine lineConfig);

}
