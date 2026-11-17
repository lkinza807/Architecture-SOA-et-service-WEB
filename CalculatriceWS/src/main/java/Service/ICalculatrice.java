package Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "CalculatriceWS")
public interface ICalculatrice {

    @WebMethod(operationName = "addition")
    int somme(@WebParam(name = "a") int a,
              @WebParam(name = "b") int b);

    @WebMethod(operationName = "soustraction")
    int soustraction(@WebParam(name = "a") int a,
                     @WebParam(name = "b") int b);

    @WebMethod(operationName = "multiplication")
    int multiplication(@WebParam(name = "a") int a,
                       @WebParam(name = "b") int b);

    @WebMethod(operationName = "division")
    double division(@WebParam(name = "a") double a,
                    @WebParam(name = "b") double b);
}