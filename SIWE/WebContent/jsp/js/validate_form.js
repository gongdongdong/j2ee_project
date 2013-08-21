function validate_email(field, alerttxt) {
	with (field) {
		apos = value.indexOf("@");
		dotpos = value.lastIndexOf(".");
		if (apos < 1 || dotpos - apos < 2) {
			alert(alerttxt);
			return false;
		} else {
			return true;
		}
	}
}

function validate_password(alerttxt)
{
	var p1 = document.form0.password.value;
	var p2 = document.form0.againPassword.value;

	if(p1 != p2)
		{alert(alerttxt);return false;}
	else
		{return true;}
}


function validate_required(field,alerttxt)
{
with (field)
  {
  if (value==null||value=="")
    {alert(alerttxt);return false;}
  else {return true;}
  }
}




function validate_form(thisform) {
	with (thisform) {
		
		if(validate_required(username,"用户名不能为空哦！亲！～！") == false){
			
			username.focus();
			return false;
		}
		
		if(validate_required(password,"密码不能为空哦！亲！～！") == false){
			
			password.focus();
			return false;
		}
		
		if(validate_required(againPassword,"确认密码不能为空哦！亲！～！") == false){
			
			againPassword.focus();
			return false;
		}
		
		
		if(validate_required(againPassword,"确认密码不能为空哦！亲！～！") == false){
			
			againPassword.focus();
			return false;
		}
		
		
		
		if (validate_email(userEmail, "Not a valid e-mail address!") == false) {
			email.focus();
			return false;
		}
		
		if(validate_password("两次提交的密码不一样哦！") == false){
			password.focus();
			return false;
		}
		
	}
}




function rewrite_info(){
	form0.username.value = "";
	form0.password.value = "";
	form0.againPassword.value = "";
	form0.userPhone.value = "";
	form0.userOICQ.value = "";
	form0.userEmail.value = "";
	form0.userFrom.value = "";	
	
}
