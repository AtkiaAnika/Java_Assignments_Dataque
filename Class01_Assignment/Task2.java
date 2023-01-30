public class Task2 {
	
	public static void main(String[] args) {
		
		double attendance = 9.0;
		double assignment = 12.0;
		double quiz = 18.0;
		double mid = 26.0;
		double fin = 35.0;
		
		double obtained = (attendance+assignment+quiz+mid+fin );
		
		double total = 115.0;
		double score = 100.0;
		
		double ans = ((obtained/total)*score);
		System.out.println("Obtained score is "+ans+"% out of 100%");
		
		
	}
	

}
