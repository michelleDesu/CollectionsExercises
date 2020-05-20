package se.lexicon.michelle;

import java.util.*;

public class HashSetRelatedExercises {

    // 5. Create a new hashset and populate it with the days of the week.
    //Lastly, print the set out and pay attention to the order of the elements.
    public void printHashSet(){
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);

    }

    // 6. Create a new hashSet and populate it with the days of the week.
    // Then convert the hashSet to an arrayList.
    public void convertHashSetToArrayList(){
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        List<String> list = new ArrayList<>(weekDays);
        System.out.println(weekDays);
    }
    // 7. Create a new hashSet and populate it with random names.
    // Then convert the hashSet to an arrayList.
    // Lastly, manually sort the list in alphabetical order and print it out.
    public void convertAnsSortHashSetToArrayList(){
        HashSet<String> names = new HashSet<>();
        names.add("Saga");
        names.add("Haldur");
        names.add("Erak");
        names.add("Vilda");
        names.add("Ädla");
        names.add("Styv");
        names.add("Embla");


        List<String> list = new ArrayList<>(names);

        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }

    // 8. Create a new hashSet and populate it with random names.
    // Lastly, sort the list in alphabetical order using only a Set or a child of Set.
    public void SortHashSetUsingTreeSet(){
        HashSet<String> names = new HashSet<>();
        names.add("Saga");
        names.add("Haldur");
        names.add("Erak");
        names.add("Vilda");
        names.add("Ädla");
        names.add("Styv");
        names.add("Embla");

        TreeSet<String> sortedNames = new TreeSet<>(names);
        System.out.println(sortedNames);
    }

}
