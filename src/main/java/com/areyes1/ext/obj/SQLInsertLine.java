package com.areyes1.ext.obj;

/**
 * The Class SQLInsertLine.
 */
public class SQLInsertLine extends SQLLine {
	
	/** The comma delimited columns. */
	private String commaDelimitedColumns;
	
	/** The comma delimited values. */
	private String commaDelimitedValues;
	
	/**
	 * Gets the comma delimited columns.
	 *
	 * @return the comma delimited columns
	 */
	public String getCommaDelimitedColumns() {
		return commaDelimitedColumns;
	}
	
	/**
	 * Sets the comma delimited columns.
	 *
	 * @param commaDelimitedColumns the new comma delimited columns
	 */
	public void setCommaDelimitedColumns(String commaDelimitedColumns) {
		this.commaDelimitedColumns = commaDelimitedColumns;
	}
	
	/**
	 * Gets the comma delimited values.
	 *
	 * @return the comma delimited values
	 */
	public String getCommaDelimitedValues() {
		return commaDelimitedValues;
	}
	
	/**
	 * Sets the comma delimited values.
	 *
	 * @param commaDelimitedValues the new comma delimited values
	 */
	public void setCommaDelimitedValues(String commaDelimitedValues) {
		this.commaDelimitedValues = commaDelimitedValues;
	}
	
	
}
