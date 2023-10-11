import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herdList;

    public Herd(){
        this.herdList = new ArrayList<>();
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        for(Movable e : herdList){
            string.append(e).append("\n");
        }
        return string.toString();
    }

    public void addToHerd(Movable movable){
        herdList.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable e : herdList){
            e.move(dx, dy);
        }
    }
}
