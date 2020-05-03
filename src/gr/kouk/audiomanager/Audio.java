package gr.kouk.audiomanager;

import java.time.LocalDate;
import java.util.Date;

public class Audio extends Mediafile {
    private int duration;
    private Boolean ismusic;

    public Audio(int id, String title, String filepath, String filetype, String description, String filesize, String quality, String dateOdArchive, String creator, Boolean availability, int duration, Boolean ismusic) {
        super(id, title, filepath, filetype, description, filesize, quality, dateOdArchive, creator, availability);
        this.duration = duration;
        this.ismusic = ismusic;
    }

    public int getDuration() {
        return duration;
    }

    public Boolean getIsmusic() {
        return ismusic;
    }

    public void setIsmusic(Boolean ismusic) {
        this.ismusic = ismusic;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "duration=" + duration +
                ", ismusic=" + ismusic +
                '}';
    }

    public String toStringCSV(){
        return super.toStringCSV() + duration +","+ ismusic;
    }
}
