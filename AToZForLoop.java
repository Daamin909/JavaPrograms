class AToZForLoop{
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int a, b=1;
		void printer(){
			for(a=0; a<=25; a++){
				System.out.println("The"+" "+b+" "+"alphabet is"+" "+alpha.charAt(a));
				b++;
			}
		}
	public static void main(String[] args){
		AToZForLoop atzfl=new AToZForLoop();
		atzfl.printer();
	}
}