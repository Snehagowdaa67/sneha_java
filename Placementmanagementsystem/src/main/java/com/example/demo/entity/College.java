package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collegeName;
    private String location;

    @OneToMany(mappedBy = "college")
    private List<Student> students;

    public College() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() { return location; }
    public void setLocation(String location) {
        this.location = location;
    }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}