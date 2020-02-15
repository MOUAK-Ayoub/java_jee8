package com.chap01.recipe01;

import javax.servlet.ServletContextEvent;
import java.util.Properties;

public class StartupShutdownListener {

    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Servlet startup...");
        System.out.println(event.getServletContext().getServerInfo());
        System.out.println(System.currentTimeMillis());
        sendEmail("Servlet context has initialized");
    }

    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("Servlet shutdown...");
        System.out.println(event.getServletContext().getServerInfo());
        System.out.println(System.currentTimeMillis());
// See error in server.log file if mail is unsuccessful
        sendEmail("Servlet context has been destroyed...");
    }

    private boolean sendEmail(String message) {
        boolean result = false;

        result = false;
        return result;
    }

}

