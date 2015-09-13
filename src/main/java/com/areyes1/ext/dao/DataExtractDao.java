package com.areyes1.ext.dao;

import java.util.List;

import com.areyes1.ext.obj.ExtractConfigLine;
import com.areyes1.ext.obj.SQLDeleteLine;
import com.areyes1.ext.obj.SQLInsertLine;
import com.areyes1.ext.obj.SQLUpdateLine;

/**
 * The Interface DataExtractDao.
 */
public interface DataExtractDao {
	
	/**
	 * Generate insert string.
	 *
	 * @param extractConfigLine the extract config line
	 * @return the list
	 */
	public List<SQLInsertLine> generateInsertString(ExtractConfigLine extractConfigLine);
	
	/**
	 * Generate delete string.
	 *
	 * @param extractConfigLine the extract config line
	 * @return the list
	 */
	public List<SQLDeleteLine> generateDeleteString(ExtractConfigLine extractConfigLine);
	
	/**
	 * Generate update string.
	 *
	 * @param extractConfigLine the extract config line
	 * @return the list
	 */
	public List<SQLUpdateLine> generateUpdateString(ExtractConfigLine extractConfigLine);
}