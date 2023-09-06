public class FunctionChecker {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset();
        long numberOfDays  = currentTime/864000000;
        System.out.println(getYear((int) numberOfDays));



    }
    public static int getYear(int numberOfDays) {
        int x = numberOfDays;
        int yearSince1970 = 0;
        int yearIndex = 0;
        while (x >= 365) {
            yearSince1970 += 1;
            yearIndex = 1970 + yearSince1970;
            if (isLeapYear(yearIndex)) {
                x -= 366;
            } else {
                x -= 365;
            }
        }
        String monthIndex = getMonthName(getMonth(x, yearIndex));
        System.out.println(monthIndex);
        return yearIndex;
    }
    private static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    private static int getMonth(int x, int yearIndex) {


        if (isLeapYear(yearIndex)){
            if (x <= 31){
                return 1;
            }if (x-31<=29) {
                return 2;
            }if (x-60<=31){
                return 3;
            }if (x-91<=30) {
                return 4;
            }if (x-121<=31) {
                return 5;
            }
            if (x-152<=30) {
                return 6;
            }
            if (x-182<=31) {
                return 7;
            }
            if (x-213<=31) {
                return 8;
            }
            if (x-244<=30){
                return 9;
            }
            if (x-274<=31){
                return 10;
            }
            if (x-305<=30){
                return 11;
            }
            if (x-335<=31) {
                return 12;
            }else {
                return 0;
            }

        }else {

            if (x <= 31) {
                return 1;
            }
            if (x - 31 <= 28) {
                return 2;
            }
            if (x - 59 <= 31) {
                return 3;
            }
            if (x - 90 <= 30) {
                return 4;
            }
            if (x - 120 <= 31) {
                return 5;
            }
            if (x - 151 <= 30) {
                return 6;
            }
            if (x - 181 <= 31) {
                return 7;
            }
            if (x - 212 <= 31) {
                return 8;
            }
            if (x - 243 <= 30) {
                return 9;
            }
            if (x - 273 <= 31) {
                return 10;
            }
            if (x - 304 <= 30) {
                return 11;
            }
            if (x - 334 <= 31) {
                return 12;
            } else {
                return 0;
            }
        }


    }
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "error";

        }
    }




}