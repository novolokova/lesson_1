package javaLessons.workers;


public abstract class Employee {

    public static final int WORK_HOURS_MONTH = 160;
    private int hoursWorked;
    private double salary;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void employeeInfo (){

        System.out.println("Работник:");
        System.out.println("Отработанно часов за месяц: " + getHoursWorked());
        System.out.println("Зарплата при 100% отработке: " + getSalary());
        System.out.println("Фиксированная ставка: " + calculateRate());
        System.out.println("Загруженность работника (в %) за месяц: " + percentHoursWorkedInMonth());
        if (getHoursWorked() >= WORK_HOURS_MONTH)
            System.out.println("Переработка в текущем месяце составляет: " + percentSalaryForOvertimeWork());
        else
            System.out.println("Недоработка в текущем месяце составляет: " + percentSalaryForOvertimeWork());
        System.out.println("ИТОГО: " + countSalary());
    }

    public double calculateRate () {  // ставкa в час
        return getSalary()/WORK_HOURS_MONTH;
    }

    public double percentHoursWorkedInMonth () {
        return (getHoursWorked()/(double)WORK_HOURS_MONTH)* 100;
    }

    public abstract double percentSalaryForOvertimeWork ();

    public abstract double countSalary();
}
