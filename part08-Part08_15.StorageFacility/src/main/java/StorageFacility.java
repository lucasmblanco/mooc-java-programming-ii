import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if(!(storage.get(storageUnit) == null)){
            return storage.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item){
        if(storage.get(storageUnit).isEmpty()){
            storage.remove(storageUnit);
        } else {
            storage.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String unit : storage.keySet()){
            if(!(storage.get(unit).isEmpty())){
                units.add(unit);
            }
        }
        return units;
    }
}
