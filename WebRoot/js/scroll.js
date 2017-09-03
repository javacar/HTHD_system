
function marque(width, height, marqueName, marqueCName, id) {
	marqueesHeight = height;
	stopscroll = false;
	scrollElem = document.getElementById(id);
	with (scrollElem) {
		style.width = width;
		style.height = marqueesHeight;
		style.overflow = "auto";
		noWrap = true;
	}
	scrollElem.onmouseover = new Function("stopscroll = true");
	scrollElem.onmouseout = new Function("stopscroll = false");
	preTop = 0;
	currentTop = 0;
	stoptime = 0;
	init_srolltext();
}
function init_srolltext() {
	setInterval("scrollUp()", 20);
}
function scrollUp() {
	if (stopscroll) {
		return;
	}
	currentTop += 1;
	if (currentTop == marqueesHeight + 1) {
		if (stoptime == (marqueesHeight) * 1) {
			currentTop = 0;
			stoptime = 0;
		}
	} else {
		preTop = scrollElem.scrollTop;
		scrollElem.scrollTop += 1;
		if (preTop == scrollElem.scrollTop) {
			scrollElem.scrollTop = 0;
			scrollElem.scrollTop += 1;
		}
	}
}
function scroll(width, height, id) {
	var scrollElem;
	var stopscroll;
	var stoptime;
	var preTop;
	var leftElem;
	var currentTop;
	var marqueesHeight;
	marque(width, height, "icefable1", "box1left", id);
	document.getElementById(id).value = document.getElementById(id).value.replace(/<br>/gi, "\n");
}

