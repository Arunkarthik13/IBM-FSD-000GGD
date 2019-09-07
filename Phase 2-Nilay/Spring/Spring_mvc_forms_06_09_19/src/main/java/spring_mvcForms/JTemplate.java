package spring_mvcForms;

import org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component(value="jdbcTemplate")
public class JTemplate extends JdbcTemplate{

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init()
	{
		setDataSource(dataSource);
	}
}
