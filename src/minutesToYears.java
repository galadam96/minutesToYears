public class minutesToYears {
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes< 0){
            System.out.println("Invalid Value");
        }
        else {

            long days = (minutes/60)/24;
            long years = days / 365;
            long remainDays = days % 365;
            //System.out.println(minutes +" min = "+ years + " y and " + remainDays+" d");
            System.out.printf("%d min = %d y and %d d", minutes, years, remainDays);
        }
    }
}
