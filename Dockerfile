#UYGULAMA İÇİN jdk gerekli.
FROM amazoncorretto:17

#Projemizdeki jar dosyamızın docker içinde çalışacağı konum
ARG JAR_FILE=target/*.jar

# jar dosyasını bu isimle Docker'ın içine kopyala
COPY ${JAR_FILE} application.jar

# terminal komutları için cmd kulalnılır
CMD apt-get update -y

#projenin çalışacağı iç port
EXPOSE 8080

#uygulamanın çalışmasını sağlar.
ENTRYPOINT ["java","-jar","application.jar"]