package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		int[] intArr = {50,30,10,40,20};
		for(int eachVal:intArr)
			System.out.print(eachVal+ " ");
		
		for(int i =0; i<intArr.length; i++) {
			for(int j =i; j<intArr.length; j++) {
				if(intArr[i] > intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		System.out.println();
		
		for(int eachVal:intArr)
			System.out.print(eachVal+ " ");
		System.out.println();
		
		int[] intArr2 = {50,30,10,40,20};
		char[] charArr = {'D','A','C','E','B'};
		String[] strArr = {"Orange","Apple","PineApple","Banana","Grapes"};
		
		Arrays.sort(intArr2);
		for(int eachVal:intArr2)
			System.out.print(eachVal+ " ");
		System.out.println();
		
		Arrays.sort(charArr);
		for(char eachVal:charArr)
			System.out.print(eachVal+ " ");
		System.out.println();
		
		
		Arrays.sort(strArr);
		for(String eachVal:strArr)
			System.out.print(eachVal+ " ");
		System.out.println();
		
		
		System.out.println("--------------------------------------");
		
		List<Integer> list1 = Arrays.asList(10,11,12,13,14);
		System.out.println(list1);
		
		System.out.println("--------------------------------------");
		
		list1.forEach(eachVal -> System.out.println(eachVal));
		
		System.out.println("--------------------------------------");
		
		list1.stream().filter(val1->{return val1%2==0;}).forEach(val->System.out.println(val));
		
		System.out.println("--------------------------------------");
		list1.stream().filter(val1->{return val1%2==1;}).forEach(val->System.out.println(val));
		
		
		System.out.println("--------------------------------------");
		List<Integer> list2 = Arrays.asList(32,12,44,69,53,26);	
		System.out.println(list2);		
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(list2.get(list2.size()-2));
		System.out.println(list2.get(list2.size()-1));
		System.out.println(list2.get(list2.size()-3));
		
		Collections.sort(list2,Comparator.reverseOrder());
		System.out.println(list2);
		System.out.println(list2.get(list2.size()-2));
		System.out.println(list2.get(list2.size()-1));
		System.out.println(list2.get(list2.size()-3));
		
		System.out.println(list2.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst());
		
		System.out.println("--------------------------------------");
		List<Integer> list3 = Arrays.asList(11,12,13,14,15);	
		System.out.println(list3);

		list3.stream().map(val1->val1*5).forEach(val-> System.out.print(val+ " "));
		List<Integer> newList = list3.stream().map(val1->val1*5).collect(Collectors.toList());
		System.out.println();
		System.out.println(newList);
		
		System.out.println("--------------------------------------");
		List<Integer> list4 = Arrays.asList(11,12,13,14,15);
		
		System.out.println(list4.stream().reduce(0,(val1,val2)-> val1+val2));
		
	}

}
