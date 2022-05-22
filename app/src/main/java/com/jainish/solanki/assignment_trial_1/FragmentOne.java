package com.jainish.solanki.assignment_trial_1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentOne extends Fragment {

    private Button basicEM;
    private Button engLab;
    private Button envsc;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentOne.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentOne newInstance(String param1, String param2) {
        FragmentOne fragment = new FragmentOne();
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
        View v = inflater.inflate(R.layout.fragment_one, container, false);

        basicEM = v.findViewById(R.id.BEM);
        basicEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl(" https://drive.google.com/drive/folders/1q7NOAfylrteHnl-sNS8d4kFw7vlDw5QD?usp=sharing\n");

            }
        });
        engLab =v.findViewById(R.id.enggLab);
        engLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://drive.google.com/drive/folders/1qJiL6FrDkE-rBHimgckYCtQ2KvSIAkRT?usp=sharing");
            }
        });
        envsc = v.findViewById(R.id.EVS);
        envsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://drive.google.com/drive/folders/1qGrmDtjXzBIzX1ZMd9EVkDeZ6pauOoGV?usp=sharing\n");
            }
        });


        // Inflate the layout for this fragment
        return v;


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}