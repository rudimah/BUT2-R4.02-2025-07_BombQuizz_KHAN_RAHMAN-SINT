package org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entites.dto;

import java.util.ArrayList;
import java.util.Map;

public class DeterminerElementDispoPourPartieDTO {
    ArrayList<String> questionnaires;
    Map<String, String> joueurs;
    public DeterminerElementDispoPourPartieDTO(ArrayList<String> questionnaires, Map<String, String> joueurs){
        this.questionnaires = questionnaires;
        this.joueurs = joueurs;
    }

}
