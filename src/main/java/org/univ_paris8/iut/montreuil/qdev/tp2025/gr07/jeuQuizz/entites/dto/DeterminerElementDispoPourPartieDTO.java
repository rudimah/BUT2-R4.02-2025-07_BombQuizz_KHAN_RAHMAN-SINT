package org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entites.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entities.dto.QuestionnaireDTO;

import java.util.ArrayList;
import java.util.Map;

public class DeterminerElementDispoPourPartieDTO {
    ArrayList<QuestionnaireDTO> questionnaires;
    Map<String, String> joueurs;
    public DeterminerElementDispoPourPartieDTO(ArrayList<QuestionnaireDTO> questionnaires, Map<String, String> joueurs){
        this.questionnaires = questionnaires;
        this.joueurs = joueurs;
    }

    public ArrayList<QuestionnaireDTO> getQuestionnaires() {
        return questionnaires;
    }

    public Map<String, String> getJoueurs() {
        return joueurs;
    }

    @Override
    public String toString() {
        return "DeterminerElementDispoPourPartieDTO{" +
                "questionnaires=" + questionnaires +
                ", joueurs=" + joueurs +
                '}';
    }
}
