package com.company;

import java.util.Locale;

public class Student {
    public Student() {
    }

    public Student(Surname surname, int group, int year_birth, int mark_informatics, int mark_physic, int mark_mathematics) {
        this.setSur(surname);
        this.setGroup(group);
        this.setYear_birth(year_birth);
        this.setMark_informatics(mark_informatics);
        this.setMark_physic(mark_physic);
        this.setMark_mathematics(mark_mathematics);
    }

    public Student(String surname, int group, int year_birth, int mark_informatics, int mark_physic, int mark_mathematics) {
        this.setSurname(surname);
        this.setGroup(group);
        this.setYear_birth(year_birth);
        this.setMark_informatics(mark_informatics);
        this.setMark_physic(mark_physic);
        this.setMark_mathematics(mark_mathematics);

    }

    private String surname;
    private Surname sur;
    private int group;
    private int year_birth;
    private int mark_informatics;
    private int mark_physic;
    private int mark_mathematics;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname = surname.strip();
        if (Character.isUpperCase(surname.charAt(0))) {
            this.surname = surname;
        } else {
            this.surname = Character.toUpperCase(surname.charAt(0)) + surname.substring(1, surname.length());
        }
    }

    public Surname getSur() {
        return sur;
    }

    public void setSur(Surname sur) {
        this.sur = sur;
    }

    public int getMark_mathematics() {
        return mark_mathematics;
    }

    public void setMark_mathematics(int mark_mathematics) {
        if (mark_mathematics > 0 && mark_mathematics <= 100) {
            this.mark_mathematics = mark_mathematics;
        } else {
            this.mark_mathematics = -1;
        }
    }

    public int getMark_physic() {
        return mark_physic;
    }

    public void setMark_physic(int mark_physic) {
        if (mark_physic > 0 && mark_physic <= 100) {
            this.mark_physic = mark_informatics;
        } else {
            this.mark_physic = -1;
        }
    }

    public int getMark_informatics() {
        return mark_informatics;
    }

    public void setMark_informatics(int mark_informatics) {
        if (mark_informatics > 0 && mark_informatics <= 100) {
            this.mark_informatics = mark_informatics;
        } else {
            this.mark_informatics = -1;
        }
    }

    public int getYear_birth() {
        return year_birth;
    }

    public void setYear_birth(int year_birth) {
        if (year_birth > 1980 && year_birth < 2005) {
            this.year_birth = year_birth;
        } else {
            this.year_birth = -1;
        }
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        if(group<5){
        this.group = group;
        }
        else {
            this.group = -1;
        }
    }

    public void get_info_student() {
        if (sur != null) {
            System.out.println("Фамилия:" + sur +
                    "\nГод рождения:" + year_birth +
                    "\nОценка по информатике:" + mark_informatics);
        } else {
            System.out.println("Фамилия:" + surname +
                    "\nГод рождения:" + year_birth +
                    "\nОценка по информатике:" + mark_informatics);
        }
    }

    enum Surname {
        Smith, Johnson, Williams, Brown, Jones, Miller, Davis, Garcia, Rodriguez, Wilson, Martinez, Anderson, Taylor, Thomas, Hernandez, Moore, Martin, Jackson, Thompson, White
    }

}
