import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet !!!!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet !!!!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}