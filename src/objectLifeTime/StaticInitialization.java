package objectLifeTime;

import static util.Print.*;

/**
 * Created by Mickey on 2017/2/10.
 */
class Bowl{
    Bowl(int marker){
        print("Bowl(" + marker + ")");
    }

    void f1(int marker){
        print("f1(" + marker + ")");
    }
}

class Table{
    static Bowl bowl1 = new Bowl(1);
    static Bowl bowl2 = new Bowl(2);

    Table(){
        print("Table()");
        bowl2.f1(1);
    }

    void f2(int marker){
        print("f2(" + marker + ")");
    }
}

class Cupboard{
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    static Bowl bowl5 = new Bowl(5);

    Cupboard(){
        print("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker){
        print("f3(" + marker + ")");
    }
}

public class StaticInitialization {
    static  Cupboard cupboard = new Cupboard();
    static  Table table = new Table();
    public  static  void test(){
        print("Creating new Cupboard()");
        new Cupboard();
        print("Creating new Cupboard()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
}
