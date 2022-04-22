package com.company;

import java.time.LocalDateTime;
import java.util.Arrays;

public class CompanyPeoples {
    private  final int YEAR_WORK_MAN = 35;
    private  final int YEAR_WORK_WOMAN = 30;
    private CompanyPeople[] CompanyPeoples;
    private int currentPeopleNumber;

    public CompanyPeoples(int peoplesNumber){
        this.CompanyPeoples= new CompanyPeople[peoplesNumber];
        currentPeopleNumber = -1;
    }

    public void addCompanyPeople( CompanyPeople people) {
        if (++currentPeopleNumber < CompanyPeoples.length) {
            CompanyPeoples[currentPeopleNumber] = people;
        }
    }
    public int getPeopleRetirementAge(){
        int count_retirement_age=0;
        for (CompanyPeople companyPeople:CompanyPeoples) {
            if(companyPeople.getGender().equalsIgnoreCase("m")|| companyPeople.getGender().equalsIgnoreCase("w")){
                if (companyPeople.getGender().equalsIgnoreCase("m")) {
                    if(LocalDateTime.now().getYear() - companyPeople.getEmployment_date_year()>YEAR_WORK_MAN){
                        count_retirement_age+=1;
                    }
                }
                else {
                    if(LocalDateTime.now().getYear()- companyPeople.getEmployment_date_year()>YEAR_WORK_WOMAN){
                        count_retirement_age+=1;
                    }
                }
            }
        }
        return count_retirement_age;
    }

}
