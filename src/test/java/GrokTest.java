import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrokTest {

    @Test
    @DisplayName("[4] Test isDead")
    void isDead() {
        Grok grok = new Grok();
        assertFalse(grok.isDead(),"A Grok should be alive when instantiated!");
        grok = new Grok(75);
        assertFalse(grok.isDead(),"A Grok should be alive when instantiated with a positive power level!");
        grok = new Grok(0);
        assertTrue(grok.isDead(),"A Grok should be dead when instantiated with a zero power level!");
        grok = new Grok(-5);
        assertTrue(grok.isDead(),"A Grok should be dead when instantiated with a negative power level!");
        grok = new Grok(1000);
        String expected = "Grok:(100,true)";
        String actual = grok.toString();
        String message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
        grok = new Grok(95);
        PowerPill pill = new PowerPill("Blue", 10);
        grok.takePowerPill(pill);
        expected = "Grok:(100,true)";
        actual = grok.toString();
        message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
    }

    @Test
    @DisplayName("[10] Test setPowerLevel")
    void setPowerLevel() {
        Grok grok = new Grok(0);
        grok.setPowerLevel(75);
        String expected = "Grok:(0,false)";
        String actual = grok.toString();
        String message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
        grok.setPowerLevel(120);
        expected = "Grok:(0,false)";
        actual = grok.toString();
        message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
        grok.setPowerLevel(101);
        expected = "Grok:(0,false)";
        actual = grok.toString();
        message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
        grok.setPowerLevel(-5);
        expected = "Grok:(0,false)";
        actual = grok.toString();
        message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
    }

    @Test
    @DisplayName("[1] Test takePowerPill")
    void takePowerPill() {
        Grok grok = new Grok(75);
        PowerPill pill10 = new PowerPill("Ten",10);
        PowerPill pill30 = new PowerPill("Thirty",30);
        grok.takePowerPill(pill10);
        String expected = "Grok:(85,true)";
        String actual = grok.toString();
        String message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
        grok.takePowerPill(pill30);
        expected = "Grok:(100,true)";
        actual = grok.toString();
        message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
        grok = new Grok(3);
        grok.tookHit();
        PowerPill pill = new PowerPill("Green",20);
        grok.takePowerPill(pill);
        expected = "Grok:(0,false)";
        actual = grok.toString();
        message = "A dead Grok cannot come back to life!\nExpecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
    }

    @Test
    @DisplayName("[1] Test tookHit")
    void tookHit() {
        Grok grok = new Grok(8);
        grok.tookHit();
        String expected = "Grok:(3,true)";
        String actual = grok.toString();
        String message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
        grok.tookHit();
        expected = "Grok:(0,false)";
        actual = grok.toString();
        message = "Expecting "+expected+" and got "+actual;
        assertEquals(expected, actual,message);
    }
}