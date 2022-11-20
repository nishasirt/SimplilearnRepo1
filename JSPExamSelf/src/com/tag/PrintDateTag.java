package com.tag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintDateTag  extends SimpleTagSupport{
	
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out=getJspContext().getOut();
		out.print("<h2>Current  date is : "+new SimpleDateFormat("dd-mm-yyyy hh:mm:ss EEE").format(new Date())+"</h2>");
	}

}
