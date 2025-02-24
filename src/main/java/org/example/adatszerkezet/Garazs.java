package org.example.adatszerkezet;

import org.example.osztalyOrokles.Auto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Garazs extends Auto {
    private ArrayList<String> jarmu;
    private boolean be,ki;

    public Garazs(UUID id, String szin, int rendszam, int ferohely, int ar, ArrayList<String> jarmu, boolean be, boolean ki) {
        super(id, szin, rendszam, ferohely, ar);
        this.jarmu = new ArrayList<>();
        this.be = be;
        this.ki = ki;
    }

    public ArrayList<String> getJarmu() {
        return jarmu;
    }

    public static void fajlbaIr(Path tempFile, List<String> sorok) throws IOException {
            Files.write(tempFile,sorok, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
    public static List<String> fajlbolOlvas(Path tempFile) throws IOException {
        return Files.readAllLines(tempFile);
    }
    public boolean isBe() {
        return be;
    }

    public boolean isKi() {
        return ki;
    }

    public void setJarmu(ArrayList<String> jarmu) {
        this.jarmu = jarmu;
    }

    public void setBe(boolean be) {
        this.be = be;
    }

    public void setKi(boolean ki) {
        this.ki = ki;
    }
    //    public void Iterable<T>(){
//
//    }
}
