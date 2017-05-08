package javaLessons.workers;



public class Manager extends Employee {

    public Manager (double salary, int hoursWorked) {

        this.setSalary(salary);
        this.setHoursWorked(hoursWorked);
    }

    @Override
    public double percentSalaryForOvertimeWork() {

        if (getHoursWorked() > WORK_HOURS_MONTH)
            return calculateRate ()*(getHoursWorked() - WORK_HOURS_MONTH);

        else if (getHoursWorked() < WORK_HOURS_MONTH)
            return calculateRate ()*(WORK_HOURS_MONTH - getHoursWorked());

        else return 0;
    }

    @Override
    public double countSalary() {

        if (getHoursWorked() > WORK_HOURS_MONTH)
                return getSalary() + percentSalaryForOvertimeWork();

       if (getHoursWorked() < WORK_HOURS_MONTH)
            return getSalary() - percentSalaryForOvertimeWork();

       return getSalary();
    }
}



