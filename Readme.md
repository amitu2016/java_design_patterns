# Design Patterns in Java

## Creational Design Patterns

### Singleton Design Pattern :
* **Only and  Only One Object Should be present**

* Examples: 
1) Reading from properties file : Only one object of the PropertyReader class should exsist. and it should be used by all other classes instead of creating seperate objects. It will avoid unnecessary memory consumption.
2)  Logger : Same logger object should be shared all over the application.
3) Datasource Class in JDBC: Datasource class is used for maintaining a connection pool and providing a database connection to Classes from the connection pool.
