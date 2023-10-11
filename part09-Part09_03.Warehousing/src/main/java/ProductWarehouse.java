public class ProductWarehouse extends Warehouse{
    private String name;
   // private double capacity;

    public ProductWarehouse(String name, double capacity){
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    @Override
    public String toString(){
        return this.name + ": " + super.toString();
    }
}
