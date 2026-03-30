public class Video extends Media {

    private int frameRate;
    private int resolution;

    Video(String name, double fileSize, double duration, int framRate, int resolution) {
        super(name, fileSize, duration);
        this.setFrameRate(framRate);
        this.setResolution(resolution);
    }

    // setters and getters
    public int getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(int frameRate) {
        if (frameRate >= 30)
            this.frameRate = frameRate;
        else {
            this.frameRate = 30;
        }
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        if (resolution >= 360)
            this.resolution = resolution;
        else {
            this.resolution = 360;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Framerate = " + this.getFrameRate());
        System.out.println("Resolution = " + this.getResolution());

    }

    @Override
    public String toString() {

        return super.toString()
                + String.format("\n Frame Rate: %d \n Resolution: %d \n", this.getFrameRate(), this.getResolution());
    }

}
