package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginSuccessfulServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");  
        PrintWriter pw = resp.getWriter();  
        
        pw.println("Your Username And Password Are Matched");
        HttpSession session = req.getSession();  
        session.setAttribute("id","s@123"); 
        pw.close();
	}
}
