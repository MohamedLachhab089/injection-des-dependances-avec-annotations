package ext;

import dao.IDao;

public class DaoImplWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        return 90;
    }
}
