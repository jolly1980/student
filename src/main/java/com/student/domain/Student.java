package com.student.domain;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Student.
 */
@Entity
@Table(name = "student")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Student implements Serializable {




    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "matrikelnummer", nullable = false)
    private Long matrikelnummer;

    @NotNull
    @Column(name = "nachnahme", nullable = false)
    private String nachnahme;

    @NotNull
    @Column(name = "vorname", nullable = false)
    private String vorname;

    @NotNull
    @Column(name = "strasse", nullable = false)
    private String strasse;

    @NotNull
    @Column(name = "plz", nullable = false)
    private Integer plz;

    @NotNull
    @Column(name = "ort", nullable = false)
    private String ort;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatrikelnummer() {
        return matrikelnummer;
    }

    public Student matrikelnummer(Long matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
        return this;
    }

    public void setMatrikelnummer(Long matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getNachnahme() {
        return nachnahme;
    }

    public Student nachnahme(String nachnahme) {
        this.nachnahme = nachnahme;
        return this;
    }

    public void setNachnahme(String nachnahme) {
        this.nachnahme = nachnahme;
    }

    public String getVorname() {
        return vorname;
    }

    public Student vorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse() {
        return strasse;
    }

    public Student strasse(String strasse) {
        this.strasse = strasse;
        return this;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public Integer getPlz() {
        return plz;
    }

    public Student plz(Integer plz) {
        this.plz = plz;
        return this;
    }

    public void setPlz(Integer plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public Student ort(String ort) {
        this.ort = ort;
        return this;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        if (student.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + getId() +
            ", matrikelnummer=" + getMatrikelnummer() +
            ", nachnahme='" + getNachnahme() + "'" +
            ", vorname='" + getVorname() + "'" +
            ", strasse='" + getStrasse() + "'" +
            ", plz=" + getPlz() +
            ", ort='" + getOrt() + "'" +
            "}";
    }
}
