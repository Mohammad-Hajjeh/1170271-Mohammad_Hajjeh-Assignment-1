package edu.bzu.a1170271_mohammadhajjeh_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_information);
        final ImageView profileHeaderImage = (ImageView) findViewById(R.id.profileImageView);
        final TextView nameTxt = (TextView) findViewById(R.id.nameTxt);
        final TextView emailTxt = (TextView) findViewById(R.id.emailTxt);
        final TextView phoneTxt = (TextView) findViewById(R.id.phoneTxt);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
        String gender = intent.getStringExtra("GENDER");
        nameTxt.setText(" " + name);
        emailTxt.setText(" " + email);
        phoneTxt.setText(phone);
        if (gender.equalsIgnoreCase("female")) {
            profileHeaderImage.setImageResource(R.drawable.femalep);
            nameTxt.setTextColor(Color.parseColor("#ffff8800"));
            emailTxt.setTextColor(Color.parseColor("#ffff8800"));
            phoneTxt.setTextColor(Color.parseColor("#ffff8800"));

        }
        else {
            profileHeaderImage.setImageResource(R.drawable.malep);
            nameTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            emailTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            phoneTxt.setTextColor(Color.parseColor("#ff33b5e5"));
        }
    }
}