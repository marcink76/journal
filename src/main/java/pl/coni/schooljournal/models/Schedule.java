package pl.coni.schooljournal.models;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "plan_zajec")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planu_zajec")
    private Long id;

    @Column(name = "data_zajec")
    private LocalDate lessonData;

    @Column(name = "godzina_rozpoczecia")
    private LocalTime lessonStartTime;

    @Column(name = "czas_trwania")
    private final static Duration DURATION_TIME = Duration.ofMinutes(45);

    @Column(name = "grupa")
    private Group group;
}