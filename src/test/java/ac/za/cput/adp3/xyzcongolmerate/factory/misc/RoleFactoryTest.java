package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

   private String testRole;
    @Test
    public void buildRole() {
        this.testRole = "admin";
        Role role = RoleFactory.buildRole(this.testRole);
        assertNotNull(role.getRoleId());
    }
}