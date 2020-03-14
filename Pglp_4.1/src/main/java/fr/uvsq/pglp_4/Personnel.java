/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.time.LocalDateTime;

/**
 *
 * @author andri
 */


public final class Personnel {
	
		private final String nom;
		private final String prenom;
		private LocalDateTime dateNaiss = LocalDateTime.now();
		private final int numeroTel;
		
		// Classe Builder 
		
		public static class Builder{

			private final String nom;
			private final String prenom;
			private final LocalDateTime dateNaiss;
			private final int numeroTel;
			
			
			public Builder(String nom, String prenom, LocalDateTime dateNaiss, int numeroTel ) {
				this.nom = nom;
				this.prenom = prenom;
				this.dateNaiss = dateNaiss;
				this.numeroTel = numeroTel;
				
			}
			
			public Personnel build() {
				return new Personnel(this);
			}
			
		}
		
		// Constructeur Personnel avec Builder
		
		private Personnel(Builder builder) {
			nom = builder.nom;
			prenom = builder.prenom;
			dateNaiss = builder.dateNaiss;
			numeroTel = builder.numeroTel;
			
			
		}

		public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public int getNumeroTel() {
			return numeroTel;
		}

		public LocalDateTime getDateNaiss() {
			return dateNaiss;
		}
		
		
		
}

