package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    private String fName;
    private String lName;
    private String email;

    @Test
    public void buildUser() {
        this.fName = "Dillyn";
        this.lName = "Lakey";
        this.email = "admin";
        User user = UserFactory.buildUser(email,fName,lName);
        assertNotNull(user);
    }
}