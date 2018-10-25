package com.java.thread.juclock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * <dl>
 * <dt> TestSemaphore</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestSemaphore {
    public static void main(String[] args){
        PlayGround playGround = new PlayGround();

        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0;i<50;i++){
            service.execute(new StudentDemo(playGround));
        }
    }
}


class PlayGround{
    /**
     *     尝试一下使用公平锁会怎么样，按顺序打印
     */
    private Semaphore semaphore = new Semaphore(5,true);

    static class Track{
        private int num;
        private boolean used;
        public Track(int num,boolean used){
            this.num = num;
            this.used = used;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }
    }
    private Track[] tracks = {
            new Track(1,false), new Track(2,false), new Track(3,false), new Track(4,false), new Track(5,false)};
    public Track getTrack(){
        try {
            semaphore.acquire(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  getNextAvalableTrack();
    }
    private Track getNextAvalableTrack(){

        for(Track track:tracks){
            if(!track.used){
                track.setUsed(true);
                return track;
            }
        }
        return null;
    }

    public void release(Track track){
        track.setUsed(false);
        semaphore.release(1);
    }
}

class StudentDemo implements  Runnable{
    private PlayGround playGround;
    public StudentDemo(PlayGround playGround){
        this.playGround = playGround;
    }
    public void run() {
        PlayGround.Track tk = playGround.getTrack();
        if(tk!=null){
            System.out.println(Thread.currentThread().getName()+"正在跑道"+tk.getNum()+"上跑步");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            playGround.release(tk);
        }

    }
}
