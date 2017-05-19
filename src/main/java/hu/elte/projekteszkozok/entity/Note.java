package hu.elte.projekteszkozok.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Note implements Serializable {

    private static final long serialVersionUID = -2869058760072865487L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 160)
    private String title;

    @Column(length = 1000)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModified;

    public Note() {
    }

    public Note(String title, String content, Date lastModified) {
        this.title = title;
        this.content = content;
        this.lastModified = lastModified;
    }

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

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", lastModified=" + lastModified +
                '}';
    }
}
