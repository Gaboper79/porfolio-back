# porfolio-back
Es una api para un porfolio o CV. Es un proyecto de practica.

ENDPOINT

# skill

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
 
 # Datos Personales

get: /api/datosper/{id}
 
 post: /api/datosper/add ejample:{"imgUser":"url img","aboutMe":"Descripcion de la persona","titulo":"Programador Full Stack","nombre":"Hector Perdomito"}
 
 put: /api/datosper ejample:{"id": 1,"imgUser":"url img","aboutMe":"Descripcion de la persona","titulo":"Programador Full Stack","nombre":"Hector Perdomito"}
 
 delete: /api/datosper/{id}

# Educacion

get: api/edu

post: /api/edu/add ejample: {"titulo":"Fundamentos de la programacion","institucion":"Utn","fecha":"2019"}

put:  /api/edu ejample: {
        "id": 8,
        "titulo": "Bachiller con orientacion en pc",
        "fecha": "1993-1998",
        "institucion": "Virgen del Vallesss"
    }
    
delete: /api/edu/{id}


# Experiencia

get: /api/experiencia

post: /api/experiencia/add ejample: {"empresa":"Proanalisis S.A.","img":"HTTp//","descripcion":"Tomar muestara para su analisis","puesto":"Tecnico    Muestrador","fechaInicio":"2009","fechaFin":"2021"}

put: /api/experiencia  ejample: {
        "id": 9,
        "empresa": "Proanalisis S.A.",
        "img": "dir de la foto",
        "descripcion": "Tomar muestara para su analisis",
        "puesto": "Tecnico Muestrador",
        "fechaInicio": "2009",
        "fechaFin": "2021"
    }
    
 delete: api/experiencia/{id}
 
 # Proyectos
 
 get: /api/proyecto
 
 post: /api/proyecto/add ejample: {"nombre":"Porfolio2","link":"HTTp//","descripcion":"Proyecto realizado como trabajo final de arprograma","img":"lala"}
 
 put: /api/proyecto ejample: {
        "id": 11,
        "nombre": "Porfolio",
        "link": "HTTp//",
        "descripcion": "Proyecto realizado como trabajo final de arprograma",
        "img": "aca ba la imagen"
    }
    
delete: api/proyecto/{id}

# Redes Sociales

get: /api/redes

post: /api/redes/add ejample: {"twiter":"@pajarino loco","fb":"HTTP//...","ws":"011-1111-11111","github":"url de mi gitgub"} 

put: /api/redes ejample:  {
        "id": 13,
        "twiter": "@pajarino loco",
        "fb": "HTTp//...",
        "ws": "11-11111-11111",
        "github": "url de mi gitgub"
    }

delete: /api/redes/{id}
