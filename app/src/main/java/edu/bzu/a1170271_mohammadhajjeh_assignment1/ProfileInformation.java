package edu.bzu.a1170271_mohammadhajjeh_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
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
        final TextView genderTxt = (TextView) findViewById(R.id.genderTxt);
        final Switch studySwitch = (Switch) findViewById(R.id.studySwitch);
        final Switch workSwitch = (Switch) findViewById(R.id.workedSwitch);
        final Switch marriedSwitch = (Switch) findViewById(R.id.marrySwitch);
        final Button backToRegister = (Button) findViewById(R.id.backRegisterButton);
        final Button exitButton = (Button) findViewById(R.id.exitButton);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
        String gender = intent.getStringExtra("GENDER");
        String month = intent.getStringExtra("MONTH");
        String day = intent.getStringExtra("DAY");
        String year = intent.getStringExtra("YEAR");
        String password = intent.getStringExtra("PASSWORD");
        String study = intent.getStringExtra("STUDY");
        String work = intent.getStringExtra("WORK");
        String married = intent.getStringExtra("MARRIED");
        if(study.equalsIgnoreCase("yes"))
        studySwitch.setChecked(true);
        else
            studySwitch.setChecked(false);
        if(work.equalsIgnoreCase("yes"))
            workSwitch.setChecked(true);
        else
            workSwitch.setChecked(false);
        if(married.equalsIgnoreCase("yes"))
            marriedSwitch.setChecked(true);
        else
            marriedSwitch.setChecked(false);
        nameTxt.setText(" " + name);
        emailTxt.setText(" " + email);
        phoneTxt.setText(" "+phone);
        calendarTxt.setText("   "+month+" "+day+","+year);
        passwordTxt.setText("  "+password);
        if (gender.equalsIgnoreCase("female")) {
            genderTxt.setText(" Female");
            profileHeaderImage.setImageResource(R.drawable.femalep);
            nameTxt.setTextColor(Color.parseColor("#ffff8800"));
            emailTxt.setTextColor(Color.parseColor("#ffff8800"));
            phoneTxt.setTextColor(Color.parseColor("#ffff8800"));
            calendarTxt.setTextColor(Color.parseColor("#ffff8800"));
            passwordTxt.setTextColor(Color.parseColor("#ffff8800"));
            genderTxt.setTextColor(Color.parseColor("#ffff8800"));
            studySwitch.setTextColor(Color.parseColor("#ffff8800"));
            workSwitch.setTextColor(Color.parseColor("#ffff8800"));
            marriedSwitch.setTextColor(Color.parseColor("#ffff8800"));
            backToRegister.setTextColor(Color.parseColor("#ffff8800"));
            exitButton.setTextColor(Color.parseColor("#ffff8800"));

        }
        else {
            genderTxt.setText(" Male");
            profileHeaderImage.setImageResource(R.drawable.malep);
            nameTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            emailTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            phoneTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            calendarTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            passwordTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            genderTxt.setTextColor(Color.parseColor("#ff33b5e5"));
            studySwitch.setTextColor(Color.parseColor("#ff33b5e5"));
            workSwitch.setTextColor(Color.parseColor("#ff33b5e5"));
            marriedSwitch.setTextColor(Color.parseColor("#ff33b5e5"));
            backToRegister.setTextColor(Color.parseColor("#ff33b5e5"));
            exitButton.setTextColor(Color.parseColor("#ff33b5e5"));

        }
    }

    public void back_register_onClick(View view) {
        finish();
        System.exit(0);

    }

    public void register_onClick(View view) {
        Intent intent = new Intent(this,Registration.class);
        startActivity(intent);
    }
}