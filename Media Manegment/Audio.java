public class Audio extends Media {

    private int bitrate;
    private String artist;

    Audio(String name, double fileSize, double duration, int bitrate, String artist) {
        super(name, fileSize, duration);
        this.setBitrate(bitrate);
        this.setArtist(artist);

    }

    // getters and setters
    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        if (bitrate >= 0)
            this.bitrate = bitrate;
        else {
            this.bitrate = 0;
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void display() {
        super.display();
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Bitrate: " + this.getBitrate());
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" \n  Artist: %s \n bitrate: %d  ", this.getArtist(), this.getBitrate());
    }

}
