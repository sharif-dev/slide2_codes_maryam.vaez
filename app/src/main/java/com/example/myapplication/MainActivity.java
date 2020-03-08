package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Activity;
import android.app.Dialog;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivityTag" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button btn_ex =  findViewById(R.id.button_send);
//        btn_ex.setOnClickListener(new View.OnClickListener() {
//                                      @Override
//                                      public void onClick(View v) {
//                                          Log.i(TAG, "Button is clicked");
//                                          Toast.makeText(getApplication(), getString(R.string.click), Toast.LENGTH_LONG).show();
//                                      }
//                                  });

//
//
//        EditText editText = findViewById(R.id.search);
//        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                boolean handled = false;
//                if (actionId == EditorInfo.IME_ACTION_SEND){
//                    sendMessage();
//                    handled = true;
//                }
//                return handled;
//            }
//        });



//        AutoCompleteTextView textView = findViewById(R.id.autocomplete_country);
//        String[]  countries = getResources().getStringArray(R.array.country_array);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , countries);
//        textView.setAdapter(adapter);


//        ToggleButton toggleButton = findViewById(R.id.togglebutton);
//        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked)
//                    Toast.makeText(getApplication(), "toggle is enabled", Toast.LENGTH_LONG).show();
//                else
//                    Toast.makeText(getApplication(), "toggle is disabled", Toast.LENGTH_LONG).show();
//
//            }
//        });


//        Spinner spinner = findViewById(R.id.planets_spinner);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this , R.array.planet_array , android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);


//        ConstraintLayout.LayoutParams a = (ConstraintLayout.LayoutParams) text.getLayoutParams();
//        Log.i("constraint param", a.width+"");
    }
    void sendMessage(){
        Toast.makeText(getApplication(), getString(R.string.send), Toast.LENGTH_LONG).show();
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager() , "TimePicker");
    }

    public void showDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager() , "DatePicker");
    }


//    public void onRadioButtonClicked(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//
//        switch (view.getId()){
//            case R.id.radio_pirates:
//                if(checked)
//                    Toast.makeText(getApplication(), "Pirates are the best", Toast.LENGTH_LONG).show();
//                break;
//            case R.id.radio_ninjas:
//                if(checked)
//                    Toast.makeText(getApplication(), "Ninjas are the best", Toast.LENGTH_LONG).show();
//                break;
//        }
//    }
}



