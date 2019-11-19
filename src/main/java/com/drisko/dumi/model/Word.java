package com.drisko.dumi.model;

import javax.persistence.*;

@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "word")
    private String word;
    @Column(name = "prefix_id")
    private Integer prefixId;

    public Word() {
    }

    public Word(Integer id, String word, Integer prefixId) {
        this.id = id;
        this.word = word;
        this.prefixId = prefixId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getPrefixId() {
        return prefixId;
    }

    public void setPrefixId(Integer prefixId) {
        this.prefixId = prefixId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", rootId=" + prefixId +
                '}';
    }
}
