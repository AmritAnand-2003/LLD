package DesignPatterns.Structural.facade;

public class VersionControlSystem{
    public void pullLatestChanges(String branch){
        System.out.println("VCS: Pulling latest changes from '" + branch + "'...");
        simulateDelay();
        System.out.println("VCS: Pull complete.");
    }

    private void simulateDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class BuildSystem {
    public boolean compileProject() {
        System.out.println("BuildSystem: Compiling project...");
        simulateDelay(2000);
        System.out.println("BuildSystem: Build successful.");
        return true;
    }
    public String getArtifactPath() {
        String path = "target/myapplication.jar";
        System.out.println("BuildSystem: Artifact located at " + path);
        return path;
    }
    private void simulateDelay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}