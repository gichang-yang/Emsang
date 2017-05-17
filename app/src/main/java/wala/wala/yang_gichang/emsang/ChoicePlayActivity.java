package wala.wala.yang_gichang.emsang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.wala.yang_gichang.emsang.R;

import java.util.Random;

public class ChoicePlayActivity extends AppCompatActivity {
    int member=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_play);
        Intent active = getIntent();
        //parse number in choice.class.
        member=active.getExtras().getInt("member");



    }

    public void next(View V){
        Random randoma = new Random();

        int whois = randoma.nextInt(member)+1;
        TextView textView = (TextView) findViewById(R.id.textView16);
        textView.setText(String.valueOf(whois)+"번");
        Animation ut = AnimationUtils.loadAnimation(this,R.anim.blink);
       // findViewById(R.id.choose).startAnimation(ut);
        textView.startAnimation(ut);
    }

    public void home(View V){
        finish();
    }
}
