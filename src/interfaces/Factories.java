package interfaces;

/**
 * Created by Mickey on 2017/2/13.
 */
interface  Service{
    void method1();
    void method2();
}

interface  Factory{
    Service getService();
}

class  Implementataion1  implements  Service{
    private  Implementataion1(){};
    public void method1(){}
    public void method2(){}
    public  static  Factory  factory = new Factory(){
        @Override
        public Service getService() {
            return  new Implementataion1();
        }
    };
}

class  Implementataion2  implements  Service{
    private  Implementataion2(){};
    public void method1(){}
    public void method2(){}
    public  static  Factory  factory = new Factory(){
        @Override
        public Service getService() {
            return  new Implementataion2();
        }
    };
}

public class Factories {
    public  static  void ServiceConsumer(Factory factory){
        Service s =factory.getService();
        s.method1();
        s.method2();
    }

    public  static  void main(String[] args){
        ServiceConsumer(Implementataion1.factory);
        ServiceConsumer(Implementataion2.factory);
    }
}


