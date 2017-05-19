package hu.elte.projekteszkozok.dto;


import java.io.Serializable;
import java.util.Date;

public class NoteDTO implements Serializable {

    private static final long serialVersionUID = 7078854223322446071L;

    private Integer id;
    private String title;
    private String content;
    private Date lastModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}
