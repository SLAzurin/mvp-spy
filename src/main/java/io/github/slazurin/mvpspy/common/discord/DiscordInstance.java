package io.github.slazurin.mvpspy.common.discord;

import javax.annotation.Nonnull;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;

public class DiscordInstance {
    private static JDA instance;
    private static MessageChannel mainTextChannel;

    public static void connect() throws InterruptedException {
        JDABuilder builder = JDABuilder.createDefault(System.getenv("DISCORD_BOT_TOKEN"));
        JDA jda = builder.build();
        builder.setActivity(Activity.watching("for MVP buffs"));
        jda.awaitReady();
        String discordChannelID = System.getenv("DISCORD_CHANNEL_ID");
        if (discordChannelID == null)
            throw new InterruptedException("No main channel ID provided");
        mainTextChannel = jda.getChannelById(MessageChannel.class, discordChannelID);
        if (mainTextChannel == null)
            throw new InterruptedException("Failed to join main channel");
    }

    public static JDA getInstance() {
        return instance;
    }

    public static void sendMessageToMain(@Nonnull String msg) {
        mainTextChannel.sendMessage(msg).queue();
    }
}
