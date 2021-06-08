<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<div style="background-color: gray; color:white; display:flex-direction: column-reverse;">login
<span style="display: inline-block; color:black; ">
 <% Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      String formatDate = sdf.format(date);
   out.print(formatDate); %>
</span>
</div>
<div>
<div style="background-color: red;"></div>
<label style="display: inline-block;padding: 10px;color: white;"></label>
<label style="padding: 10px;font-size: 10px;"></label>
</div>
<header>
</header>

<!-- </body>
</html> -->