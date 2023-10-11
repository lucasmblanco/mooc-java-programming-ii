import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations(){
        this.dictionary  = new HashMap<>();
    }

    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> get(String word) {
        return dictionary.getOrDefault(word, null);

    }
    public ArrayList<String> translate(String word){
        if(!(this.dictionary.get(word) == null)){
            return this.dictionary.get(word);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String word){
        this.dictionary.remove(word);
    }

}
