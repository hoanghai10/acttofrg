package com.example.activitytofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt;
    private Button btn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.edtMainSave);
        btn = findViewById(R.id.btnMainSave);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendFragment();
            }
        });
    }

    private void sendFragment() {
        String str = edt.getText().toString().trim();

        Fragment1 fragment1 = new Fragment1();

        Bundle bundle = new Bundle();
        bundle.putString("Name",str);

        fragment1.setArguments(bundle);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frlMainFrg, fragment1);
        fragmentTransaction.commit();
    }

    public EditText getEdt() {
        return edt;
    }
}