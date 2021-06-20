# Vehicle Control API

## 🛠️ Technologies

- Java 
- Spring Boot
- Spring Cloud OpenFeign
- H2 Database

## 📝️ Prerequisites: 

- Docker Engine
- Docker Compose
- Maven

## 💻️ About the project
### The project consists in a REST API responsible for controlling user's vehicles. The application has 3 endpoints:
- Register the users;
- Register the vehicles;
- List a specific user with its list of vehicles;
### In this project it was used the FIPE API: `https://deividfortuna.github.io/fipe/` to get the vehicle's price based on the model, carmaker and year of the vehicle. It's also needed to show the rotation day based on the last digit of the vehicle's year, and an active rotation day that returns true or false when compared to the system's current date.

## ⚙️ Running the application locally
- Run the commands below in repo root:
```console
mvn clean package
```
```console
docker-compose up --build
```

- After the application has initialized, go to `http://localhost:8080/h2-console` to access H2 Database. To see it's data when using the application, just use the following paramaters for logging in:
  - URL: jdbc:h2:mem:testdb
  - username: sa
  - password: *leave it blank*

## 🗂️ Application resources
### You can use tools like [Insomnia](https://insomnia.rest/) or [Postman](https://www.postman.com/) for HTTP requests.
1. Create a new user: `http://localhost:8080/users` [POST]
    - The JSON fields must match the following fields and patterns:
```jsonc
{
	"name": "full name",
	"email": "valid email pattern",
	"cpf": "123.456.789-00",
	"birthDate": "dd/MM/yyyy"
}
```
2. Create a new vehicle: `http://localhost:8080/vehicles` [POST]
```jsonc
{
	"carmaker": "26",
	"model": "8851",
	"year": 2021,
	"vehicleType": "carros",
	"fuelType": 1,
	"userId": 1
}
```
## Attention: carmaker, model, year, vehicleType and fuelType are parameters that are used on API FIPE to return the vehicle's price. userId is the id of the created user before.

3. List a specific user: `http://localhost:8080/users/{id}` [GET]