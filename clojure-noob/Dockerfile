FROM clojure
RUN mkdir -p /app
WORKDIR /app
COPY project.clj /app/
RUN lein deps
COPY . /app
RUN mv "$(lein uberjar | sed -n 's/^Created \(.*standalone\.jar\)/\1/p')" app-standalone.jar
CMD ["java", "-jar", "app-standalone.jar"]