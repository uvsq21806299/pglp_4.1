/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author andri
 */
public class Annuaire implements PersonnelFonction{
    
        private int IDgrp;
        public List<PersonnelFonction> childFonction = new ArrayList<>();
	
        public ArrayList<PersonnelFonction> gettan(){
            return (ArrayList<PersonnelFonction>)Collections.unmodifiableList(this.childFonction);
        }
        
        public Annuaire(int IDgrp){
            this.IDgrp = IDgrp;
        }
        
	@Override
	public void print() {
            System.out.println(this.IDgrp);
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
        
        public String toString(){
            String str = " ID : " + this.IDgrp;
            return str;
        }

    public void add(Personnel personne1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
