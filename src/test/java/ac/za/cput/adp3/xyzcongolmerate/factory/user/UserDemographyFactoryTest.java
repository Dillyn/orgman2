package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

     private String userEmail, userTitle, genderId, raceId,testName, email,fName,lName,testRace;
     private Date dateOfBirth;



    @Test
    public void buildUserDemography() {
        this.fName = "Dillyn";
        this.lName = "Lakey";
        this.email = "dillynlakey@gmail.com";
        User user = UserFactory.buildUser(email,fName,lName);


        this.testName = "Male";
        Gender gender = GenderFactory.buildGender(this.testName);


        this.testRace = "South African";
        Race race = RaceFactory.buildRace(this.testRace);


        this.userEmail = user.getUserEmail();
        this.userTitle= "Mr";
        this.genderId = gender.getGenderId();
        this.raceId= race.getRaceId();
        this.dateOfBirth = new Date();


        UserDemography userDem = UserDemographyFactory.buildUserDemography(userEmail, userTitle, genderId, raceId, dateOfBirth);
        assertNotNull(userDem);
        System.out.println(userDem);
        System.out.println(user);
        System.out.println(race);
    }
}