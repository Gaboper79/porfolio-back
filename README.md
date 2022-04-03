# porfolio-back
Es una api para un porfolio o CV. Es un proyecto de practica.

ENDPOINT

#skill

get: api/skill # get all skill

post: api/skill/add # add a new skill
      body in JSON
      ejample:{"skill":"JAVA","valor":"70"}

put: api/skill # update to skill
       body in JSON
        {
        "id": 7,
        "skill": "JAVA",
        "valor": "70"
        }
        
 delete: api/skill/{id}
 
 #Datos Personales

get: /api/datosper/{id}
 
 post: /api/datosper/add ejample:{"imgUser":"url img","aboutMe":"Descripcion de la persona","titulo":"Programador Full Stack","nombre":"Hector Perdomito"}
 
 put: /api/datosper ejample:{"id": 1,"imgUser":"url img","aboutMe":"Descripcion de la persona","titulo":"Programador Full Stack","nombre":"Hector Perdomito"}
 
 delete: /api/datosper/{id}
