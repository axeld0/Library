package Model;

public class Product {
    private  int id;
    private String title;
    private String date;


    public Product()
    {
        id = 0;
        title = "";
        date = "";
    }

    public Product(int id, String title, String date)
    {
        this.date = date;
        this.id = id;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }


    public String getDate() {
        return date;
    }
}
