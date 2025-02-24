package org.example.osztalyOrokles;

import java.text.Collator;
import java.util.Comparator;
//
public class ArComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto egyik, Auto masik) {
        Collator c = Collator.getInstance();
        return c.compare(egyik.getAr(), masik.getAr());
    }
}

