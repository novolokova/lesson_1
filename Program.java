package javaLessons.workers;



public class Program {

    public static void main(String[] args) {

        Programmer p = new Programmer( 19000,130);
        Programmer p1 = new Programmer( 15000,160);

        Manager m = new Manager(2000,160);
        Manager m1 = new Manager( 5000,180);


//        p.employeeInfo();
//        p1.employeeInfo();
//
//        m.employeeInfo();
//        m1.employeeInfo();

        Accountant accountant = new Accountant();
        Employee[] emp = new Employee[]{p, p1, m, m1};

        System.out.println("\nВЫПЛАЧЕНО СОТРУДНИКАМ В РАЗМЕРЕ: " + accountant.allSalary(emp));

    }

}
