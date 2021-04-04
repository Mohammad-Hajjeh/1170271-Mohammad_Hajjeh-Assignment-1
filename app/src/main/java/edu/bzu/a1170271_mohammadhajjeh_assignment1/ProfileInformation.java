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
        final TextView calendarTxt = (TextView) findViewById(R.id.calendarTxt);
        final TextView passwordTxt = (TextView) findViewById(R.id.passwordTxt);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
        String gender = intent.getStringExtra("GENDER");
        String month = intent.getStringExtra("MONTH");
        String day = intent.getStringExtra("DAY");
        String year = intent.getStringExtra("YEAR");
        String password = intent.getStringExtra("PASSWORD");
        nameTxt.setText(" " + name);
        emailTxt.setText(" " + email);
        phoneTxt.setText(" "+phone);
        calendarTxt.setText("   "+month+" "+day+","+year);
        passwordTxt.setText("  "+password);
        if (gender.equalsIgnoreCase("female")) {
            profileHeaderImage.setImageResource(R.drawable.femalep);
            nameTxt.setTextColor(Color.parseColor("#ffff8800"));
            emailTxt.setTextColor(Color.parseColor("#ffff8800"));
            phoneTxt.setTextColor(Color.parseColor("#ffff8800"));
            calendarTxt.setTextColor(Color.parseColor("#ffff8800"));
            passwordTxt.setTextColor(Color.parseColor("#ffff8800"));

        }
        else {
            profileHeaderImage.setImageResource(R.drawable.malep);
            nameTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            emailTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            phoneTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            calendarTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            passwordTxt.setTextColor(Color.parseColor("#ff33b5e5"));

        }
    }
}