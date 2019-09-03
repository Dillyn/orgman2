package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    private String testName;


    @Test
    public void buildGender() {
        this.testName = "Male";
        Gender gender = GenderFactory.buildGender(this.testName);
        Assert.assertNotNull(gender.getGenderId());

    }
}