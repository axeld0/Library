package Model;

public class Book extends Product implements ILendable{
    private boolean lend;


    public Book()
    {
        lend = false;
    }

    public Book (int id, String title, String date)
    {
        super(id, title, date);
        this.lend = false;
    }

    @Override
    public void lend() {
        this.lend = true;
    }

    @Override
    public void returnProduct() {
        this.lend = false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Book{" +
                "lend=" + lend +
                '}';
    }

}
