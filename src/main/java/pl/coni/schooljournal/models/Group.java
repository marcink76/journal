package pl.coni.schooljournal.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupy")
    private Long id;

    @Column(name = "nazwa_grupy")
    @Size(min = 2, max = 15)
    @NotNull
    private String groupName;

    @Column(name = "uczniowie")
    @NotNull
    private Set<Pupil> pupils;
}
