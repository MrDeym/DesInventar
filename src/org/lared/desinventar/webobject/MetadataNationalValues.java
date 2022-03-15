//PACKAGE NAME
package org.lared.desinventar.webobject;

import java.io.*;
import java.util.*;
import java.sql.*;
import java.math.*;
import java.text.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;


//CLASS NAME
// generated by WebObjectGenerator...
public class MetadataNationalValues extends webObject
{
//    public int dbType=Sys.iDatabaseType;	

	// DATA MEMBERS OF THE CLASS. THEY ARE EXACT MAPPING OF DB. RECORD.
	public 	int    metadata_key;
	public 	String metadata_country;
	public 	int    metadata_year;
	public 	double metadata_value;
	public 	double metadata_value_us;

	/**
	* creates a hash table with field values of the data members
	*
	*/

	public void updateHashTable() {
		// FIELD NAMES VECTOR
		asFieldNames.put("metadata_key", String.valueOf(metadata_key));
		asFieldNames.put("metadata_country", metadata_country);
		asFieldNames.put("metadata_year", String.valueOf(metadata_year));
		asFieldNames.put("metadata_value", String.valueOf(metadata_value));
		asFieldNames.put("metadata_value_us", String.valueOf(metadata_value_us));

	}

	/**
	* update data members with values stored in hash table
	*
	*/

	public void updateMembersFromHashTable() {
		// REVERSE FIELD NAMES VECTOR
		setMetadata_key((String)asFieldNames.get("metadata_key"));
		setMetadata_country((String)asFieldNames.get("metadata_country"));
		setMetadata_year((String)asFieldNames.get("metadata_year"));
		setMetadata_value((String)asFieldNames.get("metadata_value"));
		setMetadata_value_us((String)asFieldNames.get("metadata_value_us"));

	}
	/**
	* constructor of the class. it initialises the object variables
	*
	*/

	// CONSTRUCTOR
	public void init() {
		lastError="No errors detected";
		metadata_key = 0;
		metadata_country = "";
		metadata_year = 0;
		metadata_value = 0;
		metadata_value_us = 0;
		updateHashTable();
	}

	public MetadataNationalValues() {
		super("MetadataNationalValues object");
		init();
	}
//--------------------------------------------------------------------------------
// getter and setter methods of the elements of the class
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'metadata_key'
	public String getMetadata_key() {
		return Integer.toString(metadata_key);
	}

	public void setMetadata_key(String sParameter) {
		metadata_key = extendedParseInt(sParameter);
	}

	public void setMetadata_key(int sParameter) {
		metadata_key = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'metadata_country'
	public String getMetadata_country() {
		return metadata_country;
	}

	public void setMetadata_country(String sParameter) {
		metadata_country = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'metadata_year'
	public String getMetadata_year() {
		return Integer.toString(metadata_year);
	}

	public void setMetadata_year(String sParameter) {
		metadata_year = extendedParseInt(sParameter);
	}

	public void setMetadata_year(int sParameter) {
		metadata_year = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'metadata_value'
	public String getMetadata_value() {
		return Double.toString(metadata_value);
	}

	public void setMetadata_value(String sParameter) {
		metadata_value = extendedParseDouble(sParameter);
	}

	public void setMetadata_value(double sParameter) {
		metadata_value = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'metadata_value_us'
	public String getMetadata_value_us() {
		return Double.toString(metadata_value_us);
	}

	public void setMetadata_value_us(String sParameter) {
		metadata_value_us = extendedParseDouble(sParameter);
	}

	public void setMetadata_value_us(double sParameter) {
		metadata_value_us = sParameter;
	}
//--------------------------------------------------------------------------------


	//----------------------------------------------------------------
	// Operational methods any webObject must have. Abstract class
	// provides templates and default behaviour (return error)
	//----------------------------------------------------------------

	/**
	* retrieves object info from HTML form fields
	*
	*/
	public int getForm(HttpServletRequest req, HttpServletResponse resp, Connection con) {

		// GET_FORM()
		setMetadata_key(req.getParameter(assignName("metadata_key")));
		setMetadata_country(not_null(req.getParameter(assignName("metadata_country"))));
		setMetadata_year(req.getParameter(assignName("metadata_year")));
		setMetadata_value(req.getParameter(assignName("metadata_value")));
		setMetadata_value_us(req.getParameter(assignName("metadata_value_us")));

		updateHashTable();
		return 0;
	}

	/**
	* retrieves object info from HTML form fields
	*
	*/
	public int getForm(ServletRequest req, ServletResponse resp, Connection con) {

		// GET_FORM()
		setMetadata_key(req.getParameter(assignName("metadata_key")));
		setMetadata_country(not_null(req.getParameter(assignName("metadata_country"))));
		setMetadata_year(req.getParameter(assignName("metadata_year")));
		setMetadata_value(req.getParameter(assignName("metadata_value")));
		setMetadata_value_us(req.getParameter(assignName("metadata_value_us")));

		updateHashTable();
		return 0;
	}


	/**
	* loads an object from a record read from database
	*
	*/
	public void loadWebObject(ResultSet rset) {
		try {
			// SQL_LOAD

			try {
				metadata_key = rset.getInt("metadata_key");

			} catch (Exception ex) {
				lastError = "<-- error attempting to access field metadata_key -->";
				System.out.println(ex.toString());
			}

			try {
				metadata_country = not_null(rset.getString("metadata_country"));

			} catch (Exception ex) {
				lastError = "<-- error attempting to access field metadata_country -->";
				System.out.println(ex.toString());
			}

			try {
				metadata_year = rset.getInt("metadata_year");

			} catch (Exception ex) {
				lastError = "<-- error attempting to access field metadata_year -->";
				System.out.println(ex.toString());
			}

			try {
				metadata_value = rset.getDouble("metadata_value");

			} catch (Exception ex) {
				lastError = "<-- error attempting to access field metadata_value -->";
				System.out.println(ex.toString());
			}

			try {
				metadata_value_us = rset.getDouble("metadata_value_us");

			} catch (Exception ex) {
				lastError = "<-- error attempting to access field metadata_value_us -->";
				System.out.println(ex.toString());
			}

		} catch (Exception e) {
			lastError = "<!-- Error loading WebObject: " + e.toString() + " : " + sSql + " -->";
		}
		updateHashTable();
	}

	/**
	* reads an object from the database
	*
	*/
	public int getWebObject(Connection con) 
	{
		int nrows = 0;
		try {		
			// SQL_GET
			int f=1;
			sSql = "SELECT * FROM metadata_national_values";
			sSql += " WHERE (metadata_key = ?) AND (metadata_country = ?) AND (metadata_year = ?)";
			pstmt = con.prepareStatement(sSql);

				pstmt.setInt(f++, metadata_key);

			if (metadata_country==null || metadata_country.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);
				pstmt.setInt(f++, metadata_year);			rset = pstmt.executeQuery();
			if (rset.next()) {
				loadWebObject(rset);
				nrows = 1;				
			}			
			// releases the statement object
			rset.close();
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
		} catch (Exception ex) {
			//Trap and report SQL errors
			lastError = "<!-- Error getting webObject: " + ex.toString() + " : " + sSql	+ " -->";
			nrows = -1;
		}
		finally {
			// releases the statement object
			try { pstmt.close(); } catch (Exception ignrd) {}
		}

		return nrows;
	}



	/**
	* checks the lengths of strings are <= to what is defined in the database
	*
	*/
	public void checkLengths()
    {
		// CHECK_LENGTHS
		if (metadata_country.length()>10)
			metadata_country=metadata_country.substring(0,10);
    }

	/**
	* adds a new object to the database
	*
	*/
	public int addWebObject(Connection con)
    {
		int nrows = 0;
		try {
			// SQL_INSERT
			int f=1;
			sSql = "insert into metadata_national_values (";
			sSql += "metadata_key, metadata_country, metadata_year, metadata_value";
			sSql += ", metadata_value_us)";
			sSql += "VALUES (?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sSql);

				pstmt.setInt(f++, metadata_key);
			if (metadata_country==null || metadata_country.length()==0)
				pstmt.setNull(f++, java.sql.Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);
				pstmt.setInt(f++, metadata_year);
				pstmt.setDouble(f++, metadata_value);
				pstmt.setDouble(f++, metadata_value_us);


			nrows = pstmt.executeUpdate();
			lastError = ""; // "NO ERROR. sql="+sSql;
		} catch (Exception ex) {
			//Trap and report SQL errors
			System.out.println("ERROR (adding web object): "+ex.toString());
			lastError = "<!-- Error adding webObject: " + ex.toString() + " : " + sSql + " -->";
			nrows=-1;
		}
		finally {
			// releases the statement object
			try { pstmt.close(); } catch (Exception ignrd) {}
		}
		return nrows;		
	}

  	/**
  	* updates an existing object in the database
  	*
  	*/
  	public int updateWebObject(Connection con)
    {
		int nrows = 0;
		try {
			// SQL_UPDATE
			int f=1;
			sSql = "UPDATE metadata_national_values SET ";
			sSql += "metadata_value = ?";
			sSql += ", metadata_value_us = ?";
			sSql += " WHERE (metadata_key = ?) AND (metadata_country = ?) AND (metadata_year = ?)";
			pstmt = con.prepareStatement(sSql);

				pstmt.setDouble(f++, metadata_value);
				pstmt.setDouble(f++, metadata_value_us);


				pstmt.setInt(f++, metadata_key);

			if (metadata_country==null || metadata_country.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);
				pstmt.setInt(f++, metadata_year);


			nrows = pstmt.executeUpdate();
			lastError = ""; // "NO ERROR. sql="+sSql;
		} catch (Exception ex) {
			//Trap and report SQL errors
			lastError = "<!-- Error updating webObject: " + ex.toString() + " : " + sSql + " -->";
			nrows=-1;
		}
		finally {
			// releases the statement object
			try { pstmt.close(); } catch (Exception ignrd) {}
		}
		return nrows;		
	}

	/**
	* deletes an existing object in the database
	*
	*/
	public int deleteWebObject(Connection con) 
	{
		int nrows = 0;
		try {
			// SQL_DELETE
			int f=1;
			sSql = "DELETE FROM metadata_national_values";
			sSql += " WHERE (metadata_key = ?) AND (metadata_country = ?) AND (metadata_year = ?)";
			pstmt = con.prepareStatement(sSql);

				pstmt.setInt(f++, metadata_key);

			if (metadata_country==null || metadata_country.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);
				pstmt.setInt(f++, metadata_year);


			nrows = pstmt.executeUpdate();
			lastError = ""; // "NO ERROR. sql="+sSql;
		} catch (Exception ex) {
			//Trap and report SQL errors
			lastError = "<!-- Error deleting webObject: " + ex.toString() + " : " + sSql + " -->";
			nrows=-1;
		}
		finally {
			// releases the statement object
			try { pstmt.close(); } catch (Exception ignrd) {}
		}
		return nrows;		
	}
}

/*    HTML TEMPLATE
<table border=0 cellspacing=0 cellpadding=0>
<tr><td>metadata_key:</td><td>  <INPUT type='TEXT' size='5' maxlength='11' name='metadata_key' VALUE="<%=beanName.metadata_key%>"></td></tr>
<tr><td>metadata_country:</td><td>  <INPUT type='TEXT' size='11' maxlength='10' name='metadata_country' VALUE="<%=beanName.metadata_country%>"></td></tr>
<tr><td>metadata_year:</td><td>  <INPUT type='TEXT' size='5' maxlength='11' name='metadata_year' VALUE="<%=beanName.metadata_year%>"></td></tr>
<tr><td>metadata_value:</td><td>  <INPUT type='TEXT' size='15' maxlength='22' name='metadata_value' VALUE="<%=beanName.metadata_value%>"></td></tr>
<tr><td>metadata_value_us:</td><td>  <INPUT type='TEXT' size='15' maxlength='22' name='metadata_value_us' VALUE="<%=beanName.metadata_value_us%>"></td></tr>
</table>
END HTML TEMPLATE */
