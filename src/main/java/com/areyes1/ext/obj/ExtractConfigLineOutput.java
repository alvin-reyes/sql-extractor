package com.areyes1.ext.obj;

import java.util.List;

/**
 * The Class ExtractConfigLineOutput.
 */
public class ExtractConfigLineOutput {
	
	/** The extract config line. */
	private ExtractConfigLine extractConfigLine;
	
	/** The sql insert line. */
	private List<SQLInsertLine> sqlInsertLine;
	
	/** The sql update line. */
	private List<SQLUpdateLine> sqlUpdateLine;
	
	/** The sql delete line. */
	private List<SQLDeleteLine> sqlDeleteLine;
	
	/**
	 * Gets the extract config line.
	 *
	 * @return the extract config line
	 */
	public ExtractConfigLine getExtractConfigLine() {
		return extractConfigLine;
	}
	
	/**
	 * Sets the extract config line.
	 *
	 * @param extractConfigLine the new extract config line
	 */
	public void setExtractConfigLine(ExtractConfigLine extractConfigLine) {
		this.extractConfigLine = extractConfigLine;
	}
	
	/**
	 * Gets the sql insert line.
	 *
	 * @return the sql insert line
	 */
	public List<SQLInsertLine> getSqlInsertLine() {
		return sqlInsertLine;
	}
	
	/**
	 * Sets the sql insert line.
	 *
	 * @param sqlInsertLine the new sql insert line
	 */
	public void setSqlInsertLine(List<SQLInsertLine> sqlInsertLine) {
		this.sqlInsertLine = sqlInsertLine;
	}
	
	/**
	 * Gets the sql update line.
	 *
	 * @return the sql update line
	 */
	public List<SQLUpdateLine> getSqlUpdateLine() {
		return sqlUpdateLine;
	}
	
	/**
	 * Sets the sql update line.
	 *
	 * @param sqlUpdateLine the new sql update line
	 */
	public void setSqlUpdateLine(List<SQLUpdateLine> sqlUpdateLine) {
		this.sqlUpdateLine = sqlUpdateLine;
	}
	
	/**
	 * Gets the sql delete line.
	 *
	 * @return the sql delete line
	 */
	public List<SQLDeleteLine> getSqlDeleteLine() {
		return sqlDeleteLine;
	}
	
	/**
	 * Sets the sql delete line.
	 *
	 * @param sqlDeleteLine the new sql delete line
	 */
	public void setSqlDeleteLine(List<SQLDeleteLine> sqlDeleteLine) {
		this.sqlDeleteLine = sqlDeleteLine;
	}
	
	
	
	
}
