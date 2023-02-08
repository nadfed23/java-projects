package server;

import animal.Herb;

import java.net.*;
import java.io.*;

public class NetServer {

    public static void main(String [] args) {

        int client = 0;
        ServerSocket serverSocket = null;
        OutputStreamWriter writer = null;
        Socket clientSocket = null;
        ObjectOutputStream objOutputStream = null;

        Herb hb = new Herb("Mint", 0.5);
        String filename = "herb.txt";
        try {

                serverSocket = new ServerSocket(8000);
                clientSocket = serverSocket.accept();
                System.out.println("Client accepted " + (++client));

                writer = new OutputStreamWriter(clientSocket.getOutputStream());

                writer.write(49);
                writer.flush();


                objOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
                objOutputStream.writeObject(hb);
                objOutputStream.flush();

        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            try {
                writer.close();
                clientSocket.close();
                serverSocket.close();
                objOutputStream.close();
            } catch (IOException e) {
                System.out.println("Exception");
            }

        }
    }
}
