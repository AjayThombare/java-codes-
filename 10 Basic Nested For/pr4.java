// A C E 
// G I K 
// M O Q


class P4{
	public static void main(String[] args){
		char ch = 'A';
		for (int i=1; i<=3; i++){
			for (int j=1; j<=3; j++){
				System.out.print(ch + " ");
				ch =((char)(ch + 2));
			}
			System.out.println();
		}
	}
}

			      		
