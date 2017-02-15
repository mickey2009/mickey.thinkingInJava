package collections;

import java.util.*;

/**
 * Created by Mickey on 2017/2/14.
 */
public class Unsupported {
    static  void test(String msg , List<String> list){
        System.out.println("-----" + msg + "-----");
        Collection<String> c = list;
        Collection<String> c2 = list.subList(1,8);
        try{ c.retainAll(c2);} catch (Exception e){
            System.out.println("retainAll():" + e);
        }
        try{ c.removeAll(c2);} catch (Exception e){
            System.out.println("removeAll():" + e);
        }
        try{ c.clear();} catch (Exception e){
            System.out.println("retainAll():" + e);
        }
        try{ c.add("X");} catch (Exception e){
            System.out.println("add():" + e);
        }
        try{ c.addAll(c2);} catch (Exception e){
            System.out.println("addAll():" + e);
        }
        try{ c.remove("C");} catch (Exception e){
            System.out.println("retainAll():" + e);
        }
        try{
            list.set(0,"X");
        }catch (Exception e){
            System.out.println("List.set():" + e);
        }
    }

    public  static  void main(String[] args){
        List<String> list = Arrays.asList("A B C D E F G H I J K L M N".split(" "));
        test("Modifiable Copy" , new ArrayList<>(list));
        test("Arrays.asList" , list);
        test("unmodifiableList" , Collections.unmodifiableList(list));
    }
}
