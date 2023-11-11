package DemoSpringMVC.Controlller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Sercive.User.IProductService;
import DemoSpringMVC.Sercive.User.PaginateServiceImpl;



@Controller
public class ProductController extends BaseController {
	
	@Autowired
	private IProductService _productService;
	
	@RequestMapping(value = {"chi-tiet-san-pham/{id}"})
	public ModelAndView Index(@PathVariable int id) {
		_mvShare.setViewName("user/products/product");	
		_mvShare.addObject("product",_productService.GetProductByID(id));
		return _mvShare;
	}
}
