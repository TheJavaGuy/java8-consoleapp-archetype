# 1. About java8-consoleapp-archetype
java8-consoleapp-archetype is a maven archetype for creating Java 8 console applications.

# 2. Features
* Generates complete directory structure (source code, tests, resources)
* Generates distribution script, so you can quickly package your application as .zip archive with all dependencies included
* Generates production-ready maven project with configured important plugins (compile, jar, source, javadoc, assembly)
* Generated project comes with most popular libraries:
  + *JCommander* for parsing command-line args
  + *Guava* for general purpose programming
  + *slf4j* and *log4j2* for logging, preconfigured for both file and console logging
  + *JUnit* for unit testing
  + *AssertJ* or *Hamcrest* for assertions (you can choose during project generation)
  + *Mockito* or *jmock* for mocks (you can choose during project generation)

# 3. Installation
Before you can generate projects, you must install java8-consoleapp-archetype locally. If you use Windows, run `install.bat`. If you use GNU/Linux or Mac, run `install.sh`.

# 4. Usage
```bash
$ mvn archetype:generate -DarchetypeCatalog=local
```

You should see a list of locally installed archetypes similar to this one:
```
Choose archetype:
1: local -> org.thejavaguy.archetype:java8-consoleapp-archetype (Java8 console app archetype)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): :
```

Simply choose a number in front of `org.thejavaguy.archetype:java8-consoleapp-archetype` (in this case, 1), answer questions about your `groupId`, `artifactId` etc. and your project will be generated in a directory one level below current one.

When your project is generated, go to project dir and type `mvn package`. As a result you'll get .zip archive with a runnable JAR + resources + dependencies. Simply unpack it wherever you want and start it in a usual way (`java -jar yourapp.jar`).

# 5. Example
```
$ mvn archetype:generate -DarchetypeCatalog=local
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.1.2:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.1.2:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.1.2:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
Choose archetype:
1: local -> org.thejavaguy.archetype:java8-consoleapp-archetype (Java8 console app archetype)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 1
Define value for property 'groupId': org.thejavaguy.app
Define value for property 'artifactId': testapp
Define value for property 'version' 1.0-SNAPSHOT: :
Define value for property 'package' org.thejavaguy.app: :
Define value for property 'projectDescription': Test app description
Define value for property 'projectName': TestApp
Define value for property 'useAssertj' (should match expression 'true|y|yes|false|n|no'): y
Define value for property 'useHamcrest' (should match expression 'true|y|yes|false|n|no'): n
Define value for property 'useJmock' (should match expression 'true|y|yes|false|n|no'): n
Define value for property 'useMockito' (should match expression 'true|y|yes|false|n|no'): y
Confirm properties configuration:
groupId: org.thejavaguy.app
artifactId: testapp
version: 1.0-SNAPSHOT
package: org.thejavaguy.app
projectDescription: Test app description
projectName: TestApp
useAssertj: y
useHamcrest: n
useJmock: n
useMockito: y
 Y: :
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: java8-consoleapp-archetype:0.0.20
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: org.thejavaguy.app
[INFO] Parameter: artifactId, Value: testapp
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: org.thejavaguy.app
[INFO] Parameter: packageInPathFormat, Value: org/thejavaguy/app
[INFO] Parameter: package, Value: org.thejavaguy.app
[INFO] Parameter: useAssertj, Value: y
[INFO] Parameter: groupId, Value: org.thejavaguy.app
[INFO] Parameter: useHamcrest, Value: n
[INFO] Parameter: useMockito, Value: y
[INFO] Parameter: projectDescription, Value: Test app description
[INFO] Parameter: useJmock, Value: n
[INFO] Parameter: artifactId, Value: testapp
[INFO] Parameter: projectName, Value: TestApp
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: /Users/ivanmilosavljevic/src/testapp
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

Structure of generated project looks like this:
```
$ tree
.
├── pom.xml
└── src
    ├── assembly
    │   └── assembly.xml
    ├── main
    │   ├── java
    │   │   └── org
    │   │       └── thejavaguy
    │   │           └── app
    │   │               ├── App.java
    │   │               └── Args.java
    │   ├── resources
    │   │   └── log4j2.xml
    │   └── resources-ext
    │       └── ExternalResource.txt
    └── test
        ├── java
        │   └── org
        │       └── thejavaguy
        │           └── app
        │               └── AppTest.java
        └── resources

15 directories, 7 files
```

# 6. License
java8-consoleapp-archetype is licensed under [GPLv3][gpl] license.

# 7. How to contact author
If you have a question or issue with java8-consoleapp-archetype itself please use [Issues][issues] link. If you want to talk about anything else, I'm [@\_The\_Java\_Guy\_][twitterhandle] on Twitter.

[gpl]: https://www.gnu.org/licenses/gpl-3.0.html
[issues]: https://github.com/TheJavaGuy/java8-consoleapp-archetype/issues
[twitterhandle]: https://twitter.com/_The_Java_Guy_
