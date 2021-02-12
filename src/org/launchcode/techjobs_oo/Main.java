package org.launchcode.techjobs_oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

//        Job jobTest1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//        Job jobTest2 = new Job("Video Producer", new Employer("Donut Media"), new Location("Los Angeles, CA"), new PositionType("Video Producer"), new CoreCompetency("Make car videos"));
//        Job jobTest3 = new Job("", new Employer("Donut Media"), new Location("Los Angeles, CA"), new PositionType("Video Producer"), new CoreCompetency("Make car videos"));
//        Job jobTest4 = new Job("High School Teacher", new Employer(""), new Location("Rogers, AR"), new PositionType("Teacher"), new CoreCompetency("Teach"));
//        Job jobTest5 = new Job("Podcast Producer", new Employer("Youtube"), new Location(""), new PositionType("Producer"), new CoreCompetency("Make videos"));
//        Job jobTest6 = new Job("Construction Worker", new Employer("CAT"), new Location("Fayetteville, AR"), new PositionType(""), new CoreCompetency("Build"));
//        Job jobTest7 = new Job("Race Car Driver", new Employer("F1"), new Location("Turin, Italy"), new PositionType("Main Driver"), new CoreCompetency(""));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        for (Job job : jobs){
            System.out.println(job);
        }

//        System.out.println(jobTest1.toString());
//        System.out.println(jobTest2.toString());
//        System.out.println(jobTest3.toString());
//        System.out.println(jobTest4.toString());
//        System.out.println(jobTest5.toString());
//        System.out.println(jobTest6.toString());
//        System.out.println(jobTest7.toString());
    }

}
