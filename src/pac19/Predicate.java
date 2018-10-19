package pac19;

import java.util.ArrayList;

//public class PredicateExample {
public class Predicate {

    public static void main(String[] args) {
 
        //Create ArrayList and add String elements.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("onur");
        arrayList.add("swtestacademy");
        arrayList.add("testing");
        arrayList.add("automation");
 
        //Print the array list before remove operation.
        System.out.println(arrayList.toString());
 
        //Remove element which has a value of "onur" and print the array list.
        arrayList.removeIf(arrayElement -> arrayElement.equalsIgnoreCase("onur"));
        System.out.println(arrayList.toString());
    }
}