import Model.Book;
import Model.Magazine;
import Model.Product;

import java.lang.annotation.ElementType;

public class Main {
    public static void main(String[] args) {
        Book p1 = new Book(1,"Lala", "2/2/23");
        Magazine p2 = new Magazine(1 , "Magazine", "2/4/56", 1);

        Product [] a = new Product[2];
        a[0] = p1;
        a[1] = p2;

        //if(a[0] instanceof Book)
      // {
        //    ((Book) a[0]).lend();
       // }

        System.out.println(p1);
        System.out.println(p2);

        p1.lend();
        System.out.println(p1);
        p1.returnProduct();
        System.out.println(p1);
    }
}