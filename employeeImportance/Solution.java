package employeeImportance;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public int getImportance(List<Employee> employees, int id) {
	    int importance=0;	    
        for(Employee employee:employees){        	
        	if(employee.id==id){
        		importance=employee.importance;
        		if(employee.subordinates!=null)
        		for(Integer i:employee.subordinates)
        			importance+=getImportance(employees,i);
        		break;  
        	}
    }
        return importance;
}
public static void main(String[] args){
	Solution s=new Solution();
	List<Employee> l=new ArrayList<Employee>();
	List<Integer> su=new ArrayList<Integer>();
	Employee e1=new Employee();
	e1.id=1;
	e1.importance=5;
	Employee e2=new Employee();
	e2.id=2;
	e2.importance=3;	
	Employee e3=new Employee();
	e3.id=3;
	e3.importance=3;	
	su.add(2);
	su.add(3);
	e1.subordinates=su;
	l.add(e1);
	l.add(e2);
	l.add(e3);
	System.out.println(s.getImportance(l, 1));
}
}
