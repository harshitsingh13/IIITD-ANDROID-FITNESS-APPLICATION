package com.mc2022.template;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link meditation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class meditation extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button b1,b2,b3,b4,b41,b51,b61, p1,p2,p3,p4,p41,p51,p61, s1,s2,s3,s4,s41,s51,s61;
    MediaPlayer music1 = null,music2 = null,music3 = null,music4 = null,music41 = null,music51 = null,music61 = null;
    public meditation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment meditation.
     */
    // TODO: Rename and change types and number of parameters
    public static meditation newInstance(String param1, String param2) {
        meditation fragment = new meditation();
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
        View view=inflater.inflate(R.layout.fragment_meditation, container, false);

        music1=MediaPlayer.create(getActivity(), R.raw.one_min);
        music2=MediaPlayer.create(getActivity(), R.raw.four_min);
        music3=MediaPlayer.create(getActivity(), R.raw.ten_min);
        music4=MediaPlayer.create(getActivity(), R.raw.fifteen_min);
        music41=MediaPlayer.create(getActivity(), R.raw.body_scan);
        music51=MediaPlayer.create(getActivity(), R.raw.fifteen_min_rebounce);
        music61=MediaPlayer.create(getActivity(), R.raw.mindful_eating);

        b1=(Button) view.findViewById(R.id.play1);//defining button for 'start service' button functionality
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music1.start();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        p1=(Button) view.findViewById(R.id.pause1);//defining button for 'start service' button functionality
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music1!=null)
                    music1.pause();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        s1=(Button) view.findViewById(R.id.stop1);//defining button for 'start service' button functionality
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music1.stop();
                    music1=MediaPlayer.create(getActivity(), R.raw.one_min);
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b2=(Button) view.findViewById(R.id.play2);//defining button for 'start service' button functionality
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music2.start();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        p2=(Button) view.findViewById(R.id.pause2);//defining button for 'start service' button functionality
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music2!=null)
                    music2.pause();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        s2=(Button) view.findViewById(R.id.stop2);//defining button for 'start service' button functionality
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music2.stop();
                    music2=MediaPlayer.create(getActivity(), R.raw.four_min);

                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b3=(Button) view.findViewById(R.id.play3);//defining button for 'start service' button functionality
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music3.start();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        p3=(Button) view.findViewById(R.id.pause3);//defining button for 'start service' button functionality
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music3!=null)
                    music3.pause();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        s3=(Button) view.findViewById(R.id.stop3);//defining button for 'start service' button functionality
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music3.stop();
                    music3=MediaPlayer.create(getActivity(), R.raw.ten_min);

                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        b4=(Button) view.findViewById(R.id.play4);//defining button for 'start service' button functionality
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music4.start();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        p4=(Button) view.findViewById(R.id.pause4);//defining button for 'start service' button functionality
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music4!=null)
                    music4.pause();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        s4=(Button) view.findViewById(R.id.stop4);//defining button for 'start service' button functionality
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music4.stop();
                    music4=MediaPlayer.create(getActivity(), R.raw.fifteen_min);
//Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        b41=(Button) view.findViewById(R.id.play41);//defining button for 'start service' button functionality
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music41.start();

                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        p41=(Button) view.findViewById(R.id.pause41);//defining button for 'start service' button functionality
        p41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music41!=null)
                    music41.pause();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        s41=(Button) view.findViewById(R.id.stop41);//defining button for 'start service' button functionality
        s41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music41.stop();
                    music41=MediaPlayer.create(getActivity(), R.raw.body_scan);
//Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b51=(Button) view.findViewById(R.id.play51);//defining button for 'start service' button functionality
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music51.start();

                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        p51=(Button) view.findViewById(R.id.pause51);//defining button for 'start service' button functionality
        p51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music51!=null)
                    music51.pause();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        s51=(Button) view.findViewById(R.id.stop51);//defining button for 'start service' button functionality
        s51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music51.stop();
                    music51=MediaPlayer.create(getActivity(), R.raw.fifteen_min_rebounce);

                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b61=(Button) view.findViewById(R.id.play61);//defining button for 'start service' button functionality
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music61.start();

                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        p61=(Button) view.findViewById(R.id.pause61);//defining button for 'start service' button functionality
        p61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music61!=null)
                    music61.pause();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        s61=(Button) view.findViewById(R.id.stop61);//defining button for 'start service' button functionality
        s61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    music61.stop();
                    music61=MediaPlayer.create(getActivity(), R.raw.mindful_eating);
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        return view;
    }
}