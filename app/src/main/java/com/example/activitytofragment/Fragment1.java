package com.example.activitytofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {

    private EditText edt1;
    private Button btn1;

    private View mView;

    private MainActivity mainActivity;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_1, container, false);
        mainActivity = (MainActivity) getActivity();

        edt1 = mView.findViewById(R.id.edtFrgUpdate);
        btn1 = mView.findViewById(R.id.btnFrgUpdate);

        edt1.setText(getArguments().getString("Name"));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatedata();
            }
        });

        return mView;
    }

    private void updatedata() {

        String str = edt1.getText().toString().trim();
        mainActivity.getEdt().setText(str);

    }
}