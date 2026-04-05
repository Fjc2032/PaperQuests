package dev.Fjc.paperQuests.quest.attach;

import org.bukkit.event.Listener;

/**
 * Represents a category that a quest can be set to. Categories determine what kind of
 * events the quest should check for.
 */
public enum QuestCategory {
    // Listeners don't actually exist yet
    KILL("KILL", null),
    PLACE_BREAK("PLACE_BREAK", null),
    INTERACT("INTERACT", null);

    private final String action;
    private final Listener listener;

    QuestCategory(String action, Listener listener) {
        this.action = action;
        this.listener = listener;
    }


    public String getAction() {
        return this.action;
    }

    public Listener getListener() {
        return this.listener;
    }
}
