package wala.wala.yang_gichang.emsang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wala.yang_gichang.emsang.R;

public class GameIntroActivity extends AppCompatActivity {

    //this activity for explain way to playing.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_intro);


        Button button = (Button) findViewById(R.id.button9);
        button.setVisibility(View.VISIBLE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GamePlay.class);
                startActivity(intent);
                finish();

            }
        });

    }



}
