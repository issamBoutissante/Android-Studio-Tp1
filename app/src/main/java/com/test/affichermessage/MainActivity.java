package com.test.affichermessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message=findViewById(R.id.messageText);
    }

    public void Show(View view) {
        Intent intent=new Intent(this,MessageActivity.class);
        intent.putExtra("message",message.getText().toString());
        startActivity(intent);
    }
}