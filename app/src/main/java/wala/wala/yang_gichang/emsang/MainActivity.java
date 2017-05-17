package wala.wala.yang_gichang.emsang;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.wala.yang_gichang.emsang.R;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    Thread thread;



    private GestureDetector mGestures = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation ut = AnimationUtils.loadAnimation(this, R.anim.blink);
        findViewById(R.id.relativeLayout2).startAnimation(ut);
        handler = new Handler(){
            public void handleMessage(android.os.Message msg){
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intent);
                finish();
            }
        };

        thread = new Thread(){
            public void run(){
                super.run();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                handler.sendEmptyMessage(0);
            }
        };

        thread.start();


    }

    public void click1(View V){
        return;
    }







}

