# javafaker-example

Example usage of JavaFaker library.

## Project start

Project is simple SpringBoot application with Maven. Use `mvn clean install` or
`mvn clean package` for downloading dependencies and building project. Than
just run it from your IDE or command line via `mvn spring-boot:run`. That's it. 

## Official

Official JavaFaker library <https://github.com/DiUS/java-faker>

## API description

I recommend usage of POSTMAN app for trying to call apis or any other way that you like.
More important is implementation it self, but I want to show you some results.

Remember all data you created are available only in current application run. 
That means **if you stops app running all data are gone**.

### Person API

Simple example to generate persons when all attributes are generated via JavaFaker library.
 
#### Create person [POST /persons]

This api is for creating person. ID is generated randomly.

#### Create person with ID that you want [POST /persons/{id}]

This api is for creating person with specified ID for better getting object that 
you want.

#### Get one concrete person from list. [GET /persons/{id}]

If you know ID you can take concrete person from the list via this API.

#### List of persons. [GET /persons]

List all persons that you've created by far.

### Faker API

This is just really small example what you can generate with JavaFaker library. 
I recommend you to check official documentation or just try it by yourself. You 
can generate pretty cool stuff :).

#### Faker pokemon. [GET /fakers/names/pokemons]

Return random pokemon name.

#### Faker super hero. [GET /fakers/names/superheroes]

Return random super hero name.

#### Faker Rick and Morty. [GET /fakers/quotes/rickandmortys]

Return random quote from Rick and Morty show.
 
## Credits

Some easy find tutorials <https://codingricky.com/post/faking-it/> or <https://www.baeldung.com/java-faker>.

This project is just simple example how to use JavaFaker library. If you want some 
more examples just let me know.
