<%@page contentType="text/html"%>
<html>
<head><title>Escuela Mundo Feliz - Registro de Alumnos</title></head>
<body onload = document.regAlumno.txtDNI.focus(); >

<SCRIPT>
  function LimpiarForma(form) {
    form.txtDNI.value ="";
    document.regAlumno.txtDNI.focus();
  }
</SCRIPT>

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
        <FORM name = regAlumno method="POST" action="servlet/ValidarAlumno">
        <!Aqui se escribirá lo que aprecerá en el lado derecho>
        Home > Alta de Alumnos <BR><BR>
        Por favor llene los datos que a continuación se solicitan. Los especificados con (*)
        son obligatorios. <BR><BR>
        <TABLE WIDTH='50%' ALIGN=CENTER style="font-family:arial;font-size:10pt">
          <TR>
            <TD><B>Datos Personales</B></TD>
          </TR>
          <TR>
            <TD>*DNI:</TD><TD><INPUT NAME="txtDNI" maxlength="9" SIZE="25"></TD>
          </TR>
          <TR>  
            <TD>*Nombre:</TD><TD><INPUT NAME="txtNombre" maxlength="100" SIZE="25"></TD>
          </TR>
          <TR>
            <TD>*Apellidos:</TD><TD><INPUT NAME="txtApellidos" maxlength="100" SIZE="25"></TD>
          </TR>
          <TR>
            <TD>*Dirección:</TD><TD><INPUT NAME="txtDireccion" maxlength="100" SIZE="25"></TD>	      
          </TR>
          <TR>
            <TD>*Ciudad:</TD><TD><INPUT NAME="txtCiudad" maxlength="100" SIZE="25"></TD>	      
          </TR>
          <TR>
            <TD>*Provincia:</TD><TD><INPUT NAME="txtProvincia" maxlength="100" SIZE="25"></TD>	      
          </TR>
          <TR>
            <TD>*Código Postal:</TD><TD><INPUT NAME="txtCP" maxlength="5" SIZE="25"></TD>	      
          </TR>
          <TR>
            <TD>*Teléfono:</TD><TD><INPUT NAME="txtTelefono" maxlength="12" SIZE="25"></TD>	      
          </TR>
          <TR>
            <TD>*E-mail:</TD><TD><INPUT NAME="txtMail" maxlength="100" SIZE="25"></TD>	      
          </TR>
          <TR>
            <TD>Fecha Nacimiento:</TD><TD><INPUT NAME="txtNacimiento" maxlength="10" SIZE="25"></TD>	      
          </TR>
          <TR>
            <TD>&nbsp</TD>
          </TR>
          <TR>  
            <TD ALIGN=RIGHT><INPUT NAME="btnAceptar" TYPE="SUBMIT" VALUE="Enviar"></TD>
            <TD ALIGN=LEFT><INPUT TYPE="RESET" VALUE="Limpiar" onClick=LimpiarForma(this.form)></TD>	      
          </FORM >
          </TR>
        </TABLE>
      </td>     
    </table>
  </tr>
</table>

</body>
</html>
