package com.java.thread.juclock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * <dl>
 * <dt> TestExchange</dt>
 * <dd>Description:
 * 使用生产者、消费者
 * 当生产者生产到某个临界值之后 将对象交给消费者
 * 当
 * </dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestExchange {
    public static void main(String[] args){
        List<String> buff = new ArrayList<String>();
        List<String> buff2 = new ArrayList<String>();
        Exchanger<List<String>> exchanger = new Exchanger<List<String>>();

        new Thread(new ExchangeProductDemo(buff,exchanger)).start();
        new Thread(new ExchangeConsumerDemo(buff2,exchanger)).start();

    }

}

class ExchangeProductDemo implements Runnable {
    private List<String> buff;
    private Exchanger<List<String>> exchanger;

    public ExchangeProductDemo(List<String> buff, Exchanger<List<String>> exchanger) {
        this.buff = buff;
        this.exchanger = exchanger;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("生产者装入" + i + "--" + j);
                buff.add(new String("buff--" + i + "--" + j));
            }
            System.out.println(String.format("生产者第%d次装满", i));
            try {
                exchanger.exchange(buff);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 消费者
 */
class ExchangeConsumerDemo implements Runnable {
    private List<String> buff;
    private Exchanger<List<String>> exchanger;

    public ExchangeConsumerDemo(List<String> buff, Exchanger<List<String>> exchanger) {
        this.buff = buff;
        this.exchanger = exchanger;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                buff = exchanger.exchange(buff);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf(String.format("消费者第i次消费", i));
            for (int j = 1; j < 5; j++) {
                System.out.println("消费者消费" + i + "--" + j);
                buff.remove(0);
            }
        }
    }
}

