<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>RudeCrab-SSM整合</h1>
<%--入门--%>
<a href="/user/hello">入门程序</a>
<%--注解测试--%>
<%--<a href="/user/testRequestMapping?username=heihei">注解</a>--%>

<%--请求参数绑定--%>
<a href="/param/testParam?userName=haha&passWord=123456">请求参数绑定</a>
<%--把数据封装Account类中--%>
<form action="/param/saveAccount" method="post">
    姓名：<input type="text" name="userName"/><br/>
    密码：<input type="password" name="passWord"/><br/>
    金额：<input type="text" name="money"/><br/>
    用户名：<input type="password" name="user.name"/><br/>
    用户密码：<input type="text" name="user.password"/><br/>
    <input type="submit" value="提交"/>
</form>
<%--自定义类型转换器--%>
<form action="param/saveUser" method="post">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="password"/><br/>
    用户生日：<input type="text" name="date"/><br/>
    <input type="submit" value="提交"/>
</form>
<a href="/param/testServlet">servlet原生api</a><br/>
<a href="/param/testException">异常处理</a><br/>
<a href="/user/testInterceptor">拦截器</a>
</body>
</html>
