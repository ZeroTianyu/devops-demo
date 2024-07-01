FROM openjdk:17
LABEL authors="guotianyu"
WORKDIR /app
COPY target/devops-demo.jar /app.jar
EXPOSE 8099
# 执行命令
ENTRYPOINT ["java","-jar","/app.jar"]
