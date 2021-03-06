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
public class diccionario extends webObject
{

	// DATA MEMBERS OF THE CLASS. THEY ARE EXACT MAPPING OF DB. RECORD.
	public 	int      orden;
	public 	String nombre_campo;
	public 	String descripcion_campo;
	public 	String label_campo;
	public 	String label_campo_en;
	public 	int      pos_x;
	public 	int      pos_y;
	public 	int      lon_x;
	public 	int      lon_y;
	public 	int      color;
	public 	int      tabnumber;
	public 	int      fieldtype;

	//--------------------------------------------------------------------------------
	// creates a hash table with field values of the data members
	//--------------------------------------------------------------------------------

	public void updateHashTable() {
		// FIELD NAMES VECTOR
		asFieldNames.put("orden", String.valueOf(orden));
		asFieldNames.put("nombre_campo", nombre_campo);
		asFieldNames.put("descripcion_campo", descripcion_campo);
		asFieldNames.put("label_campo", label_campo);
		asFieldNames.put("label_campo_en", label_campo_en);
		asFieldNames.put("pos_x", String.valueOf(pos_x));
		asFieldNames.put("pos_y", String.valueOf(pos_y));
		asFieldNames.put("lon_x", String.valueOf(lon_x));
		asFieldNames.put("lon_y", String.valueOf(lon_y));
		asFieldNames.put("color", String.valueOf(color));
		asFieldNames.put("tabnumber", String.valueOf(tabnumber));
		asFieldNames.put("fieldtype", String.valueOf(fieldtype));

	}

	//--------------------------------------------------------------------------------
	// update data members with values stored in hash table
	//--------------------------------------------------------------------------------

	public void updateMembersFromHashTable() {
		// REVERSE FIELD NAMES VECTOR
		setOrden((String)asFieldNames.get("orden"));
		setNombre_campo((String)asFieldNames.get("nombre_campo"));
		setDescripcion_campo((String)asFieldNames.get("descripcion_campo"));
		setLabel_campo((String)asFieldNames.get("label_campo"));
		setLabel_campo_en((String)asFieldNames.get("label_campo_en"));
		setPos_x((String)asFieldNames.get("pos_x"));
		setPos_y((String)asFieldNames.get("pos_y"));
		setLon_x((String)asFieldNames.get("lon_x"));
		setLon_y((String)asFieldNames.get("lon_y"));
		setColor((String)asFieldNames.get("color"));
		setTabnumber((String)asFieldNames.get("tabnumber"));
		setFieldtype((String)asFieldNames.get("fieldtype"));

	}

	//--------------------------------------------------------------------------------
	// constructor of the class. it initializes the object variables
	//--------------------------------------------------------------------------------

	// CONSTRUCTOR
	public void init() {
		lastError="No errors detected";
		orden = 0;
		nombre_campo = "";
		descripcion_campo = "";
		label_campo = "";
		label_campo_en = "";
		pos_x = 0;
		pos_y = 0;
		lon_x = 0;
		lon_y = 0;
		color = 0;
		tabnumber = 0;
		fieldtype = 0;
		updateHashTable();
	}

	public diccionario(){
		super("diccionario object");
		init();
	}
//--------------------------------------------------------------------------------
// getter and setter methods of the elements of the class
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'orden'
	public String getOrden() {
		return Integer.toString(orden);
	}

	public void setOrden(String sParameter) {
		orden = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'nombre_campo'
	public String getNombre_campo() {
		return nombre_campo;
	}

	public void setNombre_campo(String sParameter) {
		nombre_campo = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'descripcion_campo'
	public String getDescripcion_campo() {
		return descripcion_campo;
	}

	public void setDescripcion_campo(String sParameter) {
		descripcion_campo = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'label_campo'
	public String getLabel_campo() {
		return label_campo;
	}

	public void setLabel_campo(String sParameter) {
		label_campo = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'label_campo_en'
	public String getLabel_campo_en() {
		return label_campo_en;
	}

	public void setLabel_campo_en(String sParameter) {
		label_campo_en = sParameter;
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'pos_x'
	public String getPos_x() {
		return Integer.toString(pos_x);
	}

	public void setPos_x(String sParameter) {
		pos_x = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'pos_y'
	public String getPos_y() {
		return Integer.toString(pos_y);
	}

	public void setPos_y(String sParameter) {
		pos_y = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'lon_x'
	public String getLon_x() {
		return Integer.toString(lon_x);
	}

	public void setLon_x(String sParameter) {
		lon_x = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'lon_y'
	public String getLon_y() {
		return Integer.toString(lon_y);
	}

	public void setLon_y(String sParameter) {
		lon_y = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'color'
	public String getColor() {
		return Integer.toString(color);
	}

	public void setColor(String sParameter) {
		color = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'tabnumber'
	public String getTabnumber() {
		return Integer.toString(tabnumber);
	}

	public void setTabnumber(String sParameter) {
		tabnumber = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------
// Access methods for database field 'fieldtype'
	public String getFieldtype() {
		return Integer.toString(fieldtype);
	}

	public void setFieldtype(String sParameter) {
		fieldtype = extendedParseInt(sParameter);
	}
//--------------------------------------------------------------------------------


	//----------------------------------------------------------------
	// Operational methods any webObject must have. Abstract class
	// provides templates and default behaviour (return error)
	//----------------------------------------------------------------

	//--------------------------------------------------------------------------------
	// retrieves object info from HTML form fields
	//--------------------------------------------------------------------------------
	public int getForm(HttpServletRequest req, HttpServletResponse resp, Connection con) {

		// GET_FORM()
		orden = extendedParseInt(req.getParameter(assignName("orden")));
		nombre_campo = not_null(req.getParameter(assignName("nombre_campo")));
		descripcion_campo = not_null(req.getParameter(assignName("descripcion_campo")));
		label_campo = not_null(req.getParameter(assignName("label_campo")));
		label_campo_en = not_null(req.getParameter(assignName("label_campo_en")));
		pos_x = extendedParseInt(req.getParameter(assignName("pos_x")));
		pos_y = extendedParseInt(req.getParameter(assignName("pos_y")));
		lon_x = extendedParseInt(req.getParameter(assignName("lon_x")));
		lon_y = extendedParseInt(req.getParameter(assignName("lon_y")));
		color = extendedParseInt(req.getParameter(assignName("color")));
		tabnumber = extendedParseInt(req.getParameter(assignName("tabnumber")));
		fieldtype = extendedParseInt(req.getParameter(assignName("fieldtype")));

		updateHashTable();
		return 0;
	}

	//--------------------------------------------------------------------------------
	// loads an object from a record read from database
	//--------------------------------------------------------------------------------
	public void loadWebObject(ResultSet rset) {
		try {
			// SQL_LOAD

			try {
				orden = rset.getInt("orden");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field orden -->";
				System.out.println(ex.toString());
			}

			try {
				nombre_campo = not_null(rset.getString("nombre_campo"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field nombre_campo -->";
				System.out.println(ex.toString());
			}

			try {
				descripcion_campo = not_null(rset.getString("descripcion_campo"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field descripcion_campo -->";
				System.out.println(ex.toString());
			}

			try {
				label_campo = not_null(rset.getString("label_campo"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field label_campo -->";
				System.out.println(ex.toString());
			}

			try {
				label_campo_en = not_null(rset.getString("label_campo_en"));
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field label_campo_en -->";
				System.out.println(ex.toString());
			}

			try {
				pos_x = rset.getInt("pos_x");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field pos_x -->";
				System.out.println(ex.toString());
			}

			try {
				pos_y = rset.getInt("pos_y");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field pos_y -->";
				System.out.println(ex.toString());
			}

			try {
				lon_x = rset.getInt("lon_x");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field lon_x -->";
				System.out.println(ex.toString());
			}

			try {
				lon_y = rset.getInt("lon_y");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field lon_y -->";
				System.out.println(ex.toString());
			}

			try {
				color = rset.getInt("color");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field color -->";
				System.out.println(ex.toString());
			}

			try {
				tabnumber = rset.getInt("tabnumber");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field tabnumber -->";
				System.out.println(ex.toString());
			}

			try {
				fieldtype = rset.getInt("fieldtype");
			} catch (Exception ex) {
				lastError = "<-- error attempting to access field fieldtype -->";
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
		if (nombre_campo.length()>30)
			nombre_campo=nombre_campo.substring(0,30);
		if (descripcion_campo.length()>180)
			descripcion_campo=descripcion_campo.substring(0,180);
		if (label_campo.length()>60)
			label_campo=label_campo.substring(0,60);
		if (label_campo_en.length()>60)
			label_campo_en=label_campo_en.substring(0,60);

	}


	//--------------------------------------------------------------------------------
	// reads an object from the database
	//--------------------------------------------------------------------------------
	public int getWebObject(Connection con) {
		try {		
			// SQL_GET
			int f=1;
			sSql = "SELECT orden,nombre_campo,descripcion_campo,label_campo,label_campo_en,pos_x,pos_y,lon_x,lon_y,color,tabnumber,fieldtype FROM diccionario";
			sSql += " WHERE (nombre_campo = ?)";
			pstmt = con.prepareStatement(sSql);


			if (nombre_campo == null || nombre_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, nombre_campo);


			rset = pstmt.executeQuery();
			int nrows = 1;
			if (rset.next()) {
				loadWebObject(rset);
			}
			else {
				nrows = 0;
			}
			
			// releases the statement object
			rset.close();
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			try{
		    	pstmt.close();
		    }
		    catch(Exception e)
		    {
		    	// do nothing for now
		    }
			
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
			sSql = "insert into diccionario (";
			sSql += "orden, nombre_campo, descripcion_campo, label_campo, label_campo_en";
			sSql += ", pos_x, pos_y, lon_x, lon_y, color, tabnumber, fieldtype)";
			sSql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sSql);

			pstmt.setInt(f++, orden);

			if (nombre_campo == null || nombre_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, nombre_campo);

			if (descripcion_campo == null || descripcion_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, descripcion_campo);

			if (label_campo == null || label_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, label_campo);

			if (label_campo_en == null || label_campo_en.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, label_campo_en);
			pstmt.setInt(f++, pos_x);
			pstmt.setInt(f++, pos_y);
			pstmt.setInt(f++, lon_x);
			pstmt.setInt(f++, lon_y);
			pstmt.setInt(f++, color);
			
			// this is a key...
			if (tabnumber == 0)
				pstmt.setNull(f++, Types.INTEGER);
			else
				pstmt.setInt(f++, tabnumber);
			
			pstmt.setInt(f++, fieldtype);


			int nrows = pstmt.executeUpdate();
			
			// releases the statement object
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			try{
		    	pstmt.close();
		    }
		    catch(Exception e)
		    {
		    	// do nothing for now
		    }
			
			//Trap and report SQL errors
			System.out.println("ERROR (adding web object): "+ex.toString());
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
			// SQL_UPDATE
			checkLengths();
			int f=1;
			sSql = "UPDATE diccionario SET ";
			sSql += "orden = ?";
			sSql += ", descripcion_campo = ?";
			sSql += ", label_campo = ?";
			sSql += ", label_campo_en = ?";
			sSql += ", pos_x = ?";
			sSql += ", pos_y = ?";
			sSql += ", lon_x = ?";
			sSql += ", lon_y = ?";
			sSql += ", color = ?";
			sSql += ", tabnumber = ?";
			sSql += ", fieldtype = ?";
			sSql += " WHERE (nombre_campo = ?)";
			pstmt = con.prepareStatement(sSql);

			pstmt.setInt(f++, orden);

			if (descripcion_campo == null || descripcion_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, descripcion_campo);

			if (label_campo == null || label_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, label_campo);

			if (label_campo_en == null || label_campo_en.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, label_campo_en);
			pstmt.setInt(f++, pos_x);
			pstmt.setInt(f++, pos_y);
			pstmt.setInt(f++, lon_x);
			pstmt.setInt(f++, lon_y);
			pstmt.setInt(f++, color);
			pstmt.setInt(f++, tabnumber);
			pstmt.setInt(f++, fieldtype);



			if (nombre_campo == null || nombre_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, nombre_campo);


			int nrows = pstmt.executeUpdate();
			// releases the statement object
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			try{
		    	pstmt.close();
		    }
		    catch(Exception e)
		    {
		    	// do nothing for now
		    }
			
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
			sSql = "DELETE FROM diccionario";
			sSql += " WHERE (nombre_campo = ?)";
			pstmt = con.prepareStatement(sSql);


			if (nombre_campo == null || nombre_campo.length() == 0)
				pstmt.setNull(f++, Types.VARCHAR);
			else
				pstmt.setString(f++, nombre_campo);


			int nrows = pstmt.executeUpdate();
			// releases the statement object
			pstmt.close();
			lastError = ""; // "NO ERROR. sql="+sSql;
			return nrows;
		} catch (Exception ex) {
			try{
		    	pstmt.close();
		    }
		    catch(Exception e)
		    {
		    	// do nothing for now
		    }
			
			//Trap and report SQL errors
			lastError = "<!-- Error deleting webObject: " + ex.toString() + " : " + sSql + " -->";
		}
		return -1;
	}
}

/*    HTML TEMPLATE
<table border=0 cellspacing=0 cellpadding=0>
<tr><td>orden:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='orden' VALUE="<%=beanName.orden%>"></td></tr>
<tr><td>nombre_campo:</td><td>  <INPUT type='TEXT' size='31' maxlength='30' name='nombre_campo' VALUE="<%=beanName.nombre_campo%>"></td></tr>
<tr><td>descripcion_campo:</td><td>  <INPUT type='TEXT' size='50' maxlength='180' name='descripcion_campo' VALUE="<%=beanName.descripcion_campo%>"></td></tr>
<tr><td>label_campo:</td><td>  <INPUT type='TEXT' size='50' maxlength='60' name='label_campo' VALUE="<%=beanName.label_campo%>"></td></tr>
<tr><td>label_campo_en:</td><td>  <INPUT type='TEXT' size='50' maxlength='60' name='label_campo_en' VALUE="<%=beanName.label_campo_en%>"></td></tr>
<tr><td>pos_x:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='pos_x' VALUE="<%=beanName.pos_x%>"></td></tr>
<tr><td>pos_y:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='pos_y' VALUE="<%=beanName.pos_y%>"></td></tr>
<tr><td>lon_x:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='lon_x' VALUE="<%=beanName.lon_x%>"></td></tr>
<tr><td>lon_y:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='lon_y' VALUE="<%=beanName.lon_y%>"></td></tr>
<tr><td>color:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='color' VALUE="<%=beanName.color%>"></td></tr>
<tr><td>tabnumber:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='tabnumber' VALUE="<%=beanName.tabnumber%>"></td></tr>
<tr><td>fieldtype:</td><td>  <INPUT type='TEXT' size='5' maxlength='22' name='fieldtype' VALUE="<%=beanName.fieldtype%>"></td></tr>
</table>
END HTML TEMPLATE */
