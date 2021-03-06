<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	MemberDAO memberDAO = MemberDAO.getInstance();
	int cnt = memberDAO.login(id, pwd);

	out.print("<script>");
	if(cnt == 1) { // 아이디가 있고, 비밀번호가 일치할 때 -> 중요한점: session 생성
		session.setAttribute("memberId", id);
		out.print("alert(`로그인 되었습니다.`);");
		out.print("location='../board/boardList.jsp'");

	} else if(cnt == 0) { // 아이디는 있고, 비밀번호가 일치하지 않을 때
		out.print("alert(`비밀번호가 일치하지 않습니다.`);history.back();");

	} else if(cnt == -1) { // 아이디가 없을 때
		out.print("alert(`아이디가 존재하지 않습니다.`);history.back();");

	}
		
	out.print("</script>");

	%>
</body>
</html>