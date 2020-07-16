package com.example.logandsign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button mButtomLogin;
    private Button mButtomSignup;
    private EditText mEditTextUserName;
    private EditText mEditTextPassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findAllViews();
        setClickListeners();
    }

    private void setClickListeners() {
        mButtomLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButtomSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditTextUserName != null && mEditTextPassWord != null){

                }else {

                }

            }
        });

        mEditTextUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mEditTextPassWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    private void findAllViews() {
        mButtomLogin = findViewById(R.id.button_login);
        mButtomSignup = findViewById(R.id.button_signUp);
        mEditTextUserName = findViewById(R.id.editText_userName);
        mEditTextPassWord = findViewById(R.id.editText_passWord);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}