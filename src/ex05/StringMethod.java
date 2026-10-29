package ex05;

import java.text.MessageFormat;
import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		//
		String str0 = "Hello";
		System.out.println("문자열의 길이" + str0.length());
		
		//             0123
		String str1 = "Java";
		System.out.println("문자 반환 : " + str1.charAt(1));
		
		//             0123456789
		String str2 = "Hello World";
		System.out.println("부분문자열 substring" + str2.substring(0, 4+1));
		System.out.println("부분문자열 substring" + str2.substring(6));
		
		//			   012345
		String str3 = "banana";
		System.out.println("문자(a)의 위치:" + str3.indexOf('a'));			//1
		System.out.println("문자(a)의 위치:" + str3.indexOf('a', 2));		//3
		System.out.println("문자(a)의 위치:" + str3.lastIndexOf('a'));		//5
		
		// ~를 포함하는 : 시작, 중간, 끝
		String str4 = "choco pie, apple pie ver2";
		System.out.println("pie 문자열을 포함하는가? " + str4.contains("pie"));
		
		// ~로 시작되는
		String str5 = "filename.java";
		System.out.println("file 이 시작 :  " + str5.startsWith("file"));
		System.out.println("file 의 위치 : " + str5.indexOf( "file" ) );
		
		// ~로 끝나는
		System.out.println(".java로 끝나는 : " + str5.endsWith(".java"));
		
		// 문자열 비교
		String str6 = "Java";
		String str7 = "java";
		System.out.println( str6.equals(str7) );			// 
		System.out.println( str6.equalsIgnoreCase(str7) );	// 대소문자 무시
		
		// 대소문자 변환
		System.out.println( str6.toUpperCase());
		System.out.println( str6.toLowerCase());
		
		// 앞뒤의 공백 제거
		String str8 = "     짱구    ";
		System.out.println(str8);
		System.out.println(str8.length());
		
		System.out.println(str8.trim());
		System.out.println(str8.trim().length());
		
		// 문자열 교체
		String str9 = "I love Java";
		System.out.println(str9);
		System.out.println(str9.replace("Java", "Python"));
		System.out.println(str9);
		str9 = str9.replace("Java", "Anaconda");
		System.out.println(str9);
		
		// 문자열을 분리하여 문자열 배열로
		String str10 		= "red,green,blue";
		System.out.println(str10);						// red,green,blue
		String [] colorArr 	= str10.split(",");
		System.out.println(colorArr);					// [Ljava.lang.String;@8bcc55f
		
		System.out.println(Arrays.toString(colorArr));	// [red, green, blue]
		System.out.println(colorArr[0]);				// red
		System.out.println(colorArr[1]);				// green
		System.out.println(colorArr[2]);				// blue
		
		//
		String empty = "";		// 빈 문자열   : length() : 0
		String blank = " ";		// 공백 문자열 : length() : 1 , empty와 동일하게 입력해도 true
		
		System.out.println(empty.isEmpty());	// 빈 문자열인가
		System.out.println(blank.isBlank());	// 공백 문자열인가  - java 11부터 가능
		
		//
		String name = "Alice";
		int    age  = 22;
		String msg  = String.format("이름 : %s, 나이 : %d",
									name, age);
		System.out.println(msg);
		
		String msg2 = MessageFormat.format("이름 : {0}, 나이 : {1}", 
									name, age);
		System.out.println(msg2);
		
		// split 의 반대 join
		String result = String.join("-", colorArr);
		System.out.println(result);
		
		String result2 = String.join("-", "2026", "10", "29");
		System.out.println(result2);
		
		// 문자열을 count 만큼 반복
		String star = "*";
		System.out.println(star.repeat(5));  // java 11부터 가능
		
		
		
	
	}

}
