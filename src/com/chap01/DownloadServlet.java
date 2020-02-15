package com.chap01;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "DownloadServlet", urlPatterns = {"/DownloadServlet"})
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Read parameter from form that contains the file name to download
        String fileToDownload = request.getParameter("filename");
        // Call the download method with the given file
        System.err.println("Downloading file now...");
        doDownload(request, response, fileToDownload);
    }


    private void doDownload(HttpServletRequest request, HttpServletResponse response,
                            String originalFile) throws IOException {
        final int BYTES = 1024;
        int length = 0;
        ServletOutputStream outStream = response.getOutputStream();
        ServletContext context = getServletConfig().getServletContext();
        response.setContentType((context.getMimeType(originalFile) != null) ?
                context.getMimeType(originalFile) : "text/plain");
        System.out.println(context.getMimeType(originalFile));
        response.setHeader("Content-Disposition", "attachment; filename=\"" + originalFile
                + "\"");
        InputStream in = context.getResourceAsStream("/" + originalFile);
        byte[] bbuf = new byte[BYTES];
        while ((in != null) &&
                ((length = in.read(bbuf)) != -1)
        ) {
            outStream.write(bbuf, 0, length);
        }
        outStream.flush();
        outStream.close();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}