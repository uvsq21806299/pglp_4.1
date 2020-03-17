/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andri
 */
public class Annuaire implements PersonnelFonction{
    
    private final List<PersonnelFonction> childFonction = new ArrayList<>();
	
	@Override
	public void print() {
		for (PersonnelFonction persoFct : childFonction) {
			persoFct.print();
		}
	}
	
	public void add(PersonnelFonction persoFct) {
		childFonction.add(persoFct);
	}
	
	public void remove(PersonnelFonction persoFct) {
		childFonction.remove(persoFct);
	}
    
}
