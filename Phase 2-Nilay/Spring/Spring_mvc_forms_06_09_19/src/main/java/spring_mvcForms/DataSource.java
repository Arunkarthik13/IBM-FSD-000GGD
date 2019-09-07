package spring_mvcForms;
import javax.annotation.PostConstruct;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;

@Component(value="dataSource")
public class DataSource extends BasicDataSource
{
	@PostConstruct
public void create()
{
	setUrl("jdbc:mysql://localhost:3306/mydb");
	setUsername("root");
	setPassword("root");
	setDriverClassName("com.mysql.jdbc.Driver");
}
}