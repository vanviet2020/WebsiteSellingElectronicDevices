package DemoSpringMVC.Sercive.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DemoSpringMVC.Dto.ProductsDto;

@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
	
 public List<ProductsDto> GetDataProductsPaginate(int start, int end);
}
 