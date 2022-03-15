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
public class MetadataNationalLang extends webObject
{
//    public int dbType=Sys.iDatabaseType;	

	// DATA MEMBERS OF THE CLASS. THEY ARE EXACT MAPPING OF DB. RECORD.
	public 	int    metadata_key;
	public 	String metadata_country;
	public 	String metadata_lang;
	public 	String metadata_description;

	/**
	* creates a hash table with field values of the data members
	*
	*/

	public void updateHashTable() {
		// FIELD NAMES VECTOR
		asFieldNames.put("metadata_key", String.valueOf(metadata_key));
		asFieldNames.put("metadata_country", metadata_country);
		asFieldNames.put("metadata_lang", metadata_lang);
		asFieldNames.put("metadata_description", metadata_description);

	}

	/**
	* update data members with values stored in hash table
	*
	*/

	public void updateMembersFromHashTable() {
		// REVERSE FIELD NAMES VECTOR
		setMetadata_key((String)asFieldNames.get("metadata_key"));
		setMetadata_country((String)asFieldNames.get("metadata_country"));
		setMetadata_lang((String)asFieldNames.get("metadata_lang"));
		setMetadata_description((String)asFieldNames.get("metadata_description"));

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
		metadata_lang = "";
		metadata_description = "";
		updateHashTable();
	}

	public MetadataNationalLang() {
		super("MetadataNationalLang object");
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
// Access methods for database field 'metadata_lang'
	public String getMetadata_lang() {
		return metadata_lang;
	}

	public void setMetadata_lang(String sParameter) {
		metadata_lang = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'metadata_description'
	public String getMetadata_description() {
		return metadata_description;
	}

	public void setMetadata_description(String sParameter) {
		metadata_description = sParameter;
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
		setMetadata_lang(not_null(req.getParameter(assignName("metadata_lang"))));
		setMetadata_description(not_null(req.getParameter(assignName("metadata_description"))));

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
		setMetadata_lang(not_null(req.getParameter(assignName("metadata_lang"))));
		setMetadata_description(not_null(req.getParameter(assignName("metadata_description"))));

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
				metadata_lang = not_null(rset.getString("metadata_lang"));

			} catch (Exception ex) {
				lastError = "<-- error attempting to access field metadata_lang -->";
				System.out.println(ex.toString());
			}

			try {
				metadata_description = not_null(rset.getString("metadata_description"));

			} catch (Exception ex) {
				lastError = "<-- error attempting to access field metadata_description -->";
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
			sSql = "SELECT * FROM metadata_national_lang";
			sSql += " WHERE (metadata_key = ?) AND (metadata_country = ?) AND (metadata_lang = ?)";
			pstmt = con.prepareStatement(sSql);

				pstmt.setInt(f++, metadata_key);

			if (metadata_country==null || metadata_country.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);

			if (metadata_lang==null || metadata_lang.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_lang);			rset = pstmt.executeQuery();
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
		if (metadata_lang.length()>10)
			metadata_lang=metadata_lang.substring(0,10);
		if (metadata_description.length()>250)
			metadata_description=metadata_description.substring(0,250);
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
			sSql = "insert into metadata_national_lang (";
			sSql += "metadata_key, metadata_country, metadata_lang, metadata_description)";
			sSql += "VALUES (?, ?, ?, ?)";
			pstmt = con.prepareStatement(sSql);

				pstmt.setInt(f++, metadata_key);
			if (metadata_country==null || metadata_country.length()==0)
				pstmt.setNull(f++, java.sql.Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);
			if (metadata_lang==null || metadata_lang.length()==0)
				pstmt.setNull(f++, java.sql.Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_lang);
			if (metadata_description==null || metadata_description.length()==0)
				pstmt.setNull(f++, java.sql.Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_description);


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
			sSql = "UPDATE metadata_national_lang SET ";
			sSql += "metadata_description = ?";
			sSql += " WHERE (metadata_key = ?) AND (metadata_country = ?) AND (metadata_lang = ?)";
			pstmt = con.prepareStatement(sSql);

			if (metadata_description==null || metadata_description.length()==0)
				pstmt.setNull(f++, java.sql.Types.VARCHAR);
			else 
				pstmt.setString(f++, metadata_description);


				pstmt.setInt(f++, metadata_key);

			if (metadata_country==null || metadata_country.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);

			if (metadata_lang==null || metadata_lang.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_lang);


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
			sSql = "DELETE FROM metadata_national_lang";
			sSql += " WHERE (metadata_key = ?) AND (metadata_country = ?) AND (metadata_lang = ?)";
			pstmt = con.prepareStatement(sSql);

				pstmt.setInt(f++, metadata_key);

			if (metadata_country==null || metadata_country.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_country);

			if (metadata_lang==null || metadata_lang.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, metadata_lang);


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
<tr><td>metadata_lang:</td><td>  <INPUT type='TEXT' size='11' maxlength='10' name='metadata_lang' VALUE="<%=beanName.metadata_lang%>"></td></tr>
<tr><td>metadata_description:</td><td>  <INPUT type='TEXT' size='50' maxlength='250' name='metadata_description' VALUE="<%=beanName.metadata_description%>"></td></tr>
</table>
END HTML TEMPLATE */