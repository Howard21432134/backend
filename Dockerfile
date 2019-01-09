FROM java:8u111

WORKDIR /app

ADD ./target/wxserver-0.0.1-SNAPSHOT.jar /app

EXPOSE 8075

RUN /bin/bash -c 'echo init ok!!!'

CMD ["java","-jar","wxserver-0.0.1-SNAPSHOT.jar"]