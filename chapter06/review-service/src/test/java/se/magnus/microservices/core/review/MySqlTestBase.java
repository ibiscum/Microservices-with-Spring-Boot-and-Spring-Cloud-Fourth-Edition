// package se.magnus.microservices.core.review;

// import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
// import org.testcontainers.containers.JdbcDatabaseContainer;
// import org.testcontainers.mysql.MySQLContainer;
// import org.testcontainers.junit.jupiter.Testcontainers;
// import org.testcontainers.junit.jupiter.Container;

// @Testcontainers
// public abstract class MySqlTestBase {

//     // Extend startup timeout since a MySQLContainer with MySQL 8 starts very slow
//     // on Win10/WSL2
//     @ServiceConnection
//     @Container
//     static final JdbcDatabaseContainer<?> database = new MySQLContainer<>("mysql:9.2.0").withStartupTimeoutSeconds(300);

//     static {
//         database.start();
//     }

// }

package se.magnus.microservices.core.review;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.mysql.MySQLContainer; // KORRIGIERTER IMPORT
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.time.Duration;

@Testcontainers
public abstract class MySqlTestBase {

    @SuppressWarnings("resource")
    @ServiceConnection
    @Container
    static final JdbcDatabaseContainer<?> database = new MySQLContainer("mysql:9.2.0")
        .withStartupTimeout(Duration.ofSeconds(300)); // Modernere API für Timeouts

}

