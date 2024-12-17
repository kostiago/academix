package com.kostiago.academix.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "course_img_id", nullable = false)
    private CourseImages courseImg;

    @OneToOne(mappedBy = "course")
    private Certificate certificate;

    @OneToMany(mappedBy = "course")
    private Set<Offer> offers = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private Set<Schedule> schedules = new HashSet<>();

    public Course() {
    }

    public Course(Long id, String name, CourseImages courseImg, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.courseImg = courseImg;
        this.certificate = certificate;
    }

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

    public CourseImages getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(CourseImages courseImg) {
        this.courseImg = courseImg;
    }

    public Set<Offer> getOffers() {
        return offers;
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
