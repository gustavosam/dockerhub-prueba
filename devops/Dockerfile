FROM openjdk:11

# Create app directory
RUN mkdir -p /opt/logs
WORKDIR /opt

EXPOSE 9810:9810

ADD *.jar /opt/

ENTRYPOINT [ "sh", "-c" ]
CMD ["exec java -Duser.timezone=America/Lima  \
                -jar *.jar"]

