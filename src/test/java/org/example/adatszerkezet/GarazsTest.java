package org.example.adatszerkezet;
//
import org.example.osztalyOrokles.Auto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GarazsTest {
    @Test
    public void testNemLehetKetEgyformaAuto(){
        Auto a1 = new Auto("Lajos", UUID.randomUUID(),"fehér", 6,30000, "123LKH");
        Auto a2 = new Auto("Márta",UUID.randomUUID(),"piros", 5,30000,"123LKH");
        assertTrue(a1.getRendszam()!= a2.getRendszam());
        assertTrue(a1.getFerohely()!= a2.getFerohely());
    }
    @Test
    public void testCsakOTAutoAllhat(){
        Garazs garazs = new Garazs("Mária", UUID.randomUUID(), "piros", 5, 4000000, "123LKH",new ArrayList<>(),false,true);
        assertTrue(garazs.getFerohely()<=5);
    }
    @Test
    public void testGetterNemMukodikSetterkent(){
        Auto a2 = new Auto("Márta",UUID.randomUUID(),"piros", 5,30000,"123LKH");

    }
}
