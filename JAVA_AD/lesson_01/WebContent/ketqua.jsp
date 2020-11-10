<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

float a = Float.parseFloat(request.getParameter("number1"));
float b = Float.parseFloat(request.getParameter("Number2"));
String valueGet = request.getParameter("caculate");

if (valueGet.equals("+")) {
float c = a + b;
out.print("Tổng hai số trên là " + c);

} if (valueGet.equals("-")) {
float d = a-b;
out.print("Hiệu hai số trên là " + d);

}if (valueGet.equals("*")) {
float e = a*b;
out.print("Tích hai số trên là " + e);
}
if (valueGet.equals("/")) {
float f = a/b;
out.print("Thương hai số trên là " + f);
}

%>
	
%>
</body>
</html>