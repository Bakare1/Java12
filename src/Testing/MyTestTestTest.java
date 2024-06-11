package Testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTestTestTest extends SomeClass {
    @Test
    public void multiplyTwo(){
        SomeClass sm =new SomeClass();
        int result = sm.multiplyTwo(2);
        Assert.assertEquals(4,result);
    }
}