package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    @Test
    public void getSuffixFromClassName() {

     String SUFFIX = Helper.getSuffixFromClassName(GenderFactory.class);
     System.out.println(SUFFIX);

    }
}