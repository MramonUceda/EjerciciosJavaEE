<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<h2><%=request.getAttribute("Inicio") %></h2>
		<form action="/AplicacionWebSerlvetConParametros/ServletRespuesta" method="post">
			<label for="numeroUno">Numero 1</label>
			<input type="text" id="txtNumeroUno" name="txtNumeroUno">
			<label for="numeroDos">Numero 2</label>
			<input type="text" id="txtNumeroDos" name="txtNumeroDos">  
			<input type="submit" value="Enviar">
		
		</form>
		      
    </body>
</html>
