package se.lexicon.michelle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Challenges {


    //1. Create an empty set and populate it with the all the days of the week.
    // Next create a second set and populate it with ONLY the weekend days (SATURDAY and SUNDAY).
    // Lastly, compare the two sets and retain in the first set only those days that are the same in both sets.
    public void compareSet() {
        Set<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println("Weekdays: " + weekDays);

        Set<String> weekend = new HashSet<>();
        weekend.add("Saturday");
        weekend.add("Sunday");
        System.out.println("Weekend: " +weekend);

        weekDays.retainAll(weekend);
        System.out.println("Weekdays after comparison and retaining same elements: " + weekDays);
    }



    //2. Create a new hashMap of types <String,String> and populate it with elements
    // containing an email (String) and a name (String).
    // Next, create a new Set and populate it with the keys from the hashMap you created.
    public void populateUsingKeys() {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("saga@challenges.com", "Saga");
        hashmap.put("haldur@challenges.com", "Haldur");
        hashmap.put("erak@challenges.com", "Erak");
        hashmap.put("vilda@challenges.com", "Vilda");
        hashmap.put("adla@challenges.com", "Ädla");

        Set<String> keys = new HashSet<>(hashmap.keySet());

        System.out.println(keys);
    }

    //3. Create a new class and call it SuperHero.
    // Add fields for Id,Name and Age + getters and setters. Have the class implement the Comparable interface.
    // Implement the override method and have it compare the AGE of the superhero.
    // Next, create a new arrayList of type SuperHero.
    // Sort the list by age and print out each element.

    //4. Create an array of type int with numbers: {1,4,4,2,6,7}.
    // Next, create an appropriate Collection and populate it with the content of the int array.
    // Lastly, print out each element in the Collection without duplicates.
}
