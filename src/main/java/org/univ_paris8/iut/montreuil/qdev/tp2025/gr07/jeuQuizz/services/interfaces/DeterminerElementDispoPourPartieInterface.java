package org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entites.dto.DeterminerElementDispoPourPartieDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.utils.exceptions.LancementPartieException;

public interface DeterminerElementDispoPourPartieInterface {
    public DeterminerElementDispoPourPartieDTO lancementPartie() throws LancementPartieException;
}
