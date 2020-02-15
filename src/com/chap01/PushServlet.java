package com.chap01;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "PushServlet", urlPatterns = {"/PushServlet"})
public class PushServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PushServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PushServlet at " + request.getContextPath() + "!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("In the servlet");
        if (request.getRequestURI().equals("/javaee8_tutorials_war_exploded/PushServlet")) {
            System.out.println("Pushing resources");
            PushBuilder builder =
                    request.newPushBuilder().path("/resources/passeport.png");
//            builder.path("/resources/images/javaee7recipes.png");
            builder.push();
        }

        processRequest(request, response);
    }

}