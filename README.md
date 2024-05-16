# Activité Pratique N°5 - Web services SOAP
## Supervisé par :
* **Pr Mohamed YOUSSFI**
## Réalise Par : 
* **Oussama ElHachimi** - [osmel1](https://github.com/osmel1)
  
Au cours de ce tp on va développer, déployer et tester un service web SOAP utilisant JAX-WS pour la gestion de comptes bancaires. 
Les principales fonctionnalités du service incluent la conversion de montants en euros vers des dirhams (DH), la consultation de comptes individuels, et la consultation d'une liste de comptes.

## Creation de webservice 
- Tout d'abord on est besoin de creer une application java maven simple on ajoutant la dependance suivant :
  ![image](https://github.com/osmel1/soap-ws/assets/110778429/811e816d-ff8b-4a7c-ba52-2dd1b605b1da)
  <br><br>
- Le model de donnes `Compte` avec un constructeur avec tous les parametres et sans parametres + les getters et les setters 
- Le Webservice avec l'annotation `@WebService` on sepecifie le nom de service par `serviceName` et ajouter au methode l'annotation  `@WebMethod`
## Deployer  webservice 
Pour déployer le service web, nous créons une application principale qui appelle la méthode Endpoint.publish pour démarrer le service.
```
public class ServiceJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8080/";
        System.out.println("Web service started at " + url);
        Endpoint.publish(url, new BankService());
    }
}
```
## Consulter et analyser le WSDL avec un Browser HTTP
- Tapez l'address de service dans un navigateur et ajouter `/?wsdl`
  ![image](https://github.com/osmel1/soap-ws/assets/110778429/8af55937-68a2-49de-ae36-bf304ac6a232)

## Tester les opérations du web service avec  SoapUI
![1](https://github.com/osmel1/soap-ws/assets/110778429/49ded906-7270-4874-b737-40908b022c68)  <br>
-  Convertir un montant de l’euro en DH
![2](https://github.com/osmel1/soap-ws/assets/110778429/0a0621ad-ad6b-4dea-86e1-4651fe5ee6bf)
  <br>
- Consulter un Compte

![3](https://github.com/osmel1/soap-ws/assets/110778429/bc2dd7ed-c47e-401f-8aaa-ce57ed56eaa2)
<br>
-  Consulter une Liste de comptes
  
![5](https://github.com/osmel1/soap-ws/assets/110778429/b0820ca2-4460-4f15-b50e-5681b94772e7)
## Client SOAP Java
-  Tout d'abord on est besoin de creer une autre application java maven simple on ajoutant la meme dependance  :
  ![image](https://github.com/osmel1/soap-ws/assets/110778429/811e816d-ff8b-4a7c-ba52-2dd1b605b1da)
  <br><br>
- Generer le proxy on utilisant un plugin dans intellij :
![Capture](https://github.com/osmel1/soap-ws/assets/110778429/7339995a-026b-4967-bf6c-ca7950329105)
![8](https://github.com/osmel1/soap-ws/assets/110778429/86078485-5505-4726-823a-c3814b2818cb)
<br>
- Appelez une methode de webservice  `conversionEuroToDh`


![image](https://github.com/osmel1/soap-ws/assets/110778429/d356af0b-d4b9-4928-9d2e-885e41f53abf)

