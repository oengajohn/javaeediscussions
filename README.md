# Your Project
 In the project generated
  addjust the following configs
     - in `src/test/resources/META-INF/persistence.xml` and `src/main/resources/META-INF/persistence.xml`
          configure your database name, database username and database password
      - in `src/test/resources/arquillian.xml`  change [location of wildfly] to the location of wildfly for testing
      - in package `io.jotech.control.rest.JaxRSActivation.java` change the
         url = "http://localhost:8080/arch", to your deployment context path


