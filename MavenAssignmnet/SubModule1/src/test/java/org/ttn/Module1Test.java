package org.ttn;

import org.junit.Assert;
import org.junit.Test;

public class Module1Test {
    Module1 module1=new Module1();
    @Test
    public void module1SumTest()
    {
        Assert.assertEquals(5,module1.sum(2,3));
    }
}
