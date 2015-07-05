package com.baidu.beidou.navi.pbrpc.util;

import org.junit.Test;

public class PreconditionsTest {

    @Test
    public void testCheckArgument() {
        try {
            int i = -1;
            Preconditions.checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test
    public void testCheckNotNull() {
        try {
            Object obj = null;
            Preconditions.checkNotNull(obj, "Argument was %s but expected not null", obj);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test
    public void testCheckState() {
        try {
            int x = 1;
            Preconditions.checkState(x == 5, "Argument was %s but expected 1", x);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
