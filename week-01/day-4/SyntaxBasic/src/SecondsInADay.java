public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 16;
        int currentMinutes = 17;
        int currentSeconds = 00;

        int hoursLeft = 7;
        int minutesLeft = 43;
        int secondsLeft = 00;

        int secondsInTheDay = 86400;
        int secondsRemainingInTheDay = 27780;

        System.out.println("Seconds in a day:");
        System.out.println(24*60*60);
        System.out.println("Seconds past in the day:");
        System.out.println(hoursLeft*60*60+ minutesLeft*60+ secondsLeft);
        System.out.println("The remaining seconds of the day:");
        System.out.println(secondsInTheDay - secondsRemainingInTheDay );


        //24*60*60=86400
        //24 00 00 - 16 17 00
        //=07 43 00

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables


    }
}
