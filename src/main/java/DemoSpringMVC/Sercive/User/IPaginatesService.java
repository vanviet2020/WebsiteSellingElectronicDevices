package DemoSpringMVC.Sercive.User;

import org.springframework.stereotype.Service;

import DemoSpringMVC.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates();
}
