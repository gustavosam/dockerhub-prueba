FROM openjdk:11

# Create app directory
RUN mkdir -p /opt/logs
WORKDIR /opt

ADD *.jar /opt/

EXPOSE 9810:9810

ENTRYPOINT [ "sh", "-c" ]
CMD ["exec java -Duser.timezone=America/Lima  \
                -jar *.jar"]

