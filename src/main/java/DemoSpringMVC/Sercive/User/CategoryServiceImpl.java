package DemoSpringMVC.Sercive.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.ProductsDao;
import DemoSpringMVC.Dto.ProductsDto;


@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ProductsDao productsDao;

	public List<ProductsDto> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}

	public List<ProductsDto> GetDataProductsPaginate(int start, int end) {
		return productsDao.GetDataProductsPaginate(start, end);
	}

}