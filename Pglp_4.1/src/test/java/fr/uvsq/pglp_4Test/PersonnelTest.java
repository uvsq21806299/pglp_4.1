/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4Test;

import static org.junit.Assert.*;


import fr.uvsq.pglp_4.Annuaire;
import fr.uvsq.pglp_4.Personnel;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author andri
 */
public class PersonnelTest {
    
    Personnel personne1;
    Personnel personne2;
    Personnel personne3;
    Personnel personne4;
    
    Annuaire groupe1;
    Annuaire groupe2;
    
    @Before
    public void setUp() {
        personne1 = new Personnel
                .Builder("RAMAROSON", "Andritsalama", 2).build();
        personne2 = new Personnel
                .Builder("JEAN", "Richard", 4).build();
        personne3 = new Personnel
                .Builder("JEAN", "Christophe", 6).build();
        personne4 = new Personnel
                .Builder("TSARA", "Mur", 7).build();
        
        groupe1 = new Annuaire(1);
        groupe2 = new Annuaire(5);
    }
    

    @Test
    public void test() {
        groupe1.add(groupe2);
        groupe1.add(personne1);
        
        groupe2.add(personne2);
        groupe2.add(groupe1);
        
        groupe1.print();
        groupe2.print();
    }
}
