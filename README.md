# SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf

Partie 1 :

Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients.
 - Les dépendances :
 
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/fd628ae0-7a5a-444d-9d4b-1a4071ff9ce6)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/abc78006-7e53-4c58-b9d3-1b6986402e63)
   
 - L'entité Patient:
   
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/28906a3d-ad38-404f-9395-0e6771acb8db)

 - L'interface PatientRepository :
   
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/0f498838-2b8c-4b41-8f78-c5a74ae98b87)

 - La création des patients dans la classe HopitalApplication :
   
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/a19e5d53-3f71-41fe-865a-b0efdb94205c)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b2c16b84-98e2-460c-8f65-d6c553bd7789)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/fd14b613-099a-489f-8f71-3455c0f07592)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3b9d1213-abf8-47a2-96e0-d7159e041da4)

 - L'utilisation de H2 Database:
   
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/644a99cd-c892-4e73-859c-0ecf0a561940)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/90b1ae52-bc36-448b-a787-f377f58a7e6c)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/99d571a9-d638-480a-8e91-ba85db0ec9bd)






L'application doit permettre les fonctionnalités suivantes :
- Afficher les patients:
   - Patient Controller:
     
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b76a8752-79e0-4722-b36a-5ca0c844169d)
     
   - Bootstrap dependency:
     
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/17173380-3579-407a-8d59-e09e6c61d8c6)
  
   - le fichier patients.html:
     
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/2f3c1e8e-0eac-41f4-934f-160e3371444c)


   - L'affichage :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/57e93650-29d2-47bd-8fc2-00bac5c221ae)


     
      
    
    
- Faire la pagination :
  
   - La migration ver Mysql Database:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/9642b5ee-0f54-4900-9de7-aa2289183fd8)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/f8c55fe0-fdb4-4da1-b771-40ed50bf97fd)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/46d8d454-df26-47e1-aaa9-ed53ce373e49)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/57f84c95-7454-4f86-9fb3-252606d00118)

  
   - La classe PatientContoller:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/7b282cdd-a8e4-4fb5-832c-05c4fb3bc313)
     
   - le fichier html :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d2d3ea2f-9a35-4b9f-ab1b-bf668f0a9bcf)
     
   - L'affichage:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/97193154-414e-4a4c-99b2-54df91216928)



- Chercher les patients :
  
   - L'interface PatientRepository:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/87d099a9-f11f-4b4e-987e-da20ef881592)

  
   - La classe PatientContoller:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/acc9030d-455f-43a8-8a26-d780eeb183d7)

     
   - le fichier html :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/55443091-568d-4983-ae80-dc86c6ad40bc)

     
   - L'affichage:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/2f1c1e84-287a-476b-adcd-bed9e86ae690)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/6e062069-a74e-4ff8-80b9-73b62b7bc831)



- Supprimer un patient :
  
   - La classe PatientContoller:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/6e13ac2f-08e5-4eee-a73e-96ccf57e0bb3)


   - le fichier html :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/dd0bf225-7f44-4c10-b56a-44a689d78fee)

     
   - L'affichage:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/cbe73239-7b5d-435d-90e5-9e2bd51562a3)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/887282e6-524d-4772-9d59-6cd14da1a77f)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/afc584e2-4a5d-4f8b-a663-5eb9e7730b16)



- Faire des améliorations supplémentaires :
  
   - Garder le mot-clé:
 
     - La methode delete:
     
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/4a01278b-21bf-4a77-9534-f1bae658f378)
       
     - Le fichier html:
       
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3566104b-841b-4979-b55e-7a839f2ff44d)
     
     - L'affichage :
       
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/056714b6-843f-48b5-b421-1d81d4eaf325)
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/273bcd18-592d-450d-b808-4c94a88acd3a)


   - Ajouter les icons:
     
      - Ajouter la dépendance de bootstrap-icons:
     
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/74435d19-e8e3-4378-bfd6-96f50c6e2923)
       
     - Le fichier html:
       
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/7931754c-cce3-4bf5-91ba-e3dca7c0e04f)
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/24344347-4bbc-445d-9dcf-5e4b54924c33)
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/40a000ed-6ad5-44b6-b541-80f7925ad921)
     
     - L'affichage :
       
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/8e83aea0-5f9e-4d43-b25a-fe75d196721f)
 

     
       
       
       



  
     




Partie 2  : 

 - Créer une page template :
   
    - L'ajout du dépendance thymeleaf layout dialect dans le fichier pom.xml :
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/62a6b583-a7df-45cb-8bb3-1f134b947556)

    - Le fichier template.html :

        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/dfa13719-d6d3-4ff1-847f-234e84e7bb8c)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/0490e86b-027c-496e-8d86-200a37e561b3)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/04429114-14e5-4468-a7ea-056bf6b8f953)


    - On va ajouter {layout:fragment="content1"} dans le fichier patient.html :

        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/c88b0e55-2961-437b-930a-53d06521c5ac)

    - L'affichage :
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/235e3165-6ffb-4787-9837-89202f7d5e8a)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/f92b4bda-6925-4690-92b8-e6b8bcad1c9a)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/553b9789-88a5-4f32-90b4-2eddb56d6ae9)

  - Nouveau Patient :

    - Le fichier PatientController.java :
        - La methode formPatients() pour ajouter un nouveau patient et renvoyer la vue formPatients :
          
             ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/c3614cdb-8536-4e19-b3e5-10a0196ed655)
           
        - La methode save() pour sauvegarder le nouveau patient :
          
             ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/1139091f-82a3-4df6-8b19-fe223f26c4ec)


    - Le fichier formPatient.html :
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/64ac10f0-4ca7-4800-b647-770b02bb6a95)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/31850d57-6537-4079-bf1d-c302ad24759a)


    - L'affichage: 

        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b735fecc-4a2f-4163-abd8-3fb32fca0393)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/9f92e4c5-7829-43f9-9844-350e1901f779)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/52c641b4-0e0e-4bb2-8013-11b89197529c)


      
-Faire la validation des formulaires: 

   - Ajout du dépendance Spring Boot Starter Validation:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d4eb6198-4b05-4d1d-a2f2-312c100c6a90)
     
   - Ajout des annotations de validation dans l'entité Patient :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/a9b08fba-774a-464c-9c4a-45e4a6b27e00)
     
   - Ajout de l'annotation "@Valid" dans la methode save() du fichier PatientController:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/cca313c1-31fa-4d27-807c-0042bf19e65d)
     
   - Teste de validation :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/8e761307-50f3-42ce-b2ba-c77dca6e1976)

-Modification des données du patient : 
       
      
       




