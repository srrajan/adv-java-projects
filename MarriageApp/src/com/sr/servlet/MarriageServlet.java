package com.sr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null;
		String gender=null;
		int age=0;
		//get printwriter
		pw=res.getWriter();
		//set content type
		res.setContentType("text/html");
		//read form data(paaraameter vaalues)
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("page"));
		gender=req.getParameter("gender");
		//business logic
		if(gender.equalsIgnoreCase("M"))
		{
			if(age>=21) {
	          pw.println("<h1 style='color:red;text-align:center'>Mr."+name+" eligible for marriage </h1>");
		      }//if
	    
	else
	    {
		pw.println("<h1 style='color:green;text-align:center'>Mr."+name+" u r not eligible to marriage</h1>");
		}//else
		 }
		 else if(gender.equalsIgnoreCase("F"))
		  {
			if(age>=18){
	          pw.println("<h1 style='color:cyan;text-align:center'>Mrs."+name+" eligible for marriage </h1>");
					  }
				else {
		        pw.println("<h1 style='color:yellow;text-align:center'>Mrs."+name+" u r not eligible to marriage</h1>");	
					}//else
				}//if
		  else
			  pw.println("<h1 style='color:yellow;text-align:center'>Unknown Gender</h1>");
		
		       pw.println("<br><b>date and time:"+new Date()+"</b><br>");
		  //add hyperlink
		  pw.println("<br> <a href='input.html'><img src='images/home.jpg' width='50' height='50'/></a>");
		  pw.close();
			
	}//doGet

}//class
