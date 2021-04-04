package edu.bzu.a1170271_mohammadhajjeh_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Calendar;

public class Registration extends AppCompatActivity {
    Spinner yearSpinner;
    Spinner monthSpinner;
    Spinner daySpinner;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioMale;
    EditText emailAddressInputField;
    EditText firstNameInputField;
    EditText lastNameInputField;
    EditText passwordInputField;
    EditText confirmPasswordInputField;
    EditText phoneNumberInputField;
    Switch studySwitch;
    Switch workSwitch;
    Switch marriedSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        emailAddressInputField = (EditText) findViewById(R.id.emailAddressInput);
        firstNameInputField = (EditText) findViewById(R.id.firstNameInput);
        lastNameInputField = (EditText) findViewById(R.id.lastNameInput);
        passwordInputField = (EditText) findViewById(R.id.passwordInput);
        confirmPasswordInputField = (EditText) findViewById(R.id.confirmPasswordInput);
        phoneNumberInputField = (EditText) findViewById(R.id.phoneNumberInput);
        monthSpinner = (Spinner) findViewById(R.id.spinnerMonth);
        daySpinner = (Spinner) findViewById(R.id.spinnerDay);
        yearSpinner = (Spinner) findViewById(R.id.spinnerYear);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioMale = (RadioButton) findViewById(R.id.radioButtonMale);
        studySwitch = (Switch) findViewById(R.id.studentSwitch);
        workSwitch = (Switch) findViewById(R.id.workSwitch);
        marriedSwitch = (Switch) findViewById(R.id.marriedSwitch);
        radioMale.toggle();
        populateSpinner();
    }

    private void populateSpinner() {
        ArrayList<String> arrayListMonth = new ArrayList<>();
        arrayListMonth.add("Month");
        arrayListMonth.add("January ");
        arrayListMonth.add("February");
        arrayListMonth.add("March");
        arrayListMonth.add("April");
        arrayListMonth.add("May");
        arrayListMonth.add("June");
        arrayListMonth.add("July");
        arrayListMonth.add("August");
        arrayListMonth.add("September");
        arrayListMonth.add("October");
        arrayListMonth.add("November");
        arrayListMonth.add("December");
        ArrayAdapter<String> arrayAdapterMonth = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrayListMonth);
        monthSpinner.setAdapter(arrayAdapterMonth);
        ArrayList<String> arrayListDay = new ArrayList<>();
        arrayListDay.add("Day");
        for(int i=1;i<=31;i++)
            arrayListDay.add(i+"");
        ArrayAdapter<String> arrayAdapterDay = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrayListDay);
        daySpinner.setAdapter(arrayAdapterDay);
        ArrayList<String> arrayListYear= new ArrayList<>();
        arrayListYear.add("Year");
        for(int i = Calendar.getInstance().get(Calendar.YEAR); i>=0; i--)
            arrayListYear.add(i+"");
        ArrayAdapter<String> arrayAdapterYear = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrayListYear);
        yearSpinner.setAdapter(arrayAdapterYear);
    }

    public void register_onClick(View view) {
        Intent intent = new Intent(this,ProfileInformation.class);
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        intent.putExtra("NAME",firstNameInputField.getText()+" "+lastNameInputField.getText());
        intent.putExtra("EMAIL",emailAddressInputField.getText().toString());
        intent.putExtra("PHONE",phoneNumberInputField.getText().toString());
        intent.putExtra("MONTH",monthSpinner.getSelectedItem().toString());
        intent.putExtra("DAY",daySpinner.getSelectedItem().toString());
        intent.putExtra("YEAR",yearSpinner.getSelectedItem().toString());
        intent.putExtra("GENDER",radioButton.getText());
        intent.putExtra("PASSWORD",passwordInputField.getText().toString().trim());
        if(studySwitch.isChecked())
            intent.putExtra("STUDY","YES");
        else
            intent.putExtra("STUDY","NO");
        if(workSwitch.isChecked())
            intent.putExtra("WORK","YES");
        else
            intent.putExtra("WORK","NO");
        if(marriedSwitch.isChecked())
            intent.putExtra("MARRIED","YES");
        else
            intent.putExtra("MARRIED","NO");


        startActivity(intent);

    }
}