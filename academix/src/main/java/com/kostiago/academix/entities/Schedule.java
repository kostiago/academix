package com.kostiago.academix.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.kostiago.academix.entities.enums.ScheduleType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant date;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private ScheduleType type;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "schedule")
    private Set<Lesson> lesson = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "tb_schedule_user", joinColumns = @JoinColumn(name = "schedule_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> user = new HashSet<>();

    public Schedule() {
    }

    public Schedule(Long id, Instant date, String description, ScheduleType type, Course course) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.type = type;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScheduleType getType() {
        return type;
    }

    public void setType(ScheduleType type) {
        this.type = type;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set<Lesson> getLesson() {
        return lesson;
    }

    public Set<User> getUsers() {
        return user;
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
        Schedule other = (Schedule) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
