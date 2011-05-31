/*
 * ValidarAlumno.java
 *
 * Created on 20 de marzo de 2006, 19:15
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import java.lang.String.*;
import java.text.*;

/**
 *
 * @author  MGM
 * @version
 */
public class ValidarAlumno extends HttpServlet {
      
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        HttpSession session = request.getSession();

        String dni = request.getParameter("txtDNI");
        String nombre = request.getParameter("txtNombre");
        String apellidos = request.getParameter("txtApellidos");
        String direccion = request.getParameter("txtDireccion");
        String ciudad = request.getParameter("txtCiudad");
        String provincia = request.getParameter("txtProvincia");
        String cp = request.getParameter("txtCP");
        String telefono = request.getParameter("txtTelefono");
        String mail   = request.getParameter("txtMail");
        String nacimiento = request.getParameter("txtNacimiento");
        //Localmente se llama desde la carpeta JSP
        String paginaSiguiente ="/JSP/mensajesAlumno.jsp"; 
        
        //Llamada desde la web
        //String paginaSiguiente ="/escuela/mensajesAlumno.jsp";               
        PrintWriter out = response.getWriter();         

        boolean val = true;
        
        request.setAttribute("proceso", "Envio_ok");  
        
        //Validar Datos obligatorios
        if (dni.equals("") || nombre.equals("") || apellidos.equals("") ||
                direccion.equals(""))
            request.setAttribute("proceso", "ErrorDatos");                
                
        // Validar DNI
        if (!dni.equals("")){
            if (!compruebaDni(dni))
                request.setAttribute("proceso", "dni_error"); 
        }
        
        //Validar Nombre
        if (!nombre.equals("")) {
            val = ValidaCadena(nombre);
            if (!val)
                request.setAttribute("proceso", "nombre_error"); 
        } 
                               
        request.setAttribute("dni_fin",dni);
        request.setAttribute("nombre_fin",nombre);
        request.setAttribute("apellidos_fin",apellidos);        
        request.setAttribute("direccion_fin",direccion);
        request.setAttribute("ciudad_fin",ciudad);
        request.setAttribute("provincia_fin",provincia);
        request.setAttribute("cp_fin",cp);
        request.setAttribute("telefono_fin",telefono);
        request.setAttribute("mail_fin",mail);
        request.setAttribute("nacimiento_fin",nacimiento);
        
        //Invocar el Response servlet
        RequestDispatcher rd;
        rd = getServletContext().getRequestDispatcher(paginaSiguiente);
        rd.include(request,response);        
    }
    
    private boolean compruebaDni(String dni) {
        String st = "TRWAGMYFPDXBNJZSQVHLCKE";
        String numeroDni;
        String dniReal;
        int enteroDni;
        if (dni.length() != 9)
            return false;
        numeroDni = dni.substring(0, 8);
        try {
            enteroDni = Integer.parseInt(numeroDni);
        } catch (NumberFormatException nfe) {
            return false;
        }
        dniReal = String.valueOf(enteroDni) + st.charAt(enteroDni % 23);
        if (!dniReal.equals(dni))
            return false;
        return true;
    }
  
    private boolean ValidaCadena (String s1) {
        boolean cadena = true;
        int len = s1.length();
        for (int cont=0; cont<len && cadena; cont++) {
            if( Character.isLetter(s1.charAt(cont)) || Character.isWhitespace(s1.charAt(cont)) ) {
                cadena = true;
                System.out.println("ValidarCadena " + s1 + "Caracter" );                    
            } 
            else {
                cadena = false;
                System.out.println("ValidarCadena " + s1 + "Número" );
            }                
        }     
        return cadena;
    }

    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Servlet que valida datos del Alumno";
    }
    
}
