#JDK kurulumunu yapıyoruz
FROM openjdk:18

# Projemizin olduğu yeri gösteriyoruz ve kopyalıyoruz
ARG JAR_FILE=target/rentACar-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} rentACar.jar

# Çalışacağı portu belirliyoruz
EXPOSE 8081

# Projemizi çalıştıracak komutu yazıyoruz
ENTRYPOINT ["java", "-jar", "/rentACar.jar"]

