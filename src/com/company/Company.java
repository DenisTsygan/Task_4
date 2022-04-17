package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Company {
    private String surname;
    private String name;
    private String patronymic;
    private String gender;
    private String work;
    private GregorianCalendar employment_date;
    private int employment_date_year;
    Company(){
    }

    public int getEmployment_date_year() {
        return employment_date_year;
    }

    Company(String surname, String name, String patronymic, String gender, String work){
        this.setSurname(surname);
        this.setName(name);
        this.setPatronymic(patronymic);
        this.setGender(gender);
        this.setWork(work);
        Random random = new Random();
        this.setEmployment_date(random.nextInt(20)+1980, random.nextInt(12)+1, random.nextInt(31)+1 );
    }
    Company(String name_full,String gender,String work){
        name_full=name_full.strip();
        while (name_full.contains("  ")) {
            name_full = name_full.replace("  ", " ");
        }
        String[] fio = name_full.split(" ");
        this.setSurname(fio[0]);
        this.setName(fio[1]);
        this.setPatronymic(fio[2]);
        this.setGender(gender);
        this.setWork(work);
        Random random = new Random();
        this.setEmployment_date(random.nextInt(22)+2000, random.nextInt(12)+1, random.nextInt(31)+1 );
    }
    public String getEmployment_date() {
        return employment_date.get(Calendar.YEAR)+"."+employment_date.get(Calendar.MONTH)+ "."+employment_date.get(Calendar.DAY_OF_MONTH);
    }


    public void setEmployment_date(int year, int month,int day) {
        this.employment_date_year=year;
        this.employment_date = new GregorianCalendar(year,month,day);
    }

    public String getWork() {
        return work;
    }


    public void setWork(String work) {
        if (work.length()!=0){
        this.work = work;
        }
        else {
            this.work="out-of-work";
        }
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
        patronymic=CorrectFullName(patronymic);
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name=CorrectFullName(name);
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname=CorrectFullName(surname);
        this.surname = surname;
    }
    private String CorrectFullName(String str){
        str=str.strip();
        if (!Character.isUpperCase(str.charAt(0))) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length());
        }
        return str;
    }
    @Override
    public String toString() {
        return "Company{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", gender='" + gender + '\'' +
                ", work='" + work + '\'' +
                ", employment_date=" + employment_date.get(Calendar.YEAR)+"."+employment_date.get(Calendar.MONTH)+ "."+employment_date.get(Calendar.DAY_OF_MONTH) +
                '}';
    }
}
