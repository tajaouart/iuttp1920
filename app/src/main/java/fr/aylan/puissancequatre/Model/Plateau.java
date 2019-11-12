package fr.aylan.puissancequatre.Model;



import java.util.List;

import fr.aylan.puissancequatre.Model.EtatPartie;
import fr.aylan.puissancequatre.Model.Joueur;
import fr.aylan.puissancequatre.exceptions.ColonneInvalideException;
import fr.aylan.puissancequatre.exceptions.ColonnePleineException;
import fr.aylan.puissancequatre.exceptions.JoueurException;
import fr.aylan.puissancequatre.exceptions.PlateauInvalideException;

public class Plateau {

    /**
     * Construit un nouveau plateau de jeu vide
     * @param largeur la largeur du plateau
     * @param hauteur la hauteur du plateau
     * @param joueurs la liste des joueurs
     * @throws PlateauInvalideException si la taille du plateau est incorrecte (mini 4x4)
     * @throws JoueurException si le nombre de joueurs est invalide (5 max)
     */
    public Plateau(int largeur, int hauteur, List<Joueur> joueurs) throws PlateauInvalideException, JoueurException {
     // TODO
    }

    /**
     * Retourne la largeur du plateau
     * @return la largeur du plateau
     */
    public int getLargeur() {
        // TODO
        return -1;
    }

    /**
     * Retourne la hauteur du plateau
     * @return la hauteur du plateau
     */
    public int getHauteur() {
        // TODO
        return -1;
    }

    /**
     * Retourne le joueur qui doit jouer
     * @return le joueur qui doit jouer
     * @throws JoueurException si personne ne doit jouer (fin de partie...)
     */
    public Joueur getJoueurCourant() throws JoueurException {
        // TODO
        return null;
    }

    /**
     * Joue une position
     * @param j le joueur jouant la position
     * @param colonne l'indexe de la colonne jouée
     * @throws ColonneInvalideException si l'index de la colonne n'existe pas
     * @throws ColonnePleineException si la colonne jouée est déjà pleine
     * @throws JoueurException si ce n'est pas a ce joueur de jouer
     */
    public EtatPartie jouer(Joueur j, int colonne) throws ColonneInvalideException, ColonnePleineException, JoueurException {
        // TODO
        return EtatPartie.EN_COURS;
    }

    /**
     * Indique le gagnant d'une partie
     * @return le gagnant si un joueur a déjà gagné, null sinon
     */
    public Joueur getGagnant() {
        // TODO
        return null;
    }
}
