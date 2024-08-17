class FibonacciSeries{
	public static void main(String[] args){
		int a=0, b=1,  c, d;
		System.out.print("\t"+a+"\t"+b+"\t");
		for (d=1; d<=17; d++){
		c=b+a;
		System.out.print(c+"\t");
		a=b;
		b=c;
		}
	}	
}