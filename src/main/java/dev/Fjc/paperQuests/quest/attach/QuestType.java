package dev.Fjc.paperQuests.quest.attach;

import java.util.List;

public class QuestType {

    private final String type;

    private static List<QuestType> validTypes;

    protected QuestType(String type) {
        this.type = type.toUpperCase();
    }

    public String getType() {
        return type;
    }

    public static List<QuestType> getValidTypes() {
        return validTypes;
    }

    public static QuestType add(String name) {
        QuestType obj = new QuestType(name);
        validTypes.add(obj);

        return obj;
    }
}
