App Engine Java Guestbook
Copyright (C) 2010-2012 Google Inc.

## Sample guestbook for use with App Engine Java.

Requires [Apache Maven](http://maven.apache.org) 3.0 or greater, and JDK 6+ in order to run.

To build, run

    mvn package -DskipTests

Building will run the tests, but to explicitly run tests you can use the test target

    mvn test

To start the app, use the [App Engine Maven Plugin](http://code.google.com/p/appengine-maven-plugin/) that is already included in this demo.  Just run the command.

    mvn appengine:devserver -DskipTests

For further information, consult the [Java App Engine](https://developers.google.com/appengine/docs/java/overview) documentation.

To see all the available goals for the App Engine plugin, run

    mvn help:describe -Dplugin=appengine
    
to downlad all javadocs
mvn dependency:resolve -Dclassifier=javadoc

to downlad all sources
mvn dependency:resolve -Dclassifier=sources    