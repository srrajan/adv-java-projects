package com.sr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {
	@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		int code=0;
		String capitals[]= {"New Delhi","Kathmandu","Dhaka","Colombo","Bhutan"};
		//get printwriter
		pw=res.getWriter();
		//set content type
		res.setContentType("text/html");
		//get country code
		code=Integer.parseInt(req.getParameter("country"));
	//display the capital
		pw.println("<h2 style='color:blue,text-align:center'>Capital is::"+capitals[code]+"</h2>");
		//add home hyperlink
		pw.println("<br><a href='form.html'>HOME</a>");
		//close stream
		pw.close();
		}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
