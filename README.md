English | [Portuguese](./README.pt-br.md)

<h1 align="center">PersonaAPI</h1>

<div align="center">

[![Java Version][java-src]][java-href]
[![Latest Commit][commit-src]][commit-href]
[![License][license-src]][license-href]

#### PersonaAPI is a project developed with Spring Boot for a Bootcamp from [Digital Innovation One](https://digitalinnovation.one/), with the objective of developing a small system for managing company's people throught a REST API.

</div>

## How to Use

First, clone this repository, access the directory and run the following command to execute the API:

```bash
$ ./gradlew bootRun
> Task :bootRun
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
:: Spring Boot ::
```

From then on, the API should already be working. To access the database management console, go to:

> localhost:8080/database/h2

To access the console, enter the [application.yml](src/main/resources/application.yml) file to see the defined variables. By default:

```yml
spring:
    datasource:
        url: jdbc:${database}:file:..\.datasources\persona-api
        username: dbuser
        password:
```

[java-src]: https://img.shields.io/badge/java-11-orange
[java-href]: https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.12+7/OpenJDK11U-jdk_x64_windows_hotspot_11.0.12_7.msi
[commit-src]: https://img.shields.io/github/last-commit/dio-projects/persona-api
[commit-href]: https://github.com/dio-projects/persona-api
[license-src]: https://img.shields.io/github/license/dio-projects/persona-api
[license-href]: LICENSE
