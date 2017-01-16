<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<base href="<%=basePath%>">

<title>修改密码</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<br />
	<br />
	<!--4行2列-->
	<table align="center" width="961" cellspacing="0" border="1"
		bordercolor="#9ACDFF">
		<tr height="30">
			<td align="right" width="240" bgcolor="#E7FBFF">工号：&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td rowspan="4">
				<!--1列4行-->
				<table cellspacing="0" border="1" bordercolor="#E8E5E8" width="720">
					<tr height="29">
						<td><input type="text" id="employeeNumber" /></td>
					</tr>
					<tr height="30">
						<td><input type="password" id="oldPwd" /></td>
					</tr>
					<tr height="30">
						<td><input type="password" id="pwd1" /></td>
					</tr>
					<tr height="30">
						<td><input type="password" id="pwd2" /></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr height="30">
			<td align="right" width="240" bgcolor="#E7FBFF">原密码：&nbsp;&nbsp;&nbsp;&nbsp;</td>
		</tr>
		<tr height="30">
			<td align="right" width="240" bgcolor="#E7FBFF">新密码：&nbsp;&nbsp;&nbsp;&nbsp;</td>
		</tr>
		<tr height="30">
			<td align="right" width="240" bgcolor="#E7FBFF">确认密码：&nbsp;&nbsp;&nbsp;&nbsp;</td>
		</tr>
	</table>
	<p align="center">
		<input type="button" id="button" value="确认修改" />
	</p>
	<p align="center" id="info"></p>
</body>

<script type="text/javascript" src="jquery-2.1.0.js"></script>
<script type="text/javascript">
	$("#button").click(function() {
		//获得4个表单控件的值
		var employeeNumber = $("#employeeNumber").val();
		var oldPwd = $("#oldPwd").val();
		var pwd1 = $("#pwd1").val();
		var pwd2 = $("#pwd2").val();

		if ((pwd1 == pwd2) && (pwd1 != "")) {
			$.ajax({ //局部刷新
				url : "/Human_Resources_System/servlet/PwdChangeServlet",
				type : "get",
				data : {
					employeeNumber : employeeNumber,
					employeePwd : oldPwd,
					pwd : pwd1
				},
				dataType : "text", //在数据接收时设置数据格式
				success : function(result) {
					$("#info").text(result);
					if (result.indexOf("成功") == -1) {
						$("#info").css("color", "red");
					} else {
						$("#info").css("color", "green");
					}
				}
			});
		} else {
			$("#info").text("两次密码输入必须相同，并且不能为空！");
			$("#info").css("color", "red");
		}
		debugger;
	});
</script>

</html>