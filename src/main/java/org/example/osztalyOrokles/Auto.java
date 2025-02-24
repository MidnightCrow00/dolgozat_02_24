package org.example.osztalyOrokles;

import java.util.UUID;

public class Auto extends Jarmu implements Comparable<Auto>{
    private int ferohely, ar;
    private String rendszam;

    public Auto(String nev, UUID id, String szin, int ferohely, int ar, String rendszam) {
        super(nev, id, szin);
        this.ferohely = ferohely;
        this.ar = ar;
        this.rendszam = rendszam;
        setRendszam(rendszam);
    }


    //RENDEZÉS:
    public static RendszamComparator rendezRendszam(){
        return new RendszamComparator();
    }
    public static FerohelyComparator rendezFerohely(){
        return new FerohelyComparator();
    }
    public static ArComparator rendezAr(){
        return new ArComparator();
    }

    public String getRendszam() {
       return "";
    }

    public int getFerohely() {
        return ferohely;
    }

    public int getAr() {
        return ar;
    }
    //Kivétel:
    public void setRendszam(String rendszam) {
        if(rendszam == String.valueOf(6)){
            throw new NemLetezoAutoException();
        }else{
            this.rendszam=rendszam;
        }
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public int compareTo(Auto o) {
        return 0;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Auto ujAuto = new Auto(UUID.randomUUID(), this.getId());
//        return ujAuto;
//    }
}
