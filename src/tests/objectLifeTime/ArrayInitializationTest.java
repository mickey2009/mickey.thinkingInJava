package objectLifeTime;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mickey on 2017/2/10.
 */
class ArrayInitializationTest {
    @Test
    void vararg() {
        int[] a = ArrayInitialization.Vararg(1,2,3);
        Assert.assertEquals(1,a[0]);
        Assert.assertEquals(2,a[1]);
        Assert.assertEquals(3,a[2]);
    }

    @Test
    void initialization(){
        int[] a = new int[]{1,2,3,4};
        int[] b = {1,2,3,4};
        int[] c = new int[4];
        for (int i = 0 ; i <c.length ; i ++){
            c[i] = i + 1;
        }
        Assert.assertEquals(1,a[0]);
        Assert.assertEquals(1,b[0]);
        Assert.assertEquals(1,c[0]);
    }
}