package se.lexicon.michelle;


public class App
{
    public static void main( String[] args )
    {
        //runListRelatedPrints();
        //runHashSetRelatedPrints();
        runHashMapRelatedExercises();
    }

    private static void runHashMapRelatedExercises() {
        HashMapRelatedExercises hashMapRelated = new HashMapRelatedExercises();
        hashMapRelated.printHashMap();
        hashMapRelated.printOnlyKeysHashMap();
        hashMapRelated.printOnlyValuesHashMap();

    }

    public static void runListRelatedPrints(){
        ListRelatedExercises listRelated = new ListRelatedExercises();

        listRelated.printDaysOfTheWeek();
        listRelated.iterateAndPrintAllWeekdays();
        listRelated.removeThenAddThursdayPrintAllWeekdays();
        listRelated.usingSublistPrintAllWeekdays();
    }

    public static void runHashSetRelatedPrints(){
        HashSetRelatedExercises hashSetRelated = new HashSetRelatedExercises();
        hashSetRelated.printHashSet();
        hashSetRelated.convertHashSetToArrayList();
        hashSetRelated.convertAnsSortHashSetToArrayList();
        hashSetRelated.SortHashSetUsingTreeSet();

    }


}
