package Testing;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class S extends SomeClass {

    @Test
    public void testMultiplyTwoUsingMockito() {
        S s = Mockito.mock(S.class);
      //  Mockito.when(s.)
    }
}