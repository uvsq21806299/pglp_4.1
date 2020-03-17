/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4Test;

import fr.uvsq.pglp_4.Affichage;
import fr.uvsq.pglp_4.Annuaire;
import fr.uvsq.pglp_4.Iterator;
import fr.uvsq.pglp_4.Personnel;
import fr.uvsq.pglp_4.PersonnelFonction;
import org.junit.Test;

/**
 *
 * @author andri
 */
public class AffichageTest {
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void affichageTest() {
        
        Personnel personne1 = new Personnel
                .Builder("RAMAROSON", "Andritsalama", 2).build();
        Personnel personne2 = new Personnel
                .Builder("JEAN", "Richard", 4).build();
        Personnel personne3 = new Personnel
                .Builder("JEAN", "Christophe", 6).build();
        Personnel personne4 = new Personnel
                .Builder("TSARA", "Mur", 7).build();
        
        Annuaire groupe1 = new Annuaire(1);
        Annuaire groupe2 = new Annuaire(5);
        
        Affichage affiche = new Affichage(groupe1);
        Iterator groupeIterator = affiche.getIterator();
        while (groupeIterator.HasNext());
            PersonnelFonction nextValue = groupeIterator.Next();
            System.out.println("Next value iterator :  " + nextValue.toString());
    }
}
