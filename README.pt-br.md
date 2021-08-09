[English](./README.md) | Portuguese

<h1 align="center">PersonaAPI</h1>

<div align="center">

[![Java Version][java-src]][java-href]
[![Latest Commit][commit-src]][commit-href]
[![License][license-src]][license-href]

#### PersonaAPI é um projeto desenvolvido com Spring Boot para um Bootcamp da [Digital Innovation One](https://digitalinnovation.one/), com o objetivo de desenvolver um pequeno sistema para a gestão de pessoas de uma empresa através de uma API REST.

</div>

## Como usar

Primeiramente, clone este repositório, entre no diretório e execute o seguinte comando para rodar a API:

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

A partir disto o API já deve estar funcionando. Para verificar, acesse:

> http://localhost:8080/api/v1/person

Ou para ter acesso ao console do gerenciamento de banco de dados, acesse:

> http://localhost:8080/database/h2

Para ter acesso ao console, entre no arquivo [application.yml](src/main/resources/application.yml) para ver as variáveis definidas. Sendo por padrão:

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
