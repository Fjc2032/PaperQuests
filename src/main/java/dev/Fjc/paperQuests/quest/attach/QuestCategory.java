package dev.Fjc.paperQuests.quest.attach;

import org.bukkit.event.Listener;

public abstract class QuestAction {

    private final String action;
    private final Listener listener;

    // Listeners will be marked NULL until I actually make the listeners lmao

    protected static final QuestAction KILL = of("KILL", null);
    protected static final QuestAction PLACE_BREAK = of("PLACE_BREAK", null);
    protected static final QuestAction INTERACT = of("INTERACT", null);

    protected QuestAction(String action, Listener listener) {
        this.action = action;
        this.listener = listener;
    }

    public static QuestAction of(String action, Listener listener) {
        return new QuestAction(action, listener) {};
    }

    public String getAction() {
        return this.action;
    }

    public Listener getListener() {
        return this.listener;
    }
}
