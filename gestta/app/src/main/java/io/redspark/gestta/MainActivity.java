package io.redspark.gestta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    final static String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.activity_login_input_user) EditText editTextUser;
    @BindView(R.id.activity_login_input_pass) EditText editTextPass;
    @BindView(R.id.activity_login_button_enter) Button buttonEnter;
    @BindView(R.id.activity_login_button_forgot) Button buttonForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.activity_login_button_enter)
    protected void performLogin() {
        Log.d(TAG, "User: " + editTextUser.getText().toString());
        Log.d(TAG, "Pass: " + editTextPass.getText().toString());
    }

    @OnClick(R.id.activity_login_button_forgot)
    protected void goToForgotPassword() {
        Intent goToForgot = new Intent(this, ForgotPassActivity.class);
        startActivity(goToForgot);
    }


}
