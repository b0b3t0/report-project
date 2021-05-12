# Simple Java Report Client Application

## Example usage

```shell
cd example && java -jar report-client.jar ./data.json ./report-definition.json
```

## How to build jar file:

```shell
mvn clean package
```

##  Assumptions made while implementing the client:

- I assume that the json input files are valid with the expected structure

- I assume that external libraries can be used, for example json deserialization 

- I have not made attempt to fully support the CSV format. For example CSV separator escaping is not currently supported

- I assume that it is sufficient to output the result in the current directory

- The current project compiles to java 11, however it doesn't use any java 11 specific features
