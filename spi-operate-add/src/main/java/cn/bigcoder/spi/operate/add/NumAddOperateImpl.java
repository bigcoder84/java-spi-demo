package cn.bigcoder.spi.operate.add;


import cn.bigcoder.spi.operate.service.INumOperate;

/**
 * @author: Jindong.Tian
 * @date: 2020-11-29
 * @description:
 **/
public class NumAddOperateImpl implements INumOperate {

    public int exec(int num1, int num2) {
        return num1 + num2;
    }
}
