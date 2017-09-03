<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
  </head>
  
  <body>    
    	<form method="post" action="notificationLog!findNotificationLogs.action">
			<input type="hidden" name="pageNo" value="${param.pageNo}">
  			<input type="hidden" name="ntype" value="${param.ntype}">
<input type="submit"  style="visibility: hidden;">
		</form>
    <script>
  
    document.forms[0].submit();
    </script>
  </body>
</html>
