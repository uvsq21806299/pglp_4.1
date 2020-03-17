/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author andri
 */


public final class Personnel {
	
		private final String nom;
		private final String prenom;
                private final int iD;
                
		private LocalDate dateNaiss;
		private final ArrayList<Integer> numeroTel;
		
		// Classe Builder 
		
		public static class Builder{

			private final String nom;
			private final String prenom;
                        private final int iD;
                        
			private LocalDate dateNaiss;
			private ArrayList<Integer>  numeroTel;
			
			
			public Builder(String nom, String prenom, int iD ) {
				this.nom = nom;
				this.prenom = prenom;
				this.iD = iD;
				
			}
                        
                        public Builder dateNaiss(int annee, int mois, int jour){
                            this.dateNaiss = LocalDate.of(annee, mois, jour);
                            return this; // erreur
                        }
			
                        public Builder numeroTel(int numeroTel){
                            this.numeroTel.add(numeroTel);
                            return this;
                        }
                        
			public Personnel build() {
				return new Personnel(this);
			}
			
		}
		
		// Constructeur Personnel avec Builder
		
		private Personnel(Builder builder) {
			nom = builder.nom;
			prenom = builder.prenom;
                        iD = builder.iD;
                        
			dateNaiss = builder.dateNaiss;
			numeroTel = builder.numeroTel;
			
			
		}

		public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public ArrayList<Integer> getNumeroTel() {
			return numeroTel;
		}

		public LocalDate getDateNaiss() {
			return dateNaiss;
		}
		
                
                
                
                @Override
                public String toString(){
                    String str = "ID : " + this.iD;
                    return str;
                }
		
		public void print(){
                    System.out.println("Information du presonnel ::  "  +this.iD
                            + "  " + this.nom +  "  " + this.prenom);
                    
                }
                
}

