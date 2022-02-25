/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-02-13 18:10:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.lesson02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class quiz10_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	");

	Calendar cal = Calendar.getInstance();

	// 월의 첫날
	cal.set(Calendar.DAY_OF_MONTH, 1);

	//그 주의 요일 반환 (일:1 ~ 토:7)
	int week = cal.get(Calendar.DAY_OF_WEEK);

	//몇 주 있는지
	int weekSize = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

	// 마지막 날짜
	int maximumDays = cal.getActualMaximum(Calendar.DATE);

	HashMap<Integer, String> dayOfWeek = new HashMap<>();
	dayOfWeek.put(1, "일");
	dayOfWeek.put(2, "월");
	dayOfWeek.put(3, "화");
	dayOfWeek.put(4, "수");
	dayOfWeek.put(5, "목");
	dayOfWeek.put(6, "금");
	dayOfWeek.put(7, "토");

	Collection<String> values = dayOfWeek.values();
	
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"container\">\n");
      out.write("\n");
      out.write("		<div class=\"fw-light fs-2 text-center\">");
      out.print(cal.get(Calendar.YEAR) + " - " + Integer.valueOf(cal.get(Calendar.MONTH) + 1));
      out.write("</div>\n");
      out.write("\n");
      out.write("		<table class=\"table\">\n");
      out.write("			<thead>\n");
      out.write("				<tr>\n");
      out.write("					");

					for (String day : values) {
					
      out.write("\n");
      out.write("					<th class=\"fw-light fs-3 ");
      out.print( day.equals("일") ? "text-danger" : "" );
      out.write('"');
      out.write('>');
      out.print(day);
      out.write("</th>\n");
      out.write("\n");
      out.write("					");

					}
					
      out.write("\n");
      out.write("				</tr>\n");
      out.write("			</thead>\n");
      out.write("			<tbody>\n");
      out.write("		");

		int counter = 1;
		for (int i = 0; i < weekSize; i++) {
		
      out.write("\n");
      out.write("			<tr>\n");
      out.write("		");

			for (int j = 1; j < 8; j++) {
				if (counter > maximumDays) {
					break;
				}
		
      out.write("\n");
      out.write("				<td class=\"fs-3 ");
      out.print( (i * 7 + j) % 7 == 1 ? "text-danger" : "" );
      out.write("\">\n");
      out.write("		");

				/* 월 1일 시작요일 체크 */
				if (week <= (i * 7 + j)) { 
		
      out.write("\n");
      out.write("					");
      out.print( counter );
      out.write('\n');
      out.write('	');
      out.write('	');

					counter++;
				}
		
      out.write("\n");
      out.write("				</td>\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("			</tr>\n");
      out.write("		");

		}
		
      out.write("\n");
      out.write("			</tbody>\n");
      out.write("		</table>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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