package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {



public static void main(String[] args) {
Integer[] arr = {3,2,11,4,6,7};
List<Integer> list = Arrays.asList(arr);

Integer[] arr1 = {1,2,8,4,9,7};
List<Integer> list1 =Arrays.asList(arr1);


for (int i = 0; i<list.size(); i++)
{
for (int j =0; j<list1.size(); j++)
{
if (list.get(i)==list.get(j))
System.out.println(list.get(i));
}
}
}
}
