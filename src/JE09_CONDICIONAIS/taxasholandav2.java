package JE09_CONDICIONAIS;

public class taxasholandav2 {
    static void main(String[] args) {
        double salary = 40000.0;
        double Tax;
        final double SALARY_WITHOUT_TAX = salary;
        double firstTax = 9.70/100;
        double secondTax = 35.0/100;
        double thirdTax = 45.0/100;
        
        if (salary <= 34712.0) {
            Tax = salary * firstTax;
            salary -= Tax;
        } else if (salary > 32314 && salary <= 68507.0 ) {
            Tax = salary * secondTax;
            salary -= Tax;
        } else {
            Tax = salary * thirdTax;
            salary -= Tax;
        }

        System.out.println("Salario with tax: " + salary);
        System.out.println("Tax: " + Tax);
        System.out.println("Salario without tax: " + SALARY_WITHOUT_TAX);
    }
}
