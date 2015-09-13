package com.areyes1.ext.obj;

/**
 * The Class SQLLine.
 */
public abstract class SQLLine {
	
	/** The Constant CONST_TOP. */
	public static final String CONST_TOP = "begin transaction";
	
	/** The Constant CONST_RB_ON_ERROR. */
	public static final String CONST_RB_ON_ERROR = "";
	
	/** The Constant CONST_BOTTOM. */
	public static final String CONST_BOTTOM = "commit transaction";
	
	/** The table. */
	private String table = "";
	
	/** The sql string. */
	private String sqlString = "";
	
	/**
	 * Gets the table.
	 *
	 * @return the table
	 */
	public String getTable() {
		return table;
	}
	
	/**
	 * Sets the table.
	 *
	 * @param table the new table
	 */
	public void setTable(String table) {
		this.table = table;
	}
	
	/**
	 * Gets the sql string.
	 *
	 * @return the sql string
	 */
	public String getSqlString() {
		return sqlString;
	}
	
	/**
	 * Sets the sql string.
	 *
	 * @param sqlString the new sql string
	 */
	public void setSqlString(String sqlString) {
		this.sqlString = sqlString;
	}
	
	
}
