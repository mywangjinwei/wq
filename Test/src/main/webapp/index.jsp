<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<?xml version="1.0" encoding="UTF-8" ?>

<html>
<body>
<h2>Hello World!</h2>



<form action="user/showUser.action">
	<input name="id">
	<input type="submit">
</form>
<form action="user/showUser.actiond">
	<input name="id">
	<input type="submit">
</form>
<form action="user/insert.action">
	<input name="id"><br>
 姓名：<input name="userName"><br>
 密码：<input name="password"><br>
 年龄：<input name="age"><br>
  <input type="submit"><br>
  
</form>
<form action="user/update.action">
	<input name="id"><br>
 姓名：<input name="userName"><br>
 密码：<input name="password"><br>
 年龄：<input name="age"><br>
  <input type="submit"><br>
  
</form>
</body>
</html>
