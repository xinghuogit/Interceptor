<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0020)http://bbs.bccn.net/ -->

<%@taglib uri="/struts-tags" prefix="s"%>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>页面未找到</title>
</head>
<body>
	<center>页面未找到</center>
	
	
	name:<s:property value="name"/><br>
	age:<s:property value="age"/><br>
	date:<s:property value="d"/><br>
	date:<s:date name="d" format="yyyy/MM/dd HH:mm:ss"/><br>
	list:<s:property value="interests"/><br>
	set:<s:property value="set"/><br>
	map:<s:property value="map"/><br>
	自定义：<s:property value="p"/><br/>
	自定义：<s:property value="ps"/><br/>
	points:<s:property value="points"/><br/>
	<s:debug></s:debug>
</body>
</html>