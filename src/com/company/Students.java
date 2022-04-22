package com.company;



public class Students {
    private Student[] students;
    private int currentStudentNumber;

    public Students(int studentsNumber){
        this.students= new Student[studentsNumber];
        currentStudentNumber = -1;
    }

    public void addStudent( Student student) {
        if (++currentStudentNumber < students.length) {
            students[currentStudentNumber] = student;
        }
    }
    public double getAverageMarkPhysic(){
        double result = 0;
        for (final Student student : students) {
            if(student.getMark_informatics()!=0) {
                result += (double) student.getMark_physic();
            }
        }
        return  result/students.length;
    }
    public String get_info_student(){
        String result="";
        for (final Student student : students) {
                result += student.getSurname() + "," + student.getYear_birth() + "," + student.getMark_informatics() + ";" + System.lineSeparator();
        }
        return result;
    }
}
