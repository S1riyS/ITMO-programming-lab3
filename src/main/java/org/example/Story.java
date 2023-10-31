package org.example;

import java.util.ArrayList;

public class Story {
    public static void main(String[] args) {
        Emma emma = new Emma("Эмма");
        emma.performAction();

        ArrayList<MumiTroll> mumiTrollFamilyMembers = new ArrayList<>();
        for (MumiTrollFamily member : MumiTrollFamily.values()) {
            MumiTroll mumiTroll = new MumiTroll(member.getDisplayName());
            mumiTrollFamilyMembers.add(mumiTroll);
            emma.addObserver(mumiTroll);
        }

        emma.notifyObservers();

        for (MumiTroll member : mumiTrollFamilyMembers) {
            member.performAction();
        }

        System.out.println("\nТестирование переопределенных методов:");
        MumiTroll mumiTrollObject = mumiTrollFamilyMembers.get(0);

        // Character toString() method
        System.out.println(emma);
        // Character equals() method (true case)
        Emma emma1 = new Emma("Эмма");
        System.out.println(emma.equals(emma1));
        // Character equals() method (false case)
        System.out.println(emma.equals(mumiTrollObject));
        // Character hashCode() method
        System.out.println(mumiTrollObject.hashCode());
    }
}

