<%@page import="java.util.Date"%>
<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style >
	<jsp:include page='../CSS/popup.css'></jsp:include>
	<jsp:include page='../CSS/navigation.css'></jsp:include>
	<jsp:include page='../CSS/flexbox.css'></jsp:include>
	<jsp:include page='../CSS/table.css'></jsp:include>
	</style>
  
</head>
<body>
	<div class="header">
		<jsp:include page='header.jsp'></jsp:include>

    </div>

    <div class="row">
    	<jsp:include page='column.jsp'></jsp:include>
       <jsp:include page='column1.jsp'></jsp:include>
       
    </div>

    <div class="footer">
       
    </div>
    <script>
	<jsp:include page="../js/program.js"/>
	</script>
</body>
</html>
