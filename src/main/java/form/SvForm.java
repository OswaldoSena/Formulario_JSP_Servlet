
package form;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import java.io.PrintWriter;

@WebServlet(name = "SvForm", urlPatterns = {"/SvForm"})
public class SvForm extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          /*  out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvForm</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +msg+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String user = request.getParameter("user");
         String pass = request.getParameter("pass");
        
            if ("admin".equals(user) && "oswal".equals(pass)){


                response.sendRedirect("mensaje.jsp");
            }else {
                response.sendRedirect("mensaje2.jsp");
            }
    }

        
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           // processRequest(request, response);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
