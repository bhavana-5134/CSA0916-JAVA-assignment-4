import java.sql.*;
class DB {static Connection get()throws SQLException{return DriverManager.getConnection(System.getenv().getOrDefault("DB_URL","jdbc:mysql://localhost:3306/campus_events"),System.getenv().getOrDefault("DB_USER","root"),System.getenv().getOrDefault("DB_PASSWORD",""));}}
