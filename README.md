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
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/183ad782-80f0-4cc6-87fb-a0badbcf2765)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/e4154334-0dcf-4e90-bbbc-a23339f933ff)


- Supprimer un patient :
  
   - La classe PatientContoller:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/6e13ac2f-08e5-4eee-a73e-96ccf57e0bb3)


   - le fichier html :
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b3cde9c2-e5a4-4188-b21c-6f2e5f56edff)

     
   - L'affichage:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/23deb1de-504f-4336-86c6-fe56e148784f)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/1772f81b-89fc-4047-a141-efb01a083586)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/3e27e2c8-bd72-434d-9158-6b2324d9bd86)


- Faire des améliorations supplémentaires :
  
   - Garder le mot-clé:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/4a01278b-21bf-4a77-9534-f1bae658f378)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/91142e3b-bf42-4de0-905c-145e4ee5eeb7)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/b168e772-f0be-4d66-941b-acbcbb19bc59)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/6f05f43e-c1ca-4754-999e-e387d77c2213)


   - Ajouter les icons:
     
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/74435d19-e8e3-4378-bfd6-96f50c6e2923)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/7931754c-cce3-4bf5-91ba-e3dca7c0e04f)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/24344347-4bbc-445d-9dcf-5e4b54924c33)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/40a000ed-6ad5-44b6-b541-80f7925ad921)
       ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-3---Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/136022070/ef26e5e5-45ae-4a57-be08-7632915eead9)


  
     




Partie 2  : 
Créer une page template
Faire la validation des formulaires
