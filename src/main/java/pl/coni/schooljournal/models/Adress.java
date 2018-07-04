package pl.coni.schooljournal.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "adres")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adresu")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "miejsce")
    @NotNull
    private Place place;

    @Column(name = "ulica")
    @NotNull(message = "Pole nie może być puste!")
    private String street;

    @Column(name = "numer_posesji")
    @Min(1)
    @NotNull
    private short posesionNumber;

    @Column(name = "numer_lokalu")
    @Min(1)
    private short localNumber;

    @Column(name = "miasto")
    @Size(min = 2, max = 25)
    @NotNull(message = "Pole nie może być puste!")
    private String city;

    @Column(name = "kod_pocztowy")
    @Pattern(regexp = "^[0-9]{2}-[0-9]{3}$", message = "Podaj własciwy kod pocztowy")
    @NotNull
    private String zipCode;





}
