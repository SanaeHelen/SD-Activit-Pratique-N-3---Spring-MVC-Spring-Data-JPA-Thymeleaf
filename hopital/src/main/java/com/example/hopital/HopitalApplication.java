package com.example.hopital;

import com.example.hopital.entities.Patient;
import com.example.hopital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(HopitalApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        // Création d'un patient en utilisant le constructeur par défaut
        Patient patient=new Patient();
        patient.setId(null);
        patient.setNom("Mohammed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);
        // Enregistrement du patient dans la base de données
        patientRepository.save(patient);

        // Création d'un patient en utilisant un autre constructeur
        Patient patien2 = new Patient(null,"Yassine",new Date(),false,123);
        // Enregistrement du deuxième patient dans la base de données
        patientRepository.save(patien2);

        // Création d'un patient en utilisant le pattern Builder
        Patient patient3= Patient.builder()
                .nom("Anas")
                .dateNaissance(new Date())
                .score(56)
                .malade(false)
                .build();
        // Enregistrement du troisième patient dans la base de données
        patientRepository.save(patient3);


        // Création et enregistrement d'un patient en une seule ligne
        patientRepository.save(new Patient(null,"Hanan",new Date(),false, 26));







    }
}
