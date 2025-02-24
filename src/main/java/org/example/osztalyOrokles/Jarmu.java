package org.example.osztalyOrokles;

import java.util.UUID;

public class Jarmu extends Tulajdonos{
    private UUID id;
    private String szin;
//
    public Jarmu(String nev, UUID id, String szin) {
        super(nev);
        this.id = id;
        this.szin = szin;
    }

    public UUID getId() {
        return id;
    }

    public String getSzin() {
        return szin;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "id=" + id +
                ", szin='" + szin + '\'' +
                '}';
    }
}
