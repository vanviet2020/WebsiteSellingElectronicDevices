package DemoSpringMVC.Controlller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Sercive.User.HomeServiceIplm;

@Controller
public class BaseController {
	@Autowired
	HomeServiceIplm _homeService;
	public ModelAndView _mvShare = new ModelAndView();
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("menus",_homeService.GetDataMenus());
		return _mvShare;
	}
}
