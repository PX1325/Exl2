package org.example.Tables;

import javax.persistence.*;

@Entity
@Table(name = "masters")
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaster;

    private String name;
    private String surname;
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}

