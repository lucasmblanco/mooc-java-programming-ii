import java.util.ArrayList;

public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> boxList;

    public Box(double capacity){
        this.maximumCapacity = capacity;
        this.boxList = new ArrayList<>();
    }

    public double weight(){
        double total = 0;
        for(Packable item : boxList){
            total += item.weight();
        }
        return total;
    }

    public void add(Packable item){
        if(weight() + item.weight() <= maximumCapacity){
            boxList.add(item);
        }
    }

    @Override
    public String toString(){
        return "Box: " + this.boxList.size() + " items," + " total weight " + this.weight() + " kg";
    }

}
