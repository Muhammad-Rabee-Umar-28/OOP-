public class Podcast extends Audio {

    private String hostName;
    private int episodeNo;

    Podcast(String name, double fileSize, double duration, int bitrate, String artist, String hostName, int episodeNo) {
        super(name, fileSize, duration, bitrate, artist);
        this.setHostName(hostName);
        this.setEpisodeNo(episodeNo);

    }

    // Setters and getters
    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getEpisodeNo() {
        return this.episodeNo;
    }

    public void setEpisodeNo(int episodeNo) {
        this.episodeNo = episodeNo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Host name: " + this.getHostName());
        System.out.println("Episode no: " + this.getEpisodeNo());
    }

    @Override
    public String toString() {

        return super.toString()
                + String.format("\nHost name: %s \n Episode no: %d", this.getHostName(), this.episodeNo);
    }

}
