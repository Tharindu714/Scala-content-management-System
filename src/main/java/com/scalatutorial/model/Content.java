//DBMS: MySQL (ver. 8.0.32)
//Case sensitivity: plain=lower, delimited=lower
//Driver: MySQL Connector/J (ver. mysql-connector-j-8.2.0 (Revision: 06a1f724497fd81c6a659131fda822c9e5085b6c), JDBC4.2)
//
//Ping: 32 ms
// SSL: yes

package com.scalatutorial.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contents")
public class Content {

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
    public Content() {}

    public Content(String title, String body, String author, Date createdAt) {
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
