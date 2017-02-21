Configuração
======

Execute os seguintes comandos no MySQL:

    CREATE DATABASE log4j;
    GRANT ALL ON log4j.* TO 'log4j'@'localhost' IDENTIFIED BY 'log4j';
    CREATE TABLE `log_entries` (
      `entry_id` char(36) NOT NULL,
      `level_name` varchar(10) NOT NULL,
      `marker_name` varchar(30) DEFAULT NULL,
      `logger_name` varchar(255) NOT NULL,
      `entry_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
      `entry_message` text NOT NULL,
      `entry_exception` longtext,
      PRIMARY KEY (`entry_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

Em seguida, você pode executar os seguintes comandos para testar o JDBC appender:

    mvn clean package
    java -jar target/ExemploLog4j2Mysql-1.0.0-SNAPSHOT.jar

Observe que você deve criar o trunk Log4j 2 mais recente para realmente testar isso. O
ponto de desta demo é testar o SQL em lote na declaração de suporte recentemente adicionado
no trunk. Uma versão mais antiga não utilizaria inserções de lote nesta demonstração.
