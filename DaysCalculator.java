public class DaysCalculator {
    public static void main(String[] args) {
        int[] day1 = {14,10,2001};
        int[] day2 = {6,2,2026};

        int totalDays = Math.abs(convertToDays(day1) - convertToDays(day2));

        System.out.println(totalDays);
    }

    public static int convertToDays(int[] date){
        int days = date[0];
        int month = date[1];
        int year = date[2];

        int totalDays = days;

        for(int i=1;i<year;i++){
            totalDays += isLeapyear(i)?366:365;
        }

        for(int i=1;i<month;i++){
            totalDays += calculateMonthDays(i,year);
        }
        return totalDays;
    }

    private static int calculateMonthDays(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapyear(year) ? 29 : 28;
            default -> 0;
        };
    }

    public static boolean isLeapyear(int year){
        return (year%4==0 || (year%100 !=0 && year%400 ==0));
    }
}
