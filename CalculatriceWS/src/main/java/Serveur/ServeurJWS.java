package Serveur;

import jakarta.xml.ws.Endpoint;
import Service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8686/";
        Endpoint.publish(url, new CalculatriceWS());
        System.out.println("Service SOAP publié à : " + url);
    }
}