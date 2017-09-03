
function delTwo(msg, url) {
	if (window.confirm(msg)) {
		document.location = url;
	} else {
		return false;
	}
}
function page(pageNo, method, id) {
	var page = document.getElementById(id);
	page.action = method + "?pageNo=" + pageNo;
	page.submit();
}
function validateChinese(str) {
	var re = /^[\u0391-\uFFE5\s\£¬\¡£\£¿£º£»¡±¡¯¡¢]+$/;
	return re.test(str);
}
function validateEnglish(str) {
	var re = /^[A-Za-z\s\,.?:;"']+$/;
	return re.test(str);
}
function validateJapanese(str) {
	var re = /^[\u0800-\u4e00\s\,.?:;"']+$/;
	return re.test(str);
}
function dateBefore(beginStr, endStr, reg) {

	var beginDate=null;
	var endDate=null;
	if(beginStr!=null&&beginStr.length>0){
		beginStr.match(reg);
		beginDate = new Date(RegExp.$1, RegExp.$2, RegExp.$3, RegExp.$4, RegExp.$5, RegExp.$6);
		}
if(endStr!=null&&endStr.length>0){
	endStr.match(reg);
 endDate = new Date(RegExp.$1, RegExp.$2, RegExp.$3, RegExp.$4, RegExp.$5, RegExp.$6);
 }
 if(beginDate==null&&endDate==null){
 return true;
 }
 else if(beginDate!=null&&endDate!=null)
 {
 	return beginDate.getTime() <= endDate.getTime();
 }
 return beginDate!=null;
 
		
}
function encodeStr(str) {
	if (str == null | str.length == 0) {
		return "";
	}
	return encodeURI(encodeURI(str));
}
function bgChange(selObj) {
	newColor = selObj.options[selObj.selectedIndex].text;
	document.bgColor = newColor;
	selObj.selectedIndex = -1;
}
function showme(showmeId, oSon) {
	var oSon = window.document.getElementById(oSon);
	if (oSon == null) {
		return;
	}
	var showmeId = document.getElementById(showmeId);
	with (oSon) {
		innerText = showmeId.value;
		style.display = "block";
		style.pixelLeft = window.event.clientX + window.document.body.scrollLeft + 6;
		style.pixelTop = window.event.clientY + window.document.body.scrollTop + 9;
	}
}
function hideme(oSon) {
	var oSon = window.document.getElementById(oSon);
	if (oSon == null) {
		return;
	}
	oSon.style.display = "none";
}

function checkLen(obj, max) {

	var maxChars = max;
	var len = 0;
	var count = 0;
	var length = obj.value.length;

	for (i = 0; i < length; i++) {
		if (/^[\u0391-\uFFE5]+$/.test(obj.value.charAt(i))) {
			len += 2;
		} else {
			len++;
		}
		count++;
		if (len == maxChars) {
			obj.value = obj.value.substring(0, count);
			obj.title = "\u6700\u591a\u8f93\u5165" + max + "\u4e2a\u5b57\u7b26";
			break;
		} else {
			if (len == maxChars + 1) {
			
				obj.value = obj.value.substring(0, count - 1);
				obj.title = "\u6700\u591a\u8f93\u5165" + max + "\u4e2a\u5b57\u7b26";
				break;
			}
		}
	}
}

function writeNumber(obj){
 if(isNaN(obj.value)||obj.value.indexOf(' ')!=-1||obj.value.indexOf('.')!=-1){
 obj.value=obj.value.substring(0,obj.value.length-1);
 }
}



