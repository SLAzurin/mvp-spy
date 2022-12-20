package io.github.slazurin.mvpspy;

import io.github.slazurin.mvpspy.common.discord.DiscordInstance;
import io.github.slazurin.mvpspy.options.OptionsParser;

public class MVPSpyApp {
    public static void main(String[] args) throws InterruptedException {
        OptionsParser.parseEnv();

        // TODO: Start executor service

        // Java Discord API main thread
        // Discord permissions int 76800
        DiscordInstance.connect();
        DiscordInstance.sendMessageToMain("test");

    }
}
