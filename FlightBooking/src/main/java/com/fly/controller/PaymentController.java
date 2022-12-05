package com.fly.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fly.dao.BookFlightDao;
import com.fly.dao.PaymentDao;
import com.fly.pojo.BookedFlight;
import com.fly.pojo.MapFligts;
import com.fly.pojo.Payment;

/**
 * Servlet implementation class PaymentController
 */
public class PaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookedFlight bookedFlight=new BookedFlight();
		
		String uniqueID = UUID.randomUUID().toString();
		
		bookedFlight.setPnr(uniqueID);
		bookedFlight.setName(request.getParameter("passname"));
		bookedFlight.setMobileNo(Long.parseLong(request.getParameter("passMob")));
		bookedFlight.setEmail(request.getParameter("passmail"));
		bookedFlight.setSeat(Integer.parseInt(request.getParameter("person")));
		bookedFlight.setDate(request.getParameter("date"));
		bookedFlight.setPrice(Double.parseDouble(request.getParameter("price")));
		bookedFlight.setFinalAmount(Double.parseDouble(request.getParameter("famt")));
		bookedFlight.setFlight(request.getParameter("fname"));
		
		MapFligts fligts=new MapFligts();
		
	   fligts.setId(Integer.parseInt(request.getParameter("fid")));
		fligts.setAirline(request.getParameter("alinname"));
		fligts.setFlightName(request.getParameter("fname"));
		fligts.setSource(request.getParameter("src"));
		fligts.setDestination(request.getParameter("des"));
//		
		
		bookedFlight.setFligts(fligts);
		
		BookFlightDao dao=new BookFlightDao();
		
		int r=dao.insert(bookedFlight);
		
		
		Payment p=new Payment();
		p.setCardNo(request.getParameter("cardNo"));
		p.setUpiid(request.getParameter("upi"));
		p.setBookedFlight(bookedFlight);
		
		PaymentDao dao1=new PaymentDao();
	    int h=dao1.insert(p);
		
	
		
		
		
		if(h>0)
		{
			response.sendRedirect("confirmation.jsp?pnr="+uniqueID);
		}
		else {
			response.sendError(h, "Booking fail");
		}
		
	}

}
