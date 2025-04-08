package org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entites.dto.DeterminerElementDispoPourPartieDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entities.dtos.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.services.implementations.fichierServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.services.interfaces.DeterminerElementDispoPourPartieInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.utils.exceptions.ChargementListeJoueurInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.utils.exceptions.ChargementListeQuestionnaireException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.utils.exceptions.LancementPartieException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeterminerElementDispoPourPartieServiceImpl implements DeterminerElementDispoPourPartieInterface {
    @Override
    public DeterminerElementDispoPourPartieDTO lancementPartie() throws LancementPartieException {

        JoueurServiceImpl joueurService = new JoueurServiceImpl();
        fichierServices questionnaireService= new fichierServices();
        ArrayList<JoueurDTO> listejoueurs = joueurService.getJoueurs();
        ArrayList<QuestionnaireDTO> listeQuestionnnaires = questionnaireService.getQuestionnaires();

        Map<String, String> joueurs = new HashMap<>();


        if(!listeQuestionnnaires.isEmpty()) {
            throw new ChargementListeQuestionnaireException();
        }
        if(!listejoueurs.isEmpty()) {
            throw new ChargementListeJoueurInvalideException();
        }

        for (JoueurDTO joueur : listejoueurs) {
            joueurs.put(joueur.getPrenom(), joueur.getPseudo());
        }

        return new DeterminerElementDispoPourPartieDTO(listeQuestionnnaires,joueurs);
    }
}
