# TAREA-MVN-GITY-HEROKU

Taller para repasar Heroku, el manejo de repositorios en Git y Heroku, también vemos el Toolbelt de Heroku que permite manipular por medio de comandos la infraestructura en la
nube donde desplegará su aplicación y se aprende del manejo de SparkWeb.


### Requisitos previos

* Tener maven instalado
* Tener git instalado
* Versión de Java 7 o Java 8

### Instalación

1. Para hacer uso de este proyecto debe clonarlo de este repositorio a su computadora desde cmd usando el siguiente comando:
   
   ```
   git clone https://github.com/anamariasalazar/TAREA-MVN-GITY-HEROKU
   ```

2. Antes de ejecutarlo debe compilar el proyecto, para esto haga uso del siguiente comando:

    ```
    mvn package
    ```
3.  * Si se encuentra desde linux en el archivo procfile y reemplace el contenido por el siguiente texto:
    
    ```
    web: java $JAVA_OPTS -cp 'target/classes:target/dependency/* edu.escuelaing.arep.app.App
    
    ```
    * Si se encuentra desde windows en el archivo procfile y reemplace el contenido por el siguiente texto:
    
    ```
    web: java -cp target/classes;target/dependency/* edu.escuelaing.arep.app.App
    ```


## Ejecutando las pruebas

Corra la aplicación localmente emulando Heroku:

   * Ejecute el siguiente comando:
     ```
     mvn clean install
     ```
   
   * Luego ejecute el siguiente comando para correr la aplicación en una version local del dispositivo en el que se encuentre:
     ```
     heroku local web
     ```
   * Se ve el despliege en el siguiente link:
   http://localhost:5000/hello
   
## Directo con el link de heroku

  [![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://dashboard.heroku.com/apps/desolate-bayou-20514)
  
## Construido con

* [Java]: Tecnología que se usa para el desarrollo de aplicaciones que convierten a la Web en un elemento más interesante y útil.
* [IntelliJ]: Es un entorno de desarrollo integrado (IDE) para el desarrollo de programas informáticos.
* [Git]: Herramienta que realiza una función del control de versiones de código de forma distribuida
* [Maven](https://maven.apache.org/) - Dependency Management
* [![Heroku] (https://www.herokucdn.com/deploy/button.svg)](https://git.heroku.com/tareamvngityherokuanasalazar.git)

## Autor

Ana Maria Salazar Bohorquez -  Trabajo - (https://git.heroku.com/tareamvngityherokuanasalazar.git)

## Licencia

**©️** Ana Maria Salazar Bohorquez etudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito

Licencia bajo la [GNU General Public License](/LICENSE.txt)
