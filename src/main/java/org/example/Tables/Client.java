package org.example.Tables;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;
    private String name;
    private String surname;
    private String PhoneNumber;

    public String getName() {return name;}
    public String getSurname(){return surname;}
    public String getNumber(){return PhoneNumber;}
}




