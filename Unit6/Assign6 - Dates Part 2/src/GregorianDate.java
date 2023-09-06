public class GregorianDate extends Date{

    public GregorianDate() {
        day = 1;
        month = 1;
        year = 1970;
        long currentTime = System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset();
        long numberOfDays = currentTime / 86400000;
        addDays((int) numberOfDays);

    }

    public GregorianDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean isLeapYear() {
        int year = getYear();
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

}





