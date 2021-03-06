package io.redspark.gestta;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgotPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    protected void sendEmail(View v) {
        closeKeyboard();

        // TODO Apresentar mensagem de sucesso e voltar para a tela anterior
        Toast.makeText(this, "email enviado com sucesso", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 1500);
    }

    @OnClick(R.id.forgotContainer)
    protected void closeKeyboard() {
        View focus = getCurrentFocus();
        if(focus != null) {
            focus.clearFocus();
        }
    }
}
