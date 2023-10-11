import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsContaner ;

    public Abbreviations(){
        this.abbreviationsContaner = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationsContaner.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return abbreviationsContaner.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        if(hasAbbreviation(abbreviation)){
            return abbreviationsContaner.get(abbreviation);
        } else {
            return null;
        }
    }
}
