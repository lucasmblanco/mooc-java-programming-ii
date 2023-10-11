public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory historyList = new ChangeHistory();
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        historyList.add(initialBalance);
    }

    public String history(){
        return historyList.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        historyList.add(super.getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount){
        double balance = super.getBalance();
        super.takeFromWarehouse(amount);
        historyList.add(super.getBalance());
        if(amount > super.getBalance()){
            return balance;
        }
        return amount;
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + historyList);
        System.out.println("Largest amount of product: " + historyList.maxValue());
        System.out.println("Smallest amount of product: " + historyList.minValue());
        System.out.println("Average: " + historyList.average());
    }
}
