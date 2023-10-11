import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
      for(LicensePlate license : registry.keySet()){
          if(license.equals(licensePlate)){
              return false;
          }
      }
      registry.put(licensePlate, owner);
      return true;
    }

    public String get(LicensePlate licensePlate){
        return registry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate){
        if(!(registry.containsKey(licensePlate))){
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates(){
        for(LicensePlate license : registry.keySet()){
            System.out.println(license);
        }
    }

    public void printOwners(){
        ArrayList<String> ownersArr = new ArrayList<>();
        for(String owner : registry.values()){
            if(!(ownersArr.contains(owner))){
                ownersArr.add(owner);
            }
        }

        for(String o : ownersArr){
            System.out.println(o);
        }
    }

}
