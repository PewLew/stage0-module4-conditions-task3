package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float sal;
        if(salary < 0){
            System.out.println("wrong input!");
        }
        else if(salary > 20000){
            sal = (float) salary * 80 / 100;
            System.out.println(sal);
        }
        else if(salary > 10000 && salary <= 20000){
            sal = (float) salary * 82 / 100;
            System.out.println(sal);
        }
        else if(salary <= 10000){
            sal = (float) salary * 85 / 100;
            System.out.println(sal);
        }
    }
}
