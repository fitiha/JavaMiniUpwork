package accounts;

import enums.Profession;
import java.util.ArrayList;

public class User extends Account {
    private int id;
    private Profession jobType;
    private int experience;

    public ArrayList lookForEmployers() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profession getJobType() {
        return jobType;
    }

    public void setJobType(Profession jobType) {
        this.jobType = jobType;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
