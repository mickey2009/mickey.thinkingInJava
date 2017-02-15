package generic.erase;

import java.util.ArrayList;

/**
 * Created by Mickey on 2017/2/14.
 * 泛型在运行时会擦除泛型参数的实际类型。
 * 历史原因为： 需要兼容已有的非泛型代码类库
 */
public class ErasedTypeEquivalence {
    public  static  void main(String[] args){
        Class class1 = new ArrayList<Integer>().getClass();
        Class class2 = new ArrayList<String>().getClass();
        System.out.println(class1 == class2);
    }
}
