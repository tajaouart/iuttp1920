package fr.aylan.puissancequatre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etGridDimensions;
    EditText etNbrPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGridDimensions = findViewById(R.id.etGridDimensions);
        etNbrPlayers = findViewById(R.id.etNbrPlayers);
    }


    public void nextChoosePlayersNames(View view){
        int nbrPlayers = Integer.parseInt(etNbrPlayers.getText().toString());
        int gridDimensions = Integer.parseInt(etGridDimensions.getText().toString());

        Intent intent = new Intent(this, ChoosePlayersNames.class);
        intent.putExtra("nbrPlayers",nbrPlayers);
        intent.putExtra("gridDimensions",gridDimensions);

        startActivity(intent);




    }
}
