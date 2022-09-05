package com.example.ipadtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.BlockingDeque;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        replaceFragment(new RightFragment());
        Log.e("mei", "onCreate: ");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn:
                replaceFragment(new RightFragment2());
                break;
            default:
                break;

        }
    }
    private void replaceFragment(Fragment fragment){
//        FragmentManager supportFragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.right_layout,fragment);
//        fragmentTransaction.addToBackStack(null);
//        //返回到刚才的界面
//        fragmentTransaction.commit();
    }
}