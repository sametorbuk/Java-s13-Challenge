
package employeeApp;

public enum Plan {;
    private  String name;
    private  double price;


    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Plan:{"+
                "name:"+ name +
                "price:"+ price;
    }
}
