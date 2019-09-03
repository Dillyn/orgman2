package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    private String testOrg;

    @Test
    public void buildOrganisation() {
        this.testOrg = "admin";
        Organisation org = OrganisationFactory.buildOrganisation(this.testOrg);
        assertNotNull(org.getOrgCode());
    }
}