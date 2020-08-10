//creating ArrayList class
//add()
//size()
//remove()
//iterator()
//ge//isEmpty()
//subList()
//clear()
import java.util.*;
public class ArrayList_demo {
public static void main(String args[]){
    ArrayList<String> list=new ArrayList<String>();

    list.add("sangeetha");
    list.add("sai krishna");    //type of adding element
    list.add(2,"sai"); //type of adding element
    list.add("sweety");
    list.add("ramya");

          System.out.println("after adding five elements: "+ list.size());//size of arraylist after adding
    list.remove(2);

    Iterator itr=list.iterator();//traversing list through iterator
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
           System.out.println("after removing index 2 value ");
           System.out.println("list size is: "+list.size());//size of arraylist
           System.out.println(list.get(3));//to know the string of index 2
           System.out.println( "iterated : "+ list.listIterator());
           System.out.println("does list is empty :"+list.isEmpty());
           System.out.println("list data from index 1 to 3: "+list.subList(1,3));
           System.out.println();
           System.out.println("by adding a value:" +list.add("chikki")); //it is adding into list and it will say TRUE
           System.out.println();
   Iterator itr2 = list.iterator();
   while(itr2.hasNext())
   {
       System.out.println(itr2.next());
   }
          list.clear();// to clear the Arraylist
          System.out.println("cleared");
}
}
