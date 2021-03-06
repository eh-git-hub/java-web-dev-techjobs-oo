package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //TODO: Add custom toString method
    @Override
    public String toString() {

        if(name.isBlank()){
            name = ("Data not available");
        }

        if(employer.getValue().isBlank()){
            employer.setValue("Data not available");
        }

        if(location.getValue().isBlank()){
            location.setValue("Data not available");
        }

        if(positionType.getValue().isBlank()){
            positionType.setValue("Data not available");
        }

        if(coreCompetency.getValue().isBlank()) {
            coreCompetency.setValue("Data not available");
        }


//        if(this.name.isBlank() && this.employer.getValue().isBlank() && this.location.getValue().isBlank() && this.positionType.getValue().isBlank() && this.coreCompetency.getValue().isBlank()) {
//            labelAndValue =
//                    "\n" + "ID: " + this.getId() +
//                            "\n" + "Name: " + "Data not available" +
//                            "\n" + "Employer: " + "Data not available" +
//                            "\n" + "Location: " + "Data not available" +
//                            "\n" + "Position Type: " + "Data not available" +
//                            "\n" + "Core Competency: " + "Data not available" + "\n";
//
//        }if(!this.name.isBlank() && !this.employer.getValue().isBlank() && !this.location.getValue().isBlank() && !this.positionType.getValue().isBlank() && !this.coreCompetency.getValue().isBlank()) {
//            labelAndValue = "\n" + "ID: " + this.getId() +
//                    "\n" + "Name: " + this.getName() +
//                    "\n" + "Employer: " + this.getEmployer() +
//                    "\n" + "Location: " + this.getLocation() +
//                    "\n" + "Position Type: " + this.getPositionType() +
//                    "\n" + "Core Competency: " + this.getCoreCompetency() + "\n";
//
//        }if(!this.name.isBlank() && this.employer.getValue().isBlank() && this.location.getValue().isBlank() && this.positionType.getValue().isBlank() && this.coreCompetency.getValue().isBlank()){
//            labelAndValue = "\n" + "ID: " + this.getId() +
//                    "\n" + "Name: " + "Data not available" +
//                    "\n" + "Employer: " + "Data not available" +
//                    "\n" + "Location: " + "Data not available" +
//                    "\n" + "Position Type: " + "Data not available" +
//                    "\n" + "Core Competency: " + "Data not available" + "\n";
//        }

//        if(this.name.isBlank()){
//            labelAndValue = "\n" + "ID: " + this.getId() +
//                    "\n" + "Name: " + "Data not available" +
//                    "\n" + "Employer: " + this.getEmployer() +
//                    "\n" + "Location: " + this.getLocation() +
//                    "\n" + "Position Type: " + this.getPositionType() +
//                    "\n" + "Core Competency: " + this.getCoreCompetency() + "\n";
//
//        }if(this.employer.getValue().isBlank()){
//            labelAndValue = "\n" + "ID: " + this.getId() +
//                    "\n" + "Name: " + this.getName() +
//                    "\n" + "Employer: " + "Data not available" +
//                    "\n" + "Location: " + this.getLocation() +
//                    "\n" + "Position Type: " + this.getPositionType() +
//                    "\n" + "Core Competency: " + this.getCoreCompetency() + "\n";
//
//        }if(this.location.getValue().isBlank()){
//            labelAndValue = "\n" + "ID: " + this.getId() +
//                    "\n" + "Name: " + this.getName() +
//                    "\n" + "Employer: " + this.getEmployer() +
//                    "\n" + "Location: " + "Data not available" +
//                    "\n" + "Position Type: " + this.getPositionType() +
//                    "\n" + "Core Competency: " + this.getCoreCompetency() + "\n";
//
//        }if(this.positionType.getValue().isBlank()){
//            labelAndValue = "\n" + "ID: " + this.getId() +
//                    "\n" + "Name: " + this.getName() +
//                    "\n" + "Employer: " + this.getEmployer() +
//                    "\n" + "Location: " + this.getLocation() +
//                    "\n" + "Position Type: " + "Data not available" +
//                    "\n" + "Core Competency: " + this.getCoreCompetency() + "\n";
//
//        }if(this.coreCompetency.getValue().isBlank()){
//            labelAndValue = "\n" + "ID: " + this.getId() +
//                    "\n" + "Name: " + this.getName() +
//                    "\n" + "Employer: " + this.getEmployer() +
//                    "\n" + "Location: " + this.getLocation() +
//                    "\n" + "Position Type: " + this.getPositionType() +
//                    "\n" + "Core Competency: " + "Data not available" + "\n";
//        }

       String labelAndValue =
                "\n" + "ID: " + this.getId() +
                        "\n" + "Name: " + name +
                        "\n" + "Employer: " + employer +
                        "\n" + "Location: " + location +
                        "\n" + "Position Type: " + positionType +
                        "\n" + "Core Competency: " + coreCompetency + "\n";

        return labelAndValue;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer employer) {

        this.employer = employer;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;
    }

    public PositionType getPositionType() {

        return positionType;
    }

    public void setPositionType(PositionType positionType) {

        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {

        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {

        this.coreCompetency = coreCompetency;
    }
}
