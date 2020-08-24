package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import server.auth.AuthService;

import java.util.ArrayList;

@Component
public class Server {
    @Autowired
    AuthService authService;

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
    }

}
