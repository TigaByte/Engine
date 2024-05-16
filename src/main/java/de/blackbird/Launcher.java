package de.blackbird;

import de.blackbird.core.WindowManager;
import org.lwjgl.Version;

import java.awt.*;

public class Launcher {

    public static void main(String[] args) {

        System.out.println(Version.getVersion());

        WindowManager window = new WindowManager("BlackBird Engine", 1600, 900, false);
        window.init();

        while (!window.windowShoulClose()){
            window.Update();
        }

        window.cleanup();

    }
}

