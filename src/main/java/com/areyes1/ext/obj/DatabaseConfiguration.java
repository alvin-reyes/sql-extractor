package com.areyes1.ext.obj;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class DatabaseConfiguration.
 */
@SuppressWarnings("restriction")
@XmlRootElement(name="databases")
public class DatabaseConfiguration {
	
	/** The id. */
	@XmlElement(name="id")
	private String id;
	
	/** The name. */
	private String name;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * Sets the driver.
	 *
	 * @param driver the new driver
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/** The db conn url. */
	@XmlElement(name="url")
	private String dbConnUrl;
	
	/** The db user name. */
	@XmlElement(name="username")
	private String dbUserName;
	
	/** The db password. */
	@XmlElement(name="password")
	private String dbPassword;
	
	/** The database. */
	@XmlElement(name="database")
	private String database;
	
	/** The driver. */
	@XmlElement
	private String driver;
	
	/**
	 * Gets the db conn url.
	 *
	 * @return the db conn url
	 */
	public String getDbConnUrl() {
		return dbConnUrl;
	}
	
	/**
	 * Sets the db conn url.
	 *
	 * @param dbConnUrl the new db conn url
	 */
	public void setDbConnUrl(String dbConnUrl) {
		this.dbConnUrl = dbConnUrl;
	}
	
	/**
	 * Gets the db user name.
	 *
	 * @return the db user name
	 */
	public String getDbUserName() {
		return dbUserName;
	}
	
	/**
	 * Sets the db user name.
	 *
	 * @param dbUserName the new db user name
	 */
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	
	/**
	 * Gets the db password.
	 *
	 * @return the db password
	 */
	public String getDbPassword() {
		return dbPassword;
	}
	
	/**
	 * Sets the db password.
	 *
	 * @param dbPassword the new db password
	 */
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	/**
	 * Gets the database.
	 *
	 * @return the database
	 */
	public String getDatabase() {
		return database;
	}
	
	/**
	 * Sets the database.
	 *
	 * @param database the new database
	 */
	public void setDatabase(String database) {
		this.database = database;
	}
	
	
}
