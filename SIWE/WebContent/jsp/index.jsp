<%@ page contentType="text/html; charset=GBK" %>
<%@page import="java.util.*,com.SIWE.domain.*"%>

<jsp:useBean id="user" class="com.SIWE.domain.User" scope="request"/>
<jsp:setProperty name="user" property="*"/>


<%
List<News> listNews = (List) request.getAttribute("listNews");

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>赛唯</title>
	<link href="/SIWE/jsp/css/css.css" rel="stylesheet" type="text/css" />
	
  </head>
  
  <body>
	    <div id="container">
	  <div id="header">
	    <div id="logo"><h1>赛唯</h1></div>
	    <div id="search">
	      <form id="form0" name="form0" method="post" action="">
	        搜索
	        <input class="inp_srh" type="text" name="textfield" id="textfield" />
	        <input class="btn_srh" type="button" name="button" id="button" value="查询" 
	        		onClick="return search('search')"/>
	      </form>
	    </div>
	  </div>
	  <div class="clearfloat"></div>
	  <div id="nav">
	  	<div id="nav_l"></div>
	    <div id="nav_r"></div>
	    <div class="nav_main">
	      <ul>
	        <li><a href="#"><span>首页</span></a></li>
	        <li><a href="#"><span>作品介绍</span></a></li>
	        <li><a href="#"><span>联系我们</span></a></li>
	      </ul>
	    </div>
	    <div class="nav_son">
	    	<ul>
	      </ul>
	    </div>
	  </div>
	  <div class="clearfloat"></div>
	  <div id="maincontent">
	    <div id="main">
	      <div id="index_top">
	        <div id="login">

<jsp:include page="login.jsp" />
		
			
				
	        </div>
	        <div id="hot_news">
	          <div id="news_top">
	            <h1>赛唯动态</h1>
	            <div id="more_news">
	           		 <p>more</p>
	            </div>
	          </div>
	          <div id="news_list">
	            <ul>
	            <% 
	            for (int i = 0; listNews != null && i<6 && i < listNews.size(); i++) {						
	            %>
	              <li>
	              <span><%=listNews.get(i).getReleaseDate() %></span>
	              <a href="/SIWE/newsReadAction.action?id=<%=listNews.get(i).getId()%>">
	              <%=listNews.get(i).getTitle() %></a></li>
	              <!-- /SIWE/newsReadAction.action?id=1 -->
	              <%} %>
	            </ul>
	          </div>
	        </div>
	      </div>
	      <div id="index_pic">
	        <h2><span></span></h2>
	        <ul>
	        </ul>
	      </div>
	      <div id="index_box">
	        <div class="box">
	          <h2><a class="more" href="#">更多..</a><span>一团队动态</span></h2>
	          <div class="box_con">
	            <dl>
	              <dt><a href="#"></a></dt>
	              <dd><a href="#"><strong>strong</strong></a>
	              导言：&hellip;</dd>
	            </dl>
	            <ul>
	            	<li><a href="#">纯CSS</a></li>
	              <li><a href="#">HTML元素</a></li>
	              <li><a href="#">aaa</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	              <li><a href="#">javascript</a></li>
	              <li><a href="#">IE,ff</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	            </ul>
	          </div>
	        </div>
	        <div class="box box1">
	          <h2><a class="more" href="#">更多..</a><span>寻找更多的业务</span></h2>
	          <div class="box_con">
	            <dl>
	              <dt><a href="#"></a></dt>
	              <dd><a href="#"><strong>strong</strong></a>
	              导言：&hellip;</dd>
	            </dl>
	            <ul>
	            	<li><a href="#">纯CSS</a></li>
	              <li><a href="#">HTML</a></li>
	              <li><a href="#">aaaa</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	              <li><a href="#">javascript</a></li>
	              <li><a href="#">bbbb</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	            </ul>
	          </div>
	        </div>
	      </div>
	    </div>
	    <div id="side">
	      <div class="side_box">
	        <h2><strong>团队</strong>介绍</h2>
	        <div class="side_con product">
	          <ul>
	          	<li></li>
	          	<li></li>
	          	<li></li>
	          </ul>
	        </div>
	      </div>
	      <div class="side_box">
	        <h2><strong>最新</strong>问答</h2>
	        <div class="side_con ask">
	          <dl>
	            <dt><a href="#">最新</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">最新</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">最新</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">最新</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">最新</a></dt>
	            <dd></dd>
	          </dl>
	        </div>
	      </div>
	      <div class="side_box">
	        <h2><strong>联系</strong>我们</h2>
	        <div class="side_con contact"><a href="#"><</a></div>
	      </div>
	    </div>
	  </div>
	  <div class="clearfloat"></div>
	  <div id="footer">
	    <dl>
	    <dt><a href="#">关于我们</a>　||　<a href="#">作品目录</a>　||　<a href="#">联系我们</a>　||　<a href="#">友情链接</a>　||　<a href="#">反馈问题</a>　||　<a href="#">广告合作</a></dt>
	      <dd>Copyright &copy;    All Rights Reserved<br />
	        </dd>
	    </dl>
	  </div>
	</div>
  </body>
</html>
