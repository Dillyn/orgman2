package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    private String testOrgCode, testOrg, email,fName,lName ;
    private String testUserEmail;



    @Test
    public void buildOrganisationUser() {
        this.testOrg = "admin";
        Organisation org = OrganisationFactory.buildOrganisation(this.testOrg);

        this.fName = "Dillyn";
        this.lName = "Lakey";
        this.email = "admin";
        User user = UserFactory.buildUser(email,fName,lName);

        this.testOrgCode =  org.getOrgCode();
        this.testUserEmail= user.getUserEmail();
        OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser(this.testOrgCode,this.testUserEmail);
        assertNotNull(orgUser);
    }

}