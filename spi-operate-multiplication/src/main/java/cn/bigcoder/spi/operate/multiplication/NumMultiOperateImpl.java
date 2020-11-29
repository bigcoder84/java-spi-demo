package cn.bigcoder.spi.operate.multiplication;

import cn.bigcoder.spi.operate.service.INumOperate;

/**
 * @author: Jindong.Tian
 * @date: 2020-11-29
 * @description:
 **/
public class NumMultiOperateImpl implements INumOperate {

    public int exec(int num1, int num2) {
        return num1 * num2;
    }
}
