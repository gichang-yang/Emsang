package wala.wala.yang_gichang.emsang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.wala.yang_gichang.emsang.R;

import java.util.Random;

public class GamePlay extends AppCompatActivity {

    int added=0;
    String INTRO;

    public int random() {

        Random choose = new Random();
        int num, result;

        num = choose.nextInt(16+(added*3));//아싸게임이 추가되면 14 이내, 추가 되면 12 이내에서 숫자를 뽑음


        if (num == 0) {
            result = R.layout.gdmj;
            INTRO = "공동묘지에~ 아싸~";
        }
        else if (num == 1) {
            result = R.layout.bani;
            INTRO = "하늘에서 내려온 토끼가 하는말~";
        }
        else if (num == 2) {
            result = R.layout.strawberry;
            INTRO = "딸기가 좋아~ 딸기가 좋아~";
        }
        else if (num == 3) {
            result = R.layout.linked_strawberry;
            INTRO = "딸기가 좋아~ 딸기가 좋아~";
        }
        else if (num == 4) {
            result = R.layout.songhae;
            INTRO = "이하 생략";
        }
        else if (num == 5) {
            result = R.layout.calculation;
            INTRO = "카큘레이션~ 카큘레이션~";
        }
        else if (num == 6) {
            result = R.layout.doobu;
            INTRO = "두~부 두부두부 으쌰 X3";
        }
        else if (num == 7) {
            result = R.layout.jan;
            INTRO = "잔치기 잔치기 짝짝짝";
        }
        else if (num == 8) {
            result = R.layout.tdsc;
            INTRO = "딸기당근 수박참외 메론~ 게임";
        }
        else if (num == 9) {
            result = R.layout.sobiet;
            INTRO = "공~산당 공산당 공~산당~";
        }
        else if (num == 10) {
            result = R.layout.br31;
            INTRO = "베스킨~ 라빈스~ 31~";
        }
        else if (num == 11) {
            result = R.layout.whale;
            INTRO = "고~래~가 아싸 고/래/가~";
        }
        else if (num == 12) {
            result = R.layout.subway;
            INTRO = " 지~하철 지하철 지~하철 지하철";
        }
        else if(num == 13){
            result=R.layout.gyul;
            INTRO = "귤~ 귤귤 귤귤~~";
        }
        else if (num==14){
            result=R.layout.cleo;
            INTRO="안녕 클레오파트라\n세상에서 제일가는 포테이토칩~";
        }
        else if(num==15){
            result=R.layout.son;
            INTRO="브금 없음";
        }
        else if(num==16){
            result=R.layout.pong;
            INTRO="니가 왼손을들면 내가 오른손을들어 x2\n퐁당퐁당~ 퐁당퐁당~";
        }
        else if (num == 18) {
            result = R.layout.assa;
            INTRO = "이하생략";
        }
        else if (num == 19) {
            result = R.layout.advanced_assa;
            INTRO = "이하생략";
        }
        else if(num==17){
            result=R.layout.hongsam;
            INTRO="아이엠 그라운드 홍삼게임 시작~";
        }
        else
            result = R.layout.strawberry;

        return result;
    }
    //랜덤으로 게임을 골라주는 메소드

    public void rand_option(){
        Random choose = new Random();
        int num,jan;
        String result;
        num = choose.nextInt(7);
        jan=choose.nextInt(3)+1;

        if (num == 0)
            result = "게임 시작한사람 ";
        else if (num == 1)
            result = "걸린사람 제외 모두 ";
        else if (num == 2||num==7||num==8)
            result = "걸린사람 ";
        else if (num == 3)
            result = "걸린사람의 양옆사람 ";
        else if (num == 4)
            result = "걸린사람+양옆사람 ";
        else if (num == 5)
            result = "걸린사람이 지목하는 사람 ";
        else if (num == 6)
            result = "걸린사람 + 지목하는 사람 ";

        else
            result = "개발자 주량";

        Toast.makeText(getBaseContext(),result+jan+"잔 마시기",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
        Intent receive = getIntent();

        //ViewPager vp = (ViewPager) findViewById(R.id.view2);
       /* vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
*/
        int param = receive.getIntExtra("assa",-1);
        if(param==0||param==1) added=param;

        int select=random();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rel);
        LayoutInflater inf = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inf.inflate(select, relativeLayout, true);
        Toast.makeText(getBaseContext(),"브금: "+INTRO,Toast.LENGTH_SHORT).show();

        Button button1 = (Button) relativeLayout.findViewById(R.id.option);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(),)
                rand_option();
            }
        });



        final Button button2 = (Button) relativeLayout.findViewById(R.id.add_game);
        if (added == 0) {
            button2.setText("헬파티게임\n"+"추가");

        } else{

            button2.setText("헬파티게임\n"+"제거");
        }
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (added == 0) {
                    Toast.makeText(getBaseContext(), "다음게임부터 헬파티게임이 추가됩니다.", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(getApplicationContext(),)
                    added = 1;
                    button2.setText("헬파티게임\n" +
                            "제거");
                } else{
                    Toast.makeText(getBaseContext(), "헬파티게임을 확률에서 제거합니다..", Toast.LENGTH_SHORT).show();
                    added=0;
                    button2.setText("헬파티게임\n" +
                            "추가");
                }
            }
        });



        Button button3 = (Button) relativeLayout.findViewById(R.id.go_home);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        Button button4 = (Button) relativeLayout.findViewById(R.id.next);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GamePlay.class);
                intent.putExtra("assa", added);

                startActivity(intent);
                finish();

            }
        });
    }



}
