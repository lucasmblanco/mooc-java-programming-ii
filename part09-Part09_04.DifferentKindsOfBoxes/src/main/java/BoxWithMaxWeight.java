import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    private ArrayList<Item> itemList;
    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
        this.itemList = new ArrayList<>();
    }

    public int totalWeight(){
        int total = 0;
        for(Item item : itemList){
            total += item.getWeight();
        }
        return total;
    }

    @Override
    public void add(Item item){
        if(totalWeight() + item.getWeight() <= maxWeight){
            itemList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return itemList.contains(item);
    }
}
