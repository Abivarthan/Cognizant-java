public class MethodOverloading
{
	void sum(int x,int y){
		System.out.println(x+y);
	}
	void sum(int x,int y,int z){
		System.out.println(x+y+z);
	}
	void sum(double x,double y){
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		int a=5;
		int b=90;
		int c=37;
		MethodOverloading add=new MethodOverloading();
		add.sum(a,b);
		add.sum(a,b,c);
		add.sum(5.90389,90.3895599);
	}
}