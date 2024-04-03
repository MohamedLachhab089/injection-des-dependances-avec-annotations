package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl  implements  IDao{

    @Override
    public double getData() {
        /*
        se connecter a la BD pour la recuperation de la temperature
         */
        System.out.println("Version base de données");
        double temp = Math.random()*20;
        return temp;
    }
}
