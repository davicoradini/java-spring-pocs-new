package com.parceirodenegocios.questions.api.domain;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    @OneToOne
    @JoinColumn(name = "requested_by_institution_id")
    @RestResource(path = "requestedByInstitution", rel = "requestedByInstitution")
    private Institution requestedByInstitution;

    @OneToOne
    @JoinColumn(name = "created_by_institution_id")
    @RestResource(path = "createdByInstitution", rel = "createdByInstitution")
    private Institution createdByInstitution;

    @ManyToMany(mappedBy = "questions")
    private List<Subject> subjects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Institution getRequestedByInstitution() {
        return requestedByInstitution;
    }

    public void setRequestedByInstitution(Institution requestedByInstitution) {
        this.requestedByInstitution = requestedByInstitution;
    }

    public Institution getCreatedByInstitution() {
        return createdByInstitution;
    }

    public void setCreatedByInstitution(Institution createdByInstitution) {
        this.createdByInstitution = createdByInstitution;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
