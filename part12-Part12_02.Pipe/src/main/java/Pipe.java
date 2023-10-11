import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipe;

    public Pipe(){
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipe.add(value);
    }

    public T takeFromPipe(){
        if(!isInPipe()){
            return null;
        }
        T oldest = this.pipe.get(0);
        this.pipe.remove(0);
        return oldest;
    }

    public boolean isInPipe(){
        return this.pipe.size() > 0;
    }
}
