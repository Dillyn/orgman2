package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {
    private String testRace;

    @Test
    public void buildRace() {


        this.testRace = "South African";
        Race race = RaceFactory.buildRace(this.testRace);
        Assert.assertNotNull(race.getRaceId());

    }
}