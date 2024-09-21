package employeeApp;

public class Employee {
    private int id;
    private  String fullName;
    private String email;
    private String password;
    private String[] healthplans;


    public void addHealthplan(int index , String name){

        if(index < 0 || index >= healthplans.length){
            System.out.println("There is no such index");
        } else if(healthplans[index] == null){
            healthplans[index]=name;
        } else {
            System.out.println("index full");
        }
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }


    public String toString() {
        return "Employee={" +
                "id:" + id +
                ", fullName:" + fullName +
                ", email:" + email +
                ", password:" + password +
                ", healthplans:" + healthplans +
                "}";
    }
}
