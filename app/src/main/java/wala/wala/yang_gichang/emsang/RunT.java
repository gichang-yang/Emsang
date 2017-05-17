package wala.wala.yang_gichang.emsang;

/**
 * Created by yang-gichang on 2016. 9. 19..
 */
public class RunT extends Thread{




    @Override
    public void run() {




        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }
}
