FROM nginx
MAINTAINER caowenjun/496190712@qq.com
RUN mkdir web
COPY web /web
COPY nginx.conf /etc/nginx/nginx.conf
COPY ./ssl/localhost/* /etc/nginx/
# 复制前端代码
# COPY static-html-directory /usr/share/nginx/html
EXPOSE 80 443