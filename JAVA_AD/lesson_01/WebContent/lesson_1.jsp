<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>

</head>
<body>
		<%@ page errorPage="error404.jsp"%>
	<!-- question1 -->
	<h1>Hello world</h1>
	<br>
	<%
		out.print("welcome to jps");
	%>
	<br>
	<!-- question 2 -->
	<%=java.util.Calendar.getInstance().getTime()%>
	<br>
	<!-- questiob 3 -->
	<%!String name = "LÊ NGỌC DU";%>
	<br>
	<%="Hello " + name%>
	<br>
	<!-- question 4 -->
	<%=new Date()%>
<!-- question 5 -->
	<%@ include file="header.html"%>
	
	
	<%-- <%
	response.sendRedirect("http://www.google.com");
	%> --%>
	<!-- Exercise 2: Demo Project -->
	<h5>Cong tru nhan chia</h5>
	<form action="ketqua.jsp">
		so hang 1: <input type="number" name="number1"> <br>
		so hang 2: <input type="number" name="number2"> <br>
		<button type="submit" value="+">+</button>
		
		<button type="submit" value="-">-</button>
		
		<button type="submit" value="*">*</button>
		
	 	<button type="submit" value="/">/</button>
	 	
	</form>
	<!-- Question 3: -->
	<table>
	<h2 style="text-align: center;">Form nhập liệu</h2>
	<%
	String id = request.getParameter("stt");
	String name = request.getParameter("name");
	String brand = request.getParameter("brand");
	String startDateStr = request.getParameter("date");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date startDate = sdf.parse(startDateStr);
	String price = request.getParameter("price");
	%>
		<tr>
			<th>STT</th>
			<th>Tên VXL</th>
			<th>Hãng sản xuất</th>
			<th>Ngày sản xuất</th>
			<th>Giá (vnd)</th>
		</tr>


		<tr>
			<td><%=id%></td>
			<td><%=name%></td>  
			<td><%=brand%></td>  
			<td><%=startDate%></td>
			<td><%=price%></td>                         
		</tr>

	</table>
	
	
</body>
</html>
