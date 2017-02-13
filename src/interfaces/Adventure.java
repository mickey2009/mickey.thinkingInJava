package interfaces;

/**
 * Created by Mickey on 2017/2/13.
 * 接口比抽象类更加的纯粹
 * 通过接口可以实现 多重继承特性.
 */
interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class  ActionCharacter{
    public  void fight(){}
}

class  Hero extends  ActionCharacter implements  CanFight ,CanSwim,CanFly{

    @Override
    public void swim() {}

    @Override
    public void fly() {}
}

public class Adventure {
    public  static  void t(CanFight x){x.fight();}
    public  static  void u(CanFly x){x.fly();}
    public  static  void v(CanSwim x){x.swim();}
    public  static  void w(ActionCharacter x){x.fight();}
    public  static  void main(String[] args){
        Hero h = new Hero();
        u(h);
        v(h);
        t(h);
        w(h);
    }
}
