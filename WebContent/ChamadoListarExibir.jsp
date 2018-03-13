<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border='1'>
		<tr bgcolor="#E6E6E6"> 
			<td> Numero Chamado </td> 
			<td> Descrição </td> 
			<td> Status </td> 
			<td> Data Abertura </td> 
			<td> Data Fechamento </td> 
			<td> Data Fila</td> 
		</tr>

		<% 

		List<Chamado> lista = (List<Chamado>) request.getAttribute("lista");
			for(Chamado chamado:lista) {
		%>
		
		<tr> <td> <%= chamado.getIdChamado() %> </td> 
		     <td> <%= chamado.getDescricao() %> </td> 
		     <td> <%= chamado.getStatus() %> </td> 
		     <td> <%= chamado.getDtAbertura() %> </td> 
		     <td> <%= chamado.getDtFechamento() %> </td> 
		</tr>
		
		
		
		<% } %>

</table>
</body>
</html>