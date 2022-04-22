package com.company;


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

        Student st1= new Student("ivanov",6,2021,6000,5300,1233);
        Student st2= new Student(" ivanov");
        Student st3= new Student(" ivanov");
        Student st4= new Student(" ivanov");
        Student st5= new Student(" ivanov");

        Students students= new Students(5);

        students.addStudent(st1);
        students.addStudent(st2);
        students.addStudent(st3);
        students.addStudent(st4);
        students.addStudent(st5);
        System.out.println("Средняя оценка по физика="+students.getAverageMarkPhysic());
        System.out.println(students.get_info_student());

    }

    /**
     * Средний уровень
     * Поля класса:Фамилия,Имя,Отчество,Должность,Пол,Дата приёма на работу
     * Задача:Определить количество сотрудников пенсионного возраста
     * (мужчинам больше 65-ти лет, женщинам - 60).
     * --------------------------------------------------------------------
     * Для себя(стаж роботы должен быть  для мужчин-больше 35 лет,для женщин больше-30лет)
     */
    private static void Task_2() {

        CompanyPeople people1 = new CompanyPeople(" rebecca", "  Peay", "olegovich", "w", "Psychologist");
        CompanyPeople people2 = new CompanyPeople(" Baranov", " Maxim", "Andreevich", "m", "Web-Programmer");
        CompanyPeople people3 = new CompanyPeople(" Gribova", " Sofia", "Mikhailovna", "W", "Banker");
        CompanyPeople people4 = new CompanyPeople(" Morozov", " Mark", "Ivanovich", "M", "engineer");
        CompanyPeople people5 = new CompanyPeople(" Lukyanov", "Matvey", "Davidovich", "m", "driver  ");

        CompanyPeoples companyPeoples= new CompanyPeoples(5);

        companyPeoples.addCompanyPeople(people1);
        companyPeoples.addCompanyPeople(people2);
        companyPeoples.addCompanyPeople(people3);
        companyPeoples.addCompanyPeople(people4);
        companyPeoples.addCompanyPeople(people5);

        System.out.println("Количество сотрудников пенсионного возраста:"+companyPeoples.getPeopleRetirementAge());

    }
}
