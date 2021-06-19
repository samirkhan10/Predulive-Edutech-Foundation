package com.example.preduliveedutech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class dashboardActivity extends AppCompatActivity {

    TextView emailhome,uidhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        emailhome=(TextView)findViewById(R.id.email_home);
        uidhome=(TextView)findViewById(R.id.uidhome);

        emailhome.setText(getIntent().getStringExtra("email").toString());
        uidhome.setText("UID :"+getIntent().getStringExtra("uid").toString());
    }

    public void logoutprocess(View view) {


        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(dashboardActivity.this,MainActivity.class));
    }
}