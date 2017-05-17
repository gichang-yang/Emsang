package wala.wala.yang_gichang.emsang;

/**
 * Created by yang-gichang on 2017. 1. 3..
 */
public class GameList {

    //this class is gamelayout
    String title;
    String sub_title;
    int img_id;

    public GameList(){}

    public GameList(String title,String sub_title,int img_id){
        this.title=title;
        this.sub_title=sub_title;
        this.img_id=img_id;
    }
    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
