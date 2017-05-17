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
import android.widget.Toast;

import com.wala.yang_gichang.emsang.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Middle.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Middle#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Middle extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Middle() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Middle.
     */
    // TODO: Rename and change types and number of parameters
    public static Middle newInstance(String param1, String param2) {
        Middle fragment = new Middle();
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
        ViewGroup parentView = (ViewGroup)inflater.inflate(R.layout.fragment_middle, container, false);

        ListView listView = (ListView)parentView.findViewById(R.id.listView2);


        GameAdapter adapter = new GameAdapter();

        adapter.setContext(getActivity().getBaseContext());
        adapter.addItem(new GameList("카큘레이션","중급자용",R.mipmap.calculator));
        adapter.addItem(new GameList("지목딸기게임","중급자용",R.mipmap.strawberry_m));
        adapter.addItem(new GameList("지목두부게임","중급자용",R.mipmap.doobu_m));
        adapter.addItem(new GameList("고래가","중급자용",R.mipmap.whale_m));
        adapter.addItem(new GameList("딸기 당근 수박 참외 메론게임","중급자용", R.mipmap.tdsc_m));
        adapter.addItem(new GameList("잔치기게임","중급자용",R.mipmap.jan));
        adapter.addItem(new GameList("퐁당퐁당게임","중급자용",R.mipmap.msjb_m));
        adapter.addItem(new GameList("클레오파트라","성대결절 주의!!",R.mipmap.cleo_m));
        adapter.addItem(new GameList("귤게임","중급자용",R.mipmap.gyul));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        Toast.makeText(getActivity().getBaseContext(),"한명씩 숫자,계산기호를 번갈아가면서 외치고 옆사람을 먹이고 싶으면 = 을 크게 외치면 된다.",Toast.LENGTH_LONG).show();

                        break;
                    case 1:
                        Toast.makeText(getActivity().getBaseContext(),"딸기게임 응용판. 딸기를 외칠때 마지막번째는 다른사람을 지목한다.(EX 딸기셋=딸기딸기딸(기->지목하면서))",Toast.LENGTH_LONG).show();

                        break;
                    case 2:
                        Toast.makeText(getActivity().getBaseContext(),"두부게임 응용판. 몇모인지 외치면서 다른사람을 지목한다.(EX 두부 네모!(가리키며))",Toast.LENGTH_LONG).show();

                        break;
                    case 3:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=AD5VYpHjDrk"));
                        getActivity().startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://blog.naver.com/ykcha9/220897211297"));
                        getActivity().startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=aJQ4Qjgwz_M"));
                        getActivity().startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cafe.naver.com/playgroundspirit/4310"));
                        getActivity().startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.blog.naver.com/d_l96/220548517743"));
                        getActivity().startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.thecontest.co.kr/contest/contest_board_view.php?ccont_id=731436&cnst_id=2183&cate=&stat=1&sort=&csearch_key=&csearch_val="));
                        getActivity().startActivity(intent);
                        break;

                }

            }
        });
        /*


        Button calc = (Button) parentView.findViewById(R.id.button18);
        calc.setOnClickListener(new View.OnClickListener() {

            //http://blog.naver.com/d_l96/220548054614
            public void onClick(View view) {
                Toast.makeText(getActivity().getBaseContext(),"한명씩 숫자,계산기호를 번갈아가면서 외치고 옆사람을 먹이고 싶으면 = 을 크게 외치면 된다.",Toast.LENGTH_LONG).show();
            }
        });
        Button selectedStrawberry = (Button) parentView.findViewById(R.id.button19);
        selectedStrawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getBaseContext(),"딸기게임 응용판. 딸기를 외칠때 마지막번째는 다른사람을 지목한다.(EX 딸기셋=딸기딸기딸(기->지목하면서))",Toast.LENGTH_LONG).show();
            }
        });
        Button selectedDoobu = (Button) parentView.findViewById(R.id.button20);
        selectedDoobu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getBaseContext(),"두부게임 응용판. 몇모인지 외치면서 다른사람을 지목한다.(EX 두부 네모!(가리키며))",Toast.LENGTH_LONG).show();
            }
        });
        Button whale = (Button) parentView.findViewById(R.id.button21);
        whale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=AD5VYpHjDrk"));
                getActivity().startActivity(intent);

            }
        });
        Button tdsc = (Button) parentView.findViewById(R.id.button22);
        tdsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://blog.naver.com/ykcha9/220897211297"));
                getActivity().startActivity(intent);
            }
        });
        Button jan = (Button) parentView.findViewById(R.id.button26);
        jan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=aJQ4Qjgwz_M"));
                getActivity().startActivity(intent);
            }
        });
        */
        // Inflate the layout for this fragment
        return parentView;


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
