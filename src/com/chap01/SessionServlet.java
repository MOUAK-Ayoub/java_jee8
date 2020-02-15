package com.chap01;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name="SessionServlet", urlPatterns={"/SessionServlet"}) public class
SessionServlet extends HttpServlet {
    public void doPost (HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
// Obtain the Session object
        HttpSession session = req.getSession(true);
// Set up a session attribute
        String email = (String)
                session.getAttribute ("session.email");
        if (email == null) {
            email = req.getParameter("email");
            session.setAttribute ("session.email", email);
        }
        String sessionId = session.getId();
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head><title>Working with sessions</title></head>");
        out.println("<body>");
        out.println("<h1>Session Test</h1>");
        out.println ("Your email address is: " + email + "<br/><br/>");
        out.println ("Your session id: " + sessionId);
        out.println("</body></html>");
    }
}