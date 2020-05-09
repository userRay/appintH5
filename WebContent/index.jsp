<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> --%>
<title>跳转中</title>
<%-- <%@ include file="/view/common/resource.jsp" %> --%>

<%--<meta http-equiv=refresh content="1;url=<%=basePath+"/index"%>"> --%>
</head>
<body>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
  <h1>hello</h1>
<form id="ticketForm" name="ticketForm" method="post" action="${ctx }/ticket/choose/list">
	<input type="hidden" id="studentNo" name="studentNo" value="01">
</form>
  <button class="search" onclick="queryToStudent()" style="cursor:pointer;">搜索</button>
</body>
<script type="text/javascript">
function  queryToStudent(){
	alert("helloword");
	ticketForm.submit();
}
</script>
</body>
</html>