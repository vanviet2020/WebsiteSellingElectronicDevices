package DemoSpringMVC.Sercive.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.CategorysDao;
import DemoSpringMVC.Dao.MenusDao;
import DemoSpringMVC.Dao.ProductsDao;
import DemoSpringMVC.Dao.SlidesDao;
import DemoSpringMVC.Dto.ProductsDto;
import DemoSpringMVC.Entity.Categorys;
import DemoSpringMVC.Entity.Menus;
import DemoSpringMVC.Entity.Slides;

@Service
public class HomeServiceIplm implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	
	@Autowired
	private CategorysDao categorys;

	@Autowired
	private MenusDao menusDao;
	
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}

	public List<Categorys> GetDataCategorys() {
		return categorys.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		return menusDao.GetDataMenus();
	}

	@Override
	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}

}
