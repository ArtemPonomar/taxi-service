package taxi.service;

import taxi.exception.AuthenticationException;
import taxi.model.Driver;

public interface AuthService {
    Driver login(String login, String password) throws AuthenticationException;
}
