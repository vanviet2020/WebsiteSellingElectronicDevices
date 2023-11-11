package DemoSpringMVC.Controlller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Dto.PaginatesDto;
import DemoSpringMVC.Sercive.User.CategoryServiceImpl;
import DemoSpringMVC.Sercive.User.PaginateServiceImpl;

@Controller
public class CategoryController extends BaseController {

	@Autowired
	private CategoryServiceImpl categoryService;
	@Autowired
	private PaginateServiceImpl paginateService;

	private int totalProductPage = 9;

	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id) {

		_mvShare.setViewName("user/products/category");

		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductPage, 1);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate",
				categoryService.GetDataProductsPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));
		return _mvShare;
	}

	@RequestMapping(value = "/san-pham/{id}/currentPage")
	public ModelAndView Product(@PathVariable String id, @PathVariable String currentPage) {

		_mvShare.setViewName("user/products/category");

		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductPage,
				Integer.parseInt(currentPage));
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate",
				categoryService.GetDataProductsPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));
		return _mvShare;
	}
}
