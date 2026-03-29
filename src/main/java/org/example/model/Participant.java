package org.example.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
    private List<Enrollment> enrollment;

}
