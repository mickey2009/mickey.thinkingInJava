package enums;

/**
 * Created by Mickey on 2017/2/14.
 * values() , ordinal() ,
 */

enum Shrubbery {GROUND , CRAWLING,HANGING}

public class EnumClass {
    public static  void main(String[] args){
        for (Shrubbery s : Shrubbery.values()){
            System.out.println( s + " ordinal:" + s.ordinal());
            System.out.println( s.getDeclaringClass());
            System.out.println( s.name());
            System.out.println( "-----------------");
        }
        for (String name: "GROUND CRAWLING HANGING".split(" ")){
            Shrubbery sh = Enum.valueOf(Shrubbery.class , name);
            System.out.println( sh);
        }
    }
}
