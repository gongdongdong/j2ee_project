

<%@ page contentType="text/html; charset=GBK" language="java"
	import="java.sql.*" errorPage=""%>
<%@ page
	import="java.sql.*,java.util.*,javax.servlet.*,
		 javax.servlet.http.*,java.text.*"%>
<%! public static final String _AppId = "edit"; %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="News-Type" news="text/html; charset=GBK">
<title>新闻管理</title>
<script language=Javascript>
function submit(target, action) {
    form1.target = target;   
    form1.action.value = action;
    form1.submit();
}
function check(action) {
	submit('',action);
}
</script>
<SCRIPT LANGUAGE=javascript>
<!--
_editor_url = "/SIWE/jsp/js/";
-->
</script>
</head>
<SCRIPT LANGUAGE="JScript" SRC="/SIWE/jsp/js/editor.js"> </SCRIPT>
<body>
	<form action="/newsRelease/newsRelease/news.do" method="post"
		name="form1">
		<table width="100%" border="1">
			<tr>
				<td height="17" colspan="2"><div align="center">
						『<span class="style1">消息提示：</span>』
					</div></td>
			</tr>
			<tr>
				<td height="44"><div align="right">已存在的新闻：</div></td>
				<td><ol>
		
						<li><input type="checkbox" name="chk" value="">
							<input type="hidden" name="id_newsMany"
							value=""> </li>
						

					</ol></td>
			</tr>
			<tr>
				<td width="320">
					<div align="right">新闻标题：</div>
				</td>
				<td width="440"><input name="title_news" type="text" size="100"
					maxlength="100" value=""></td>
			</tr>
			<tr>
				<td><div align="right">新闻正文：</div></td>
				<td><textarea id="content" name="content_news" cols="76"
						rows="17" value=""></textarea>&nbsp;</td>
			</tr>
			<tr>
				<td><div align="right">新闻类别：</div></td>
				<td><select name="newsTypeId_news">
						
						<option value='' ></option>
						
				</select></td>
			</tr>
			<tr>
				<td><div align="right">发布日期：</div></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="2"><div align="center"></div>
					<div align="center">
						<input type="button" name="button" value="新增"
							onClick="return check('insert')"> <input type="button"
							name="button" value="修改" onClick="return check('update')">
						<input type="button" name="button" value="删除"
							onClick="return check('delete')">
					</div></td>
			</tr>
		</table>
		<input type="hidden" name="action" value=""> <input
			type="hidden" name="username" value=""> <input
			type="hidden" name="userId" value="">
	</form>
</body>
</html>
<script language="javascript1.2">
editor_generate('content');
form1.content.value = '';
window.name = "";    
</script>