package objectLifeTime;

import org.junit.jupiter.api.Test;

/**
 * Created by Mickey on 2017/2/10.
 * 1.不能依赖垃圾回收器和finalize()方法的执行
 * 2.垃圾回收算法:引用计数（效率低下） ，活对象(停止复制，扫描清理)
 */
class StaticInitializationTest {
    /**
     * 载入类的时候才会执行静态初始化，而且只会执行一次
     * 字段的初始化会在构造函数前执行
     * */
    @Test
    void test1() {
        StaticInitialization.test();
    }

}