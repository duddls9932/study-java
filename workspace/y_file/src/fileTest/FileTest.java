package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		절대 경로
//		어디서든지 찾아갈 수 있는 경로
//		D:\gb_0900_jyi\java\memo
//		상대경로
//		내 위치를 기준으로 찾아갈 수 있는 경로
//		./,현재경로 현재경로는 생략가능   ../뒤로가기
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt",true));
		bufferedWriter.write("불고기");
		bufferedWriter.close();
		try {
		    BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
		    String line;
		    while ((line = bufferedReader.readLine()) != null) {
		        System.out.println(line);
		    }
		    bufferedReader.close();
		} catch (Exception e) {
		    System.out.println("파일의 위치를 다시 확인해주세요");
		}
		
	}
}
