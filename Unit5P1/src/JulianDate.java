class JulianDate {
    private int year;
    private int month;
    private int day;
    public JulianDate() {
        day = 1;
        month = 1;
        year = 1;
        addDays(719164);
        long currentTime = System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset();
        long numberOfDays  = currentTime/86400000;
        addDays((int) numberOfDays);
    }
    public JulianDate(int year, int month, int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }

    Boolean isLeapYear() {
        int year = getYear();
        return year % 4 == 0;
    }

    private int getNumberOfDaysInMonth(int month) {
        int[] numberOfDays = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear()&&month==2) {
            return 29;
        } else {
            return numberOfDays[month - 1];
        }
    }
    public String getMonthName() {
        String[] monthName = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
        int month = getMonth();
        return monthName[month-1];
    }

    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    int getDayOfMonth() {
        return day;
    }
    public void printShortDate() {
        System.out.print(month+"/"+day+"/"+year);
    }
    public void printLongDate() {
        System.out.print(getMonthName()+" "+day+", "+year);
    }
    public void addDays(int numberOfDays) {
        while(numberOfDays!=0) {
            day++;
            if(day>getNumberOfDaysInMonth(month)) {
                month++;
                day=1;
                if(month>12) {
                    month=1;
                    day=1;
                    year++;
                }
            }
            numberOfDays--;
        }
    }
    public void subtractDays(int days) {
        while(days!=0) {
            day--;
            if(day<1) {
                month--;

                if(month<1) {
                    month=12;
                    day=31;
                    year--;
                }
                day=getNumberOfDaysInMonth(month);
            }
            days--;
        }
    }
}



