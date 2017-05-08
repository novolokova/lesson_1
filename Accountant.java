package javaLessons.workers;


public class Accountant {

    public int allSalary(Employee[] employeers) {
        int sum = 0;
        for (int i = 0; i < employeers.length; i++) {
            sum += employeers[i].countSalary();
        }
        return sum;
    }

}

