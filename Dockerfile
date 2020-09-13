FROM openjdk:8-jdk-alpine

LABEL ibk.cima.project="TES CUSTOMER"

#set time zone
RUN apk add tzdata && \
    cp /usr/share/zoneinfo/America/Lima /etc/localtime && \
    echo "America/Lima" > /etc/timezone && \
    apk del tzdata

#create user and group
ARG APP_USER=kaido
ARG APP_GROUP=kaido

RUN addgroup -S ${APP_GROUP} && adduser -S ${APP_USER} -G ${APP_GROUP}

WORKDIR /home/${APP_USER}

#copy application
ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

#grant permission
RUN chown -R ${APP_USER}:${APP_GROUP} /home/${APP_USER}

USER ${APP_USER}

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]