package wala.wala.yang_gichang.emsang;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wala.yang_gichang.emsang.R;

/**
 * Created by yang-gichang on 2017. 1. 3..
 */
public class GameListView extends LinearLayout{
    TextView titleView;
    TextView sub_titleView;
    ImageView imageView;
    public GameListView(Context context) {
        super(context);

        init(context);
    }

    public GameListView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

   private void init(Context context){
       LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       inflater.inflate(R.layout.game_list,this,true);

        titleView = (TextView)findViewById(R.id.Title);
        sub_titleView=(TextView)findViewById(R.id.Subtitle);
       imageView = (ImageView)findViewById(R.id.img);
   }

    public void setTitle(String title){
        titleView.setText(title);
    }

    public void setSubtitle(String subTitle){
        sub_titleView.setText(subTitle);
    }

    public void setImg(int id){
        imageView.setImageResource(id);
    }

    public void setClick(String uri){
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
