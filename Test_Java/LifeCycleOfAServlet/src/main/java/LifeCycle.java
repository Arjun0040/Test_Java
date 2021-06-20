import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycle extends HttpServlet {
	
	  
	// Extend HttpServlet class
	
	   private String output;
	    
	   // Initializing servelet
	   public void init() throws ServletException 
	   {
	      output = "Advance Java Concepts";
	   }
	  
	   // Requesting and printing the output
	   public void doGet(HttpServletRequest req, 
	                    HttpServletResponse resp)
	      throws ServletException, IOException 
	      {
	         resp.setContentType("text/html");
	         PrintWriter out = resp.getWriter();
	         out.println(output);
	      }
	  
	      public void destroy() 
	      {
	         System.out.println("Over");
	      }
	}
}
