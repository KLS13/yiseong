package test05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++){
			for(int j=4;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	System.out.println();
	
	for(int i=0;i<4;i++){
		for(int j=0;j<3-i;j++){
			System.out.print(" "); 
		}
		for(int j=0;j<2*i+1;j++){
			System.out.print("*"); 
		}
		System.out.println("");
	}

	for(int i=0; i<4; i++) {
		
		// i가 0일때    0 < 3  012  ( 3칸 공백)    2*i+1;   
		for(int j=0; j<3-i;j++) {
			System.out.print(" ");
		}
		for(int j=0; j<2*i+1; j++) {
			System.out.print("*");
		}
		
		System.out.println("");
	}
	}
}
