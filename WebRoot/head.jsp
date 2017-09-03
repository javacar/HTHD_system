<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script>
if(${empty account}){
alert('用户长时间没有操作');
window.status='用户长时间没有操作';	
document.location='<%=basePath%>Account.jsp';

}

</script>






