package wala.wala.yang_gichang.emsang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.wala.yang_gichang.emsang.R;

public class Profile extends AppCompatActivity {
    boolean ko=false;
    FrameLayout kor;
    FrameLayout eng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

         kor= (FrameLayout) findViewById(R.id.kor);
         eng=(FrameLayout)findViewById(R.id.eng);

    }

    public void changeLanguage(View v){
        Toast.makeText(getBaseContext(),"영어버젼은 열심히 만드는 중입니다.",Toast.LENGTH_SHORT).show();
        /*if(ko==false){
            kor.setVisibility(View.GONE);
            eng.setVisibility(View.VISIBLE);
            ko=true;
        }
        else{


            kor.setVisibility(View.VISIBLE);
            eng.setVisibility(View.GONE);
            ko=false;
        }*/
    }
}
