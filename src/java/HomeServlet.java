
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class HomeServlet extends HttpServlet
{   
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        out.println("<h1>Hello "+(String)(session.getAttribute("name"))+"</h1>");
    }
}