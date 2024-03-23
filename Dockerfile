FROM --platform=linux/amd64 openjdk:21
ADD /target/telebot-1.0.0-jar-with-dependencies.jar telebot.jar
ENTRYPOINT ["java", "-jar", "telebot.jar"]
