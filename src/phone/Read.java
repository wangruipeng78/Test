package phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
		public static void main(String[] args) throws IOException{
			read();
		}
		public static List<String[]> read() throws IOException{
			List<String[]> aList=new ArrayList<String[]>();
			File file=new File("D:\\��E\\���⳵\\20150330track09.csv");//���ݳ���·���������ļ�ʵ��
			BufferedReader br=new BufferedReader(new FileReader(file));//FileReader�Ƕ�ȡ�ַ��ļ��ı���࣬BufferedReader���ַ��������л����ı�
			String row;
		    while((row=br.readLine())!=null){//ÿһ�ζ�ȥ�������¶�ȡ�µ�һ��
			  String[] s =row.split(",");     //���ŷָ�
			  aList.add(s);
		    }
		    aList.remove(0);//��ȥ����ĸ����һ��
		    System.out.println(aList.get(1)[2]);
			return aList;
			
		}
		
	

}
