

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



public class LoginServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("pass");
        HttpSession session = req.getSession();
        session.setAttribute("name",name);
        session.setAttribute("pass", password);
        if(name.equals("Admin") && password.equals("12345"))
        {
           RequestDispatcher rd = req.getRequestDispatcher("HomeServlet");
           rd.forward(req,res);
        }
        else
        {
           out.println("Wrong Username or Password");
        }   
    }
}