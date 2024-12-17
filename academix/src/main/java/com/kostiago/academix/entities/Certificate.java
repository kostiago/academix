package com.kostiago.academix.entities;

import java.time.Instant;

import com.kostiago.academix.entities.enums.CertificateStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant issueDate;

    private String certificationLink;
    private String courseName;
    private String issuerName;
    private String issuerCnpj;

    private CertificateStatus status;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
            @JoinColumn(name = "offer_id", referencedColumnName = "offer_id") })
    private Enrollment enrollment;

    public Certificate() {
    }

    public Certificate(Long id, Instant issueDate, String certificationLink, String courseName, String issuerName,
            String issuerCnpj, Course course, Enrollment enrollment, CertificateStatus status) {
        this.id = id;
        this.issueDate = issueDate;
        this.certificationLink = certificationLink;
        this.courseName = courseName;
        this.issuerName = issuerName;
        this.issuerCnpj = issuerCnpj;
        this.course = course;
        this.enrollment = enrollment;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Instant issueDate) {
        this.issueDate = issueDate;
    }

    public String getCertificationLink() {
        return certificationLink;
    }

    public void setCertificationLink(String certificationLink) {
        this.certificationLink = certificationLink;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getIssuerCnpj() {
        return issuerCnpj;
    }

    public void setIssuerCnpj(String issuerCnpj) {
        this.issuerCnpj = issuerCnpj;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public CertificateStatus getStatus() {
        return status;
    }

    public void setStatus(CertificateStatus status) {
        this.status = status;
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
        Certificate other = (Certificate) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
