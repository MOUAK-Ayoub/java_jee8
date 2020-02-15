package com.chap01;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns = {"/AcmeReaderServlet"}, asyncSupported = true)
public class AcmeReaderServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter output = response.getWriter()) {
            String filename = "test.txt";
            ServletContext context = getServletContext();
            InputStream in = context.getResourceAsStream(filename);
            output.println("<html>");
            output.println("<head>");
            output.println("<title>Acme Reader</title>");
            output.println("</head>");
            output.println("<body>");
            output.println("<h1>Welcome to the Acme Reader Servlet</h1>");
            output.println("<br/><br/>");
            output.println("<p>Look at the server log to see data that was read asynchronously from a file<p>");
            AsyncContext asyncCtx = request.startAsync();
            ServletInputStream input = request.getInputStream();
            input.setReadListener(new AcmeReadListenerImpl(input, asyncCtx));
            output.println("</body>");
            output.println("</html>");
        } catch (Exception ex) {
            System.out.println("Exception Occurred: " + ex);
        }
    }

}