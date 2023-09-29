import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class DateServlet  extends GenericServlet {

		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			res.setContentType("text/html");
			//get print writer stream object from res object
			PrintWriter pw=res.getWriter();
			//request processing logic
			Date d=new Date();
			//write output to response object
			pw.println("<h1>date and time is "+d+"<h1>");
			//close print writer
			pw.close();	
		}

}//class
