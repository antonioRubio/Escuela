<%@page contentType="text/html"%>
<html>
<head><title>Escuela Mundo Feliz - Registro de Alumnos</title></head>

<% String proceso = (String)request.getAttribute("proceso"); %> 

<table width='100%' style="font-family:arial;font-size:10pt">
  <tr BGCOLOR="6A9195">
    <td ALIGN=RIGHT>
        <font COLOR=WHITE> Bienvenido(a) al Registro de Alumnos </font>
    </td>
  </tr>
  <tr>
    <table height='90%' width='100%' style="font-family:arial;font-size:10pt">
      <td width='18%'>
        <TABLE height='100%' width='100%'>
          <TR>
            <TD ALIGN=LEFT BGCOLOR="43B0BC" VALIGN=TOP><FONT FACE="Arial" COLOR=WHITE SIZE=2> 
            </TD>
          </TR>
        </TABLE>
      </td>
      <td valign=top>
     <% if (proceso != (null)){
          if (proceso.equals("ErrorDatos")){ %>
          Home > Alta de Alumnos > Datos Erróneos <BR><BR></FONT>
          <FONT FACE="Arial" SIZE=2 color=#F4000A>
          Por favor revise que todos los campos que tengan (*) 
          <a href="#" onclick="window.history.go(-1)"> estén llenos.</a></FONT>
        <%} else if (proceso.equals("Envio_ok")){ %>
          Home > Alta de Alumnos > Datos Correctos <BR><BR></FONT>
          Tu información ha sido almacenada correctamente.   
        <% } else if (proceso.equals("dni_error")){ %>
          Home > Alta de Alumnos > DNI Erróneo <BR><BR></FONT>
          <FONT FACE="Arial" SIZE=2 color=#F4000A>
          Por favor revise que el DNI esté escrito
          <a href="#" onclick="window.history.go(-1)"> correctamente.</a><BR><BR>     
       <% } else if (proceso.equals("nombre_error")){ %>
          Home > Alta de Alumnos > Nombre Erróneo <BR><BR></FONT>
          <FONT FACE="Arial" SIZE=2 color=#F4000A>
          Por favor revise que el Nombre tenga solo
          <a href="#" onclick="window.history.go(-1)"> caracteres.</a><BR><BR>            
       <% }} else { %>
        > Home  </A> <BR><BR>
        Existe un problema con el servicio...<BR><BR>
        Inténtalo más tarde por favor y perdona las molestias que esto te pueda ocasionar.<BR><BR>
        Atte. <BR>
        Escuela Mundo Feliz
      <% } %>
      </td>      
    </table>
  </tr>
</table>
</body>
</html>

