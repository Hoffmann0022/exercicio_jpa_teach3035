package org.example.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate date;
    private String local;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Enrollment> enrollment;

}
