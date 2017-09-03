<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<script src="js/hj02.js"></script>
	</head>

	<body style="background: url(images/1_003.gif) repeat; width: 1024px;">

		<table>
			<tr>
				<td>
					<a href="notificationLog!findNotificationLogs.action?ntype=0">群发</a>
				</td>
						<td>
				<a href="notificationLog!findNotificationLogs.action?ntype=2">中奖用户</a>
				</td>
			</tr>
			<tr>

				<td>
					<a href="notificationLog!findNotificationLogs.action?ntype=1">长时间未登录用户</a>
				</td>
						<td>
				<a href="notificationLog!findNotificationLogs.action?ntype=3">指定用户</a>
				</td>

			</tr>
		</table>


	<input type="image" src="<%=basePath%>/images/ht-exit.png"
								style="width:120px; height:50px; margin-bottom:10px; margin-top:10px;" 
								onclick="document.location='<%=basePath%>account!logout.action'">


	</body>
</html>
