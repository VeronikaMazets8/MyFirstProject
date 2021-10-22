package com.company;

class Employee {
    private String department;
    private Integer number;
    private String name;
    private String job;
    private String salary;
    private String totalCost;

    //      private static class Salary {
    //         private Double value;
    //      private String currency;

    //       public Double getValue() {
    //            return value;
    //       }

    //        public void setValue(Double value) {
    //           this.value = value;
    //       }

    //     public String getCurrency() {
    //            return currency;
    //       }
//
    //        public void setCurrency(String currency) {
    //           this.currency = currency;
    //     }


    //         public void setSalary(Double valueOf) {
    //        }


    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public Integer getNumber() {

        return number;
    }

    public void setNumber(Integer number) {

        this.number = number;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {

        this.job = job;
    }
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary + '\'' +
                '}';


    }
}