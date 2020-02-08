package ro.facebook.model;

import java.util.Date;

public class PersonalInfo {
    private Date dateOfBirth;
    private String maritalStatus;
    private String sex;
    private String city;
    private String job;

    public PersonalInfo(Date dateOfBirth, String maritalStatus, String sex, String city, String job) {
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.sex = sex;
        this.city = city;
        this.job = job;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
