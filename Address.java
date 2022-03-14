//example of aggregation
class Address
  {
	String houseno, street ;
	long pin;
	  }
		class Student
{
		String name, cource;
		int roll;
		Address ad;
		void display()
                  {
	        System.out.println(name + "\t" + roll + "\t" +cource);
		System.out.println(ad.houseno + "\t" + ad.street + "    " + ad.pin);

	}	
}