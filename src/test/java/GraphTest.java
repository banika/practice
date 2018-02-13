import algo.basics.Graph;
import org.junit.Test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by banindita on 4/3/2017.
 */
public class GraphTest {
    @Test
    public void testBasicGraph() {
        InputStream is = null;
        DataInputStream dis = null;

        try {

            // create input stream from file input stream
            is = new FileInputStream("C:\\Projects\\practice\\tinyG.txt");

            // create data input stream
            dis = new DataInputStream(is);

            Graph graph = new Graph(dis);

//            // count the available bytes form the input stream
//            int count = is.available();
//
//            // create buffer
//            byte[] bs = new byte[count];
//
//            // read data into buffer
//            dis.read(bs);
//
//            // for each byte in the buffer
//            for (byte b:bs) {
//
//                // convert byte into character
//                char c = (char)b;
//
//                // print the character
//                System.out.print(c+" ");
//            }

        } catch(Exception e) {

            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
