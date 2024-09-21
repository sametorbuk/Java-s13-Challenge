package employeeApp;

public class HealthPlan {
       private int id;
       private  String name;
       private String plan;

       public HealthPlan(int id, String name, String plan) {
              this.id = id;
              this.name = name;
              this.plan = plan;
       }

       public void setId(int id) {
              this.id = id;
       }

       public void setPlan(String plan) {
              this.plan = plan;
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

       public String getPlan() {
              return plan;
       }



       public  String toString() {
              return "Healthplan={" +
                      "id:" + id +
                      ", name:" + name +
                      ", plan:" + plan +
                      "}";
       }







}
