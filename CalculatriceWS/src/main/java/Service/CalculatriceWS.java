package Service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "Service.ICalculatrice")
public class CalculatriceWS implements ICalculatrice {

    @Override
    public int somme(int a, int b) {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return a / b;
    }
}