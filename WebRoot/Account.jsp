<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ include file="c.inc"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/hj02.css" type="text/css" rel="stylesheet" />
		<link href="images/User_Login.css" type="text/css" rel="stylesheet" />
		<META content="MSHTML 6.00.6000.16674" name="GENERATOR">
		<script src="js/hj02.js"></script>
		<script src="js/jQuery.js"></script>

		<script>
	
  $.ajaxSetup ({
cache: false //关闭AJAX相应的缓存
});
function validateAccount(){
var name=$(':text').val();
var pass=$(':password').val();

if(name.length==0){
	window.status='用户名未填写';
 return name.length!=0;
}
if(pass.length==0){
 	window.status='密码未填写';
 return pass.length!=0;
}
obj=$.ajax({url:"account!validateAccount.action?name="+encodeStr(name)+"&password="+encodeStr(pass),async:false});

b=obj.responseText==0;

if(b){
window.status='用户名错误';
return !b;
}
return name.length!=0&&pass.length!=0;
}
</script>

	</head>
	


	<BODY id="userlogin_body">
		<DIV></DIV>

		<DIV id="user_login">
			<DL>
				<DD id="user_top">
					<UL>
						<LI class="user_top_l"></LI>
						<LI class="user_top_c"></LI>
						<LI class="user_top_r"></LI>
					</UL>
				</DD>
				<DD id="user_main">
					<UL>

						<form action="account!login.action" method="post" id="account"
							onsubmit="return validateAccount();" class="user_main_box">

							<LI class="user_main_l"></LI>
							<LI class="user_main_c">
								<UL>
									<LI class="user_main_text">
										用户名：
									</LI>
									<LI class="user_main_input">

										<INPUT class="TxtUserNameCssClass" id="TxtUserName"
											type="text" maxLength="20" name="name" autocomplete="off">
									</LI>
								</UL>
								<UL>
									<LI class="user_main_text">
										密 码：
									</LI>
									<LI class="user_main_input">

										<INPUT class="TxtPasswordCssClass" id="TxtPassword"
											type="password" maxLength="20" name="password"
											autocomplete="off" />

									</LI>
								</UL>


							</LI>
							<LI class="user_main_r">
								<INPUT class="IbtnEnterCssClass" id="IbtnEnter"
									style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px"
									type="image" src="images/user_botton.gif" name="IbtnEnter">


							</LI>
						</form>
					</UL>

				</DD>

				<DD id="user_bottom">
					<UL>
						<LI class="user_bottom_l"></LI>
						<LI class="user_bottom_c">
							<SPAN style="MARGIN-TOP: 40px"></SPAN>
						</LI>
						<LI class="user_bottom_r"></LI>
					</UL>
				</DD>
			</DL>
		</DIV>

		<SPAN id="ValrUserName" style="DISPLAY: none; COLOR: red"></SPAN>
		<SPAN id="ValrPassword" style="DISPLAY: none; COLOR: red"></SPAN>
		<SPAN id="ValrValidateCode" style="DISPLAY: none; COLOR: red"></SPAN>

		<DIV id="ValidationSummary1" style="DISPLAY: none; COLOR: red"></DIV>

		<DIV></DIV>




	</BODY>
</html>
