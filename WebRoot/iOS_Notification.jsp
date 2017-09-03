<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.HTHD_system.util.NumberHandle"%>
<%@page import="com.HTHD_system.pojo.NotificationLog"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ include file="c.inc"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<script src="js/jQuery.js"></script>
		<script src="<%=basePath%>js/hj02.js"></script>
		<link rel="stylesheet" href="css/hj02.css" type="text/css"></link>
		<script src="js/tipswindown.js"></script>
		<script src="js/tipswinup.js"></script>
		  

		<style>
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

a,img {
	border: 0;
}

body {
	font: 12px/ 180% Arial, Helvetica, sans-serif;
}

label {
	cursor: pointer;
}

<!--
里面内容的样式 -->.democode {
	width: 400px;
	margin: 30px auto 0 auto;
	line-height: 24px;
}

.democode h2 {
	font-size: 14px;
	color: #3366cc;
	height: 28px;
}

.agree {
	margin: 40px auto;
	width: 400px;
	font-size: 16px;
	font-weight: 800;
	color: #3366cc;
}

.mainlist {
	padding: 10px;
}

.mainlist li {
	height: 28px;
	line-height: 28px;
	font-size: 12px;
}

.mainlist li span {
	margin: 0 5px 0 0;
	font-family: "宋体";
	font-size: 12px;
	font-weight: 400;
	color: #ddd;
}

.btnbox {
	text-align: center;
	height: 30px;
	padding-top: 10px;
	background: #ECF9FF;
}

<!--
里面内容样式 结束 --><!--弹出层框架的样式 -->#windownbg {
	display: none;
	position: absolute;
	width: 100%;
	height: 100%;
	background: #000;
	top: 0;
	left: 0;
}

#windown-box {
	position: fixed;
	_position: absolute;
	border: 5px solid #E9F3FD;
	background: #FFF;
	text-align: left;
}

#windown-title {
	position: relative;
	height: 30px;
	border: 1px solid #A6C9E1;
	overflow: hidden;
	background: url(images/tipbg.png) 0 0 repeat-x;
}

#windown-title h2 {
	position: relative;
	left: 10px;
	top: 5px;
	font-size: 14px;
	color: #666;
}

#windown-close {
	position: absolute;
	right: 10px;
	top: 8px;
	width: 10px;
	height: 16px;
	text-indent: -10em;
	overflow: hidden;
	background: url(images/tipbg.png) 100% -49px no-repeat;
	cursor: pointer;
}

#windown-content-border {
	position: relative;
	top: -1px;
	border: 1px solid #A6C9E1;
	padding: 5px 0 5px 5px;
}

#windown-content img,#windown-content iframe {
	display: block;
}

#windown-content .loading {
	position: absolute;
	left: 50%;
	top: 50%;
	margin-left: -8px;
	margin-top: -8px;
}
<!--
框架样式结束
 
-->
</style>
	</head>
	<body>
		<div id="container">
			<%
				int pageNo = 1;
				String pageNos = request.getParameter("pageNo");
				if (pageNos != null && NumberHandle.isParseInt(pageNos, 10)) {
					pageNo = Integer.parseInt(request.getParameter("pageNo"));
				}
				int pre = pageNo;
				int next = pageNo;
			%>
			<script>
//查询之后改变后自动返回上一页
if(${empty notificationLogs}){
 if(<%=pageNo > 1%>){
 array=new Array();
 array[0]='<%=basePath%>notificationLog!findNotificationLogs.action?ntype=';
 array[1]='${param.ntype}';
 array[2]='&pageNo=<%=pageNo - 1%>';

}
}

</script>
			<h3>
				<c:choose>
					<c:when test="${param.ntype==0}">群发</c:when>
					<c:when test="${param.ntype==1}">长时间未登录用户</c:when>
					<c:when test="${param.ntype==2}">中奖用户</c:when>
					<c:when test="${param.ntype==3}">指定用户</c:when>
				</c:choose>

			</h3>
			<table border="1" align="center" style="width: 75%;" id="example">
		
				<tr>
					<th>
						<nobr>
						<c:choose>
							<c:when test="${param.ntype==0}">所用用户</c:when>
							<c:when test="${param.ntype==1}">长时间未登录用户</c:when>
							<c:when test="${param.ntype==2}">中奖用户</c:when>
							<c:when test="${param.ntype==3}">指定用户</c:when>
						</c:choose>

						</nobr>
					</th>

					<th>
						<nobr>
						通知内容
						</nobr>
					</th>
					<th>
						<nobr>
						发送时间
						</nobr>
					</th>

					<th>
						<nobr>
						成功数量
						</nobr>
					</th>

					<th>
						<nobr>
						失败数量
						</nobr>
					</th>

				</tr>

				<c:forEach var="notificationLog" items="${notificationLogs}">
					<tr>
						<fmt:formatDate var="sendTime"
							value="${notificationLog.notification.sendTime}" type="date"
							pattern="yyyy-MM-dd HH:mm:ss" />
						<td style="width: 10%; height: 30px; word-break: break-all;">
							<nobr>
							${notificationLog.notification.inTarget}&nbsp;
							</nobr>
							
		
		
						</td>
						<td style="width: 15%; height: 30px; word-break: break-all;">
							<nobr>
							${notificationLog.notification.inContent}&nbsp;
							</nobr>
							
							 
						</td>

						<td style="width: 15%; height: 30px; word-break: break-all;">
							<nobr>
							${sendTime}&nbsp;
							</nobr>
						</td>

						<td style="width: 15%; height: 30px; word-break: break-all;">
							<nobr>
							${notificationLog.notification.successCount}
							</nobr>
						</td>
						<td style="width: 15%; height: 30px; word-break: break-all;">
							<nobr>
							${notificationLog.notification.failureCount}
							</nobr>
						</td>
					</tr>
				</c:forEach>


			</table>
			<div id="footer">

				<!-- 弹出窗口开始 -->


				<input type="button" class="footer_1" style="margin-right: 100px;"
					name="isread" id="isread" value="新建" />
				<input type="button" class="footer_1" style="margin-right: 100px;"
					onclick="document.location='Base1.jsp'" value="返回">


			</div>
			<!-- 弹出窗口结束 -->



			<div style="display: none;">

				<div id="simTestContent" class="simScrollCont">

					<jsp:include page="iOSBase.jsp"></jsp:include>


				</div>
				<!--simTestContent end-->

			</div>



			<c:set var="next" value="<%=next%>"></c:set>
			<c:set var="pre" value="<%=pre%>"></c:set>
			<c:set var="pageNo" value="<%=pageNo%>"></c:set>
			<!-- 分页开始 -->
			<div style="width: 1000px; height: 30px;">

				<form method="post" id="notificationLog">
					<input type="hidden" name="ntype" value="${param.ntype}">
					<div id="page_2">

						<c:if test="${!empty  pageNo&&pageNo>1}">
							<input type="button" value="首页"
								onclick="page(1,'notificationLog!findNotificationLogs.action','notificationLog')">
							<input type="button" value="上一页"
								onclick="page(<%=--pre%>,'notificationLog!findNotificationLogs.action','notificationLog')">

						</c:if>
						第
						<input value="<%=pageNo%>" id="pageNo" size="2"
							onFocus='this.select()' onMouseOver='this.focus()'
							onpropertychange='goChange(this.value)'
							onchange='goChange(this.value)'>
						页
						<input type="button" value="go" onclick="go()" id="GO"
							disabled="disabled" title="当前页是本页">
						<c:if test="${!empty  count&&pageNo<pageSize}">
							<input type="button" value="下一页"
								onclick="page(<%=++next%>,'notificationLog!findNotificationLogs.action','notificationLog')">
							<input type="button" value="尾页"
								onclick="page(${pageSize},'notificationLog!findNotificationLogs.action','notificationLog')">
						</c:if>
					</div>
				</form>
				<div id="page_1">
					[当前页有${pageCount}条记录/共查询到${count}条记录]&nbsp;&nbsp;[当前是第<%=pageNo%>页/共${pageSize}页]
				</div>
			</div>
			<!-- 分页结束 -->
			<hr style="width: 950px; clear: both;">
			<div style="display: none;" id='showMessage'>
				<jsp:include page="iOSBase.jsp"></jsp:include>
			</div>
			<script>
	
	function goChange(val){
	var GO=document.getElementById('GO');
	if(isNaN(val)||val<1||val>${pageSize}){
		GO.title='页号不正确';
		GO.disabled=true;
	}
	else if(val==<%=pageNo%>)
	{
		GO.title='当前页是本页';
		GO.disabled=true;
	}
	else{
		GO.title='';
		GO.disabled=false;
	}
				
	}
	 function go(){
var pageNo=$("#pageNo")[0].value;
if(pageNo<1||pageNo>${pageSize}){
	 alert("页号不正确");
	return false;
}
page(pageNo,'notificationLog!findNotificationLogs.action','notificationLog');
}

	
	
			</script>


		</div>
	</body>
</html>