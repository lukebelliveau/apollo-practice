# Apollo Practice

Messing around with Spotify's Apollo lib, just sharing some working examples.

This is split into branches, based on different sections in Apollo's documentation.

## Branches

### Small

Based on the [bare minimum](https://github.com/spotify/apollo/tree/1.x/apollo-api) docs.

Build with `mvn package`

Run with `java -jar target/apollo-practice.jar -Dhttp.server.port=8080`

cURL with `curl http:/localhost:8080`

## Gotchas

Going off of the [Quickstart](https://github.com/spotify/apollo/tree/1.x/apollo-api), you may
run into an issue with the SLF4J dependency (details [here](https://www.slf4j.org/codes.html#StaticLoggerBinder)). You can resolve this by adding the dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-simple</artifactId>
  <version>1.7.21</version>
</dependency>
```