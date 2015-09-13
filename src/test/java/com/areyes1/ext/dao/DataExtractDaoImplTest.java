package com.areyes1.ext.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.areyes1.ext.obj.TableType;
/**
 * The Class DataExtractDaoImplTest.
 */
public class DataExtractDaoImplTest {
	
	/**
	 * Test if the table types wil work as expected. (No Integration, just plain 
	 * setting of new values and verifying them that the record is at least
	 * shown once).
	 */
	@Test
	public void testGetTableTypes() {
		TableType tType = Mockito.mock(TableType.class);
		DataExtractDaoImpl t = Mockito.mock(DataExtractDaoImpl.class);
		tType.setTable("CI_ALGO");
		tType.setType("TYPE1");
		tType.setColumn("ALG_TYPE");
		
		//	Insert new
		t.getTableTypes("TYPE1", "VALUE1");
		t.getTableTypes("TYPE2", "VALUE2");
		
		Mockito.verify(t, Mockito.atLeast(1)).getTableTypes("TYPE1", "VALUE1");
		Mockito.verify(t, Mockito.atLeast(1)).getTableTypes("TYPE2", "VALUE2");
	}


	/**
	 * Test generate delete string.
	 */
	@Test
	public void testGenerateDeleteString() {
		fail("Not yet implemented");
	}

	/**
	 * Test generate insert string.
	 */
	@Test
	public void testGenerateInsertString() {
		fail("Not yet implemented");
	}

	/**
	 * Test generate update string.
	 */
	@Test
	public void testGenerateUpdateString() {
		fail("Not yet implemented");
	}

	/**
	 * Test get connection.
	 */
	@Test
	public void testGetConnection() {
		fail("Not yet implemented");
	}

	/**
	 * Test get connection string.
	 */
	@Test
	public void testGetConnectionString() {
		fail("Not yet implemented");
	}

}
