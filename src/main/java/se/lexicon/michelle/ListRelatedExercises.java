package se.lexicon.michelle;

import java.util.ArrayList;
import java.util.List;

public class ListRelatedExercises {


    //1. Create a new list and populate it with the days of the week.
    //Lastly, print the out the list.
    public void printDaysOfTheWeek(){
        List<String> weekDays= new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);
    }
    //2. Create a new list and populate it with the days of the week.
    //Lastly, iterate through the list and print out each element separately.
    public void iterateAndPrintAllWeekdays(){
        List<String> weekDays= new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        for (String string: weekDays){
            System.out.println(string);
        }
    }
    //3. Create a new list and populate it with the days of the week excluding THURSDAY
    //insert the weekday THURSDAY into the right position in the list.
    public  void removeThenAddThursdayPrintAllWeekdays(){
        List<String> weekDays= new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        weekDays.add(3, "Thursday");
        for (String string: weekDays){
            System.out.println(string);
        }
    }

    //4. Create a new list and populate it with the days of the week
    //Then create a new list out of the first three elements of the first list using a subList.
    public  void usingSublistPrintAllWeekdays() {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        List<String> sublist = new ArrayList<>(weekDays.subList(0,3));
        System.out.println(sublist);



    }
}
