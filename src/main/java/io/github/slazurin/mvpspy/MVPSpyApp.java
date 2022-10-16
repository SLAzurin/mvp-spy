package io.github.slazurin.mvpspy;

import io.github.slazurin.mvpspy.options.OptionsParser;

public class MVPSpyApp {
    public static void main(String[] args) {
        try {
            OptionsParser.parseEnv();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
            return;
        }
        
    }
}
