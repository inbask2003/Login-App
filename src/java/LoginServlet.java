

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("pass");
        req.setAttribute("name",name);
        if(name.equals("Admin") && password.equals("12345"))
        {
            out.println("Welcome");
            RequestDispatcher rd = req.getRequestDispatcher("HomeServlet");
            rd.forward(req, res);
        }
        else
        {
            out.println("<h1>Wrong Username or Password</h1>");
        }
         
    }
    
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out = res.getWriter(); 
    }
}