package com.chap01;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebFilter("/*")
public class LoggingFilter implements Filter {

    private FilterConfig filterConf = null;

    public void init(FilterConfig filterConf) {
        this.filterConf = filterConf;
    }

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        String userAddy = request.getRemoteHost();
        filterConf.getServletContext().log("Visitor User IP: " + userAddy);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

}