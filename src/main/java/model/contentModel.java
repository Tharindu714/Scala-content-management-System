package model;

import javax.persistence.*;
import java.util.Date;

public class contentModel {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(length = 10000)
    private String body;

    private String author;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    // Constructors
    public contentModel() {}

    public contentModel(String title, String body, String author, Date createdAt) {
        this.title = title;
        this.body = body;
        this.author = author;
        this.createdAt = createdAt;
    }

    // Getters and setters
    public int getId() { return id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
}
