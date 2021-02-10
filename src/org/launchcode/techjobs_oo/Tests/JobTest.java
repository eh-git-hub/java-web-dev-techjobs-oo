package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void testSettingJobId(){
        Job constructionWorker = new Job();
        Job deskWorker = new Job();
        Job fastFoodWorker = new Job();

        assertEquals(constructionWorker.getId(), 4);
        assertEquals(deskWorker.getId(), 5);
        assertEquals(fastFoodWorker.getId(), 6);

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
}

//    private String name;
//    private Employer employer;
//    private Location location;
//    private PositionType positionType;
//    private CoreCompetency coreCompetency;