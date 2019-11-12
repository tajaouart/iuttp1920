package fr.aylan.puissancequatre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.function.Consumer;

import fr.aylan.puissancequatre.Model.Joueur;

public class ChoosePlayersNames extends AppCompatActivity {

    ArrayList<RadioButton> radioButtons;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;

    int leftNbrPlayers;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_players_names);

        disableNextButton();



        Intent intent = getIntent();
        leftNbrPlayers = intent.getIntExtra("leftNbrPlayers",0);

        radioButtons = new ArrayList<>(leftNbrPlayers);
        initializeRB();


        // initialise butoons
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);


        // set listeners to each  radioButton
        radioButton1.setOnClickListener(first_radio_listener);
        radioButton2.setOnClickListener(second_radio_listener);
        radioButton3.setOnClickListener(third_radio_listener);
        radioButton4.setOnClickListener(fourth_radio_listener);


    }

    private void initializeRB() {
        ArrayList<Integer> colors = ((App) getApplication()).colors;

        // id color is taken then disable RB
        if(colors.get(0) == null){
            findViewById(R.id.radioButton1).setEnabled(false);
        }
        if(colors.get(1) == null){
            findViewById(R.id.radioButton2).setEnabled(false);
        }
        if(colors.get(2) == null){
            findViewById(R.id.radioButton3).setEnabled(false);
        }
        if(colors.get(3) == null){
            findViewById(R.id.radioButton4).setEnabled(false);
        }


    }




    // Go to next player
    public void nextPlayer(View view){

        String nom = findViewById(R.id.etNom).toString();
        int imageSrc = 0;

        if(radioButton1.isChecked()){
            imageSrc = ((App) getApplication() ).colors.get(0);
            ((App) getApplication() ).colors.set(0,null);
        }else if(radioButton2.isChecked()){
            imageSrc = ((App) getApplication() ).colors.get(1);
            ((App) getApplication() ).colors.set(1,null);
        }else if(radioButton3.isChecked()){
            imageSrc = ((App) getApplication() ).colors.get(2);
            ((App) getApplication() ).colors.set(2,null);
        }else if(radioButton4.isChecked()){
            imageSrc = ((App) getApplication() ).colors.get(3);
            ((App) getApplication() ).colors.set(3,null);
        }


        Joueur j = new Joueur(nom,imageSrc) ;
        ((App) getApplication() ).addJoueur(j);
        if(leftNbrPlayers > 1){
            leftNbrPlayers--;
            Intent intent = new Intent(this, ChoosePlayersNames.class);
            intent.putExtra("leftNbrPlayers", leftNbrPlayers);
            startActivity(intent);
            finish();
        }else{
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void radioB1IsChecked(View view) {
        radioButton1.setChecked(true);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton4.setChecked(false);
        enableNextBtn();
    }

    void enableNextBtn(){
        findViewById(R.id.nextBtn).setEnabled(true);
    }

    void disableNextButton(){
        findViewById(R.id.nextBtn).setEnabled(false);
    }
    private void radioB2IsChecked(View view) {
        radioButton1.setChecked(false);
        radioButton2.setChecked(true);
        radioButton3.setChecked(false);
        radioButton4.setChecked(false);
        enableNextBtn();

    }
    private void radioB3IsChecked(View view) {
        radioButton1.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(true);
        radioButton4.setChecked(false);
        enableNextBtn();

    }
    private void radioB4IsChecked(View view) {
        radioButton1.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton4.setChecked(true);
        enableNextBtn();

    }


    // listeners
    OnClickListener first_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radioB1IsChecked(null);
        }
    };
    OnClickListener second_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radioB2IsChecked(null);
        }
    };
    OnClickListener third_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radioB3IsChecked(null);
        }
    };
    OnClickListener fourth_radio_listener = new OnClickListener (){
        public void onClick(View v) {
            radioB4IsChecked(null);
        }
    };



}
