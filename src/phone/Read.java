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
			File file=new File("D:\\左E\\出租车\\20150330track09.csv");//根据抽象路径名创建文件实例
			BufferedReader br=new BufferedReader(new FileReader(file));//FileReader是读取字符文件的便捷类，BufferedReader从字符输入流中缓冲文本
			String row;
		    while((row=br.readLine())!=null){//每一次都去进行重新读取新的一行
			  String[] s =row.split(",");     //逗号分隔
			  aList.add(s);
		    }
		    aList.remove(0);//除去带字母的那一行
		    System.out.println(aList.get(1)[2]);
			return aList;
			
		}
		
	

}
