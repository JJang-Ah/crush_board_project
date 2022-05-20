/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-20 06:37:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.logon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberLoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>로그인 폼</title>\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Paytone+One&display=swap');\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Hammersmith+One&family=Paytone+One&display=swap');\r\n");
      out.write("#container { width: 450px; margin: 0 auto;}\r\n");
      out.write("a { text-decoration: none; color: black;}\r\n");
      out.write("/* 상단 - 메인, 서브 타이틀 */\r\n");
      out.write(".m_title { font-family:'Paytone One', sans-serif; font-size: 3em; text-align: center;}\r\n");
      out.write(".s_title { font-family: 'Hammersmith One', sans-serif; font-size: 2em; text-align: center; margin-bottom: 30px}\r\n");
      out.write("\r\n");
      out.write("/* 중단 - 입력창 */\r\n");
      out.write(".f_input { text-align: center; border: 1px solid #ccc; padding: 10px;}\r\n");
      out.write(".f_input .c_id, .f_input .c_pwd { height: 45px; margin-top: 20px; padding-left: 5px;}\r\n");
      out.write(".f_input .f_chk { text-align: left; margin-top: 10px; font-size: 0.9em; color: gray;}\r\n");
      out.write(".f_input #btn_Login { width: 425px; height: 47px; margin-top: 25px; background: black; color: white;\r\n");
      out.write(" font-size: 16px; font-weight: bold; cursor: pointer; margin-top: 25px; margin-bottom: 10px;}\r\n");
      out.write(" \r\n");
      out.write(" /* 하단 - 비밀번호 찾기, 아이디 찾기, 회원가입 */\r\n");
      out.write(" .f_a { text-align: center; margin-top: 30px; font-size: 0.9em;}\r\n");
      out.write(" .f_a a {color: gray;}\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	document.addEventListener(\"DOMContentLoaded\", function() {\r\n");
      out.write("		let form = document.loginForm;\r\n");
      out.write("		// 로그인 버튼을 클릭했을 때 유효성 검사 (공백 유무)\r\n");
      out.write("		let btn_Login = document.getElementById(\"btn_Login\");\r\n");
      out.write("		btn_Login.addEventListener(\"click\", function() {\r\n");
      out.write("			if(!form.id.value) {\r\n");
      out.write("				alert('아이디를 입력하시오.!');\r\n");
      out.write("				form.id.focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(!form.pwd.value) {\r\n");
      out.write("				alert('비밀번호를 입력하시오.!');\r\n");
      out.write("				form.pwd.focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 아이디 기억하기\r\n");
      out.write("			let now = new Date(); // 오늘 날짜\r\n");
      out.write("			let name = \"cookieId\"; // 쿠키 이름\r\n");
      out.write("			let value = form.id.value; // 쿠키 값\r\n");
      out.write("			\r\n");
      out.write("			if(form.chk.checked == true) { // 체크박스를 체크했을 때 -> 쿠키 생성\r\n");
      out.write("				// 만료시간: 지금으로부터 7일 후로 설정, 만료시간으로 사용\r\n");
      out.write("				now.setDate(now.getDate() + 7); \r\n");
      out.write("			} else { // 체크박스를 해제했을 때 -> 쿠키 삭제\r\n");
      out.write("				// 만료시간: 지금 시간으로 설정\r\n");
      out.write("				now.setDate(now.getDate() + 0);\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 쿠키 생성시에 필요한 정보 - 쿠키의 이름과 값, 위치, 만료시간\r\n");
      out.write("			// ;path=/;expires= : 현재 페이지의 위치\r\n");
      out.write("			document.cookie = name + \"=\" + escape(value) + \";path=/;expires=\" +now.toGMTString() + \";\";\r\n");
      out.write("			\r\n");
      out.write("			form.submit();\r\n");
      out.write("		})	\r\n");
      out.write("		\r\n");
      out.write("		// 쿠키가 생성되어 있을 때 쿠키에 저장된 값인 아이디를 아이디 입력상자에 놓도록 하는 작업\r\n");
      out.write("		// 쿠키 확인 - 쿠키가 존재한다면 \r\n");
      out.write("		if(document.cookie.length > 0) {\r\n");
      out.write("			var search = \"cookieId=\";\r\n");
      out.write("			var idx = document.cookie.indexOf(search); // 쿠키 중에서 cookieId=이 나오는 위치\r\n");
      out.write("			if(idx != -1) { // cookieId값이 존재한다면\r\n");
      out.write("				idx += search.length;\r\n");
      out.write("				var end = document.cookie.indexOf(';', idx);\r\n");
      out.write("				\r\n");
      out.write("				if(end == -1) {\r\n");
      out.write("					end = document.cookie.length;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				form.id.value = document.cookie.substring(idx, end);\r\n");
      out.write("				form.chk.checked = true;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		// ************************cookieId=aaa1111;path=/;expires=\r\n");
      out.write("		\r\n");
      out.write("		//로그인 상태 유지 체크박스를 체크했을 때 -> 쿠키 사용\r\n");
      out.write("		// http 속성 : 연결 상태를 유지하지 않음.\r\n");
      out.write("		// cookie, session: 연결 상태를 유지함. \r\n");
      out.write("		// - cookie: 연결 정보를 클라이언트 쪽에 저장\r\n");
      out.write("		// - session: 연결 정보를 서버 쪽에 저장\r\n");
      out.write("		// escape() 함수: *, -, _, +, ., / 를 제외한 모든 문자를 16진수로 변환하는 함수\r\n");
      out.write("		// 쉼표, 세미콜론 등과 같은 문자가 쿠키에서 사용되는 문자열과 충돌을 방지하기 위해 사용\r\n");
      out.write("// 		let chk = document.getElementById(\"chk\");\r\n");
      out.write("// 		chk.addEventListener(\"click\", function() {\r\n");
      out.write("			/* let now = new Date(); // 오늘 날짜\r\n");
      out.write("			let name = \"cookieId\"; // 쿠키 이름\r\n");
      out.write("			let value = form.id.value; // 쿠키 값\r\n");
      out.write("			\r\n");
      out.write("			if(form.chk.checked == true) { // 체크박스를 체크했을 때 -> 쿠키 생성\r\n");
      out.write("				// 만료시간: 지금으로부터 7일 후로 설정, 만료시간으로 사용\r\n");
      out.write("				now.setDate(now.getDate() + 7); \r\n");
      out.write("			} else { // 체크박스를 해제했을 때 -> 쿠키 삭제\r\n");
      out.write("				// 만료시간: 지금 시간으로 설정\r\n");
      out.write("				now.setDate(now.getDate() + 0);\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 쿠키 생성시에 필요한 정보 - 쿠키의 이름과 값, 위치, 만료시간\r\n");
      out.write("			// ;path=/;expires= : 현재 페이지의 위치\r\n");
      out.write("			document.cookie = name + \"=\" + escape(value) + \";path=/;expires=\" +now.toGMTString() + \";\"; */\r\n");
      out.write("// 		})\r\n");
      out.write("		\r\n");
      out.write("	})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("	<div class=\"m_title\"><a href=\"../board/boardList.jsp\">Crush 팬 카페</a></div>\r\n");
      out.write("	<div class=\"s_title\">LOGIN</div>\r\n");
      out.write("	\r\n");
      out.write("	<form action=\"memberLoginPro.jsp\" method=\"post\" name=\"loginForm\">\r\n");
      out.write("		<div class=\"f_input\">\r\n");
      out.write("			<div class=\"f_id\"><input type=\"text\" id=\"id\" name=\"id\" class=\"c_id\" placeholder=\"아이디\" size=\"55\"></div>\r\n");
      out.write("			<div class=\"f_pwd\"><input type=\"password\" id=\"pwd\" name=\"pwd\" class=\"c_pwd\" placeholder=\"비밀번호\" size=\"55\"></div>\r\n");
      out.write("			<div class=\"f_chk\">\r\n");
      out.write("				<input type=\"checkbox\" id=\"chk\" class=\"c_chk\" size=\"55\" name=\"chk\">&nbsp;\r\n");
      out.write("				<label for=\"chk\">아이디 기억하기</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"f_submit\"><input type=\"button\" value=\"로그인\" id=\"btn_Login\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"f_a\">\r\n");
      out.write("			<a href=\"#\">비밀번호 찾기</a>&emsp;|&emsp;\r\n");
      out.write("			<a href=\"#\">아이디 찾기</a>&emsp;|&emsp;\r\n");
      out.write("			<a href=\"../member/memberJoinForm.jsp\">회원가입</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
