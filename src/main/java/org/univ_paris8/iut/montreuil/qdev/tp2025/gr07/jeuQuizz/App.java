package org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entities.dtos.JoueurDTO;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> centreInteret = new ArrayList<>(); centreInteret.add("Jeux video");
        JoueurDTO joueurDTO = new JoueurDTO("Hamiodur", "hraman", 22122004, centreInteret, 1);
    }
}
