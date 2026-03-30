public class Media {

    private String title;
    private double fileSize;
    private double duration;

    // Constructor chaining
    Media(String title, double fileSize, double duration) {
        this.setTitle(title);
        this.setFileSize(fileSize);
        this.setDuration(duration);
    }

    // Setters and getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        if (fileSize >= 0)
            this.fileSize = fileSize;
        else {
            this.fileSize = 0;
        }
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration >= 0) {
            this.duration = duration;
        } else {
            this.duration = 0;
        }

    }

    // Methods
    public void pause() {
        System.out.println("Media Paused");
    }

    public void stop() {
        System.out.println("Media Stopped");

    }

    public void play() {
        System.out.println("Media Played");
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Duration: " + duration + " minutes");
    }

    public String toString() {

        return String.format("Media Title: %s \n Media file size: %f  \n  Media duration: %f", this.getTitle(),
                this.getFileSize(), this.getDuration());
    }

}
