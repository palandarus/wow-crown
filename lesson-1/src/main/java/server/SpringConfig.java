package server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import server.auth.AuthService;
import server.auth.AuthServiceJdbcImpl;
import server.persistance.UserRepository;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class SpringConfig {

    @Bean
   public Server server(AuthService authService){
       return new Server();
   }

    @Bean
    public AuthService authService(UserRepository userRepository){
        return new AuthServiceJdbcImpl(userRepository);
    }

    @Bean
    public UserRepository userRepository(DataSource dataSource) throws SQLException{
        return new UserRepository(dataSource);
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUserName("palandarus");
        ds.setPassword("root");
        ds.setUrl("jdbc:mysql://localhost:3306/wow_crown?&amp;useUnicode=true&amp;characterEncoding=UTF-8&amp;serverTimezone=UTC");
        return ds;
    }

}
