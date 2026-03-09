public class Date {

    private int day;
    private int month;
    private int year;

    // Constructors
    public Date() {
        this(1);
    }

    public Date(int day) {
        this(day, 1);
    }

    public Date(int day, int month) {
        this(day, month, 2000);

    }

    public Date(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);

    }

    // Copy Constructors
    public Date(Date other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    // Getters and Setters
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }

    }

    public int getDay() {

        return this.day;

    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }

    }

    public int getMonth() {

        return this.month;

    }

    public void setYear(int year) {
        if (year > 2000 && year < 4000) {
            this.year = year;
        }

    }

    public int getYear() {

        return this.year;

    }

    // toString
    public String toString() {
        return String.format("%02d-%02d-%d", this.day, this.month, this.year);
    }

    // equals
    public boolean equals(Date other) {
        if (this.day == other.day && this.month == other.month && this.year == other.year)
            return true;
        else
            return false;
    }

}
