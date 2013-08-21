function check1(action) {
	document.form1.action = "loginAction!" + action + ".action";
	document.form1.submit();
	
}

function check2(action){
	
	document.form2.action = "loginAction!" + action + ".action";
	document.form2.submit();
}

function regist(action){
	document.form2.action = "registAction!" + action + ".action";
	document.form2.submit();
}

function search(action) {
	
	document.form0.action="loginAction!" + action + ".action";
//	document.form0.submit();
}
