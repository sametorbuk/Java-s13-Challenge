package employeeApp;


public class Main
{




    private static void workWithData ()
    {
        Company comp = new Company();
        HealthPlan plan = new HealthPlan(25 , "Samet" , "Premium");
        Employee emp = new Employee();

        String empString=emp.toString();
        String planString=plan.toString();
        String compString = comp.toString();

        System.out.println(empString);
        System.out.println(planString);
        System.out.println(compString);



        emp.setFullName("Samet");
        comp.addEmployee(2 , "Pelin");
        comp.addEmployee(1 , "Doğukan");

        comp.setGiro(-10);


        plan.setPlan("Demo");
        plan.setId(46);

    }


    public static void main(String[] args)
    {
        workWithData();
    }
}
