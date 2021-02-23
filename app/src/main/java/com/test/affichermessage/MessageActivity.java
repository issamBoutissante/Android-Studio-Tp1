package com.test.affichermessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {
    TextView MessageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        MessageText=findViewById(R.id.messageText);
        Intent intent=getIntent();
        if(intent.getExtras()!=null)
            MessageText.setText(MessageText.getText()+" "+intent.getExtras().getString("message"));
    }
}