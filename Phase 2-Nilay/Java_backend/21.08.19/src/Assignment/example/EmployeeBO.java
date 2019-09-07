package Assignment.example;

public class EmployeeBO {
	Employee e=null;
	public void SortbySalary(Object[] obj) {
		
		for(Object o:obj)
		{
			e=(Employee)o;
			System.out.printf("Id:%-15d Name:%-30s Dept:%-30s Joining:%-10s Age:%-10d Salary:%-10d\n",e.getId(),e.getName().toString(),e.getDepartment().toString(),e.getDateOfJoining().toString(),e.getAge(),e.getSalary());
		}
		
	}

	public void SortbyAge(Object[] obj1) {
		for(Object o:obj1)
		{
			e=(Employee)o;
			System.out.printf("Id:%-15d Name:%-30s Dept:%-30s Joining:%-10s Age:%-10d Salary:%-10d\n",e.getId(),e.getName().toString(),e.getDepartment().toString(),e.getDateOfJoining().toString(),e.getAge(),e.getSalary());
		}
		
	}



	

}
