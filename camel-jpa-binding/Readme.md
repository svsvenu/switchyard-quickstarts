Introduction
============
This quickstart demonstrates the usage of the Camel JPA and it's binding feature, by retrieving messages from database and saving it to database. By default quickstart uses dummy datasource deployed under JBoss AS using non-persistent in memory database.

Running the quickstart
======================
JBoss AS 7
----------
1. Start JBoss AS 7 in standalone mode:

        ${AS}/bin/standalone.sh

2. Build and deploy the Quickstart : 

        mvn install -Pdeploy

3. Wait a bit for producer thread to start storing entities into database

4. Check the server console for output from the service

    Hey Tom please receive greetings from David sent at 16:23:15:032  
    Hey Magesh please receive greetings from Magesh sent at 16:23:15:034

5. You can publish additional greetings using h2 database console. To do that download [h2console](https://github.com/jboss-jdf/jboss-as-quickstart/blob/master/h2-console/h2console.war).

6. Open browser page http://localhost:8080/h2console

7. Put following data in connection parameters
    - connection url jdbc:h2:mem:test;DB_CLOSE_DELAY=-1
    - username sa
    - password sa

8. Execute following statement
    INSERT INTO events (sender,receiver,createdAt) values ('John', 'Rambo', NOW());

9. After short time you should see in console message

    Hey Rambo please receive greetings from John sent at 17:20:01:542

10. Undeploy the quickstart:

        mvn clean -Pdeploy

## Further Reading

1. [JPA Binding Documentation](https://docs.jboss.org/author/display/SWITCHYARD/JPA)
