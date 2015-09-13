package com.areyes1.ext.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.areyes1.ext.factory.ExtractFactory;
import com.areyes1.ext.factory.ExtractProvider;
import com.areyes1.ext.obj.ExtractConfigLine;
import com.areyes1.ext.obj.ExtractConfigLineOutput;

/**
 * Extract Processor!.
 *
 * @author alvinreyes
 */
@SuppressWarnings("rawtypes")
public class ExtractorItemProcessor implements ItemProcessor<ExtractConfigLine, ExtractConfigLineOutput> {
	
	/** The extract factory. */
	@Autowired
	private ExtractFactory extractFactory;
	
	/**
	 * This is the heard and soul. This will get the lines, create the extract and store it per object.
	 *
	 * @param arg0 the arg0
	 * @return the extract config line output
	 * @throws Exception the exception
	 */
	@SuppressWarnings("static-access")
	public ExtractConfigLineOutput process(ExtractConfigLine arg0) throws Exception {
		@SuppressWarnings("unchecked")
		ExtractConfigLineOutput extractConfig = new ExtractConfigLineOutput();
		ExtractProvider<ExtractConfigLineOutput> e = extractFactory.getExtractProvider(ExtractFactory.DEFAULT_PROVIDER);
		extractConfig = e.getExtract(arg0);
		return extractConfig;
	}

}
