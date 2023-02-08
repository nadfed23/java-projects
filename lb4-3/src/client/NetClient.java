package client;



import animal.Herb;

import java.net.*;
import java.io.*;

public class NetClient {

    public static void main(String [] args)  {
        Socket clientSocket =  null;
        BufferedReader reader = null;
        ObjectInputStream objInputStream = null;
        String filename = "herb.txt";
        try {
           clientSocket = new Socket("127.0.0.1", 8000);
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String message = reader.readLine();
            System.out.println(message + " ");

            objInputStream = new ObjectInputStream(new FileInputStream(filename));
            Herb herb = (Herb) objInputStream.readObject();
            System.out.println("Herb " + herb.getName());


        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            try{
                objInputStream.close();
                reader.close();
                clientSocket.close();
            }catch (IOException e){
                System.out.println("Exception");
            }
            catch (NullPointerException e){
                System.out.println("Exception");
            }
        }

    }

}
