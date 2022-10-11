package org.ttn;

import org.junit.Assert;
import org.junit.Test;

public class Module2Test {
    Module2 module2=new Module2();
    @Test
    public void module2MultiplyTest()
    {
        Assert.assertEquals(18,module2.multiply(6,3));
    }
}
