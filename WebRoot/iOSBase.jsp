<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

		<script src="<%=basePath%>js/jQuery.js"></script>
		<script src="js/hj02.js"></script>
		<script src="js/String.js"></script>
	</head>
	<body>

		<p>
			通知内容：不超过36个中文字符
		</p>


		<form method="post"
			action="<%=basePath%>notification!sendMessage.action"
			onsubmit="return vaildateContent()">
			<input type="hidden" name="ntype" value="${param.ntype}">
			<c:if test="${param.ntype==1}">
				<select name="day">
					<c:forEach var="i" begin="1" end="99" step="1">
						<option value="${i}">
							${i}
						</option>
					</c:forEach>
				</select>
			</c:if>
			<c:if test="${param.ntype==2}">
				<c:choose>
					<c:when test="${empty optionsTVProgarm}">
							无中奖用户
						</c:when>

					<c:otherwise>
			栏目
	<select name="program" id="program" onchange="updateVersion()"
							onblur="send.disabled=value.length==0||inContent.value.trim().length==0">
							<option value="">
								--请选择--
							</option>
							${optionsTVProgarm}
						</select>
						<br>	期号
				<select name="version" id="version" onchange="updatePrize()"
							onblur="send.disabled=value.length==0||inContent.value.trim().length==0">
							<option value="">
								--请选择--
							</option>
						</select>

						<br>奖项
		<select name="prize" id="prize">
							<option value="">
								--请选择--
							</option>
						</select>

					</c:otherwise>
				</c:choose>
			</c:if>

			<c:if test="${param.ntype==3}">
			账号(多个用户之间用英文;分隔)
			<input type="text" name="userName" id="userName"
					onpropertychange="if(/[^\d|;]/g.test(value)){value=value.substring(0,value.length-1);}"
					onkeyup="value=value.replace(';;',';');"
					onkeydown="value=value.replace(';;',';')"
					onblur="userNameNotExists(this.value)">
			</c:if>
			<br>
			<textarea rows="5" cols="40" name="inContent" id="inContent"
				onkeyup="checkLen(this,36)" onchange="checkLen(this,36)"
				onpropertychange="send.disabled=this.value.trim().length==0"
				onchange="onpropertychange"></textarea>

			<p>
				<input type="submit" value="发送" class="footer_1" id="send"
					disabled="disabled" style="margin-left: 73px;" title="内容必须填写">

				<input type="button" value="取消" onclick="$('#windownbg').remove();
					$('#windown-box').fadeOut('slow',function(){$(this).remove();})"
			 class="footer_2">
				
			</p>
		</form>
		<script>
	 //中奖用户模板

	
		function userNameNotExists(val){
		obj=$.ajax({url:"notification!userNameNotExists.action?userName="+val+"&ntype="+${param.ntype},async:false});
		b=obj.responseText==0;
		if(b){
			window.status=b?'用户不存在':'';
			
		}
	return b;
		}
		
		</script>

		<script src="js/iOSBase.js"></script>

	</body>
</html>

