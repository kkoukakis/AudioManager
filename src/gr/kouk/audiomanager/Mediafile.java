package gr.kouk.audiomanager;

import java.time.LocalDate;

public class Mediafile {
    //FIELDS
    private int id;
    private String title;
    private String filepath;
    private String filetype;
    private String description;
    private String filesize;
    private String quality;
    private String dateOfArchive;
    private Boolean availability;
    private String creator;


    //CONSTRUCTOR
    public Mediafile(int id, String title, String filepath, String filetype, String description, String filesize, String quality, String dateOfArchive, String creator, Boolean availability) {
        this.id = id;
        this.title = title;
        this.filepath = filepath;
        this.filetype = filetype;
        this.description = description;
        this.filesize = filesize;
        this.quality = quality;
        this.dateOfArchive = dateOfArchive;
        this.availability = availability;
        this.creator = creator;
    }


    //SETTERS AND GETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDateOfArchive() {
        return dateOfArchive;
    }

    public void setDateOfArchive(String dateOfArchive) {
        this.dateOfArchive = dateOfArchive;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    //TO STRING
    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", filepath='" + filepath + '\'' +
                ", filetype='" + filetype + '\'' +
                ", description='" + description + '\'' +
                ", filesize='" + filesize + '\'' +
                ", quality='" + quality + '\'' +
                ", dateOdArchive=" + dateOfArchive +
                ", availability=" + availability +
                ", creator='" + creator + '\'' +
                "Type=";
    }

    public String toStringCSV(){

     return  id +
             "," + title +
             "," + filepath +
             "," + filetype +
             "," + description +
             "," + filesize +
             "," + quality +
             "," + dateOfArchive +
             "," + availability +
             "," + creator + ",";

    }



}
