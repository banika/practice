import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class MainClass {
    public static void main ( String[] args )
    {
        ArrayList<String> event = new ArrayList<String>();
        event.add("A");
        event.add("B");
        event.add("C");
        event.add("D");
        System.out.println(event);
        Iterator<String> events = event.iterator();
        String fullPath = "";
        String suppliedPath ="X:";
        while(events.hasNext()) {
            fullPath = suppliedPath + events.next();
            System.out.println(fullPath);
        }
    }

    public static void main1 ( String[] args )
    {
        Map contextMap = new HashMap();
        contextMap.put("OCR_NOTE", "retrieve image from binary Store");
        contextMap.put("OCR_NOTE", "111");

        String fileName = "C:\\Projects\\practice\\intData.dat" ;
        long sum = 0;

        try
        {
            DataInputStream instr = new DataInputStream(new BufferedInputStream(new FileInputStream( fileName ) ) );

            sum += instr.readInt();
            sum += instr.readInt();
            sum += instr.readInt();
            sum += instr.readInt();

            System.out.println( "The sum is: " + sum );
            instr.close();
        }
        catch ( IOException iox )
        {
            System.out.println("Problem reading " + fileName );
        }
    }
}