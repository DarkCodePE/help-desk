package com.peterson.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity(name = "product")
@Table(name="solutions")
public class Solution {
    @Id
    @Column(name = "solution_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "TITLE", unique = true)
    @NotBlank(message = "Title can not be blank")
    private String title;

    @Column(name = "SUMMARY")
    @NotBlank(message = "Sort summary can not be blank")
    private String summary;

    @Column(name = "STATUS")
    private boolean status;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "chamado_id")
    private Chamado chamado;

    public Solution(Integer id, String title, String summary, boolean status, Chamado chamado) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.status = status;
        this.chamado = chamado;
    }

    public Solution() {
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(id, solution.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
