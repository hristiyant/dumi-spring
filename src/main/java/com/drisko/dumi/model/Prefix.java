package com.drisko.dumi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "prefixes")
public class Prefix {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "prefix")
    private String prefix;

    @Transient
    private List<Word> words;

    public Prefix() {
    }

    public Prefix(String prefix) {
        this.prefix = prefix;
    }

    public Prefix(Integer id, String prefix) {
        this.id = id;
        this.prefix = prefix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Prefix{" +
                "id=" + id +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}
