package com.indianeagle.browser;


import java.io.IOException;

public class Local_Setup_DockerGrid {

    public void startDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
        Thread.sleep(50000);
    }

    public void stopDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
        Thread.sleep(15000);
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); //Close command prompt
    }
}
