/*public interface ICalculator{
	 int add(int x, int y);
	 float divide(int x, int y);
}*/

class SimpleCalculator  implements ICalculator
{
	public float divide(int x, int y)
	{
		if(y!=0)
		 {
		 float z= x/y;
		 return z;
		 }
		 else
		 {
			 return 0;
		 }
	}

	public int add(int x, int y)
		{
			int z= x+y;
			return z;
		}
	
}
