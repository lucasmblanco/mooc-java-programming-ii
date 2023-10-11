package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class SaveableDictionary {
    private Map<String, String > dictionary;
    private String file;

    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public boolean load(){
    try(Scanner reader = new Scanner(new File(this.file))){
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            String[] arrLine = line.split(":");
            add(arrLine[0], arrLine[1]);
        }
    } catch(Exception e) {
        return false;
    }
        return true;
    };

    public void add(String word, String translation){
        if(!(this.dictionary.containsKey(word))){
            this.dictionary.put(word, translation);
        }
    }

    public String translate(String word){
       for(String w : this.dictionary.keySet()){
           if(w.equals(word)){
               return this.dictionary.get(w);
           } else if(this.dictionary.get(w).equals(word)){
               return w;
           }
       }
        return null;
    };

    public void delete(String word){
        //this.dictionary.remove(word);
        /*Iterator<String> iterator = this.dictionary.keySet().iterator();
        while(iterator.hasNext()){
            String w = iterator.next();
            if(w.equals(word)){
                iterator.remove();
            } else if(this.dictionary.get(w).equals(word)){
                iterator.remove();
            }
        }*/
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        } else if(this.dictionary.containsValue(word)){
            this.dictionary.values().remove(word);
        }
    }

    public boolean save(){
        int index = 0;
        try(PrintWriter writer = new PrintWriter(new File(this.file))){
            for(String word : this.dictionary.keySet()){
                index++;
                writer.print(word);
                writer.print(":");
                writer.print(this.dictionary.get(word));
                if(!(index == this.dictionary.size())){
                    writer.println();
                }
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }

}
