package Emp;

public class Admin extends Employee {
		private int bonus;
		
		public Admin(String name,int Idno,double salary,int bonus)
		{
			super(name,Idno,salary);
			this.bonus=bonus;
		}
		
		public String toString()
		{
			String str;
			str="\n"+super.toString()+"\t"+bonus+"\t"+calsal();
			return str;
		}
		
	public double calsal() 
	{
		double netsal;
			netsal=salary+bonus;
			System.out.println("Net salary is :"+netsal);
			return netsal;
		
	}
	}


	

