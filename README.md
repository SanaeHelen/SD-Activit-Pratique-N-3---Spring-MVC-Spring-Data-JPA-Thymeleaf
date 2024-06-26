# SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf


Partie 1 :

- Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients.
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





- L'application doit permettre les fonctionnalités suivantes :
  
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


      
- Faire la validation des formulaires: 

   - Ajout du dépendance Spring Boot Starter Validation:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d4eb6198-4b05-4d1d-a2f2-312c100c6a90)
     
   - Ajout des annotations de validation dans l'entité Patient :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/a9b08fba-774a-464c-9c4a-45e4a6b27e00)
     
   - Ajout de l'annotation "@Valid" dans la methode save() du fichier PatientController:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/cca313c1-31fa-4d27-807c-0042bf19e65d)
     
   - Teste de validation :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/8e761307-50f3-42ce-b2ba-c77dca6e1976)

- Modification des données du patient :
    - On va ajouter le button edit dans le fichier patient.html :
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/cc00ce26-312e-42f1-b702-9701bff5cb92)
  
    - La methode editPatient() dans le fichier PatientController :
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b51cb665-15f1-4bf1-bda7-d9d110c23158)
      
    - La formulaire de modification dans le fichier editPatient.html :
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/1a0633e7-3e58-4f07-a363-8bebdbb5cc9f)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d0bd717a-eca5-4645-aa01-f764235c461c)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/443aafc3-88e3-43b1-89e1-0609c7a39e67)
      
    - L'affichage : 
         
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/7644031f-236a-428e-a59f-e4afc454d75e)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ea48217b-7062-487a-a957-b9a794fe986d)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ace11412-23b1-47e7-8744-a2996d4e7fde)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/00cbf085-e7d8-4d74-8109-1f368cce31e8)

   - Quand on cherche un patient et puis on fait une modification on garde toujours le mot-clé:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/0b2ffed3-fddc-4eeb-ba24-18b52916984f)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/13c0b732-9987-4e93-89ef-fdbdf5dc6d7a)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b2d1dc95-71e9-4503-9760-7fc45068967d)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/dbf87ade-e650-4980-b904-afe2d1fa56f7)


Partie 3 : 

 - Sécurité avec Spring security  : 
 
   - L'ajout du dépendance Spring Security :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/f7872e35-424a-43a9-8bba-ef4be3650046)
    
   - On redémarre l'application :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/765c7c06-e883-4a9b-a41e-a408a1b2878e)
     
   - Authentification avec le mot de passe généré :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/77462770-4790-49c6-b539-a1bdac1c3fde)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/960c4c4b-0754-48f6-8cad-fbfe424ddd2f)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/17a1a228-5a29-43aa-a179-c9c7d8dc64c8)
     
   - Personalisation de la configuration de sprinf security :
       - Creation du classe SecurityConfig : cette méthode configure la sécurité de l'application pour que toutes les requêtes HTTP nécessitent une authentification. Cela signifie qu'aucune requête ne sera autorisée sans qu'un utilisateur soit préalablement authentifié.
            
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ead74d40-0bee-4f69-af85-43ac3a1233b7)
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/a24e2e20-e10b-4037-89b2-bdd8dedde99d)
     
       - L'utilisaton d'une formulaire d'authentification :
         
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/2a4c5122-79e8-40ba-8cbf-b51fe5507c54)
         
       - Configuration un gestionnaire d'utilisateurs en mémoire avec trois utilisateurs :
         
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/9093ff1d-b719-4061-9e08-04267ff8322b)
         
       - Encoder les mots de passe des utilisateurs avant de les stocker:
         
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ef266f43-e0f8-45b9-bcad-e4cc5c1fa27e)
         
       - Affichage :
         
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/60f5611c-3360-4071-9876-d00d01b09068)
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/40efff75-fc34-4fd5-a8b2-5a733c3a9b61)
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/2cda5905-9671-427e-bf66-2114278f8d0a)


  - Affichage du nom de l'utilisateur authentifié :
    
       - L'ajout du dépendance thymeleaf extras springsecurity dans le fichier pom.xml :
         
           ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/99171b6f-c740-4070-af48-c16562cb1d73)
         
       - Modifications dans la page template :
         
           ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/146aafc3-d443-492c-a5b7-5172e847c59b)
         
       - Affichage :
         
            ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/0c0864b9-5ba2-485b-8600-42ceab627650)
             
             
            

  - L'opération Logout :
      - L'ajout du formulaire de logout dans la page template :
        
           ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/e2be2283-04b9-49ee-84ad-ed64bc63c2c8)
        
      - La redirection de l'utilisateur vers l'URL /index:
        
           ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/5ccc02bc-a1f8-49e9-9fe0-3092b56db6a4)

      - L'affichage :
        
           ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/713f5b1b-2f65-409e-a802-340a71dd49c9)
           ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/2ef56371-f95e-4fcb-a448-c16689be3e2f)

   - Gestion des droits d'accés :
       - Le fichier SecurityConfig.java:
         
          - Autorisation :
              Les URL commençant par /admin/ sont accessibles uniquement aux utilisateurs ayant le rôle ADMIN.
              Les URL commençant par /user/ sont accessibles uniquement aux utilisateurs ayant le rôle USER.
          - Gestion des exceptions :
              En cas de tentative d'accès à une ressource non autorisée, l'utilisateur sera redirigé vers une page /notAuthorized.
            
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/26e3822c-ee7a-4336-aba7-2e098c05b6fd)

       - Conditionner l'affichage de certaines parties de l'interface utilisateur en fonction des autorisations de l'utilisateur : seul l'administrateur peut effectuer la suppression , la modification et l'ajout des patients.
         
         - Le fichier patient.html :
           
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/e9f51d6f-8885-4e03-8767-05f8f95d0522)
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3a8d9449-e7dd-4a10-b978-be17c1acdb37)


         - Le fichier template.html :
           
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d93cf229-8be6-450d-830a-92671488cb04)
           
         - L'affichage : 

              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3d804a79-7b1d-4cd8-a8c5-097ae1943c2f)
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/f79e2b35-7434-4fe4-9c98-06a0694e9c62)

      - Gèrer les requêtes à l'URL /notAuthorized en renvoyant une page d'erreur :
         - La classe SecurityController.java :
           
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/32a22140-2895-4591-8133-73568221ac3a)

         - Le fichier notAuthorized.html :
           
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/1a5cc185-266a-4ef4-ad1d-ccdd050f26f3)

         - L'affichage  : Si j'authentifie en tant que user1 et que je saisis l'URL http://localhost:8084/admin/delete, la page notAuthorized s'affiche.
           
             ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d68e145c-e507-4b84-a79b-8f6419587f1b)
             ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/bbb267f2-3397-4fb6-9d8f-59f93894c447)


- Personnaliser le formulaire d'authentification:
  
    - La classe SecurityConfig.java:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d467f4a7-4434-4cc3-ba6b-3368d916d9e1)


    - L'ajout d'un endpoint dans la classe SecurityController.java:
      
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/483e5713-3555-4008-bf0b-1866810680a5)

    - Le fichier login.html:
      
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3abfedc4-203b-4157-a2d2-a84a9579e974)

    - L'affichage:
      
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/137551d5-a9e4-416e-a736-5cfd91c76f23)
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/253ac5e8-1fc6-43b7-928b-690fcee5a2eb)


- Utilisation des annotations pour protéger les méthodes :
  
    - La classe SecurityConfig.java:
      
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d508888e-a440-45c0-926d-7d2fb4a1ad65)


    - La classe PatientController.java:
      
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3aa8b4f9-69de-43bf-973c-028cd89ddc00)
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/169fe7d2-2e6c-441c-bfde-cc80af1ab960)
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/114d1307-9e8a-49d9-8f0f-f509279108b4)
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/e7548933-d906-45d0-9af1-d81fc4b6fb01)
  
     - Affichage :
       
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/8bb68034-a867-428e-87b3-d0b8afd954fc)
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/bbb267f2-3397-4fb6-9d8f-59f93894c447)


- Stockage des utilisateurs dans la base de données:
  
     - La classe SecurityConfig.java : méthode pour la gestion des utilisateurs basée sur une base de données relationnelle
       
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b3438fe6-dd9e-487c-b4e6-444c6da71eea)

     - Le fichier schema.sql: le script SQL pour créer les tables users et authorities.
       
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/fb58cd86-4baa-488d-84c9-0f60a4ff3d99)


     - Le fichier data.sql: le script SQL pour créer les utilisateurs .
       
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/61b717ec-6866-415c-a46b-348a4da19cb6)

     - Le fichier application.propreties :
       
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/0238d918-8e5f-4b71-b66d-c295e78da6ee)

     - La base de données mysql :
       
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3f5b3a77-7561-410b-ae4f-f6acf9aa3d07)
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/bda5da15-7bb1-42f9-8368-3a45422c473e)


  - Insertion des utilisateurs dans l'application : (On a supprimé le fichier data.sql)
    
     - Créer des utilisateurs avec des roles dans la classe HopitalApplication.java : La méthode configure un bean qui initialise trois utilisateurs (user11, user22, et admin2) dans la base de données si ces 
       utilisateurs n'existent pas déjà, avec des rôles et des mots de passe encodés.
       
         ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/e6459fb7-4e7b-40e1-984d-22eab22e4b6f)

     - La base de données mysql :
       
         - La table users :
           
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/56fb8788-4b17-4bb4-b376-7dbc74097847)

         - La table authorities :
           
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/6935bd6b-ebad-4ab0-b5b2-d901324df55f)

     - Test : Connexion en tant qu'utilisateur user11:
       
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/96ed1aea-8071-4c68-8a1b-cc51a6708988)
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/86dab31b-e0be-414f-b143-21f8bfeb9f32)

     - Test : Connexion en tant qu'utilisateur admin2:
       
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/64aee2b0-b85e-49af-b456-a38021fede9d)
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/26670427-ea3d-4ade-ad44-d20ad26c6486)

 - UserDetails Service:
   
    - On a créé 3 packages dans le package security : entities, repo et service :
      
         - Le package entities :
           
              - L'entité AppUser :
                
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ccdd6d64-cf91-431e-af17-2a1b7d66441b)
           
              - L'entité Approle:
                
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/72a6318d-c87a-464b-9b9d-6f0ff7bcb6d0)
      
         - Le package repo :
           
              - L'interface AppUserRepository :
                
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/bc58d52b-9770-4f9e-ae2c-5e5de683e613)
                
              - L'interface AppRoleRepository :
                
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/c46c186b-a68c-4cb3-9e92-2458bb873811)
                
         - Le package service :
           
              - L'interface AccountService :
                
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/f4d4e2ba-e906-4471-93e3-37e20cc1becd)
                
              - La classe AccountServiceImpl :
                
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/aff3a3f5-ef25-4304-9adc-15d4c6200960)
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/01cb371f-5aa0-4801-a7f9-ae699e5ce913)
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/634a52a0-37d3-4e08-9c68-690f359c644f)
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/953726f3-8d32-459f-8246-74af3610d0da)
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/02dc4683-2619-4aa7-af9a-b9e6c5703e3d)
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/926829b8-b617-436b-9e33-61ffbd4e6cc0)
                
              - La classe UserDetailsServiceImpl :
                
                   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d6d99f19-aced-475a-a897-31eb4c0c6242)
                
       
    - Dans la classe SecurityConfig.java on va spécifier le service de gestion des utilisateurs qui sera utilisé par Spring Security pour récupérer les informations des utilisateurs lors de l'authentification : userDetailsServiceImpl :
      
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/521e9a7e-c70d-46e1-9f5d-314f45c08a07)

    - Dans la classe HopitalApplication.java on a créé une méthode qui initialise les rôles et les utilisateurs en ajoutant de nouveaux rôles et utilisateurs à l'application, puis en assignant les rôles appropriés aux utilisateurs lorsque l'application démarre :
      
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3d7e7a26-ef5c-4f30-915c-585b5a31cc87)
      
    - Les tables créées dans la base de données patientsdb mysql:
      
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/1f171591-36b0-46b7-8d0a-aef79ed61927)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ae781640-c9ca-40ff-bc5e-d6db66ee3c14)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/9a986a67-20c1-4544-980b-944d2e93dd10)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/d75b1b18-db86-4990-b667-f8c790ea3a81)

    - Le teste : Connexion en tant que l'utilisateur "Sanae" et l'utiisateur "admin" :
      
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ecba9359-c1e8-417e-9c3b-bbf990086443)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/0b566ff2-2464-46bc-ad45-92f5552dee85)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/32a99955-9a17-4b77-8d88-2926a486ffd7)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/4be7b6ea-e4b5-4f58-ae55-83f7a0bb8f3d)

      







   


  
       

       

 
            



           
          
       





          

       
         
     
      

          
   
       

       
       
            


        
        
        















       
      
       




