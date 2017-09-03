/*
*弹出本页指定ID的内容于窗口
*id 指定的元素的id
*title:	window弹出窗的标题
*width:	窗口的宽,height:窗口的高
*/
function showTipsWindown(title,id,width,height){
	tipsWindown(title,"id:"+id,width,height,"true","","true",id);
}
function confirmTerm(s) {
	parent.closeWindown();
	if(s == 1) {
		parent.document.getElementById("isread").checked = true;
	}
}


//弹出层调用
function popTips(){
	showTipsWindown("通知内容", 'simTestContent', 600, 255);	
	$("#isread").attr("checked", false);
}

$(document).ready(function(){

	$("#isread").click(popTips);
	$("#isread-text").click(popTips);
	
});