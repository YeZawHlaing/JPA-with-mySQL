package com.example.library;


import jakarta.persistence.*;

@Entity
@Table
public class publisher {

    @Id
    @SequenceGenerator(
            name = "p_sequence",
            sequenceName = "p_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "p_sequence"

    )
    @Column(name = "p_ID",updatable = false)
    private int id;

    @Column
    private String p_name;

    @Column
    private String book;

    @Column
    private int date;

    public publisher() {

    }

    public publisher(int id, String p_name, String book, int date) {
        this.id = id;
        this.p_name = p_name;
        this.book = book;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "publisher{" +
                "id=" + id +
                ", p_name='" + p_name + '\'' +
                ", book='" + book + '\'' +
                ", date=" + date +
                '}';
    }
}
