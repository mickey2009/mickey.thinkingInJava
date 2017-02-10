package language;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * Created by Mickey on 2017/2/10.
 */

class BasicTypeTest {
    class BasicTypeDefaultValue {
        boolean aBoolean;
        char aChar;
        byte aByte;
        short aShort;
        int anInt;
        long aLong;
        float aFloat;
        double aDouble;
    }

    @Test
    void defaultValue() {
        BasicTypeDefaultValue o = new BasicTypeDefaultValue();
        Assert.assertEquals(o.aBoolean, false);
        Assert.assertEquals(o.aChar, '\u0000');
        Assert.assertEquals(o.aByte, 0);
        Assert.assertEquals(o.aShort, 0);
        Assert.assertEquals(o.anInt, 0);
        Assert.assertEquals(o.aLong, 0l);
        Assert.assertEquals(o.aFloat, 0f, 0.01);
        Assert.assertEquals(o.aDouble, 0, 0.01);
    }

    @Test
    void randomSeeder(){
        Random r1= new Random(47);
        Random r2= new Random(47);
        for (int i = 0 ; i < 10 ; i ++){
            Assert.assertEquals(r1.nextInt(100), r2.nextInt(100));
        }
    }

}