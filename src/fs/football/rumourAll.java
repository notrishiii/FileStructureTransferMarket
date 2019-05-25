package fs.football;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class rumourAll {
    public static Vector<rumour> rumourall() throws FileNotFoundException, IOException, ClassNotFoundException{
        File f=new File("rumour.txt");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream obj = new ObjectInputStream(fin);
        Vector<rumour> v = (Vector<rumour>)obj.readObject();
            return v;
    }
}
