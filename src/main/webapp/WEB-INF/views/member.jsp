<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member信息</title>
</head>
<body>
    <table cellpadding="10" cellspacing="0" border="1">
       <thead>
         <tr>
          <td>编号</td>
          <td>姓名</td>
          <td>邮箱</td>
          <td>电话</td>
         </tr>
       </thead>
       <tbody>
         <tr>
          <td>${member.mid}</td>
          <td>${member.mname}</td>
          <td>${member.email}</td>
          <td>${member.tel}</td>
         </tr>
       </tbody>
    </table>
</body>
</html>