package pl.coni.schooljournal.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "lekcja")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lekcji")
    private Long id;

    @Column(name = "data")
    private LocalDate lessonDate;

    @Column(name = "czas_lekcji")
    private LocalTime lessonTime;

    @Column(name = "obecni_na_lekcji")
    private Set<Pupil> pupils;

    @Column(name = "temat_lekcji")
    @NotNull
    private String topic;
}
