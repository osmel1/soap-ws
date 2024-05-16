package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BankService {
    @WebMethod(operationName = "conversionEuroToDh")
    public double conversionEuroToDh(@WebParam(name = "montant") double montant) {
        return montant * 11;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*100000, new Date());
    }
    @WebMethod(operationName = "listCompte")
    public List<Compte> listCompte(){
        return List.of(new Compte(1, Math.random()*100000, new Date()),
                new Compte(2, Math.random()*100000, new Date()),
                new Compte(3, Math.random()*100000,new Date()));
    }
}
