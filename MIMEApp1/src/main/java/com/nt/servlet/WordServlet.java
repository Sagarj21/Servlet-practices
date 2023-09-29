//html servlet

package com.nt.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WordServlet {

	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		//set responce content type
		res.setContentType("application/msword");
		//get pw wirter
		PrintWriter pw=res.getWriter();
		pw.println("<table border='1' align='centre'>");
		pw.println("<tr><th>Player name</th> <th>Medal </th><th> category</th> </tr>");
		pw.println("<tr><td>chanu</td> <td>weightlift </td><td> women</td> </tr>");
	
		pw.println("</table>");
		pw.close();
	
	}

}
