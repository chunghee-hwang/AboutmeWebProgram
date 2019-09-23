package com.chung;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/today")
public class TodayServlet extends HttpServlet {
       
    public TodayServlet() {
        super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime now = LocalDateTime.now();
		String today = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분"));
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>몇 시인가요</title>");
		out.println("</head>");
		out.println("<a href='html/index.html'><h2>메인 화면</h2></a><br>");
		out.println("<h1>"+today+"</h1>");
		out.println("</html>");
	}
}
