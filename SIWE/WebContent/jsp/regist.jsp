<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>用户注册</title>


	<link href="/SIWE/jsp/css/css.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="mylogo">
<h1>LOGO</h1>
</div>
 <center>
          <table border="1" width="80%" bgcolor="#F9F9F9" cellspacing="0" cellpadding="0" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white" rules="none" style="margin-top:5">
          <form name=form0  onsubmit="return validate_form(this)" action="/SIWE/registAction!regist.action">

	          <tr height="80">  <td colspan="5" style="text-indent:20">■ 用户注册</td></tr>
	          <tr height="45">
	                <td align="right" width="35%">用 户 名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
    	            <td colspan="4"><input type="text" name="username" size="40"/></td>
    	      </tr>
    	      <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
	          <tr height="45">
	                <td align="right">用户密码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><input type="password" name="password" size="40" redisplay="false"/></td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
	          <tr height="45">
	                <td align="right">确认密码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="3"><input type ="password" name="againPassword" size="40" redisplay="false"/></td>
	                <td rowspan="3" width="20%" valign="bottom" style="padding-bottom:10">	                    
	                    <img id="head" src="/SIWE/jsp/images/face/user/user0.gif" style="border:1 solid">   
	                </td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
   	          <tr height="45">
	                <td align="right">用户性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td>
	                    <input type="radio" name="userSex" value="男"/>男
	                    <input type="radio" name="userSex" value="女"/>女
	                </td>
	                <td width="15%" align="center">用户头像：</td>
	                <td width="20%" align="center">
	                   
	                </td>
	          </tr>
   	          <tr height="45">
	                <td align="right">联系电话：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><input type="text" name="userPhone" size="40"/></td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
	          <tr height="45">
	                <td align="right">常用联系方式：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><input type="text" name="userOICQ" size="40"/></td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
   	          <tr height="45">
	                <td align="right">E-mail：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><input type="text" name="userEmail" size="50"/></td>
	          </tr>
   	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
   	          <tr height="45">
	                <td align="right">来自：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><input type="text" name="userFrom" size="60"/></td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
    	      <tr height="80">
	                <td>&nbsp;</td>
	                <td colspan="4">
	                    <input type="submit" value="用户注册" />
	                    <input type="button" value="重新填写"   onclick="rewrite_info()"/>
    	            </td>
	          </tr>	      	      
			
          </table>
          </form>
          <br>
    </center>
    <script type="text/javascript" src="/SIWE/jsp/js/validate_form.js"></script>
    
  <div id=footer>  <s:property value="msg" /></div>
</body>
</html>