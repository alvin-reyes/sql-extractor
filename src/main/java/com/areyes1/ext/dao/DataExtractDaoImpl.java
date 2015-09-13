package com.areyes1.ext.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.areyes1.ext.obj.ExtractConfigLine;
import com.areyes1.ext.obj.SQLDeleteLine;
import com.areyes1.ext.obj.SQLInsertLine;
import com.areyes1.ext.obj.SQLUpdateLine;
import com.areyes1.ext.obj.TableType;

/**
 * The Class DataExtractDaoImpl.
 */
@Repository("dataExtractDao")
public class DataExtractDaoImpl extends Dao implements DataExtractDao {

	/**
	 * Gets the table types.
	 *
	 * @param type the type
	 * @param value the value
	 * @return the table types
	 */
	public List<TableType> getTableTypes(String type, String value) {

		PreparedStatement ps;
		List<TableType> tableTypes = new ArrayList<TableType>();
		try {
			ps = getConnection().prepareCall("select * from type_table where type = ? and value = ?");
			ps.setString(1, type);
			ps.setString(2, value);
			ps.execute();
			ResultSet rs = ps.getResultSet();
			while (rs.next()) {
				TableType tableType = new TableType();
				tableType.setId(rs.getInt("id"));
				tableType.setColumn(rs.getString("column"));
				tableType.setType(rs.getString("type"));
				tableType.setTable(rs.getString("table"));
				tableTypes.add(tableType);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tableTypes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.areyes1.ext.dao.DataExtractDao#generateDeleteString(com.areyes1.ext
	 * .obj.ExtractConfigLine)
	 */
	public List<SQLDeleteLine> generateDeleteString(
			ExtractConfigLine extractConfigLine) {
		
		List<SQLDeleteLine> sqlDeleteLines = new ArrayList<SQLDeleteLine>();
		List<TableType> tableTypes = getTableTypes(
				extractConfigLine.getComponentType(),
				extractConfigLine.getComponentValue());
		
		// Get the records and select.
		for(TableType tableType:tableTypes){
			SQLDeleteLine sqlDeleteLine = new SQLDeleteLine();
			sqlDeleteLine.setTable(tableType.getColumn());
			sqlDeleteLine.setWhereClause(tableType.getColumn() + "=" + extractConfigLine.getComponentValue());
			sqlDeleteLines.add(sqlDeleteLine);
		}

		// Generate delete line for each.
		return sqlDeleteLines;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.areyes1.ext.dao.DataExtractDao#generateInsertString(com.areyes1.ext
	 * .obj.ExtractConfigLine)
	 */
	public List<SQLInsertLine> generateInsertString(
			ExtractConfigLine extractConfigLine) {
		List<SQLInsertLine> sqlInsertLines = new ArrayList<SQLInsertLine>();
		List<TableType> tableTypes = getTableTypes(
				extractConfigLine.getComponentType(),
				extractConfigLine.getComponentValue());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.areyes1.ext.dao.DataExtractDao#generateUpdateString(com.areyes1.ext
	 * .obj.ExtractConfigLine)
	 */
	public List<SQLUpdateLine> generateUpdateString(
			ExtractConfigLine extractConfigLine) {
		List<TableType> tableTypes = getTableTypes(
				extractConfigLine.getComponentType(),
				extractConfigLine.getComponentValue());
		// TODO Auto-generated method stub
		return null;
	}
}
