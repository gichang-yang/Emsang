package wala.wala.yang_gichang.emsang;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.wala.yang_gichang.emsang.R;

public class Search extends AppCompatActivity {
    Toolbar toolbar;

   // public GameAdapter beginer;
   // public GameAdapter middle;
  //  public GameAdapter hell;
    Fragment lay1;
    Fragment lay2;
    Fragment lay3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        /*
        ///초급자용 아이템 추가
        beginer=new GameAdapter();
        beginer.setContext(getBaseContext());
        beginer.addItem(new GameList("바니바니","초급자용",R.mipmap.bani));
        beginer.addItem(new GameList("공동묘지","초급자용",R.drawable.img1));
        beginer.addItem(new GameList("베스킨라빈스31","초급자용",R.mipmap.br31));
        beginer.addItem(new GameList("두부게임","초급자용",R.mipmap.doobu));
        beginer.addItem(new GameList("딸기게임","초급자용",R.mipmap.strawberry));
        beginer.addItem(new GameList("공산당","초급자용", R.mipmap.sobiet));
        beginer.addItem(new GameList("전국노래자랑","초급자용",R.mipmap.songhae));
        beginer.addItem(new GameList("지하철게임","초급자용",R.mipmap.subway));
        beginer.addItem(new GameList("손병호게임","아무나 저격하세요",R.mipmap.son));



        //중급자용 아이템 추가
        middle=new GameAdapter();
        middle.setContext(getBaseContext());
        middle.addItem(new GameList("카큘레이션","중급자용",R.mipmap.calculator));
        middle.addItem(new GameList("지목딸기게임","중급자용",R.mipmap.strawberry));
        middle.addItem(new GameList("지목두부게임","중급자용",R.mipmap.doobu));
        middle.addItem(new GameList("고래가","중급자용",R.mipmap.whale));
        middle.addItem(new GameList("딸기 당근 수박 참외 메론게임","중급자용", R.mipmap.tdsc));
        middle.addItem(new GameList("잔치기게임","중급자용",R.mipmap.jan));
        middle.addItem(new GameList("퐁당퐁당게임","중급자용",R.mipmap.msjb));
        middle.addItem(new GameList("클레오파트라","성대결절 주의!!",R.mipmap.cleo));
        middle.addItem(new GameList("귤게임","중급자용",R.mipmap.gyul));


        //헬파티
        hell= new GameAdapter();
        hell.setContext(getBaseContext());
        hell.addItem(new GameList("아싸게임","핵 어려움",R.mipmap.assa));
        hell.addItem(new GameList("이중모션게임","핵+암걸리게 어려움",R.mipmap.advanced_assa));
        hell.addItem(new GameList("홍삼게임","다음날을 보장할 수 없음",R.mipmap.hongsam));
        */
        Toast.makeText(getBaseContext(),"게임들을 클릭해 보세요",Toast.LENGTH_SHORT).show();


        toolbar = (Toolbar)findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        lay1= new Beginner();
        lay2=new Middle();
        lay3=new Hell();


        getSupportFragmentManager().beginTransaction().replace(R.id.container,lay1).commit();
        final TabLayout tb = (TabLayout)findViewById(R.id.tabs);

        tb.addTab(tb.newTab().setText("초보"));
        tb.addTab(tb.newTab().setText("중급자"));
        tb.addTab(tb.newTab().setText("헬파티"));
        tb.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Fragment selected=null;

                if(position==0){
                    selected = lay1;

                }
                else if(position==1) selected = lay2;
                else if(position==2) selected =lay3;

                getSupportFragmentManager().beginTransaction().replace(R.id.container,selected).commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

       /* TextView br31  = (TextView)lay1.getActivity().findViewById(R.id.br31);
        br31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"test",Toast.LENGTH_SHORT).show();
            }
        });*/
        /*Button tex = (Button) lay1.get
        tex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://firstsoju.com/549"));
                startActivity(intent);
            }
        });*/


    }


}
