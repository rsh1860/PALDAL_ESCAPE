package Team5;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Professor implements Person{
	
	 int[] answer;

	public int[] store_ans(String fileName){
		answer=new int[1000];
		
		try{
		FileInputStream f=new FileInputStream(fileName);
		int i=f.read();
		
		int n;
		for(n=0;i!=-1;n++){
			answer[n]=i-48;
			i=f.read();		
		}
		}
		catch(Exception e){
			System.out.println("ERROR");
		}
	return answer;
		
	}
	
	@Override
	public String give(String fileName){
		String s="";
			try{
			FileInputStream f=new FileInputStream(fileName);
			int i=f.read();
			while(i!=-1){
				 i=f.read();
	
				s=s+(char)i+"";
				 
				}System.out.println(s);
				return s;
				
			}
			catch(FileNotFoundException er){
				System.out.println("file ERROR");return "";
				}
			catch(IOException e){
				System.out.println("ERROR");return "";
				}
			
	}
	


}
