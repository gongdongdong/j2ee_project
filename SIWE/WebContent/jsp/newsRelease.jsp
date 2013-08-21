<%@ page contentType="text/html; charset=GBK" language="java" errorPage="/SIWE/jsp/newsRelease.jsp" %>
<%@ page import="java.util.*" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="News-Type" news="text/html; charset=GBK">
<title>新闻管理</title>


</head>

<body>
<form action="" method="post"  name="form0">
  <table width="100%" border="1">
    <tr>
      <td height="17" colspan="2"><div align="center">『<span class="style1">消息提示：</span>』</div></td>
    </tr>
    <tr>
      
    </tr>
    <tr>
      <td width="320"> <div align="right">新闻标题：</div></td>
      <td width="440"><input name="title_news" type="text" size="100" maxlength="100" value=""></td>
    </tr>
    <tr>
      <td><div align="right">新闻正文：</div></td>
      <td><textarea id="content" name="content_news" cols="76" rows="17" value="ddd"></textarea>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">新闻类别：</div></td>
      <td><select name="newsTypeId_news">
 
          <option value ='SIWEnews'>赛唯新闻</option>
          <option value ='YInews'>一团队新闻</option>
          
      </select></td>
    </tr>
    <tr>
      <td><div align="right">发布日期：</div></td>
      <td><%java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd HH/mm/ss");    
java.util.Date currentTime_1 = new java.util.Date();    
out.print(formatter.format(currentTime_1)); %>
		  <input type="hidden" name="releasedate" value="<%=formatter.format(currentTime_1) %>">
			</td>
    </tr>
    <tr>
      <td colspan="2"><div align="center"></div>        <div align="center">
         <input type="button" name="create_news" value="新增" onClick = "return check('create')" >
      <input type="button" name="edit_news" value="修改" >
      <input type="button" name="delete_news" value="删除" >
      </div></td>
    </tr>
  </table>
  <input type="hidden" name="username" value="ddd">
  <input type="hidden" name="userId" value="ddd">
</form>


<script type="text/javascript">

function check(action){
	document.form0.action = "newsReleaseAction!" + action + ".action";
	document.form0.submit();
}

</script>
<br>

<div style="text-align:center;">
	${msg}
</div>
</body>
</html>