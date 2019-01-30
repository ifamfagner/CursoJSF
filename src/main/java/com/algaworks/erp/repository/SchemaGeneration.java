package com.algaworks.erp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.erp.model.Empresa;

public class SchemaGeneration {
	
	public static void main(String[] args) {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("AlgaWorksPU");
		 EntityManager manager = factory.createEntityManager();
		 
		 List<Empresa>empresas = manager.createQuery("from Empresa", Empresa.class).getResultList();
		 
		 manager.close();
		 factory.close();
		 
	}

}
