package access;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mickey on 2017/2/11.
 * 访问控制权限的范围为: public , protected , 包访问权限 , private
 * 封装的目的在于维护， 客户端程序员只关注public接口。类库的开发者可以修改内部的实现而不用担心客户端代码
 */
class Cookie2Test {
    /**
     * 同一个包里面的类（非继承关系）居然可以访问protected成员。
     */
    @Test
    void test1() {
        Cookie2.test();
    }
}