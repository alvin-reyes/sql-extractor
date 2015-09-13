package com.areyes1.ext.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.areyes1.ext.dao.DataExtractDao;
import com.areyes1.ext.obj.ExtractConfigLine;
import com.areyes1.ext.obj.ExtractConfigLineOutput;

/**
 * The Default extract provider will always use the comma delimited properties
 * file.
 *
 * @author alvinreyes
 */
@SuppressWarnings("rawtypes")
@Repository
public class DefaultExtractProvider implements ExtractProvider {

	/** The data extract dao. */
	@Autowired
	@Qualifier("dataExtractDao")
	private DataExtractDao dataExtractDao;
	
	public ExtractConfigLineOutput getExtract(ExtractConfigLine extractLineConfig) {
		ExtractConfigLineOutput extractConfigLineOutput = new ExtractConfigLineOutput();
		extractConfigLineOutput.setSqlDeleteLine(dataExtractDao.generateDeleteString(extractLineConfig));
		return extractConfigLineOutput;
	}


}
