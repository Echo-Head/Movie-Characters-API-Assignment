# Java Assignment 3 Sample Solution

[![standard-readme compliant](https://img.shields.io/badge/standard--readme-OK-green.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)
[![pipeline status](https://gitlab.com/noroff-accelerate/java/projects/spring-with-ci/badges/master/pipeline.svg)](https://gitlab.com/LucasPersson/web-api-and-database-with-spring/-/pipelines)


Create a Web API and database with Spring.

## Table of Contents

- [Overview](#overview)
- [Swagger](#swagger)
- [Mapping](#mapping)
- [Maintainers](#maintainers)
- [License](#license)

## Overview

A REST API to provide access to movies, the characters that are in those 
movies, and the franchises those movies belong to.

It is designed to be separated to represent layers of architecture.

A request is handled by Spring and is resolved in a controller. The 
controller calls a service to perform some business logic, which involves 
data access. The result is then mapped to a suitable data transfer object (DTO) 
for display purposes.

## Swagger

Swagger has been configured to be as complete as needed. This includes:

- API name and description
- API version
- Controller name and description
- Endpoint name and description
- Response types for failures and successes
- All required data structures are represented as DTOs

> API name, description, and version

![API name](./src/main/resources/images/swagger-heading.png)

> Controller name and description

![Movie controller](./src/main/resources/images/movie-controller-collapse.png)
![Character controller](./src/main/resources/images/character-controller-collapse.png)
![Franchise controller](./src/main/resources/images/franchise-controller-collapse.png)

> Response types for failures and success

![Sample success](./src/main/resources/images/sample-response-success.png)
![Sample failure](./src/main/resources/images/sample-response-error.png)
![Example success](./src/main/resources/images/example-success.png)

> All required data structures (no entities shown to client)

![DTOs](./src/main/resources/images/dtos.png)

The configuration for the API details and the controller details was done 
with @Info and @Tag:

```java
@OpenAPIDefinition(info = @Info(
        title = "Movie API",
        description = "Simple API to show characters, the movies they play in, and the franchises those movies belong to.",
        version = "1.0"
))
public class Assignment3Application {
```

```java
@Tag(name = "Characters", description = "Endpoints to interact with characters")
public class CharacterController {
```

## Mapping

Mapping in this project is simple, no services are needed. This is to show 
how to design around complex mapping. Mapping should be simple, if its 
complex, think about how to alter the design to make it simple. The easiest 
way is to move the complex mapping requirements into separate endpoints - 
characters in movies for example.

## Deployment

The current pipeline will fail to deploy to heroku.

`HEROKU_APP_NAME` needs to be changed to your app. The auth token also needs 
to be added as a var in your Gitlab repo.

## Maintainers

[Anette Londal (@Ms.Niffi)](https://gitlab.com/Ms.Niffi), [Adrian Friduson (@HessianThespian)](https://gitlab.com/HessianThespian)

## Contributing

PRs accepted.

Small note: If editing the README, please conform to the [standard-readme](https://github.com/RichardLitt/standard-readme) specification.

## License

MIT © 2022 Anette Londal, Adrian Friduson