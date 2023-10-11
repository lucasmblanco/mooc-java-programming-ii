import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public String toString(){
        return this.history.toString();
    }

    public double maxValue(){
        if (history.isEmpty()) {
            return 0.0;
        }
        return Collections.max(this.history);
    }

    public double minValue(){
        if (history.isEmpty()) {
            return 0.0;
        }
        return Collections.min(this.history);
    }

    public double average(){
        int total = 0;
        if (history.isEmpty()) {
            return total;
        }
        for(double s : this.history){
            total += s;
        }
        return (double) total / this.history.size();
    }
}
