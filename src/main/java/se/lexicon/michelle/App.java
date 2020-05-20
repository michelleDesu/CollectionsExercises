package se.lexicon.michelle;


public class App
{
    public static void main( String[] args )
    {
        runListRelatedPrints();
    }

    public static void runListRelatedPrints(){
        ListRelatedExercises listRelated = new ListRelatedExercises();

        //listRelated.printDaysOfTheWeek();
        //listRelated.iterateAndPrintAllWeekdays();
        //listRelated.removeThenAddThursdayPrintAllWeekdays();
        listRelated.usingSublistPrintAllWeekdays();
    }


}
