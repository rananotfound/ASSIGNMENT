package FileListingApp;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;



class FileListing 
{
    
    
    static ArrayList<String> store = new ArrayList<String>();
    static String scan = null;
    static String show = null;
    
    public static void main(String[] args) throws IOException  
    {
        
        JFrame f;
        f=new JFrame();   
        String name=JOptionPane.showInputDialog(f,"Enter Path of Text Document");
        
        File file = new File(name);
        boolean check = file.exists();
        System.out.println("File Exist :"+check);
        FileReader in = null;
        
    try
    {
    in = new FileReader(file);
        BufferedReader br=new BufferedReader(in);

        
                   scan = br.readLine();

                  show = br.readLine();

            {
                File filenew = new File(scan);

                if(filenew.exists() && filenew.isDirectory()) 
                {
                    File arr[]=filenew.listFiles(); 
                    print(arr, 0, 0);
                }
                System.out.println("\nSuccessful");
            }
            {
                File sw = new File(show);
                FileWriter out =new FileWriter(sw);
                try
                {
                    Iterator itr = store.iterator();
                    while(itr.hasNext())
                    {
                        String x =(String) itr.next();
                        
                        out.write(x);
//                        out.write("\n");
//                        out.write(",");
         
                     
                    }
                    out.close();
                }
                catch(Exception e)
                    {
                        e.printStackTrace();
                    }
            }
          
        }
        
        catch(IOException e)
        {
            e.printStackTrace();
      
        }
    
    }

    static void print( File[] array,int index,int l)
    {
        if(index == array.length)
        return;
        
        for(int i=0;i<l;i++)
            store.add("");   //System.out.println("\t");
            if(array[index].isFile())
            {
               store.add(array[index].getName()+" : "+array[index].getAbsolutePath() ); //System.out.println(array[index].getAbsoluteFile());
            }
            else if(array[index].isDirectory())
            {
                store.add(array[index].getName()+" : "+array[index].getAbsolutePath()); //System.out.println(array[index].getAbsolutePath());
                 print(array[index].listFiles(), 0, l+ 1);
            }
            print(array,++index, l);
    }
}