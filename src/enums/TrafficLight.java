package enums;

/**
 * Created by Mickey on 2017/2/14.
 * Enum 可以用Switch语句
 */
enum Signal {GREEN , YELLOW, RED}
public class TrafficLight {
    Signal color = Signal.RED;
    public  void change(){
        switch (color){
            case GREEN:color = Signal.YELLOW;break;
            case RED:color = Signal.GREEN;break;
            case YELLOW:color = Signal.RED;break;
        }
    }

    public  String toString(){
        return  "TrafficLight's Color is " + color;
    }

    public  static  void main(String[] args){
        TrafficLight light = new TrafficLight();
        for (int i = 0 ; i < 10 ; i ++){
            System.out.println(light);
            light.change();
        }
    }
}
