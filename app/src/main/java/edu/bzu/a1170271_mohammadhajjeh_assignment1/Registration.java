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
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Calendar;

public class Registration extends AppCompatActivity {
    Spinner yearSpinner;
    Spinner monthSpinner;
    Spinner daySpinner;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        final EditText emailAddressInputField = (EditText) findViewById(R.id.emailAddressInput);
        final EditText firstNameInputField = (EditText) findViewById(R.id.firstNameInput);
        final EditText lastNameInputField = (EditText) findViewById(R.id.lastNameInput);
        final EditText passwordInputField = (EditText) findViewById(R.id.passwordInput);
        final EditText confirmPasswordInputField = (EditText) findViewById(R.id.confirmPasswordInput);
        final EditText phoneNumberInputField = (EditText) findViewById(R.id.phoneNumberInput);
        monthSpinner = (Spinner) findViewById(R.id.spinnerMonth);
        daySpinner = (Spinner) findViewById(R.id.spinnerDay);
        yearSpinner = (Spinner) findViewById(R.id.spinnerYear);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
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
        intent.putExtra("GENDER",radioButton.getText());
        startActivity(intent);

    }
}