package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

   private String orgCode, userEmail, roleId,email,fName,lName,testOrg,testRole;

   @Test
    public void buildUserRole() {
        this.fName = "Dillyn";
        this.lName = "Lakey";
        this.email = "dillynlakey@gmail.com";
        User user = UserFactory.buildUser(email,fName,lName);

       this.testOrg = "admin";
       Organisation org = OrganisationFactory.buildOrganisation(this.testOrg);

       this.testRole = "admin";
       Role role = RoleFactory.buildRole(this.testRole);



        this.orgCode = org.getOrgCode();
        this.userEmail= user.getUserEmail();
        this.roleId = role.getRoleId();


        UserRole userRole = UserRoleFactory.buildUserRole(orgCode, userEmail, roleId);
        assertNotNull(userRole);
       System.out.println(userRole);
       System.out.println(org);
        System.out.println(user);
        System.out.println(role);
    }
}