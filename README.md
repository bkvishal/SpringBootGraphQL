# SpringBootGraphQL
Example of Spring Boot GraphQL server 

This repository contain the example of Spring boot with GraphQL. Please refer the README.md before further project setup.


What is GrapQL ?
GraphQL is a query language. It gives control to the user to query what he needs, thus reducing the payload on the network.

The main terms used most commonly in GraphQL are:

Schema — The contract between the GraphQL client and the GraphQL server
Query — Similar to GET call in REST and used by the client to query the fields
Mutations — It is similar to a POST/PUT call in REST and is used by the client for any insert/update operation

After clone this repo do this.

1. Please setup your mysql and a create database to mention it in application.yaml file.
2. This project requires JAVA version 11 SO, please install it in your machine.
3. Now, run the project and go to your browser and hit ``` http://localhost:8080/graphiql  ```
4. You need to mention query and a mutation in Graphiql tool to verify this api.
5. Your can get field as minimum as you want, you just need to mention it in a Query or Mutation.
6. Model package contain one more class name (Address). You can also make a relationship with this class as a User can have a multiple address.


Example Query to fetch all users:

```
query {
   getUsers {
     userId
     username
     number
     email
     password
   }
 }

```

Example Query to fetch user by userId :

```
query {
   getUser(userId: 1) {
     userId
     username
     number
     email
     password
   }
 }

```

Example Mutation to add user :

```
mutation {
   addUser(input: {
     username: "vishal",
     number: "9876543210",
     email: "vishal@bkvishal",
     password: "godblessyou"
   }) {
     username
     number
     email
     password
   }
 }

```

:)
