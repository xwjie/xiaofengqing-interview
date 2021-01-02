package cn.xiaowenjie.webperformance;

import org.junit.Assert;
import org.junit.Test;

import static cn.xiaowenjie.webperformance.SleepTimeFilter.getLoadTimeFromFileName;

/**
 * @Description TODO
 * @Date 2021/1/2 0002
 * @Author 晓风轻 https://github.com/xwjie
 */
public class UtilTest {

    @Test
    public void test() {
        Assert.assertEquals(getLoadTimeFromFileName("defer-load-500-sleep-1000.js"), 500);
        Assert.assertEquals(getLoadTimeFromFileName("defer-load-500.js"), 500);
        Assert.assertEquals(getLoadTimeFromFileName("load-500.js"), 500);
        Assert.assertTrue(getLoadTimeFromFileName("load-500.j);s") > 0);
    }
}
