package com.di.mergeo.service;


import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import java.io.IOException;

public class StartupService {

    public static void loadApplication(String tomcatPath, String warPath) throws IOException, InterruptedException {

        ProcessBuilder pb = new ProcessBuilder("cp", "-a", warPath, tomcatPath);
        Process p = null;
        p = pb.start();
        p.waitFor();

        System.out.println("[Status] Startup application transfered to Tomcat's base");

    }
}
