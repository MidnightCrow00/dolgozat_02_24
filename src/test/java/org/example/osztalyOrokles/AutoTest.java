package org.example.osztalyOrokles;

import org.junit.jupiter.api.Test;
//
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {
    @Test
    public void testEgyformaKetAuto(){
        //akkor legyen egyforma,ha a rendszamuk és a férőhelyük megegyezik
        Auto a1 = new Auto("Lajos", UUID.randomUUID(),"fehér", 6,30000, "123LKH");
        Auto a2 = new Auto("Márta",UUID.randomUUID(),"piros", 5,30000,"123LKH");
        assertEquals(a1.getRendszam(),a2.getRendszam());
        assertEquals(a1.getFerohely(),a2.getFerohely());
    }

    @Test
    public void testRendszamNagyobbMintHatBetuVagyKisebb(){
        Auto a2 = new Auto("Márta",UUID.randomUUID(),"piros", 5,30000,"123LK");
        //assertThrows(a2.setRendszam(a2.getRendszam()),() -> ,"Rendszám nem megfelelö");
    }
}
