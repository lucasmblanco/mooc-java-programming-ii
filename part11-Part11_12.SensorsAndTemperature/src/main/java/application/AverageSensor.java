package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> averages;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn(){
        return sensors.stream().allMatch(Sensor::isOn);
    };
    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    };

    @Override
    public void setOff(){
        sensors.forEach(Sensor::setOff);
    };

    public List<Integer> readings(){
        return averages;
    }
    @Override
    public int read(){
        if(isOn()){
            int avg = (int) sensors.stream().mapToInt(Sensor::read).average().orElseThrow(IllegalStateException::new);
            averages.add(avg);
            return avg;
        } else {
            throw new IllegalStateException();
        }
    }
}
