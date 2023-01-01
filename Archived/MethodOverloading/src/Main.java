/**
 * Method Overloading is a feature that allows us to have more than one method
 * with the same name, so long we use different parameters.
 */

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        //Method Overloading
//        System.out.println(calculateScore("Uday", 500));
//        System.out.println(calculateScore(10));
//        calculateScore();
//        System.out.println(LocalDateTime.now());
        System.out.println(getDurationString(65, 45));
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score + " points" );
        return score * 1000;
    } public static int calculateScore(int score) {
        System.out.println("unnamed Player scored " + score);
        return score * 1000;
    } public static void calculateScore() {
        System.out.println("No Player scored");
    }
    public static double calcFeetAndInchesToCentimeters(double param1, double param2) {
        return param1 * param2;
    }

    private static String getDurationString(long minutes, long seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59)
        return "Invalid value";
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
    private static String getDurationString(long seconds) {
        if(seconds < 0) return "Invalid value";
        long minutes = seconds/ 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}