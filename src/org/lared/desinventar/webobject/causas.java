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

import org.lared.desinventar.util.*;
import org.lared.desinventar.system.*;
import org.lared.desinventar.webobject.*;


//CLASS NAME
// generated by persistentObjectGenerator...
public class causas extends webObject
{
    // DATA MEMBERS OF THE CLASS. THEY ARE EXACT MAPPING OF DB. RECORD.
     public   String causa;
     public   String causa_en;

	//--------------------------------------------------------------------------------
	// creates a hash table with field values of the data members
	//--------------------------------------------------------------------------------

  public void updateHashTable()
  {
		// FIELD NAMES VECTOR
		asFieldNames.put("causa", causa);
		asFieldNames.put("causa_en", causa_en);

	}

	//--------------------------------------------------------------------------------
	// update data members with values stored in hash table
	//--------------------------------------------------------------------------------

	public void updateMembersFromHashTable() {
		// REVERSE FIELD NAMES VECTOR
		setCausa((String)asFieldNames.get("causa"));
		setCausa_en((String)asFieldNames.get("causa_en"));

	}
  
	//--------------------------------------------------------------------------------
	// constructor of the class. it initializes the object variables
	//--------------------------------------------------------------------------------

	// CONSTRUCTOR
	public void init()
	{
		lastError="No errors detected";
		causa = "";
		causa_en = "";
		updateHashTable();
	}

	public causas()
	{
		super("causas object");
		init();
	}
//--------------------------------------------------------------------------------
// getter and setter methods of the elements of the class
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// METHODS FOR: causa
	public String getCausa()
	{
		return causa;
	}

	public void setCausa(String sParameter)
	{
		causa = sParameter;
	}
// end of methods for Causa
//--------------------------------------------------------------------------------
// METHODS FOR: causa_en
	public String getCausa_en()
	{
		return causa_en;
	}

	public void setCausa_en(String sParameter)
	{
		causa_en = sParameter;
	}
// end of methods for Causa_en

	//----------------------------------------------------------------
	// Operational methods any webObject must have. Abstract class
	// provides templates and default behaviour (return error)
	//----------------------------------------------------------------

	//--------------------------------------------------------------------------------
	// retrieves object info from HTML form fields
	//--------------------------------------------------------------------------------
	public int getForm(HttpServletRequest req, HttpServletResponse resp, Connection con) {

		// GET_FORM()
		causa = not_null(req.getParameter(assignName("causa")));
		causa_en = not_null(req.getParameter(assignName("causa_en")));

		updateHashTable();
		return 0;
	}

	//--------------------------------------------------------------------------------
	// loads an object from a record read from database
	//--------------------------------------------------------------------------------
  public void loadWebObject(ResultSet rset)
    {
		try {
			// SQL_LOAD

			try {
				causa = not_null(rset.getString("causa"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field causa -->";
				System.out.println(ex.toString());
			}

			try {
				causa_en = not_null(rset.getString("causa_en"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field causa_en -->";
				System.out.println(ex.toString());
			}

		} catch (Exception e) {
			lastError = "<!-- Error loading WebObject: " + e.toString() + " : " + sSql + " -->";
		}
		updateHashTable();
	}

	/**
	* checks the lengths of strings are <= to what is defined in the database
	*
	*/
	public void checkLengths()
  {
		// CHECK_LENGTHS
		if (causa.length()>25)
			causa=causa.substring(0,25);
		if (causa_en.length()>25)
			causa_en=causa_en.substring(0,25);
  }

	//--------------------------------------------------------------------------------
	// reads an object from the database
	//--------------------------------------------------------------------------------
  public int getWebObject(Connection con)
    {
		try {		
			// SQL_GET
			int f=1;
			sSql = "SELECT causa,causa_en FROM causas";
			sSql += " WHERE (causa = ?)";
			pstmt = con.prepareStatement(sSql);


			if (causa == null || causa.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, causa);			rset = pstmt.executeQuery();
			int nrows = 1;
			if (rset.next())
				loadWebObject(rset);
			else
				nrows = 0;
			// releases the statement object
			rset.close();
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			//Trap and report SQL errors
			lastError = "<!-- Error getting webObject: " + ex.toString() + " : " + sSql
					+ " -->";
		}

		return -1;
	}

	//--------------------------------------------------------------------------------
	// adds a new object to the database
	//--------------------------------------------------------------------------------
  public int addWebObject(Connection con)
    {
		try {
			checkLengths();
			// SQL_INSERT
			int f=1;
			sSql = "insert into causas (";
			sSql += "causa, causa_en)";
			sSql += "VALUES (?, ?)";
			pstmt = con.prepareStatement(sSql);


			if (causa == null || causa.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, causa);

			if (causa_en == null || causa_en.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, causa_en);


			int nrows = pstmt.executeUpdate();
			
			// releases the statement object
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			//Trap and report SQL errors
			System.out.println("DI9: ERROR (adding web object) CAUSE: "+ex.toString());
			lastError = "<!-- Error adding webObject: " + ex.toString() + " : " + sSql + " -->";
			return -1;
		}
	}

	//--------------------------------------------------------------------------------
	// updates an existing object in the database
	//--------------------------------------------------------------------------------
  public int updateWebObject(Connection con)
    {
		try {
			checkLengths();
			// SQL_UPDATE
			int f=1;
			sSql = "UPDATE causas SET ";
			sSql += "causa_en = ?";
			sSql += " WHERE (causa = ?)";
			pstmt = con.prepareStatement(sSql);


			if (causa_en == null || causa_en.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, causa_en);



			if (causa == null || causa.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, causa);


			int nrows = pstmt.executeUpdate();
			// releases the statement object
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			//Trap and report SQL errors
			lastError = "<!-- Error updating webObject: " + ex.toString() + " : " + sSql + " -->";
		}

		return -1;
	}

	//-------------------------------------------------------------------------------
	// deletes an existing object in the database
	//--------------------------------------------------------------------------------
	public int deleteWebObject(Connection con) {

		try {
			// SQL_DELETE
			int f=1;
			sSql = "DELETE FROM causas";
			sSql += " WHERE (causa = ?)";
			pstmt = con.prepareStatement(sSql);


			if (causa == null || causa.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, causa);


			int nrows = pstmt.executeUpdate();
			// releases the statement object
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			//Trap and report SQL errors
			lastError = "<!-- Error deleting webObject: " + ex.toString() + " : " + sSql + " -->";
		}
		return -1;
	}
}

/*    HTML TEMPLATE
<table border=0 cellspacing=0 cellpadding=0>
<tr><td>causa:</td><td>  <INPUT type='TEXT' size='26' maxlength='25' name='causa' VALUE="<%=beanName.causa%>"></td></tr>
<tr><td>causa_en:</td><td>  <INPUT type='TEXT' size='26' maxlength='25' name='causa_en' VALUE="<%=beanName.causa_en%>"></td></tr>
</table>
END HTML TEMPLATE */
