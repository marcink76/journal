package pl.coni.schooljournal.models;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "rodzic")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rodzica")
    private Long id;

    @Column(name = "imie")
    @Size(min = 2, max = 25)
    private String firstName;

    @Column(name = "nazwisko")
    @Size(min = 2, max = 25)
    private String lastName;

    @Column(name = "adres_rodzica")
    private Adress adress;
}
