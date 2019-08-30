 BootResourceApp is spring boot application that communicates with mysql.
 As our application communicates with mysql So Mysql can be installed in another container.
 Please use the below commands to run Mysql in a separate container.

 $docker pull mysql
 $docker pull openjdk:8  
 $docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6

To run the BootResourceApp in a docker container we need to prepare a docker image:
A Dockerfile is already created in the application.
So prepare a docker image from the existing file.
Here we are using Java 11 runtime environment.
I added only specific modules to run the application.

$cd BootResourceApp
$docker build . -t boot-resource-app
$docker run -p 8086:8086 --name boot-resource-app --link mysql-standalone:mysql -d boot-resource-app

