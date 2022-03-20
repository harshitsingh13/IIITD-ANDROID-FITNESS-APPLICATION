package com.mc2022.template;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link have_time#newInstance} factory method to
 * create an instance of this fragment.
 */
public class have_time extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public have_time() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment have_time.
     */
    // TODO: Rename and change types and number of parameters
    public static have_time newInstance(String param1, String param2) {
        have_time fragment = new have_time();
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

    first f=new first();
    second s=new second();
    third t=new third();
    Button b1,b2,b3;
    ImageView ig1,ig2;
    TextView tv1,tv2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_have_time, container, false);
        ig1=view.findViewById(R.id.imageView13);
        ig2=view.findViewById(R.id.imageView14);
        tv1=view.findViewById(R.id.hvt1);
        tv2=view.findViewById(R.id.hvt2);
        //b1=view.findViewById(R.id.button);
        ig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,f);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,f);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        //b2=view.findViewById(R.id.button2);
        ig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,s);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,f);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });



        return view;
    }
}