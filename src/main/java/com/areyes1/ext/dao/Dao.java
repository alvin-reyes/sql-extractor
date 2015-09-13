package com.areyes1.ext.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 * The Class Dao.
 */
public abstract class Dao {
	
	/** The conn. */
	protected Connection conn;

	
	/** The data source. */
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	
	/** The data source list. */
	@Value("#{dataSourceList}")
	private Map<String,DataSource> dataSourceList;
	
	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public Connection getConnection() {
		try {
			this.conn = dataSource.getConnection();
			return dataSource.getConnection();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	
	/**
	 * Gets the connection.
	 *
	 * @param dataSourceName the data source name
	 * @return the connection
	 */
	public Connection getConnection(String dataSourceName) 	{
		try {
			return (Connection) dataSourceList.get(dataSourceName).getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
