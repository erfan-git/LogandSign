package com.example.logandsign.controller;

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

import static com.example.logandsign.controller.LoginActivity.EXTRA_KAY;

public class SignUpActivity extends AppCompatActivity {
    public static final String EXTRA_KAY_USER_NAME_1 = "com.example.logandsign.controller.userName";
    private Button mButtomSignup1;
    private EditText mEditTextUserName1;
    private EditText mEditTextPassWord1;
    private String mUserName1;
    private String mPassWord1;
    private Sign mSign = new Sign();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Intent intent = getIntent();
        mSign = (Sign) intent.getSerializableExtra(EXTRA_KAY);
        if (mSign.getUserName() != null){
            mEditTextUserName1.setText(mSign.getUserName());
        }
        if (mSign.getPassWordd() != null){
            mEditTextPassWord1.setText(mSign.getPassWordd());
        }

        findAllViews();
        setClickListeners();
    }

    private void setClickListeners() {
        mButtomSignup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(EXTRA_KAY_USER_NAME_1,mSign);
                setResult(RESULT_OK,intent);

                finish();
            }
        });

        mEditTextUserName1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mUserName1 = mEditTextUserName1.getText().toString();
                mSign.setUserName(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mEditTextPassWord1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mPassWord1 = mEditTextPassWord1.getText().toString();
                mSign.setPassWordd(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void findAllViews() {
        mButtomSignup1 = findViewById(R.id.button_signUp1);
        mEditTextUserName1 = findViewById(R.id.editText_userName1);
        mEditTextPassWord1 = findViewById(R.id.editText_passWord1);
    }
}