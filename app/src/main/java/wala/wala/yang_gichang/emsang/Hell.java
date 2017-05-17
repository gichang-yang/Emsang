package wala.wala.yang_gichang.emsang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.wala.yang_gichang.emsang.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Hell.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Hell#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hell extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Hell() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Hell.
     */
    // TODO: Rename and change types and number of parameters
    public static Hell newInstance(String param1, String param2) {
        Hell fragment = new Hell();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rv = (ViewGroup)inflater.inflate(R.layout.fragment_hell, container, false);



        final GameAdapter adapter = new GameAdapter();
        adapter.setContext(getActivity().getBaseContext());
        adapter.addItem(new GameList("아싸게임","핵 어려움",R.mipmap.assa_m));
        adapter.addItem(new GameList("이중모션게임","핵+암걸리게 어려움",R.mipmap.advanced_assa_m));
        adapter.addItem(new GameList("홍삼게임","다음날을 보장할 수 없음",R.mipmap.hongsam_m));

        ListView listView = (ListView)rv.findViewById(R.id.listView3);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                GameList CUR = (GameList) adapter.getItem(i);
                switch(i){
                    case 0:
                        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://blog.naver.com/puhaha0000/220061982365"));
                        getActivity().startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.kr/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=이중모션"));
                        getActivity().startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://namu.wiki/w/%ED%99%8D%EC%82%BC(%EA%B2%8C%EC%9E%84)"));
                        getActivity().startActivity(intent);
                        break;
                }
            }
        });

        /*
        Button assa = (Button) rv.findViewById(R.id.button23);
        assa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://blog.naver.com/puhaha0000/220061982365"));
                getActivity().startActivity(intent);
            }
        });
        Button twoMotion = (Button) rv.findViewById(R.id.button24);
        twoMotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://wiki.dcinside.com/wiki/%EC%9D%B4%EC%A4%91%EB%AA%A8%EC%85%98"));
                getActivity().startActivity(intent);
            }
        });*/
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
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
