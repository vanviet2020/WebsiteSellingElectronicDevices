package DemoSpringMVC.Sercive.User;

import org.springframework.stereotype.Service;

import DemoSpringMVC.Dto.ProductsDto;

@Service
public interface IProductService {
	
	public ProductsDto GetProductByID(long id);
}