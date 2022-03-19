package com.mc2022.template;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link day1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class day1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public day1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment day1.
     */
    // TODO: Rename and change types and number of parameters
    public static day1 newInstance(String param1, String param2) {
        day1 fragment = new day1();
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

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,td;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_day1, container, false);

        td=view.findViewById(R.id.textd);
        //td.setTextColor(Color.BLUE);
        td.setText(MainActivity.text);

        t1=view.findViewById(R.id.textView1);
        t1.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex1+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        //t1.setText("Frequency: "+String.valueOf(MainActivity.ex1+MainActivity.count)+"\n(You can also do in 2 - 4 equal sets)");

        t2=view.findViewById(R.id.textView2);
        t2.setText("Main Muscle Group : Abs\nType : Strength\nEquipment : Body Only\nTime: "+String.valueOf(MainActivity.ex2+MainActivity.count)+"sec (You can also do in 2 - 4 equal sets)");
        //t2.setText("Time in seconds: "+String.valueOf(MainActivity.ex2+MainActivity.count)+"\n(You can also do in 2 - 4 equal sets)");

        t3=view.findViewById(R.id.textView3);
        t3.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex3+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        t4=view.findViewById(R.id.textView4);
        t4.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex4+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        t5=view.findViewById(R.id.textView5);
        t5.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex5+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        t6=view.findViewById(R.id.textView6);
        t6.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex6+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        t7=view.findViewById(R.id.textView7);
        t7.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex7+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        t8=view.findViewById(R.id.textView8);
        t8.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex8+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        t9=view.findViewById(R.id.textView9);
        t9.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex9+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        t10=view.findViewById(R.id.textView10);
        t10.setText("Main Muscle Group : Cardio\nType : Cardio\nEquipment : Body Only\nFrequency: "+String.valueOf(MainActivity.ex10+MainActivity.count)+" (You can also do in 2 - 4 equal sets)");

        return view;
    }
}