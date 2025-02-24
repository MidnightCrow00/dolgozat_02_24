package org.example.osztalyOrokles;

import java.text.Collator;
import java.util.Comparator;
//
public class FerohelyComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto egyik, Auto masik) {
        Collator c = Collator.getInstance();
        return c.compare(egyik.getFerohely(), masik.getFerohely());
    }
}
