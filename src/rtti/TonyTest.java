package rtti;

/**
 * Created by Mickey on 2017/2/13.
 * instanceof, newInstance
 * 泛型Class<T>
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends  Toy implements  HasBatteries , Waterproof , Shoots{
    FancyToy(){
        super(1);
    }
}

public class TonyTest {
    static  void printInfo (Class cc){
        System.out.println("getName：" + cc.getName());
        System.out.println("isInterface：" + cc.isInterface());
        System.out.println("getSimpleName" + cc.getSimpleName());
        System.out.println();
    }
    public  static  void  main(String[] args){
        Class c = null;
        try{
            c =  Class.forName("rtti.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("Cannot find Gum");
        }
        printInfo(c);
        for (Class cl:c.getInterfaces()){
            printInfo(cl);
        }

        c= c.getSuperclass();
        try{
            //返回的是Object类型
            Object o = c.newInstance();
        }catch (Exception e){
        }

        Class<FancyToy> ft = FancyToy.class;
        try {
            //返回的是具体类型
            FancyToy fancyToy = ft.newInstance();
        }catch (Exception e){
        }

        //RTTI的第三种形式:instanceof
        FancyToy fancyToy =new FancyToy();
        System.out.println(fancyToy instanceof Toy);
        System.out.println(Toy.class.isInstance(fancyToy));
        System.out.println(Toy.class.isAssignableFrom(FancyToy.class));
    }
}
