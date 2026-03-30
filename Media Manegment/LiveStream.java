class LiveStream extends Video {
    private boolean isLive;
    private String streamerName;

    public LiveStream(String title, double fileSize, double duration,
            int frameRate, int resolution,
            boolean isLive, String streamerName) {
        super(title, fileSize, duration, frameRate, resolution);
        this.setLive(isLive);
        this.setStreamerName(streamerName);
    }

    public boolean getLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    public String getStreamerName() {
        return streamerName;
    }

    public void setStreamerName(String streamerName) {
        this.streamerName = streamerName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Streamer: " + this.getStreamerName());
        System.out.println("Live: " + this.getLive());

    }

    @Override
    public String toString() {

        return super.toString()
                + String.format("\nStreamer: %s \n Live: %b \n ", this.getStreamerName(), this.getLive());
    }
}