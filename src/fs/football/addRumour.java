/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs.football;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author Rishi Jha
 */
public class addRumour {
    public static void addRumour(rumour p) throws ClassNotFoundException, FileNotFoundException, IOException {
        Vector<rumour> v = null;
        Btree i = null;
        File f = new File("rumour.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        try {
            //Add player to record
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(fin);
            v = (Vector<rumour>) obj.readObject();
 
            v.add(p);

            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            obj1.writeObject(v);
            
            
        } catch (EOFException e) {
            
            Vector<rumour> z = new Vector<>();
            
            //Add to record
            z.add(p);
            
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            obj1.writeObject(z);
           
            
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
