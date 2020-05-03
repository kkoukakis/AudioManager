package gr.kouk.audiomanager;

import java.time.LocalDate;
import java.util.Date;

public class Video extends Mediafile {
    private int duration;
    private int width;
    private int height;

    public Video(int id, String title, String filepath, String filetype, String description, String filesize, String quality, String dateOfArchive, String creator, Boolean availability, int duration, int width, int height) {
        super(id, title, filepath, filetype, description, filesize, quality, dateOfArchive, creator, availability);
        this.duration = duration;
        this.width = width;
        this.height = height;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
    public String toStringCSV() {

            return super.toStringCSV() + duration+ ","+ width +","+height;

    }
}
