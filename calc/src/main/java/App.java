import java.util.Scanner;
class App {
	public static final void main(String[] args){
		Integer a=new Integer(0);
		Integer b=new Integer(0);
		String op = new String();
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		op = in.next();
		switch(op){
			case "+":{
				System.out.println(a+b);
			}break;
			case "-":{
				System.out.println(a-b);
			}break;
			case "*":{
				System.out.println(a*b);
			}break;
			case "/":{
				System.out.println(a/b);
			}break;
			default:{
				System.out.println("Smthng wrong");
			}
		}
	}
}
