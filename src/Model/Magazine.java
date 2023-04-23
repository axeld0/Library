package Model;

public class Magazine extends Product{

    private int number;


    public Magazine ()
    {
        number = 0;
    }
    public Magazine(int id, String title, String date, int number)
    {
        super(id, title, date);
        this.number = number;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Magazine{" +
                "number=" + number +
                "} " ;
    }
}
