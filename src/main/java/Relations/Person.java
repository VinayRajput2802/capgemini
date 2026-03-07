package Relations;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String name;
    private LocalDate dob;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_dl")
    private DL dl;

    public Person(){}

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public int getPid() {
        return pid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public DL getDl() {
        return dl;
    }

    public void setDl(DL dl) {
        this.dl = dl;
    }
}
