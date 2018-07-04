package pl.coni.schooljournal.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "uczen")
public class Pupil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ucznia")
    private Long id;

    @Column(name = "imie")
    @Size(min = 2, max = 25)
    private String firstName;

    @Column(name = "nazwisko")
    @Size(min = 2, max = 25)
    private String lastName;

    @Column(name = "opiekun")
    private Set<Parent> parent;

    @Column(name = "adres_ucznia")
    private Adress adress;
}
