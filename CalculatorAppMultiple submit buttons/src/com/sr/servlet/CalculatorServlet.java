package com.sr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CalculatorServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter pw=null;
		String pval=null;
		Calendar calendar =null;
		float val1=0.0f,val2=0.0f;
		//get printwriter
		pw=res.getWriter();
		//set content type
		res.setContentType("text/html");
		//read additional param values(s1)
		pval=req.getParameter("s1");
		//read form data only when hyperlink is not clicked
		if(!pval.equalsIgnoreCase("link1") && !pval.equalsIgnoreCase("link2")) {
			val1=Float.parseFloat(req.getParameter("t1"));
			val2=Float.parseFloat(req.getParameter("t2"));
		}
		else {
			 calendar =Calendar.getInstance();
		}
			//different logics
		if(pval.equalsIgnoreCase("add")) {
			pw.println("<h2 style='color:red'>Addition:: "+(val1+val2)+"</h2>");
		}
		else if(pval.equalsIgnoreCase("mul")) {
			pw.println("<h2 style='color:red'>Multiply:: "+(val1*val2)+"</h2>");
		}
		else if(pval.equalsIgnoreCase("sub")) {
			pw.println("<h2 style='color:red'>Subtraction:: "+(val1-val2)+"</h2>");
		}
		else if(pval.equalsIgnoreCase("div")) {
		    pw.println("<h2 style='color:red'>Division:: "+(val1/val2)+"</h2>");
		   }
		else if(pval.equalsIgnoreCase("link1")) { 
			pw.println("<h2 style='color:red'>Caalendar day In The Year:::"+calendar.get(Calendar.DAY_OF_YEAR)+"</h2>");
		}
		else{
			pw.println("<h2 style='color:red'>Caalendar week In The Year:::"+calendar.get(Calendar.WEEK_OF_YEAR)+"</h2>");
			}
		//add hyperlink
				pw.println("<br><a href='calculator.html'><img src='images/home.gif' width='100' height='50'/></a>");
			//close printwriter
		pw.close();
	}

		
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   doPost(req,res);
	}
	
		

	
}
