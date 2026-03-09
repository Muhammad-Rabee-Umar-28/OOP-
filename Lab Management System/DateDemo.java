public class DateDemo {

    public static void main(String args[]) {

        Date d1 = new Date();
        Date d2 = new Date(12);
        Date d3 = new Date(14, 12);
        Date d4 = new Date(3, 9, 2026);
        Date d5 = new Date(d4); // Deep Copying a Constructor
        Date d6 = new Date(45, 18, 2026);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

    }

}
