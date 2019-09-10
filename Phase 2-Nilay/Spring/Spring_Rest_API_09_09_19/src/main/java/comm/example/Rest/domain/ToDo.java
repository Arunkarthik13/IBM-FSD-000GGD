package comm.example.Rest.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class ToDo {

	public String id;
	public String description;
	public Date scheduledate;
	
	public ToDo(String description, Date scheduledate) {
		super();
		this.id=UUID.randomUUID().toString();
		this.description = description;
		this.scheduledate = scheduledate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getScheduledate() {
		return scheduledate;
	}

	public void setScheduledate(Date scheduledate) {
		this.scheduledate = scheduledate;
	}
	
	
	
}
