package com.company;

import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Task_1();
        Task_2();
    }


    /**
     * Базовый уровень
     * Поля класса:Фамилия,Группа,Год рождения,Оценка по физике,Оценка по математике,Оценка по информатике
     * Задача: Вычислить средний балл оценок студентов по физике
     * и напечатать фамилии, год рождения и оценки по
     * информатике всех студентов.
     */
    private static void Task_1() {
        Random random = new Random();

        Student st1= new Student(" ivanov",2,2999,34,5,3);
        Student st2 = new Student(Student.Surname.Smith, 4, 4, 44, 4, 4);
        Student st3 = new Student(Student.Surname.Anderson,
                random.nextInt(2) + 1,
                random.nextInt(2) + 2003,
                random.nextInt(100) + 1,
                random.nextInt(100) + 1,
                random.nextInt(100) + 1);
        Student st4 = new Student(Student.Surname.Anderson,
                random.nextInt(2) + 1,
                random.nextInt(2) + 2003,
                random.nextInt(100) + 1,
                random.nextInt(100) + 1,
                random.nextInt(100) + 1);
        Student st5 = new Student(Student.Surname.White,
                random.nextInt(2) + 1,
                random.nextInt(2) + 2003,
                random.nextInt(100) + 1,
                random.nextInt(100) + 1,
                random.nextInt(100) + 1);
        System.out.println("Средний балл оценок студентов по физике:" + (double) (st1.getMark_physic() + st2.getMark_physic() + st3.getMark_physic() + st4.getMark_physic() + st5.getMark_physic()) / 5);
        System.out.println("-------------");
        st1.get_info_student();
        System.out.println("-------------");
        st2.get_info_student();
        System.out.println("-------------");
        st3.get_info_student();
        System.out.println("-------------");
        st4.get_info_student();
        System.out.println("-------------");
        st5.get_info_student();
    }

    /**
     * Средний уровень
     * Поля класса:Фамилия,Имя,Отчество,Должность,Пол,Дата приёма на работу
     * Задача:Определить количество сотрудников пенсионного возраста
     * (мужчинам больше 65-ти лет, женщинам - 60).
     * --------------------------------------------------------------------
     * Для себя(стаж роботы должен быть для мужчин-35 лет,для женщин-30лет)
     */
    private static void Task_2() {

        Company people1 =new Company(" rebecca","  Peay","olegovich","v","Psychologist");
        Company people2 =new Company(" Baranov"," Maxim","Andreevich","m","Web-Programmer");
        Company people3 =new Company(" Gribova"," Sofia","Mikhailovna","W","Banker");
        Company people4 =new Company(" Morozov"," Mark","Ivanovich","M","engineer");
        Company people5 =new Company(" Lukyanov","Matvey","Davidovich","m","driver  ");
        Company people6 =new Company("Vlasova  Maria   Andreevna","W","broker");
        Company people7 =new Company(" Timofeeva Nadezhda Maksimovna","W","doctor");
       int count_retirement_age = retirement_age(people1)+retirement_age(people2)+retirement_age(people3)+retirement_age(people4)+retirement_age(people5)+retirement_age(people6)+retirement_age(people7);
       System.out.println("Количевство сотрудников пенсионного возраста="+count_retirement_age);
    }
    private static int retirement_age(Company people) {
        int retirement_age=0;
        if(people.getGender().equalsIgnoreCase("m")|| people.getGender().equalsIgnoreCase("w")){
            if (people.getGender().equalsIgnoreCase("m")) {
               if(2022- people.getEmployment_date_year()>35){
                   retirement_age+=1;
               }

            }
            else {
                if(2022- people.getEmployment_date_year()>30){
                    retirement_age+=1;
                }
            }
        }
        return retirement_age;
    }
}
