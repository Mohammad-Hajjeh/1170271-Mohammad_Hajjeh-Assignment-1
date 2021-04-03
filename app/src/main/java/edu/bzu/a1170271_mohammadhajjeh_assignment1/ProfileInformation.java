package edu.bzu.a1170271_mohammadhajjeh_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfileInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_information);
        ImageView profileHeaderImage = (ImageView) findViewById(R.id.profileImageView);
        Intent intent = getIntent();
        String gender = intent.getStringExtra("GENDER");
        if(gender.equalsIgnoreCase("male"))
            profileHeaderImage.setImageResource(R.drawable.malep);
        else
            profileHeaderImage.setImageResource(R.drawable.femalep);
    }
}