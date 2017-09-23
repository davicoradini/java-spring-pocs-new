package com.parceirodenegocios.questions.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "requestedByInstitution")
    @JsonIgnore
    private Question requestedQuestion;

    @OneToOne(mappedBy = "createdByInstitution")
    private Question createdQuestion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question getRequestedQuestion() {
        return requestedQuestion;
    }

    public void setRequestedQuestion(Question requestedQuestion) {
        this.requestedQuestion = requestedQuestion;
    }

    public Question getCreatedQuestion() {
        return createdQuestion;
    }

    public void setCreatedQuestion(Question createdQuestion) {
        this.createdQuestion = createdQuestion;
    }
}
