public class Demo {

    public static void main(String[] args) {
        Media m = new Media("Generic Media", 500, 60);
        m.display();

        System.out.println("\n");
        Audio a = new Audio("Song", 5.5, 3.2, 320, "Artist A");
        a.display();
        System.out.println("\n");
        Video v = new Video("Movie", 1500, 120, 60, 1080);
        v.display();
        System.out.println("\n");
        Podcast p = new Podcast("Tech Talk", 45, 50, 128, "Speaker", "Host A", 10);
        p.display();
        System.out.println("\n");
        LiveStream ls = new LiveStream("Gaming Stream", 2000, 180, 60, 1080, true, "StreamerX");
        ls.display();
        System.out.println("\n");
    }

}
