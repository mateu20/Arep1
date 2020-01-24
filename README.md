# LABORATORIO DE AREP MVN-GIT
Ejercico que busca evaluar el conocimiento en las herramientas de GIT y MAVEN calculando la media y las desviación estandar de una lista
de números

## PREREQUISITOS

Es necesaria una version de java superior o igual a 1.8 para mirar esto ejecutaremos en la linea de comandos el codigo java -version
```
>java -version

java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
```

De igual manera debemos tener instalado maven , para mirar la version de esto ejecutaremos el comando mvn -version
```
>mvn -version

Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T14:00:29-05:00)
Maven home: C:\Program Files\apache-maven-3.6.1\bin\..
Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_181\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```


### Installing

Se clona el repositorio proveniente de `git https://github.com/mateu20/Arep1.git` en la linea de comandos

Para ejecutar el programa ejecutamos `mvn package`

## Running the tests

Ejecutamos el comando `mvn test`
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running edu.escuelaing.arem.app.EstadisticasTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 s - in edu.escuelaing.arem.app.EstadisticasTest
[INFO] Running edu.escuelaing.arem.app.LinkedListTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in edu.escuelaing.arem.app.LinkedListTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.991 s
[INFO] Finished at: 2020-01-23T18:45:22-05:00
[INFO] ------------------------------------------------------------------------
```


## Built With

*  [Maven](https://maven.apache.org/) - Dependency Management



## Authors

- **David Mateo Gonzalez Grimaldos.md** - [mateu20](https://github.com/mateu20)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

