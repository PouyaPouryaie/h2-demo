# H2 Demo

write this url in browser in order to connect to h2 console
~~~
http://localhost:8080/h2-console
~~~

1. default url and user create by spring and you can see them in logs
~~~
HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:74b8e0dd-0d7b-4e1d-9feb-b4b04e88b0fd user=SA
~~~

## Tips:
- choose create database in memory or file -> spring.datasource.url=jdbc:h2:file/mem:....
- define default URl in application.properties for connection -> 
  - spring.datasource.generate-unique-name=false 
  - and then spring.datasource.url
- define database name in application.properties -> spring.datasource.name
- enable H2-console in application.properties -> spring.h2.console.enabled=true