import java.util.ArrayList;
public class ArrayListExamples
{
 public static void ex1(){
     //Declaring and printing an arraylist
     ArrayList<String> a = new ArrayList<String>();
     
     a.add("one");
     a.add("two");
     a.add("three");
     
     System.out.println(a);
     // [one, two three]
    }
    
 public static void ex2(){  
       
     ArrayList<String> alist = new ArrayList<String>();
     
     alist.add("one");
     alist.add("two");
     alist.add("three");
     
// iterating using a for  loop 
     for (int i=0; i < alist.size();i++){
        System.out.println(alist.get(i));  
    }
    
 // iterating using a foreach loop (enhanced for loop)   
     for (String a: alist){
        System.out.println(a);  
    }   
    /*
     one
     two
     three
     one
     two 
     three
     */
 }   
 
  public static void ex3(){
     ArrayList<String> alist = new ArrayList<String>();
     
     alist.add("one");
     alist.add("two");
     alist.add("three");
     
     // adding at the end of the list
     alist.add("four");
     
     // adding at the beginning of the list  
     alist.add(0,"zero");
     alist.add(2,"another");
     
     // setting a value at a specific location
     
     alist.set(3,"XXX");
     
     
     for (String a: alist){
        System.out.println(a);  
    }
    /*
     zero
     one
     another
     XXX
     three
     four
     */
 }  
 
  public static void ex4(){
     ArrayList<String> alist = new ArrayList<String>();
     
     alist.add("zero");
     alist.add("one");
     alist.add("two");
     alist.add("three");
     
     // removing from a list
     alist.remove(2);
     
     System.out.println(alist);
     
     // [zero, one, three]
    }    
    
 public static void ex5(){
     ArrayList<String> alist = new ArrayList<String>();
     
     alist.add("zero");
     alist.add("one");
     alist.add("two");
     alist.add("three");
     
     // changing a value in a list
     alist.set(2,"not two");
     
     System.out.println(alist);
     
     // [zero, one, not two, three]
    } 
    
    public static void ex6(){
     ArrayList<String> alist = new ArrayList<String>();
     
     alist.add("zero");
     alist.add("one");
     alist.add("two");
     alist.add("three");
     alist.add("four");
     alist.add("five");
     alist.add("six"); 
     
     //using a for loop to remove objects
      for (int i=0; i < alist.size();i++){
 
         if (i%2==0){
           alist.remove(i);
        }
           
     // Does this print what you would expect? Why or why not?
     
     System.out.println(alist);
     /*
     [one, two, three, four, five, six]
     [one, two, three, four, five, six]
     [one, two, four, five, six]
     [one, two, four, five, six]
     [one, two, four, five]
      */
    }  
    
}
    
}
