<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"  %>
 <%@page import="java.util.*,com.SIWE.domain.*"%>

<% News theNewsToRead =(News) request.getAttribute("newsToRead");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NewsRead</title>
</head>
<body>
<h1>Logo</h1>
<div style="text-align:center;">
<br>
<h2>新闻标题</h2>
<br>
<%=theNewsToRead.getTitle() %>
<br>
<h3>新闻内容</h3>
<%=theNewsToRead.getContent() %>
<br>
<h4>新闻发布时间：<%=theNewsToRead.getReleaseDate() %></h4>
</div>

<div style="text-align:center;">${msg}</div>
</body>
</html>