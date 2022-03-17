package com.mc2022.template;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link monthly_plan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class monthly_plan extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    day1 d1=new day1();
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    TextView t1,t2,t3,t5,t6,t7,t9,t10,t11,t13,t14,t15,t17,t18,t19,t21,t22,t23,t25,t26,t27,t29,t30;
    public monthly_plan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment monthly_plan.
     */
    // TODO: Rename and change types and number of parameters
    public static monthly_plan newInstance(String param1, String param2) {
        monthly_plan fragment = new monthly_plan();
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
        View view=inflater.inflate(R.layout.fragment_monthly_plan, container, false);
        t1=(TextView) view.findViewById(R.id.textd);


        b1=(Button) view.findViewById(R.id.day1);//defining button for 'start service' button functionality
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=0;
                MainActivity.text="YOUR DAY-1";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b2=(Button) view.findViewById(R.id.day2);//defining button for 'start service' button functionality
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=3;
                MainActivity.text="YOUR DAY-2";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b3=(Button) view.findViewById(R.id.day3);//defining button for 'start service' button functionality
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=6;
                MainActivity.text="YOUR DAY-3";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        /*b4=(Button) view.findViewById(R.id.day4);//defining button for 'start service' button functionality
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=9;
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/

        b5=(Button) view.findViewById(R.id.day5);//defining button for 'start service' button functionality
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=9;
                MainActivity.text="YOUR DAY-5";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b6=(Button) view.findViewById(R.id.day6);//defining button for 'start service' button functionality
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=12;
                MainActivity.text="YOUR DAY-6";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b7=(Button) view.findViewById(R.id.day7);//defining button for 'start service' button functionality
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=15;
                MainActivity.text="YOUR DAY-7";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        /*b8=(Button) view.findViewById(R.id.day8);//defining button for 'start service' button functionality
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=21;
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/


        b9=(Button) view.findViewById(R.id.day9);//defining button for 'start service' button functionality
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=18;
                MainActivity.text="YOUR DAY-9";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b10=(Button) view.findViewById(R.id.day10);//defining button for 'start service' button functionality
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=21;
                MainActivity.text="YOUR DAY-10";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b11=(Button) view.findViewById(R.id.day11);//defining button for 'start service' button functionality
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=24;
                MainActivity.text="YOUR DAY-11";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        /*b12=(Button) view.findViewById(R.id.day12);//defining button for 'start service' button functionality
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=33;
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/

        b13=(Button) view.findViewById(R.id.day13);//defining button for 'start service' button functionality
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=27;
                MainActivity.text="YOUR DAY-13";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        b14=(Button) view.findViewById(R.id.day14);//defining button for 'start service' button functionality
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=30;
                MainActivity.text="YOUR DAY-14";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b15=(Button) view.findViewById(R.id.day15);//defining button for 'start service' button functionality
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=33;
                MainActivity.text="YOUR DAY-15";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        /*b16=(Button) view.findViewById(R.id.day16);//defining button for 'start service' button functionality
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=45;
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/

        b17=(Button) view.findViewById(R.id.day17);//defining button for 'start service' button functionality
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=36;
                MainActivity.text="YOUR DAY-17";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b18=(Button) view.findViewById(R.id.day18);//defining button for 'start service' button functionality
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=39;
                MainActivity.text="YOUR DAY-18";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        b19=(Button) view.findViewById(R.id.day19);//defining button for 'start service' button functionality
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=42;
                MainActivity.text="YOUR DAY-19";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        /*b20=(Button) view.findViewById(R.id.day20);//defining button for 'start service' button functionality
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=57;
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/

        b21=(Button) view.findViewById(R.id.day21);//defining button for 'start service' button functionality
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=45;
                MainActivity.text="YOUR DAY-21";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b22=(Button) view.findViewById(R.id.day22);//defining button for 'start service' button functionality
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=48;
                MainActivity.text="YOUR DAY-22";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b23=(Button) view.findViewById(R.id.day23);//defining button for 'start service' button functionality
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=51;
                MainActivity.text="YOUR DAY-23";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        /*b24=(Button) view.findViewById(R.id.day24);//defining button for 'start service' button functionality
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=69;
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/

        b25=(Button) view.findViewById(R.id.day25);//defining button for 'start service' button functionality
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=54;
                MainActivity.text="YOUR DAY-25";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b26=(Button) view.findViewById(R.id.day26);//defining button for 'start service' button functionality
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=57;
                MainActivity.text="YOUR DAY-26";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b27=(Button) view.findViewById(R.id.day27);//defining button for 'start service' button functionality
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=60;
                MainActivity.text="YOUR DAY-27";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        /*b28=(Button) view.findViewById(R.id.day28);//defining button for 'start service' button functionality
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=81;
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/


        b29=(Button) view.findViewById(R.id.day29);//defining button for 'start service' button functionality
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=63;
                MainActivity.text="YOUR DAY-29";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b30=(Button) view.findViewById(R.id.day30);//defining button for 'start service' button functionality
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.count=66;
                MainActivity.text="YOUR DAY-30";
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,d1);
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