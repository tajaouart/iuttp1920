package fr.aylan.puissancequatre;

import android.app.Application;

import java.util.ArrayList;

import fr.aylan.puissancequatre.Model.Joueur;

public class App extends Application {

    int nbrPlayers;
    int gridDimensions;
    ArrayList<Joueur> joueurs ;
    ArrayList<Integer> colors ;



    public void initialize(int nbtJoueurs){
       joueurs = new ArrayList<>(nbtJoueurs);
       colors = new ArrayList<>(4);
       colors.add(R.drawable.green_pion);
       colors.add(R.drawable.red_pion);
       colors.add(R.drawable.purple_pion);
       colors.add(R.drawable.yellow_pion);
    }


    public void addJoueur(Joueur joueur){
        this.joueurs.add(joueur);
     }

    public Joueur getJoueur(int i){
        return this.joueurs.get(i);
    }

    public ArrayList<Joueur> getAllJoueurs(){
        return this.joueurs;
    }






}
