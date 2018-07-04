package pl.coni.schooljournal.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oceny")
    private Long id;

    @Column(name = "uczen")
    private Pupil pupil;

    @Column(name = "lekcja")
    private Lesson lesson;

    @Column(name = "ocena")
    @Min(1)
    @Max(6)
    private short value;
}
