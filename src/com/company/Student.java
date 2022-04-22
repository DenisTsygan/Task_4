package com.company;


import java.util.Random;

public class Student {
    public Student() {
    }



    public Student(String surname, int group, int year_birth, int mark_informatics, int mark_physic, int mark_mathematics) {
        this.setSurname(surname);
        this.setGroup(group);
        this.setYear_birth(year_birth);
        this.setMark_informatics(mark_informatics);
        this.setMark_physic(mark_physic);
        this.setMark_mathematics(mark_mathematics);

    }
    public Student(String surname){
        Random random=new Random();
        this.setSurname(surname);
        this.setGroup(random.nextInt(100)+1);
        this.setYear_birth(random.nextInt(20)+1990);
        this.setMark_informatics(random.nextInt(100)+1);
        this.setMark_physic(random.nextInt(100)+1);
        this.setMark_mathematics(random.nextInt(100)+1);
    }

    private String surname;
    private int group;
    private int year_birth;
    private int mark_informatics;
    private int mark_physic;
    private int mark_mathematics;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
            this.surname = CorectName.CorectName(surname);
    }


    public int getMark_mathematics() {
        return mark_mathematics;
    }

    public void setMark_mathematics(int mark_mathematics) {
        this.mark_mathematics = isMark(mark_mathematics)? mark_mathematics:0;
    }

    public int getMark_physic() {
        return mark_physic;
    }

    public void setMark_physic(int mark_physic) {
        this.mark_physic = isMark(mark_physic)? mark_physic:0;
    }

    public int getMark_informatics() {
        return mark_informatics;
    }

    public void setMark_informatics(int mark_informatics) {
        this.mark_informatics = isMark(mark_informatics)? mark_informatics:0;
    }

    public int getYear_birth() {
        return year_birth;
    }

    public void setYear_birth(int year_birth) {
        if (year_birth > 1980 && year_birth < 2005) {
            this.year_birth = year_birth;
        } else {
            this.year_birth = 0;
        }
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        if(group < 60){
        this.group = group;
        }
        else {
            this.group = -1;
        }
    }
    private boolean isMark(int mark){
        if (mark > 0 && mark <= 100) {
            return true;
        } else {
            return false;
        }
    }
}
