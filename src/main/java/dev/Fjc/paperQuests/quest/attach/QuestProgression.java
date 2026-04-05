package dev.Fjc.paperQuests.quest.attach;

import dev.Fjc.paperQuests.quest.Quest;

public class QuestProgression<Q extends Quest> {

    private final Q quest;

    private float value1;
    private final float value2;

    private State state;

    protected QuestProgression(Q quest, State state, float value1, float value2) {
        this.quest = quest;
        this.state = state;
        this.value1 = value1;
        this.value2 = value2;
    }

    public Q getQuest() {
        return quest;
    }

    public float getValue1() {
        return value1;
    }

    public float getValue2() {
        return value2;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setValue1(float value1) {
        this.value1 = value1;
    }

    public enum State {
        SEALED,
        ACTIVE,
        COMPLETE,
        INVALID
    }
}
