package org.example.osztalyOrokles;
//
public class NemLetezoAutoException extends IllegalArgumentException {
    public NemLetezoAutoException() {
        System.out.println("Ez az auto nem létezik túl hosszú a rendszámma, vagy túl rövid.");
    }
}
