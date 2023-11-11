package DemoSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperMenus implements RowMapper<Menus> {

	@Override
	public Menus mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Menus menus = new Menus();
		menus.setId(rs.getInt("Id"));
		menus.setName(rs.getString("name"));
		menus.setUrl(rs.getString("url"));
		return menus;
	}

}

