import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class GreetAll extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse 	response) throws IOException, ServletException
    {
        	response.setContentType("text/html");
        	PrintWriter printwrite = response.getWriter();
        	printwrite.println("<html>");
        	printwrite.println("<head>");
        	String greet ;
        	greet = getServletConfig().getInitParameter("greeting");
		printwrite.println("<title>"+greet+"</title>");
        	printwrite.println("</head>");
        	printwrite.println("<body>");
        	printwrite.println("<h1>"+greet+"</h1>");
        	printwrite.println("</body>");
        	printwrite.println("</html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException 
    {
    	doGet(request, response);    	
    }
}
