// In progress not completed yet
package romanToInt;

import java.util.*;

public class RomanToInt {
	
//	Method for converting roman numeral to integer
	
	public int converter(String s){
		Map<Character, Integer> map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			if(i>0 && map.get(s.charAt(i))>map.get(s.charAt(i-1))) {
				result += map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));
			}else {
				result += map.get(s.charAt(i));
			}
		}
		
		return result;
	}
	//main method
	public static void main(String[] args) {
		System.out.println("Enter roman numeral : ");
		 Scanner sc = new Scanner(System.in);
		 String roman = sc.nextLine();
		RomanToInt obj = new RomanToInt();
		int num = obj.converter(roman);
		System.out.println(num);

	}

}
