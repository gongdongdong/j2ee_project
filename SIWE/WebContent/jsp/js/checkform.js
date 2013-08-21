function checkselect(object) {
	if (object.name.value == "") {
		alert("用户名不能为空！");
		return false;
	} else if (object.password.value == "") {
		alert("密码不能为空！");
		return false;
	} else {
		return true;
	}

}