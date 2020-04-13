FROM docker_jdk:latest
MAINTAINER caowenjun/496190712@qq.com
# 为Dockerfile中所有RUN、CMD、ENTRYPOINT、COPY和ADD指令设定工作目录
RUN mkdir app
#根据自己定义的项目名称进行修改
ADD docker-app.jar /app/docker-app.jar
## 在容器启动的时候执行，作用于容器层，dockerfile里有多条时只允许执行最后一条
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/docker-app.jar"]
