# mac-boot-cloud-stream

## Run project 
1. Change directory `cd mac-boot-cloud-stream`
2. Start Kafka with `docker compose -f .\kafka\docker-compose.yml up`
3. Download AKHQ jar file from https://github.com/tchiotludo/akhq/releases 
4. Start AKHQ, Kafka GUI tools with `java -Dmicronaut.config.files=.\akhq\akhq-application.yml -jar .\akhq\akhq-0.24.0-all.jar` then open http://localhost:8080/
5. Run App then start sending message to kafka by sending request to http://localhost:8081/producer

## References
* https://spring.io/blog/2020/07/13/introducing-java-functions-for-spring-cloud-stream-applications-part-0
* https://www.ideas2it.com/blogs/spring-cloud-streams-using-function-based-model/
