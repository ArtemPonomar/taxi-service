package taxi.service;

import java.util.Objects;
import taxi.dao.DriverDao;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthServiceImpl implements AuthService {

    public static final String AUTH_ERROR
            = "Could not authenticate Driver with designated credentials.";

    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Driver found = driverDao.getByLogin(login)
                .orElseThrow(() -> new AuthenticationException(AUTH_ERROR));
        if (found.getPassword() == null || !Objects.equals(found.getPassword(), password)) {
            throw new AuthenticationException(AUTH_ERROR);
        }
        return found;
    }
}
