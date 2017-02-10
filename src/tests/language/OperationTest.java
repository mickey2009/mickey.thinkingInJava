package language;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Created by Mickey on 2017/2/10.
 */
public class OperationTest {
    class BasicTypeDefaultValue {
        int anInt;
    }

    @Test
    void referenceAssignment() {
        BasicTypeDefaultValue a = new BasicTypeDefaultValue();
        a.anInt = 10;
        BasicTypeDefaultValue b = a;
        b.anInt = 20;
        Assert.assertEquals(a.anInt, 20);
        Assert.assertEquals(b.anInt, 20);
    }

    @Test
    void intDecided() {
        Assert.assertEquals(2, 5 / 2);
    }

    @Test
    void selfIncrement() {
        int a = 1;
        Assert.assertEquals(1, a++);
        Assert.assertEquals(2, a);

        int b = 1;
        Assert.assertEquals(2, ++b);
        Assert.assertEquals(2, b);
    }

    @Test
    void Hex() {
        //16进制
        Assert.assertEquals("101111", Integer.toBinaryString(0x2f));
        //8进制
        Assert.assertEquals("1111111", Integer.toBinaryString(0177));
    }

    @Test
    void Move() {
        short a = -1;
        a <<= 10;
        Assert.assertEquals("11111111111111111111110000000000", Integer.toBinaryString(a));

        //有符号右移
        a = -1;
        a >>= 10;
        Assert.assertEquals("11111111111111111111111111111111", Integer.toBinaryString(a));
    }

    @Test
    void stringAdd() {
        int a = 1;
        int b = 2;
        String s = "a,b";
        Assert.assertEquals("a,b12", s + a + b);
    }

    @Test
    void intCast() {
        double d = 29.8;
        Assert.assertEquals(29, (int) d);
    }
}
