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
public class users extends webObject
{
   // DATA MEMBERS OF THE CLASS. THEY ARE EXACT MAPPING OF DB. RECORD.
     public   String suserid;
     public   String spassword;
     public   int      iusertype;
     public   String sfirstname;
     public   String slastname;
     public   String sorganization;
     public   String saddress1;
     public   String saddress2;
     public   String scity;
     public   String sstateprovince;
     public   String scountry;
     public   String spostalcode;
     public   String semailaddress;
     public   String sphonenumber;
     public   String salternatephonenumber;
     public   String sfaxnumber;
     public   int      bnewuser;
     public   int      brecordstatus;
     public   int      bactive;
     public   String   dlastlogindate;
     public   String   dusersince;
     public   int      ifrequency;
     public   int      breceiveinstant;
     public   String smemberorganizationid;

	//--------------------------------------------------------------------------------
	// creates a hash table with field values of the data members
	//--------------------------------------------------------------------------------

  public void updateHashTable()
  {
		// FIELD NAMES VECTOR
		asFieldNames.put("suserid", suserid);
		asFieldNames.put("spassword", spassword);
		asFieldNames.put("iusertype", String.valueOf(iusertype));
		asFieldNames.put("sfirstname", sfirstname);
		asFieldNames.put("slastname", slastname);
		asFieldNames.put("sorganization", sorganization);
		asFieldNames.put("saddress1", saddress1);
		asFieldNames.put("saddress2", saddress2);
		asFieldNames.put("scity", scity);
		asFieldNames.put("sstateprovince", sstateprovince);
		asFieldNames.put("scountry", scountry);
		asFieldNames.put("spostalcode", spostalcode);
		asFieldNames.put("semailaddress", semailaddress);
		asFieldNames.put("sphonenumber", sphonenumber);
		asFieldNames.put("salternatephonenumber", salternatephonenumber);
		asFieldNames.put("sfaxnumber", sfaxnumber);
		asFieldNames.put("bnewuser", String.valueOf(bnewuser));
		asFieldNames.put("brecordstatus", String.valueOf(brecordstatus));
		asFieldNames.put("bactive", String.valueOf(bactive));
		asFieldNames.put("dlastlogindate", dlastlogindate);
		asFieldNames.put("dusersince", dusersince);
		asFieldNames.put("ifrequency", String.valueOf(ifrequency));
		asFieldNames.put("breceiveinstant", String.valueOf(breceiveinstant));
		asFieldNames.put("smemberorganizationid", smemberorganizationid);

	}

	//--------------------------------------------------------------------------------
	// constructor of the class. it initializes the object variables
	//--------------------------------------------------------------------------------

	// CONSTRUCTOR
	public void init()
	{
		lastError="No errors detected";
		suserid = "";
		spassword = "";
		iusertype = 0;
		sfirstname = "";
		slastname = "";
		sorganization = "";
		saddress1 = "";
		saddress2 = "";
		scity = "";
		sstateprovince = "";
		scountry = "";
		spostalcode = "";
		semailaddress = "";
		sphonenumber = "";
		salternatephonenumber = "";
		sfaxnumber = "";
		bnewuser = 0;
		brecordstatus = 0;
		bactive = 0;
		dlastlogindate = "";
		dusersince = "";
		ifrequency = 0;
		breceiveinstant = 0;
		smemberorganizationid = "";
		updateHashTable();
	}

	public users()
	{
		super("users object");
		init();
	}
//--------------------------------------------------------------------------------
// getter and setter methods of the elements of the class
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// METHODS FOR: suserid
	public String getSuserid()
	{
		return suserid;
	}

	public void setSuserid(String sParameter)
	{
		suserid = sParameter;
	}
// end of methods for Suserid
//--------------------------------------------------------------------------------
// METHODS FOR: spassword
	public String getSpassword()
	{
		return spassword;
	}

	public void setSpassword(String sParameter)
	{
		spassword = sParameter;
	}
// end of methods for Spassword
//--------------------------------------------------------------------------------
// METHODS FOR: iusertype
	public String getIusertype()
	{
		return Integer.toString(iusertype);
	}

	public void setIusertype(String sParameter)
	{
		iusertype = extendedParseInt(sParameter);
	}
// end of methods for Iusertype
//--------------------------------------------------------------------------------
// METHODS FOR: sfirstname
	public String getSfirstname()
	{
		return sfirstname;
	}

	public void setSfirstname(String sParameter)
	{
		sfirstname = sParameter;
	}
// end of methods for Sfirstname
//--------------------------------------------------------------------------------
// METHODS FOR: slastname
	public String getSlastname()
	{
		return slastname;
	}

	public void setSlastname(String sParameter)
	{
		slastname = sParameter;
	}
// end of methods for Slastname
//--------------------------------------------------------------------------------
// METHODS FOR: sorganization
	public String getSorganization()
	{
		return sorganization;
	}

	public void setSorganization(String sParameter)
	{
		sorganization = sParameter;
	}
// end of methods for Sorganization
//--------------------------------------------------------------------------------
// METHODS FOR: saddress1
	public String getSaddress1()
	{
		return saddress1;
	}

	public void setSaddress1(String sParameter)
	{
		saddress1 = sParameter;
	}
// end of methods for Saddress1
//--------------------------------------------------------------------------------
// METHODS FOR: saddress2
	public String getSaddress2()
	{
		return saddress2;
	}

	public void setSaddress2(String sParameter)
	{
		saddress2 = sParameter;
	}
// end of methods for Saddress2
//--------------------------------------------------------------------------------
// METHODS FOR: scity
	public String getScity()
	{
		return scity;
	}

	public void setScity(String sParameter)
	{
		scity = sParameter;
	}
// end of methods for Scity
//--------------------------------------------------------------------------------
// METHODS FOR: sstateprovince
	public String getSstateprovince()
	{
		return sstateprovince;
	}

	public void setSstateprovince(String sParameter)
	{
		sstateprovince = sParameter;
	}
// end of methods for Sstateprovince
//--------------------------------------------------------------------------------
// METHODS FOR: scountry
	public String getScountry()
	{
		return scountry;
	}

	public void setScountry(String sParameter)
	{
		scountry = sParameter;
	}
// end of methods for Scountry
//--------------------------------------------------------------------------------
// METHODS FOR: spostalcode
	public String getSpostalcode()
	{
		return spostalcode;
	}

	public void setSpostalcode(String sParameter)
	{
		spostalcode = sParameter;
	}
// end of methods for Spostalcode
//--------------------------------------------------------------------------------
// METHODS FOR: semailaddress
	public String getSemailaddress()
	{
		return semailaddress;
	}

	public void setSemailaddress(String sParameter)
	{
		semailaddress = sParameter;
	}
// end of methods for Semailaddress
//--------------------------------------------------------------------------------
// METHODS FOR: sphonenumber
	public String getSphonenumber()
	{
		return sphonenumber;
	}

	public void setSphonenumber(String sParameter)
	{
		sphonenumber = sParameter;
	}
// end of methods for Sphonenumber
//--------------------------------------------------------------------------------
// METHODS FOR: salternatephonenumber
	public String getSalternatephonenumber()
	{
		return salternatephonenumber;
	}

	public void setSalternatephonenumber(String sParameter)
	{
		salternatephonenumber = sParameter;
	}
// end of methods for Salternatephonenumber
//--------------------------------------------------------------------------------
// METHODS FOR: sfaxnumber
	public String getSfaxnumber()
	{
		return sfaxnumber;
	}

	public void setSfaxnumber(String sParameter)
	{
		sfaxnumber = sParameter;
	}
// end of methods for Sfaxnumber
//--------------------------------------------------------------------------------
// METHODS FOR: bnewuser
	public String getBnewuser()
	{
		return Integer.toString(bnewuser);
	}

	public void setBnewuser(String sParameter)
	{
		bnewuser = extendedParseInt(sParameter);
	}
// end of methods for Bnewuser
//--------------------------------------------------------------------------------
// METHODS FOR: brecordstatus
	public String getBrecordstatus()
	{
		return Integer.toString(brecordstatus);
	}

	public void setBrecordstatus(String sParameter)
	{
		brecordstatus = extendedParseInt(sParameter);
	}
// end of methods for Brecordstatus
//--------------------------------------------------------------------------------
// METHODS FOR: bactive
	public String getBactive()
	{
		return Integer.toString(bactive);
	}

	public void setBactive(String sParameter)
	{
		bactive = extendedParseInt(sParameter);
	}
// end of methods for Bactive
//--------------------------------------------------------------------------------
// METHODS FOR: dlastlogindate
	public String getDlastlogindate()
	{
		return dlastlogindate;
	}

	public void setDlastlogindate(String sParameter)
	{
		dlastlogindate = strDate(sParameter);
	}
// end of methods for Dlastlogindate
//--------------------------------------------------------------------------------
// METHODS FOR: dusersince
	public String getDusersince()
	{
		return dusersince;
	}

	public void setDusersince(String sParameter)
	{
		dusersince = strDate(sParameter);
	}
// end of methods for Dusersince
//--------------------------------------------------------------------------------
// METHODS FOR: ifrequency
	public String getIfrequency()
	{
		return Integer.toString(ifrequency);
	}

	public void setIfrequency(String sParameter)
	{
		ifrequency = extendedParseInt(sParameter);
	}
// end of methods for Ifrequency
//--------------------------------------------------------------------------------
// METHODS FOR: breceiveinstant
	public String getBreceiveinstant()
	{
		return Integer.toString(breceiveinstant);
	}

	public void setBreceiveinstant(String sParameter)
	{
		breceiveinstant = extendedParseInt(sParameter);
	}
// end of methods for Breceiveinstant
//--------------------------------------------------------------------------------
// METHODS FOR: smemberorganizationid
	public String getSmemberorganizationid()
	{
		return smemberorganizationid;
	}

	public void setSmemberorganizationid(String sParameter)
	{
		smemberorganizationid = sParameter;
	}
// end of methods for Smemberorganizationid

	//----------------------------------------------------------------
	// Operational methods any webObject must have. Abstract class
	// provides templates and default behaviour (return error)
	//----------------------------------------------------------------

	//--------------------------------------------------------------------------------
	// retrieves object info from HTML form fields
	//--------------------------------------------------------------------------------
	public int getForm(HttpServletRequest req, HttpServletResponse resp, Connection con) {

		// GET_FORM()
		suserid = not_null(req.getParameter(assignName("suserid")));
		spassword = not_null(req.getParameter(assignName("spassword")));
		iusertype = extendedParseInt(req.getParameter(assignName("iusertype")));
		sfirstname = not_null(req.getParameter(assignName("sfirstname")));
		slastname = not_null(req.getParameter(assignName("slastname")));
		sorganization = not_null(req.getParameter(assignName("sorganization")));
		saddress1 = not_null(req.getParameter(assignName("saddress1")));
		saddress2 = not_null(req.getParameter(assignName("saddress2")));
		scity = not_null(req.getParameter(assignName("scity")));
		sstateprovince = not_null(req.getParameter(assignName("sstateprovince")));
		scountry = not_null(req.getParameter(assignName("scountry")));
		spostalcode = not_null(req.getParameter(assignName("spostalcode")));
		semailaddress = not_null(req.getParameter(assignName("semailaddress")));
		sphonenumber = not_null(req.getParameter(assignName("sphonenumber")));
		salternatephonenumber = not_null(req.getParameter(assignName("salternatephonenumber")));
		sfaxnumber = not_null(req.getParameter(assignName("sfaxnumber")));
		bnewuser = extendedParseInt(req.getParameter(assignName("bnewuser")));
		brecordstatus = extendedParseInt(req.getParameter(assignName("brecordstatus")));
		bactive = extendedParseInt(req.getParameter(assignName("bactive")));
		dlastlogindate = strDate(not_null(req.getParameter(assignName("dlastlogindate"))));
		dusersince = strDate(not_null(req.getParameter(assignName("dusersince"))));
		ifrequency = extendedParseInt(req.getParameter(assignName("ifrequency")));
		breceiveinstant = extendedParseInt(req.getParameter(assignName("breceiveinstant")));
		smemberorganizationid = not_null(req.getParameter(assignName("smemberorganizationid")));

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
				suserid = not_null(rset.getString("suserid"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field suserid -->";
				System.out.println(ex.toString());
			}

			try {
				spassword = not_null(rset.getString("spassword"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field spassword -->";
				System.out.println(ex.toString());
			}

			try {
				iusertype = rset.getInt("iusertype");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field iusertype -->";
				System.out.println(ex.toString());
			}

			try {
				sfirstname = not_null(rset.getString("sfirstname"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field sfirstname -->";
				System.out.println(ex.toString());
			}

			try {
				slastname = not_null(rset.getString("slastname"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field slastname -->";
				System.out.println(ex.toString());
			}

			try {
				sorganization = not_null(rset.getString("sorganization"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field sorganization -->";
				System.out.println(ex.toString());
			}

			try {
				saddress1 = not_null(rset.getString("saddress1"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field saddress1 -->";
				System.out.println(ex.toString());
			}

			try {
				saddress2 = not_null(rset.getString("saddress2"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field saddress2 -->";
				System.out.println(ex.toString());
			}

			try {
				scity = not_null(rset.getString("scity"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field scity -->";
				System.out.println(ex.toString());
			}

			try {
				sstateprovince = not_null(rset.getString("sstateprovince"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field sstateprovince -->";
				System.out.println(ex.toString());
			}

			try {
				scountry = not_null(rset.getString("scountry"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field scountry -->";
				System.out.println(ex.toString());
			}

			try {
				spostalcode = not_null(rset.getString("spostalcode"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field spostalcode -->";
				System.out.println(ex.toString());
			}

			try {
				semailaddress = not_null(rset.getString("semailaddress"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field semailaddress -->";
				System.out.println(ex.toString());
			}

			try {
				sphonenumber = not_null(rset.getString("sphonenumber"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field sphonenumber -->";
				System.out.println(ex.toString());
			}

			try {
				salternatephonenumber = not_null(rset.getString("salternatephonenumber"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field salternatephonenumber -->";
				System.out.println(ex.toString());
			}

			try {
				sfaxnumber = not_null(rset.getString("sfaxnumber"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field sfaxnumber -->";
				System.out.println(ex.toString());
			}

			try {
				bnewuser = rset.getInt("bnewuser");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field bnewuser -->";
				System.out.println(ex.toString());
			}

			try {
				brecordstatus = rset.getInt("brecordstatus");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field brecordstatus -->";
				System.out.println(ex.toString());
			}

			try {
				bactive = rset.getInt("bactive");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field bactive -->";
				System.out.println(ex.toString());
			}

			try {
				dlastlogindate = strDate(rset.getDate("dlastlogindate"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field dlastlogindate -->";
				System.out.println(ex.toString());
			}

			try {
				dusersince = strDate(rset.getDate("dusersince"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field dusersince -->";
				System.out.println(ex.toString());
			}

			try {
				ifrequency = rset.getInt("ifrequency");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field ifrequency -->";
				System.out.println(ex.toString());
			}

			try {
				breceiveinstant = rset.getInt("breceiveinstant");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field breceiveinstant -->";
				System.out.println(ex.toString());
			}

			try {
				smemberorganizationid = not_null(rset.getString("smemberorganizationid"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field smemberorganizationid -->";
				System.out.println(ex.toString());
			}

		} catch (Exception e) {
			lastError = "<!-- Error loading WebObject: " + e.toString() + " : " + sSql + " -->";
		}
		updateHashTable();
	}

	//--------------------------------------------------------------------------------
	// reads an object from the database
	//--------------------------------------------------------------------------------
  public int getWebObject(Connection con)
    {
		try {		
			// SQL_GET
			int f=1;
			sSql = "SELECT * FROM users";
			sSql += " WHERE (suserid = ?)";
			pstmt = con.prepareStatement(sSql);


			if (suserid == null || suserid.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, suserid);			rset = pstmt.executeQuery();
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
			// SQL_INSERT
			int f=1;
			sSql = "insert into users (";
			sSql += "suserid, spassword, iusertype, sfirstname, slastname, sorganization";
			sSql += ", saddress1, saddress2, scity, sstateprovince, scountry, spostalcode, semailaddress";
			sSql += ", sphonenumber, salternatephonenumber, sfaxnumber, bnewuser, brecordstatus";
			sSql += ", bactive, dlastlogindate, dusersince, ifrequency, breceiveinstant, smemberorganizationid)";
			sSql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sSql);


			if (suserid == null || suserid.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, suserid);

			if (spassword == null || spassword.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, spassword);
			pstmt.setInt(f++, iusertype);

			if (sfirstname == null || sfirstname.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sfirstname);

			if (slastname == null || slastname.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, slastname);

			if (sorganization == null || sorganization.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sorganization);

			if (saddress1 == null || saddress1.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, saddress1);

			if (saddress2 == null || saddress2.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, saddress2);

			if (scity == null || scity.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, scity);

			if (sstateprovince == null || sstateprovince.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sstateprovince);

			if (scountry == null || scountry.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, scountry);

			if (spostalcode == null || spostalcode.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, spostalcode);

			if (semailaddress == null || semailaddress.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, semailaddress);

			if (sphonenumber == null || sphonenumber.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sphonenumber);

			if (salternatephonenumber == null || salternatephonenumber.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, salternatephonenumber);

			if (sfaxnumber == null || sfaxnumber.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sfaxnumber);
			pstmt.setInt(f++, bnewuser);
			pstmt.setInt(f++, brecordstatus);
			pstmt.setInt(f++, bactive);
			if (dlastlogindate.length() > 0)
				pstmt.setDate(f++, extendedParseDate(dlastlogindate));
			else
				pstmt.setNull(f++, Types.DATE);
			if (dusersince.length() > 0)
				pstmt.setDate(f++, extendedParseDate(dusersince));
			else
				pstmt.setNull(f++, Types.DATE);
			pstmt.setInt(f++, ifrequency);
			pstmt.setInt(f++, breceiveinstant);

			if (smemberorganizationid == null || smemberorganizationid.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, smemberorganizationid);


			int nrows = pstmt.executeUpdate();
			
			// releases the statement object
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			//Trap and report SQL errors
			System.out.println("ERROR (adding web object): "+ex.toString());
			lastError = "<!-- Error adding User webObject: " + ex.toString() + " : " + sSql + " -->";
			return -1;
		}
	}

	//--------------------------------------------------------------------------------
	// updates an existing object in the database
	//--------------------------------------------------------------------------------
  public int updateWebObject(Connection con)
    {
		try {
			// SQL_UPDATE
			int f=1;
			sSql = "UPDATE users SET ";
			sSql += "spassword = ?";
			sSql += ", iusertype = ?";
			sSql += ", sfirstname = ?";
			sSql += ", slastname = ?";
			sSql += ", sorganization = ?";
			sSql += ", saddress1 = ?";
			sSql += ", saddress2 = ?";
			sSql += ", scity = ?";
			sSql += ", sstateprovince = ?";
			sSql += ", scountry = ?";
			sSql += ", spostalcode = ?";
			sSql += ", semailaddress = ?";
			sSql += ", sphonenumber = ?";
			sSql += ", salternatephonenumber = ?";
			sSql += ", sfaxnumber = ?";
			sSql += ", bnewuser = ?";
			sSql += ", brecordstatus = ?";
			sSql += ", bactive = ?";
			sSql += ", dlastlogindate = ?";
			sSql += ", dusersince = ?";
			sSql += ", ifrequency = ?";
			sSql += ", breceiveinstant = ?";
			sSql += ", smemberorganizationid = ?";
			sSql += " WHERE (suserid = ?)";
			pstmt = con.prepareStatement(sSql);


			if (spassword == null || spassword.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, spassword);
			pstmt.setInt(f++, iusertype);

			if (sfirstname == null || sfirstname.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sfirstname);

			if (slastname == null || slastname.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, slastname);

			if (sorganization == null || sorganization.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sorganization);

			if (saddress1 == null || saddress1.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, saddress1);

			if (saddress2 == null || saddress2.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, saddress2);

			if (scity == null || scity.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, scity);

			if (sstateprovince == null || sstateprovince.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sstateprovince);

			if (scountry == null || scountry.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, scountry);

			if (spostalcode == null || spostalcode.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, spostalcode);

			if (semailaddress == null || semailaddress.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, semailaddress);

			if (sphonenumber == null || sphonenumber.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sphonenumber);

			if (salternatephonenumber == null || salternatephonenumber.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, salternatephonenumber);

			if (sfaxnumber == null || sfaxnumber.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, sfaxnumber);
			pstmt.setInt(f++, bnewuser);
			pstmt.setInt(f++, brecordstatus);
			pstmt.setInt(f++, bactive);

			if (dlastlogindate == null || dlastlogindate.length() == 0)
				pstmt.setNull(f++, Types.DATE);
			else
				pstmt.setDate(f++,  extendedParseDate(dlastlogindate));

			if (dusersince == null || dusersince.length() == 0)
				pstmt.setNull(f++, Types.DATE);
			else
				pstmt.setDate(f++, extendedParseDate(dusersince));
			pstmt.setInt(f++, ifrequency);
			pstmt.setInt(f++, breceiveinstant);

			if (smemberorganizationid == null || smemberorganizationid.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, smemberorganizationid);



			if (suserid == null || suserid.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, suserid);


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
			sSql = "DELETE FROM users";
			sSql += " WHERE (suserid = ?)";
			pstmt = con.prepareStatement(sSql);


			if (suserid == null || suserid.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, suserid);


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
<tr><td>suserid:</td><td>  <INPUT type='TEXT' size='31' maxlength='30' name='suserid' VALUE="<%=beanName.suserid%>"></td></tr>
<tr><td>spassword:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='spassword' VALUE="<%=beanName.spassword%>"></td></tr>
<tr><td>iusertype:</td><td>  <INPUT type='TEXT' size='5' maxlength='11' name='iusertype' VALUE="<%=beanName.iusertype%>"></td></tr>
<tr><td>sfirstname:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='sfirstname' VALUE="<%=beanName.sfirstname%>"></td></tr>
<tr><td>slastname:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='slastname' VALUE="<%=beanName.slastname%>"></td></tr>
<tr><td>sorganization:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='sorganization' VALUE="<%=beanName.sorganization%>"></td></tr>
<tr><td>saddress1:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='saddress1' VALUE="<%=beanName.saddress1%>"></td></tr>
<tr><td>saddress2:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='saddress2' VALUE="<%=beanName.saddress2%>"></td></tr>
<tr><td>scity:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='scity' VALUE="<%=beanName.scity%>"></td></tr>
<tr><td>sstateprovince:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='sstateprovince' VALUE="<%=beanName.sstateprovince%>"></td></tr>
<tr><td>scountry:</td><td>  <INPUT type='TEXT' size='31' maxlength='30' name='scountry' VALUE="<%=beanName.scountry%>"></td></tr>
<tr><td>spostalcode:</td><td>  <INPUT type='TEXT' size='16' maxlength='15' name='spostalcode' VALUE="<%=beanName.spostalcode%>"></td></tr>
<tr><td>semailaddress:</td><td>  <INPUT type='TEXT' size='50' maxlength='255' name='semailaddress' VALUE="<%=beanName.semailaddress%>"></td></tr>
<tr><td>sphonenumber:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='sphonenumber' VALUE="<%=beanName.sphonenumber%>"></td></tr>
<tr><td>salternatephonenumber:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='salternatephonenumber' VALUE="<%=beanName.salternatephonenumber%>"></td></tr>
<tr><td>sfaxnumber:</td><td>  <INPUT type='TEXT' size='50' maxlength='50' name='sfaxnumber' VALUE="<%=beanName.sfaxnumber%>"></td></tr>
<tr><td>bnewuser:</td><td>  <INPUT type='TEXT' size='5' maxlength='6' name='bnewuser' VALUE="<%=beanName.bnewuser%>"></td></tr>
<tr><td>brecordstatus:</td><td>  <INPUT type='TEXT' size='5' maxlength='6' name='brecordstatus' VALUE="<%=beanName.brecordstatus%>"></td></tr>
<tr><td>bactive:</td><td>  <INPUT type='TEXT' size='5' maxlength='6' name='bactive' VALUE="<%=beanName.bactive%>"></td></tr>
<tr><td>dlastlogindate:</td><td> <INPUT type='TEXT' size='10' maxlength='10' name='dlastlogindate' VALUE="<%=beanName.dlastlogindate%>"></td></tr>
<tr><td>dusersince:</td><td> <INPUT type='TEXT' size='10' maxlength='10' name='dusersince' VALUE="<%=beanName.dusersince%>"></td></tr>
<tr><td>ifrequency:</td><td>  <INPUT type='TEXT' size='5' maxlength='11' name='ifrequency' VALUE="<%=beanName.ifrequency%>"></td></tr>
<tr><td>breceiveinstant:</td><td>  <INPUT type='TEXT' size='5' maxlength='6' name='breceiveinstant' VALUE="<%=beanName.breceiveinstant%>"></td></tr>
<tr><td>smemberorganizationid:</td><td>  <INPUT type='TEXT' size='31' maxlength='30' name='smemberorganizationid' VALUE="<%=beanName.smemberorganizationid%>"></td></tr>
</table>
END HTML TEMPLATE */