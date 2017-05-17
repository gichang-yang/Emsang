package wala.wala.yang_gichang.emsang;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.wala.yang_gichang.emsang.R;

public class MenuActivity extends AppCompatActivity {
    Animation animation;
    Button btn;
    Button jebi;
    Button search;
    Button dev;
//    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        animation= AnimationUtils.loadAnimation(this,R.anim.btn_blink);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(getBaseContext(),R.anim.btn_blink);
                Game();


            }
        });
        jebi=(Button)findViewById(R.id.button2);
        jebi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(getBaseContext(),R.anim.btn_blink);
                Jebi();


            }
        });
        search=(Button)findViewById(R.id.button3);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(getBaseContext(),R.anim.btn_blink);
                Search();


            }
        });

        dev=(Button)findViewById(R.id.button5);
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(getBaseContext(),R.anim.btn_blink);
                developer();
            }
        });

    }


    public void Game(){
        Intent intent = new Intent(getApplicationContext(),GameIntroActivity.class);
        startActivity(intent);
        if(Build.VERSION.SDK_INT<=Build.VERSION_CODES.KITKAT)
            btn.startAnimation(animation);

    }

    public void Jebi(){

        Intent inten = new Intent(getApplicationContext(),Choice.class);
        startActivity(inten);
        if(Build.VERSION.SDK_INT<=Build.VERSION_CODES.KITKAT)
            jebi.startAnimation(animation);

    }

    public void Search(){
        Intent inten = new Intent(getApplicationContext(),Search.class);
        startActivity(inten);
        if(Build.VERSION.SDK_INT<=Build.VERSION_CODES.KITKAT)
            search.startAnimation(animation);
    }

    public void developer(){
        Intent inten = new Intent(getApplicationContext(),Profile.class);
        startActivity(inten);
        if(Build.VERSION.SDK_INT<=Build.VERSION_CODES.KITKAT)
            dev.startAnimation(animation);
    }

    public void exit(View v){
        finish();
    }
}
