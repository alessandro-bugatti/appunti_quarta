package net.imparando;

import java.io.*;

public class Main {

    public static void main(String[] args) {
//	    Razionale r = new Razionale(1,2);
//        System.out.println(r);
//        ObjectOutputStream out = null;
//        try {
//            out = new ObjectOutputStream(new FileOutputStream("razionali.bin"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (out != null) {
//            try {
//                out.writeObject(r);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        ObjectInputStream in = null;
        Razionale r = null;
        try {
            in = new ObjectInputStream(new FileInputStream("razionali.bin"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            r = (Razionale) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(r);

        Successione s = null;


//        ObjectOutputStream out = null;
//        try {
//            out = new ObjectOutputStream(new FileOutputStream("successione.bin"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (out != null) {
//            try {
//                out.writeObject(s);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            in = new ObjectInputStream(new FileInputStream("successione.bin"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            s = (Successione) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
