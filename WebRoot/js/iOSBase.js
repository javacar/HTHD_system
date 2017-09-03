	


  function vaildateContent(){

  var flag=document.all.program!=null&&document.all.version!=null&&document.all.prize!=null;
if(flag){
flag=$('#windown-content select[name=program]').val().length!=0!=0&&$('#windown-content select[name=version]').val().length!=0&&$('#windown-content select[name=prize]').val().length!=0
 	 	 window.status=flag?'':'中奖用户未选';
 		return flag;
 	 	
}
flag=document.all.userName!=null;
 if(flag){
 flag=$.trim($('#windown-content input[name=userName]').val()).length!=0;
 	if(flag){
 		flag=userNameNotExists($.trim($('#windown-content input[name=userName]').val()));
 	if(flag){
 	 	alert('用户名不存在');
 	}
 			return !flag;
 	}
 
 	window.status=flag?'':'用户名未填写';
 	return flag;
 } 
flag= document.all.day!=null;
 if(flag){
 flag=$('#windown-content select[name=day]').val().length!=0
  window.status=flag?'':'日期未选择';
  return flag;
 }
 
return $.trim($('#windown-content textarea[name=inContent]').val()).length!=0;
}


<!--期号级联-->

function updateVersion(){
	$.ajax( {
		url : 'notificationLog!xmlActVersion.action?selected='+$('#windown-content select[name=program]').val(),
		success : function(xml) {
			$("#windown-content select[name=version]").empty();
			var arr=new Array();
				$("#windown-content select[name=version]").append("<option value=\"\">--请选择--</option>");
				$(xml).find("version").each(function() {
				var value = $(this).children("versionvalue").text();
				var name = $(this).children("versionname").text();
				arr[0]="<option value=\"";
				arr[1]=value;
				arr[2]="\">";
				arr[3]=name;
				arr[4]="</option>";
			$("#windown-content select[name=version]").append(arr.join(''));
			});
		}
	});
}


<!--奖项级联-->
function updatePrize(){
	$.ajax( {
		url : 'notificationLog!xmlPrize.action?selected='+$('#windown-content select[name=version]').val(),
		success : function(xml) {
			$("#windown-content select[name=prize]").empty();
			var arr=new Array();
		$("#windown-content select[name=prize]").append("<option value=\"\">--请选择--</option>");
			$(xml).find("prize").each(function() {
				var value = $(this).children("prizevalue").text();
				var name = $(this).children("prizename").text();
				arr[0]="<option value=\"";
				arr[1]=value;
				arr[2]="\">";
				arr[3]=name;
				arr[4]="</option>"
			$("#windown-content select[name=prize]").append(arr.join(''));
			});
		}
	});
	

}