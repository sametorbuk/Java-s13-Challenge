package employeeApp;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public void setId(int id) {
        this.id = id;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(int giro) {
     this.giro =  giro < 0 ? this.giro = 0 : giro;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }



    public void addEmployee(int index , String name){
        String[] developerNamess = new String[5];
        if(index < 0 || index > developerNamess.length){
            System.out.println("There is no index");
        }else if(developerNamess[index] != null ){
            System.out.println(" index  full");
        } else if(developerNamess[index] == null){
            developerNamess[index]= name;
        }
    }


    public String toString() {
        return "Company={" +
                "id:" + id +
                ", name:" + name +
                ", giro:" + giro +
                ", developerNames:" + developerNames +
                "}";
    }






}
