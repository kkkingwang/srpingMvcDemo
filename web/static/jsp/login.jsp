<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
%>
<html>
<script>
    var path = "<%=path%>";
</script>

<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" />
<script src="<%=path%>/static/js/login.js"></script>
<head>
    <title>主页</title>
  </head>
  <body>
    <div>
      <input type="button" onclick="login()" value="登陆"/>
    </div>
  </body>
</html>
