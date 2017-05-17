package wala.wala.yang_gichang.emsang;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by yang-gichang on 2017. 1. 3..
 */

//this class for listview in Search activity.
public class GameAdapter extends BaseAdapter{

    ArrayList<GameList> list = new ArrayList<GameList>();
    Context gameContext;
    public Context setContext(Context context){
        gameContext=context;
        return context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    public void addItem(GameList Li){
        list.add(Li);
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }

    public int setItemId(int i){
      return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        GameListView v = null;
        if(view ==null) v=(GameListView) new GameListView(gameContext);
        else v=(GameListView) view;

        GameList cur = list.get(i);

        v.setTitle(cur.getTitle());
        v.setSubtitle(cur.getSub_title());
        v.setImg(cur.getImg_id());
        setItemId(i);
        return v;
    }
}
