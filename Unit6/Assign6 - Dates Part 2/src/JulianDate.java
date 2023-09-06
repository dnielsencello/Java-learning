public class JulianDate extends Date {

    public JulianDate() {
        day = 1;
        month = 1;
        year = 1;
        addDays(719164);
        long currentTime = System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset();
        long numberOfDays = currentTime / 86400000;
        addDays((int) numberOfDays);
    }
    public JulianDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    @Override
    public boolean isLeapYear() {
        int year = getYear();
        return year % 4 == 0;
    }
}



