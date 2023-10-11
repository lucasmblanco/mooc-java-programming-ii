package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private String state;
    //private int parameter;

    public TemperatureSensor(){
        //this.parameter = parameter;
        this.state = "off";
    }
    @Override
    public boolean isOn(){
        return this.state.equals("on");
    }
    @Override
    public void setOn(){
        this.state = "on";
    }
    @Override
    public void setOff(){
        this.state = "off";
    }

    public int read(){
        if(isOn()){
            Random rand = new Random();
            int low = -30;
            int high = 30;
            return rand.nextInt(high - low ) + low;
        } else {
            throw new IllegalStateException();
        }
    }

}
