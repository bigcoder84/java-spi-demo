package cn.bigcoder.spi.operate;

import cn.bigcoder.spi.operate.service.INumOperate;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author: Jindong.Tian
 * @date: 2020-11-29
 * @description:
 **/
public class INumOperateTest {
    @Test
    public void test() {
        // SPI机制，寻找所有的实现类，顺序执行
        ServiceLoader<INumOperate> loader = ServiceLoader.load(INumOperate.class);
        Iterator<INumOperate> iterator = loader.iterator();
        if (iterator.hasNext()) {
            INumOperate numOperate = iterator.next();
            System.out.println(numOperate.exec(1, 2));
        } else {
            throw new RuntimeException("classpath中未找到cn.bigcoder.spi.operate.INumOperate实现类");
        }
    }
}
