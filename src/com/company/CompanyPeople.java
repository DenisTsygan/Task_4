package com.company;

import java.time.LocalDateTime;
import java.util.Random;

public class CompanyPeople {
    private String surname;
    private String name;
    private String patronymic;
    private String work;
    private String gender;
    private LocalDateTime employment_date;
    private int employment_date_year;


    CompanyPeople(){
    }

    CompanyPeople(String surname, String name, String patronymic, String gender, String work){
        this.setSurname(surname);
        this.setName(name);
        this.setPatronymic(patronymic);
        this.setGender(gender);
        this.setWork(work);
        Random random=new Random();
        this.employment_date=LocalDateTime.of(random.nextInt(32)+1980,random.nextInt(11)+1,random.nextInt(28)+1,0,0);
        employment_date_year=employment_date.getYear();

    }
    public int getEmployment_date_year() {
        return employment_date_year;
    }

    public String getEmployment_date() {
        return employment_date.getDayOfMonth()+"."+employment_date.getMonthValue()+"."+employment_date.getYear();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work =work.length()!=0? work:"out-of-work";
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender=gender.strip();
        if(gender.equalsIgnoreCase("m")||gender.equalsIgnoreCase("w")) {
            this.gender = gender;
        }
        else{
            this.gender= "undefined";
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = CorectName.CorectName(patronymic);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = CorectName.CorectName(name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = CorectName.CorectName(surname);
    }


}
