package servelet.contrllor;
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	 private  Integer message=new Integer(10);
	 
	    public void init() throws ServletException {
	        // Do required initialization
	        message +=8;
	    }
	 
	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	 
	    	message +=1;
	        // Set response content type
	        response.setContentType("text/html");
	 
	        // Actual logic goes here.
	        PrintWriter out = response.getWriter();
	        out.println("<h1>" + message + "</h1>");
	        message=new Integer(0);
	    }
	 
	    public void destroy() {
	        // do nothing.
	    	message=message-2;
	    }
}