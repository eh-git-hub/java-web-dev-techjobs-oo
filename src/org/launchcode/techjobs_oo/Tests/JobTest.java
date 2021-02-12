package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void testSettingJobId(){
        Job constructionWorker = new Job(); //1
        Job deskWorker = new Job(); //2
        Job fastFoodWorker = new Job(); //3
        Job soccerPlayer = new Job(); //4

        assertEquals(1, deskWorker.getId() - constructionWorker.getId());
        assertEquals(2, fastFoodWorker.getId() - constructionWorker.getId());
        assertEquals(3, soccerPlayer.getId() - constructionWorker.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(productTester.getName(), "Product tester");
        assertEquals(productTester.getEmployer().getValue(), "ACME");
        assertEquals(productTester.getLocation().getValue(), "Desert");
        assertEquals(productTester.getPositionType().getValue(), "Quality control");
        assertEquals(productTester.getCoreCompetency().getValue(), "Persistence");

        assertTrue(productTester.getName() instanceof String);
        assertTrue(productTester.getEmployer() instanceof Employer);
        assertTrue(productTester.getLocation() instanceof Location);
        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job firstHospitalWorker = new Job("Nurse", new Employer("Kaiser Permanente"), new Location("California"), new PositionType("Staff"), new CoreCompetency("Provide Care"));
        Job secondHospitalWorker = new Job("Nurse", new Employer("Kaiser Permanente"), new Location("California"), new PositionType("Staff"), new CoreCompetency("Provide Care"));

        assertNotEquals(firstHospitalWorker, secondHospitalWorker);
    }

    @Test
    public void firstReq(){
        Job highSchoolTeacher = new Job("Teacher", new Employer("RHS"), new Location("Rogers, AR"), new PositionType("Staff"), new CoreCompetency("Teach"));

        String highSchoolTeacherStr = highSchoolTeacher.toString();

        assertTrue(highSchoolTeacherStr.startsWith("\n"));
        assertTrue(highSchoolTeacherStr.endsWith("\n"));
    }

    @Test
    public void secondReq(){
        Job navalOfficer = new Job("Naval Officer", new Employer("US Navy"), new Location("Quantico, VA"), new PositionType("Officer"), new CoreCompetency("Sail the seas"));

//        TODO: checks string should contain a label and each field has data
//        TODO: checks each field should be on its own line

        String navalOfficerStr = navalOfficer.toString();
        String[] navalOfficerArr = navalOfficerStr.split("\n");

        assertEquals("Name: " + navalOfficer.getName(), navalOfficerArr[2]);
        assertEquals("Employer: " + navalOfficer.getEmployer(), navalOfficerArr[3]);
        assertEquals("Location: " + navalOfficer.getLocation(), navalOfficerArr[4]);
        assertEquals("Position Type: " + navalOfficer.getPositionType(), navalOfficerArr[5]);
        assertEquals("Core Competency: " + navalOfficer.getCoreCompetency(), navalOfficerArr[6]);

    }

    //TODO: If a field is empty, the method should add, “Data not available” after the label.
    @Test
    public void thirdReq(){
        Job superHero2 = new Job("Super Hero", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String labelAndValue =
                "\n" + "ID: "  + "1" +
                        "\n" + "Name: " + "Super Hero" +
                        "\n" + "Employer: " + "Data not available" +
                        "\n" + "Location: " + "Data not available" +
                        "\n" + "Position Type: " + "Data not available" +
                        "\n" + "Core Competency: " + "Data not available" + "\n";
        assertEquals(labelAndValue, superHero2.toString());

    }

    //Todo: If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
//    @Test
//    public void fourthReq(){
//        Job bonusJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//
//    }
}
