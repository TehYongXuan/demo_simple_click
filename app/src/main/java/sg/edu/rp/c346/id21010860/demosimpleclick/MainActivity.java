package sg.edu.rp.c346.id21010860.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton toggleButton;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        toggleButton = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                String txt = etInput.getText().toString();
//                String stringResponse = etInput.getText().toString();
//                tvDisplay.setText(stringResponse);
////                Toast.makeText(MainActivity.this,txt, Toast.LENGTH_LONG).show();

                String stringResponse = etInput.getText().toString();

                int checkedRadioId = rgGender.getCheckedRadioButtonId();

                String txt = "";

                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    txt = "He says " + stringResponse;

                }
                else{
                    // Write the code when female selected
                    txt = "She says " + stringResponse;


                }
                tvDisplay.setText(txt);

            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButton.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });


    }
}


