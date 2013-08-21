<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>



</head>


<body>
<%!

	String username_in;
%>

<% 	
	username_in =(String) request.getSession().getAttribute("username");

%>


	<% 	if(username_in != null){  	%>
	
	
<div style="margin:30px 20px 30px 30px; ">


<table>
		<tr>
		<img alt="ÎÒ" src="/SIWE/jsp/images/btn_login1.gif">
	</tr>

</table>
<table>


	<tr>
		<td>
			»¶Ó­Äã£¡
		</td>
		<td>
			<%=username_in %>
		</td>

	</tr>

	

</table>

<table>
	<tr>
		<form name="form1" method="post" action="">
				<input type="button" name="checkout" value="µÇ³ö"
							onClick="return check1('checkout')">
			</form>
		
		
	</tr>
</table>
</div>





<% 	} else{ %>
	<form name="form2" method="post" action="">
		<table class="logintable" width="269" border="0">
			<tr>
				<td height="38" colspan="2"><div align="center">µÇÂ¼</div></td>
			</tr>
			<tr>
				<td width="159"><div align="center">ÓÃ»§Ãû£º</div></td>
				<td width="110"><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><div align="center">ÃÜÂë£º</div></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2"><div align="center"></div>
					<div align="center">
						<input type="button" name="checkin" value="µÇÂ¼"
							onClick="return check2('checkin')"> 
						<input type="button" name="registbtn"   value="×¢²á"
						    onClick="return regist('index')">
					</div></td>
			</tr>
		</table>
		<input type="hidden" name="action" value="">
	</form>
	
	${msgtoshow} 
	<%--  <h2><s:property value="message" /></h2> --%>


			
						<%} %>
						
						
						
	<script type="text/javascript" src="/SIWE/jsp/js/js.js"></script>
</body>
