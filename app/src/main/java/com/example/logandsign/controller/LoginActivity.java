package com.example.logandsign.controller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.logandsign.R;
import com.example.logandsign.model.Sign;

import java.io.Serializable;

public class LoginActivity extends AppCompatActivity implements Serializable {

    public static final String KAY_BUNDEL_EDITTEXT = "kay bundel editText";
    public static final String EXTRA_KAY = "userName";
    public static final int REQUEST_CODE_SIGNUP_ACTIVITY = 0;
    private Button mButtomLogin;
    private Button mButtomSignup;
    private EditText mEditTextUserName;
    private EditText mEditTextPassWord;
    private Sign mSign;
    private String mUserName;
    private String mPassWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findAllViews();


        if (savedInstanceState != null) {
            mSign = (Sign) savedInstanceState.getSerializable(KAY_BUNDEL_EDITTEXT);
        } else {
            mSign = new Sign();
        }
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
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);

                if (mUserName == null && mPassWord == null) {
                    mSign.setUserName("");
                    mSign.setPassWordd("");
                }
                intent.putExtra(EXTRA_KAY, mSign);
                startActivityForResult(intent, REQUEST_CODE_SIGNUP_ACTIVITY);
            }
        });

        mEditTextUserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mUserName = mEditTextUserName.getText().toString();
                mSign.setUserName(charSequence.toString());
//                mUserName = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mEditTextPassWord.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mPassWord = mEditTextPassWord.getText().toString();
                mSign.setPassWordd(charSequence.toString());
//                mPassWord = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void findAllViews() {
        mButtomLogin = findViewById(R.id.button_login);
        mButtomSignup = findViewById(R.id.button_signUp1);
        mEditTextUserName = findViewById(R.id.editText_userName);
        mEditTextPassWord = findViewById(R.id.editText_passWord);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mUserName != null && mPassWord != null) {
            outState.putSerializable(KAY_BUNDEL_EDITTEXT, mSign);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}