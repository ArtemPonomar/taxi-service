package taxi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.lib.Inject;
import taxi.service.AuthService;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
    @Inject
    private AuthService authService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getSession().setAttribute("driverId", null);
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }
}