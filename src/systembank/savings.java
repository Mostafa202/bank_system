package systembank;

import javax.swing.*;

public class savings extends account{
    float interesting_rate;
    public savings(float interesting_rate,float balance){
        super(balance);
        this.interesting_rate=interesting_rate;
    }
    public savings(){
        interesting_rate=0.0f;
    }
    public float getInteresting_rate(){
        return interesting_rate;
    }
    public void setInteresting_rate(float interesting_rate){
        this.interesting_rate=interesting_rate;
    }
}


