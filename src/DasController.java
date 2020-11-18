import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DasController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String name = arg0.getParameter("name");
		Map map = new HashMap();
		map.put("message", "with multiple configuration files at different locations and custom configuration file name..."+name);
		return new ModelAndView("success", map);
	}

}
