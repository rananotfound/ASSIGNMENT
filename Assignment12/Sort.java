package movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort implements Comparable<Sort>
{
    String Name;
    int Age;
    
    Sort(String Name,int Age)
    {
        this.Name=Name;
        this.Age=Age;
        
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
    
    public static void main(String args[])
    {
        ArrayList<Sort> sort=new ArrayList<Sort>();
        sort.add(new Sort("Ashutosh",19));
        sort.add(new Sort("Krishna",20));
        sort.add(new Sort("Mukund",45));
        sort.add(new Sort("Umashankar",19));
        sort.add(new Sort("Raghunath",24));
        sort.add(new Sort("Gupta",38));
        
        Personname comparename = new Personname();
        Collections.sort(sort, comparename);
        System.out.println("Sorted According to Name :\n");
        for(Sort person : sort)
            System.out.println(person.getName()+" "+person.getAge());
        
        
        Collections.sort(sort);
        System.out.println("\nSorted According to Age :\n");
        for(Sort person : sort)
            System.out.println(person.getName()+" "+person.getAge());
        
    }

    @Override
    public int compareTo(Sort t) {
        return this.Age-t.Age;
    }
    
}









class Personname implements Comparator<Sort>
{
    @Override
    public int compare(Sort t, Sort t1) {
        return t.getName().compareTo(t1.getName());
    }
    
}
