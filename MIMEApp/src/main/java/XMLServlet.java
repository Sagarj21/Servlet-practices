//html servlet
package servletpkg;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class XMLServlet {

	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		//set responce content type
		res.setContentType("text/xml");
		//get pw wirter
		PrintWriter pw=res.getWriter();
		pw.println("<table border='1' align='centre'>");
		pw.println("<tr><th>Player name</th> <th>Medal <th><th> category</th> </tr>");
		pw.println("<tr><th>chanu</th> <th>weightlift <th><th> women</th> </tr>");
	
		pw.println("</table>");
		pw.close();
	
	}

}
