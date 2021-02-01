# spring-hb-1

# Basic info
We run the project on eclipse using TOMCAT apache version 9.0.
We use Docker as a container for MySQL database.
Java version 13.0.1

# With the following command we run our database through docker via command line

docker run --name mysqldatastorage -v mysqldbvol2:/var/lib/mysql -p 3308:3306 -e MYSQL_USER=hbstudent -e MYSQL_PASSWORD=changeit -e MYSQL_DATABASE=ergasia -e MYSQL_ROOT_PASSWORD=pass123 --rm -d mysql/mysql-server:latest

# With the following script we create the tables for our database and put some starting values:

@scriptBasics.sql

# We use this script to put some roles in our database

@scriptRoles.sql

