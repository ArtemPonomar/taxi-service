package taxi.controller.car;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.lib.Injector;
import taxi.model.Car;
import taxi.model.Manufacturer;
import taxi.service.CarService;
import taxi.service.ManufacturerService;

@WebServlet("/cars/add")
public class AddCarController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final CarService carService
            = (CarService) injector.getInstance(CarService.class);
    private final ManufacturerService manufacturerService
            = (ManufacturerService) injector.getInstance(ManufacturerService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Manufacturer> manufacturers = manufacturerService.getAll();
        req.setAttribute("manufacturers", manufacturers);
        req.getRequestDispatcher("/WEB-INF/views/cars/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        final String manufacturerId = req.getParameter("madeBy");
        final Manufacturer manufacturer = manufacturerService.get(Long.valueOf(manufacturerId));
        final String model = req.getParameter("model");
        final Car car = new Car();
        car.setManufacturer(manufacturer);
        car.setModel(model);
        carService.create(car);
        resp.sendRedirect(req.getContextPath() + "/");
    }
}
