class two{
	public static void main(String args[]){
		String str = "Tushar";
		char target = 'h';
		System.out.println(search(str, target));
	}
	static boolean search(String str, char target){
		if (str.length()==0){
			return false;
		}
		
		for(int i=0;i<str.length();i++){
			if(target == str.charAt(i)){
				System.out.println(str.charAt(i));
				return true;
				
			}
		}
		
		return false;
	}
}