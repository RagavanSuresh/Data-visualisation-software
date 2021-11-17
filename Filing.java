import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filing
{
    File file = new File("C:\\Users\\ragav\\OneDrive\\Desktop\\Data Visualisation Software\\data.csv");
    String name;
    int grade;
    int mark;

    public void createfile()
    {
        try
        {
            if(file.createNewFile())
            {
                FileWriter writer = new FileWriter("C:\\Users\\ragav\\OneDrive\\Desktop\\Data Visualisation Software\\data.csv",true);
                writer.write("Name,Class,Marks\n");
                writer.close();
                System.out.println("New file created!!!");
            }
            else
            {
                System.out.println("File already exists!!!");
            }
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void writefile()
    {
        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\ragav\\OneDrive\\Desktop\\Data Visualisation Software\\data.csv",true);
            writer.append(name+","+grade+","+mark+"\n");
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void readfile()
    {
        try
        {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
            {
                String[] temp = reader.nextLine().split(",");
                System.out.printf(temp[0]+"\t"+temp[2]+"\n");
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> exportdata()
    {
        
        ArrayList<String[]> tempr = new ArrayList<String[]>();
        try
        {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
            {
                String[] temp = reader.nextLine().split(",");
                if(temp[0].equals("Name"))
                {
                    continue;
                }
                else
                    tempr.add(temp);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // for(int i=0;i<tempr.size();i++)
        // {
        //     String[] temp = tempr.get(i);
        //     System.out.println(temp[0]+"\t"+temp[1]+"\t"+temp[2]+"\n");
        // }
        return tempr;
    }

    public void display()
    {
        ArrayList<String[]> tempList = exportdata();
        for(int i=0;i<tempList.size();i++)
        {
            String[] temp = tempList.get(i);
            System.out.println(temp[0]+"\t"+temp[1]+"\t"+temp[2]);
        }
    }

    public static void main(String[] args)
    {
        Filing f = new Filing();
        f.createfile();
        f.display();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
