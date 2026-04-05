package dev.Fjc.paperQuests.quest;

import dev.Fjc.paperQuests.quest.attach.QuestCategory;
import dev.Fjc.paperQuests.quest.attach.QuestProgression;
import dev.Fjc.paperQuests.quest.attach.QuestType;

/**
 * Represents a quest. A quest should consist of the following: <br>
 * A name, a {@link QuestType}, an array of valid {@link QuestCategory}. <br>
 * On a custom paper/item, multiple quests will be stored together.
 */
public abstract class Quest {

    private final QuestType type;
    private final QuestCategory[] categories;

    public Quest(QuestType type, QuestCategory... categories) {
        this.type = type;
        this.categories = categories;
    }

    public QuestType type() {
        return this.type;
    }

    public QuestCategory[] categories() {
        return this.categories;
    }

    abstract QuestProgression<Quest> progression();
}
