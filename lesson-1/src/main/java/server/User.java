package server;

public class User {

    private Long id;
    private String first_name;
    private String second_name;
    private String surname;
    private String login;
    private String password;

    public User(String first_name, String second_name, String surname, String login, String password) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
