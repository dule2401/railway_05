<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.io.Console"%>

<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Form dạng bảng</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}
tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<h2 style="text-align: center;">Form nhập liệu</h2>

	<%
		String id = request.getParameter("stt");
	String name = request.getParameter("name");
	String brand = request.getParameter("brand");
	/* parse từ dạng String sang date */
	String startDateStr = request.getParameter("date");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//out.print(startDateStr);
	Date startDate = sdf.parse(startDateStr);
	/* Cách viết ngắn gọn:
	Date startDate=new SimpleDateFormat("mm/dd/yyyy").parse(request.getParameter("date")); */
	String price = request.getParameter("price");
	%>

	<table>

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
		<h2 style="text-align: center;">Bảng thông tin học sinh</h2>

	<%
	String id1 = request.getParameter("");
	String name1 = request.getParameter("name");
	String valueGet = request.getParameter("sex");
	if (valueGet.equals("Nam")) {
	} else if (valueGet.equals("Nữ")) {
	}
	String phone = request.getParameter("phone");
	String startDString = request.getParameter("birthday");
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	Date starDate = sdf.parse(startDateStr);
	%>
	/* Cách viết ngắn gọn:
	Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date")); */
	

	<table>

		<tr>
			<th>STT</th>
			<th>Họ tên</th>
			<th>Năm sinh</th>
			<th>Giới tính</th>
			<th>Số điện thoại</th>
		</tr>


		<tr>
			<td><%=id%></td>
			<td><%=name%></td>
			<td><%=startDate%></td>
			<td><%=valueGet%></td>  
			<td><%=phone%></td>                           
		</tr>

	</table>

</body>
</html>