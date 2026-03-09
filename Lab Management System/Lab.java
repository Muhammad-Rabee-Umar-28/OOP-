public class Lab {

    // Static Variables
    private static int counter = 1;
    private static String ID_Prefix = "LAB-";

    // Instance Variables
    private int id;
    private int totalComputers;
    private int bookedComputers;
    private Date labDate;
    private String uniName;
    private String depName;
    private String secName;
    private String labName;

    // Constructors
    public Lab() {
        this(3, 9, 2026);
    }

    public Lab(int day, int month, int year) {
        this(0, 0, day, month, year);
    }

    public Lab(int totalComputers, int bookedComputers, int day, int month, int year) {
        this(totalComputers, bookedComputers, "Unknown", "Unknown", "Unknown", "Unknown", day, month, year);
    }

    public Lab(String uniName, String depName, String secName, String labName, int day, int month, int year) {
        this(0, 0, uniName, depName, secName, labName, day, month, year);
    }

    public Lab(int totalComputers, int bookedComputers, String uniName, String depName, String secName,
            String labName, int day, int month, int year) {
        this.labDate = new Date(day, month, year);
        this.idGenerator();
        this.setTotalComputers(totalComputers);
        this.setBookedComputers(bookedComputers);
        this.setUniName(uniName);
        this.setDepName(depName);
        this.setSecName(secName);
        this.setLabName(labName);

    }

    // Copy Constructors
    public Lab(Lab other) {
        this.id = counter;
        counter++;
        this.labDate = new Date(other.labDate);
        this.totalComputers = other.totalComputers;
        this.bookedComputers = other.bookedComputers;
        this.uniName = other.uniName;
        this.depName = other.depName;
        this.secName = other.secName;
        this.labName = other.labName;

    }

    // Setters and Getters
    public void setTotalComputers(int totalComputers) {
        if (totalComputers >= 0) {
            this.totalComputers = totalComputers;

        }
    }

    public int getTotalComputers() {
        return this.totalComputers;
    }

    public void setBookedComputers(int bookedComputers) {
        if (bookedComputers >= 0) {
            this.bookedComputers = bookedComputers;

        }
    }

    public int getBookedComputers() {
        return this.bookedComputers;

    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getUniName() {
        return this.uniName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepName() {
        return this.depName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getSecName() {
        return this.secName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabName() {
        return this.labName;
    }

    public int getId() {
        return this.id;
    }

    // methods
    private void idGenerator() {
        this.id = counter;
        counter++;
    }

    public static int totalObjects() {
        return counter - 1;
    }

    public String bookComputers(int bookComputers) {
        if (this.totalComputers >= (this.bookedComputers + bookComputers)) {
            this.bookedComputers += bookComputers;
            return String.format("\nBooking has been done Successful \nAvailable Computers : %d",
                    this.availableComputers());
        } else {
            return String.format(
                    "\nBooking Unsuccessful\nBooking exceeded than total number of computers in the lab.\nAvailable Computers : %d",
                    this.availableComputers());
        }

    }

    public String cancelBooking(int cancelComputing) {
        if (cancelComputing <= this.bookedComputers && cancelComputing >= 0) {
            this.bookedComputers -= cancelComputing;
            return String.format("\nBooking Successfuly canceled. \nRemaining bookings: %d \nAvailable Computers: %d",
                    this.bookedComputers, this.availableComputers());

        } else {
            return String.format("\nInvalid Input given or Input Out of Range \nAvailable Computers : %d",
                    this.availableComputers());
        }
    }

    public int availableComputers() {
        return this.totalComputers - this.bookedComputers;
    }

    // equals
    public boolean equals(Lab other) {
        if (this.labName == other.labName && this.id == other.id) {
            return true;
        } else
            return false;
    }

    // toString
    public String toString() {
        return String.format("Lab %d Details :- \nLab ID                : " + ID_Prefix
                + "%d \nLab Name \t      : %s \nUniversity Name       : %s \nDepartment Name       : %s \nSection Name \t      : %s \nTotal Computers       : %d \nBooked Computers      : %d \nAvailable Computers   : %d\nLab Date              : %s \n \n-----------------------------------\n\n",
                this.id, this.id, this.labName, this.uniName, this.depName, this.secName, this.totalComputers,
                this.bookedComputers, this.availableComputers(), this.labDate);
    }
}
