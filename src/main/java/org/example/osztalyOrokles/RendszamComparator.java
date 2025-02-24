package org.example.osztalyOrokles;

import java.text.Collator;
import java.util.Comparator;
//
public class RendszamComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto egyik, Auto masik) {
        Collator c = Collator.getInstance();
        return c.compare(egyik.getRendszam(), masik.getRendszam());
    }
}

