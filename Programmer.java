package javaLessons.workers;



public class Programmer extends Employee {

        public Programmer(double salary, int hoursWorked){
        this.setSalary(salary);
        this.setHoursWorked(hoursWorked);
        }

    @Override
    public double percentSalaryForOvertimeWork() {return 0;}

    @Override
    public double countSalary (){
        return  calculateRate () * getHoursWorked();
    }

}
