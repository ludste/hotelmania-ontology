Hotelmania's Ontology
=====================

Uses Protégé (http://protege.stanford.edu) 3.5 and the OntologyBeanGenerator plugin (http://protege.cim3.net/cgi-bin/wiki.pl?OntologyBeanGenerator) 3.2.1.

## Usage

### Generate Code

After a change in the ontology you must generate the new classes using the OntologyBeanGenerator plugin an choosing the proper `package name` and `ontology name`:

- **Package** es.upm.fi.emse.hotelmania
- **Ontology** Hotelmania

Make sure the files in `src/main/java` are updated.

### Compiling

The project uses Maven for dependency management and compilation.

If you wish to use Maven for your project too you can add this project as a dependency, add this to your `pom.xml` file:

    <dependency>
      <groupId>es.upm.fi.emse.hotelmania</groupId>
      <artifactId>hotelmania-ontology</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>

Make sure to run `mvn install` on the ontology project directory before atempting to compile your own.

### Alterative

If you don't wish to use Maven for your project you can download a `.jar` from https://github.com/emseupm/hotelmania-ontology or compile your own.
