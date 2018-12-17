package work.Util;

import work.dao.IProductDAO;
import work.dao.ProductDAOimpl;

public class test {
    public static void main(String[] args) {
        IProductDAO iProductDAO=new ProductDAOimpl();


         System.out.println( iProductDAO.getOne(2));
    }
}
