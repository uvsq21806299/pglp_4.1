/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.ArrayList;

/**
 *
 * @author andri
 */
public class Affichage {
    public ArrayList<PersonnelFonction> groupe = new ArrayList<>();
    
    public Affichage (PersonnelFonction admin){
        this.groupe.add(admin);
    }
    
    private class GroupeIterator implements Iterator{
        int index = 0;
        
        public GroupeIterator(){
            int verif = 0;
            while(verif < groupe.size()){
                if(groupe.get(verif) instanceof Annuaire){
                    Annuaire test = (Annuaire)groupe.get(verif);
                    int i = 0;
                    while(i<test.childFonction.size()){
                        groupe.add(test.childFonction.get(i));
                        i ++;
                    }
            }
                verif ++;
            }
    }
        
        @Override
        public boolean HasNext(){
            return index<groupe.size();
        
        }
        
        @Override
        public Annuaire Next(){
            if(this.HasNext()){
                index ++;
                return (Annuaire) groupe.get(index - 1);
            }
            return null;
        }
    }
    
    public Iterator getIterator(){
        return new GroupeIterator();
    }
    
    

}