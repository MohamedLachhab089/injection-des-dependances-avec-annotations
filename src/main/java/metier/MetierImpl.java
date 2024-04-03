package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    /*
    couplage faible
     */
    //@Autowired
    //@Qualifier("dao2") // vous dites injecte moi l'instance qui s'appele dao
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp/10;
        return res;
    }
    /*
    Injecté dans la variable dao un objet d'une classe qui implemente l'interface IDao
     */
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
