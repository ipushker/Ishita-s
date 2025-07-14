import java.util.*;
class ArrayListOperations{
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<>();
        a.add("Pain");
        a.add("Gain");
        System.out.println("Original List:"+a);
        a.add(1,"For");
        System.out.println("After adding element at index 1:"+a);
        a.remove(0);
        System.out.println("Elemenets removed from index 0:"+a);
        a.remove("Gain");
        System.out.println("After removing element Gain:"+a);
        a.set(0,"Done");
        System.out.println("Final List:"+a);
    }

}