import ws.Banque;

import javax.xml.ws.Endpoint;

public class JaxServeurWs {

    public static void main(String[] args) {

        String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url, new Banque());
        System.out.println("seb service déployé sur " + url);

    }
}
