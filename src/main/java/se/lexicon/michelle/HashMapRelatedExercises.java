package se.lexicon.michelle;

import java.util.HashMap;

public class HashMapRelatedExercises {
    //9. Create a new hashMap of type <Integer,String> and populate it with
    // elements containing an id(Integer) and a car brand(String).
    // Lastly, print out the entire hashMap.
    public void printHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Ford");
        hashMap.put(4, "Lamborghini");
        hashMap.put(5, "Toyota");

        System.out.println(hashMap);

    }

    //10. Create a new hashMap of type <Integer,String> and populate it with
    // elements containing an id(Integer) and a car brand(String).
    //Lastly, print out only the keys.
    public void printOnlyKeysHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Ford");
        hashMap.put(4, "Lamborghini");
        hashMap.put(5, "Toyota");

        System.out.println(hashMap.keySet());
    }

    //11. Create a new hashMap of type <Integer,String> and populate it with
    // elements containing an id(Integer) and a car brand(String).
    //print out only the values.
    public void printOnlyValuesHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Ford");
        hashMap.put(4, "Lamborghini");
        hashMap.put(5, "Toyota");

        System.out.println(hashMap.values());
    }

}
