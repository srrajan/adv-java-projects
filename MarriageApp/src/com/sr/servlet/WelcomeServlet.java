package com.sr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		//get printwriter
		pw=res.getWriter();
		//set content type
		res.setContentType("text/html");
		pw.println("<marquee><h1 style='color:blue'>Welcome To SR World</h1></marquee>");
		//close streaam
		pw.close();
		
		
	}//doget


}//class
