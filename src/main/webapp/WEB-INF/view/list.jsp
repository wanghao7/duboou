<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/index2.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<form action="list" method="post">
			    创建日期:<input name="dt1" type="text" >--<input name="dt2" type="text" >
			    <select name="tj">
				    <option value="" >请选择</option>
				    <option value="created" >时间</option>
				    <option value="username" >作者</option>
				    <option value="commentCnt" >评论数量</option>
			    </select>
			    <button>查询</button>
		<table>
		<tr>
		    <th>编号</th>
		    <th>标题</th>
		    <th>作者</th>
		    <th>创建时间</th>
		    <th>评论数量</th>
		  </tr>
		  <c:forEach var="b" items="${pageInfo.list }" >
			  <tr>
			    <td>${b.id}</td>
			    <td>${b.title }</td>
			    <td>${b.username}</td>
			    <td>
			    	<fmt:formatDate value="${b.created}" pattern="yyyy-MM-dd hh-mm-ss" />
			    </td>
			    <td>${b.commentCnt}</td>
			  </tr>
		  </c:forEach>
		  <tr>
			    <td colspan="10">
			    <button name="page" value="1">首页</button>
			    <button name="page" value="${pageInfo.prePage==0?'1':pageInfo.prePage }">上一页</button>
			    <button name="page" value="${pageInfo.nextPage==0?pageInfo.pages:pageInfo.nextPage }">下一页</button>
			    <button name="page" value="${pageInfo.pages }">尾页</button>
	    		</td>	
   			</tr>		
		</table>
	</form>
</body>
</html>