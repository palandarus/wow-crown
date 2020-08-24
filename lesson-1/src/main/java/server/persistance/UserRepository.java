package server.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import server.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserRepository {


    private final Connection conn;

    @Autowired
    public UserRepository(DataSource dataSource) throws SQLException {
        this(dataSource.getConnection());
    }

    public UserRepository(Connection conn) {
        this.conn=conn;
    }

    public void insert(User user) throws SQLException{
        try(PreparedStatement stmt=conn.prepareStatement(
                "insert into users(login, password, first_name, second_name, surname) values (?,?,?,?,?);"
        )){
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getFirst_name());
            stmt.setString(4, user.getSecond_name());
            stmt.setString(5, user.getSurname());
            stmt.execute();
        }
    }

    public User findByLogin(String login) throws SQLException{
        return new User("1", "1", "1", "1", "1");  //заглушка метода авторизации
    }
}
