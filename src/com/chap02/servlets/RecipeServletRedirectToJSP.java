package com.chap02.servlets;

import com.database.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "RecipeServletRedirectToJSP", urlPatterns = {"/ServletRedirToJSP"})
public class RecipeServletRedirectToJSP extends HttpServlet {

    private static final String JSP_TO_REDIRECT = "/chap02_jsp/recipe_output.jspx";

    private TutorialDao tutorialDao = new TutorialDao();


    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int result = -1;
        result = tutorialDao.insertRow(Integer.parseInt(request.getParameter("recipeNumber")),
                request.getParameter("name"),
                request.getParameter("description"),
                request.getParameter("text"));
        request.setAttribute("result", result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(JSP_TO_REDIRECT);
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}