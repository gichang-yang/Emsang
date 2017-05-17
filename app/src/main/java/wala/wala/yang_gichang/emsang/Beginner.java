package wala.wala.yang_gichang.emsang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.wala.yang_gichang.emsang.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Beginner.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Beginner#newInstance} factory method to
 * create an instance of this fragment.
 */


public class Beginner extends Fragment implements View.OnClickListener{
    GameAdapter adapter;



    private OnFragmentInteractionListener mListener;

    public Beginner() {
        // Required empty public constructor
    }


    @Override
    public void onClick(View view) {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Beginner.
     */
    // TODO: Rename and change types and number of parameters
    public static Beginner newInstance(String param1, String param2) {

        Beginner fragment = new Beginner();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        int i=0;
        Log.d("createView","called"+i++);
        ViewGroup rv = (ViewGroup)inflater.inflate(R.layout.fragment_beginner, container, false);

        ListView listView = (ListView)rv.findViewById(R.id.listView);


        adapter = new GameAdapter();
        adapter.setContext(getActivity().getBaseContext());

        adapter.addItem(new GameList("바니바니","초급자용",R.mipmap.bani_m));
        adapter.addItem(new GameList("공동묘지","초급자용",R.mipmap.gdmj_m));
        adapter.addItem(new GameList("베스킨라빈스31","초급자용",R.mipmap.br31_m));
        adapter.addItem(new GameList("두부게임","초급자용",R.mipmap.doobu_m));
        adapter.addItem(new GameList("딸기게임","초급자용",R.mipmap.strawberry_m));
        adapter.addItem(new GameList("공산당","초급자용", R.mipmap.sobiet_m));
        adapter.addItem(new GameList("전국노래자랑","초급자용",R.mipmap.songhae_m));
        adapter.addItem(new GameList("지하철게임","초급자용",R.mipmap.subway_m));
        adapter.addItem(new GameList("손병호게임","아무나 저격하세요",R.mipmap.son_m));


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        bani(adapterView);
                        break;
                    case 1:
                        gdmj(adapterView);
                        break;
                    case 2:
                        br31(adapterView);
                        break;
                    case 3:
                        doobu(adapterView);
                        break;
                    case 4:
                        strawberry(adapterView);
                        break;
                    case 5:
                        sobiet(adapterView);
                        break;
                    case 6:
                        songhae(adapterView);
                        break;
                    case 7:
                        subway(adapterView);
                        break;
                    case 8:
                        son(adapterView);
                        break;
                }
            }
        });



        return rv;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        Log.d("detatch","det");
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    /*----these methods are link to explaining each game list.-----*/
    public void sobiet(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=v20tVHwwK8g"));
        getActivity().startActivity(intent);
    }
    public void gdmj(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/puhaha0000/40199228448"));
        getActivity().startActivity(intent);

    }

    public void bani(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/d_l96/220564403246"));
        getActivity().startActivity(intent);

    }
    public void doobu(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/justjoinit/220648719865"));
        getActivity().startActivity(intent);
    }
    public void subway(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/hjcook2/220416349288"));
        getActivity().startActivity(intent);
    }
    public void br31(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/PostView.nhn?blogId=rnrgid00&logNo=40126207168"));
        getActivity().startActivity(intent);
    }
    public void strawberry(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://firstsoju.com/395"));
        getActivity().startActivity(intent);
    }
    public void songhae(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EC%A0%84%EA%B5%AD%EB%85%B8%EB%9E%98%EC%9E%90%EB%9E%91(%EC%88%A0%EA%B2%8C%EC%9E%84)"));
        getActivity().startActivity(intent);
    }

    public void son(View V){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://danbis.net/8713"));
        getActivity().startActivity(intent);
    }
}
