package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
	
	@Id
	private int id;
	@NonNull
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	private int anneeEtude;

}
