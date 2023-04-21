package Tests;

import personnes.Client;
import java.util.Date;

public class TestClient {
    public static void main(String[] args) {
        Client client1 = new Client("Doe", "John", new Date(2000, 1, 1), 1, 1234, "johndoe@example.com", "123 Main St", 100);
        Client client2 = new Client("Doe", "Jane", new Date(2000, 1, 1), 1, 1234, "janedoe@example.com", "123 Main St", 100);
        Client client3 = new Client("Doe", "John", new Date(2000, 1, 1), 2, 5678, "johndoe@example.com", "123 Main St", 200);

        System.out.println("Client 1 : " + client1.toString());
        System.out.println("Client 2 : " + client2.toString());
        System.out.println("Client 3 : " + client3.toString());

        System.out.println("Test égalité entre client 1 et client 2 : " + client1.equals(client2));
        System.out.println("Test égalité entre client 1 et client 3 : " + client1.equals(client3));

        client1.setPoints(200);

        System.out.println("Client 1 après modification : " + client1.toString());
    }
}
