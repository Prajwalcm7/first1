package com.besant.lohi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.praju.Empdetails;

public class ServletCls extends HttpServlet {
	protected void service(HttpServletRequest arg0,HttpServletResponse arg1) throws ServletException,IOException{
List<Empdetails> st=new ArrayList<Empdetails>();
st.add(new Empdetails(1, "lohi", 20000));
st.add(new Empdetails(2, "praju", 24000));
arg0.setAttribute("nnn", st);



	
	}
}
