package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000) {
            int a = (salary * 15) / 100;
            float sum = salary - a;
            System.out.println(sum);
        } else if (salary > 10000 && salary <= 20000) {
            int b = (salary * 18) / 100;
            float sum1 = salary - b;
            System.out.println(sum1);
        } else if (salary > 20000) {
            int c = (salary * 20) / 100;
            float sum2 = salary - c;
            System.out.println(sum2);
        } else if (salary < 0 ) {
            System.out.println("wrong input!");
        }
    }
}

