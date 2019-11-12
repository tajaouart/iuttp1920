package fr.aylan.puissancequatre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ChoosePlayersNames extends AppCompatActivity {

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_players_names);

        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);


        radioButton1.setOnClickListener(first_radio_listener);
        radioButton2.setOnClickListener(second_radio_listener);
        radioButton3.setOnClickListener(third_radio_listener);
        radioButton4.setOnClickListener(fourth_radio_listener);

    }

    private void radiob1(View view) {
        radioButton1.setChecked(true);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton4.setChecked(false);

    }
    private void radiob2(View view) {
        radioButton1.setChecked(false);
        radioButton2.setChecked(true);
        radioButton3.setChecked(false);
        radioButton4.setChecked(false);

    }
    private void radiob3(View view) {
        radioButton1.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(true);
        radioButton4.setChecked(false);

    }
    private void radiob4(View view) {
        radioButton1.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton4.setChecked(true);

    }


    OnClickListener first_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radiob1(null);
        }
    };

    OnClickListener second_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radiob2(null);
        }
    };

    OnClickListener third_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radiob3(null);
        }
    };
    OnClickListener fourth_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radiob4(null);
        }
    };



}
