package gr.kouk.audiomanager;

import java.time.LocalDate;
import java.util.Date;

public class Image extends Mediafile {
    private int width;
    private int height;

    public Image(int id, String title, String filepath, String filetype, String description, String filesize, String quality, String dateOdArchive, String creator, Boolean availability, int width, int height) {
        super(id, title, filepath, filetype, description, filesize, quality, dateOdArchive, creator, availability);
        this.width = width;
        this.height = height;
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
        return  super.toString() +
                "Image{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public String toStringCSV(){
       return super.toStringCSV() + width +","+height;
    }
}
