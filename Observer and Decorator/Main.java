public class Main 
{
    public static void main(String[] args) 
    {
        Reader1 r1 = new Reader1();
        Reader2 r2 = new Reader2();
         
        Newspaper n = new Newspaper();
         
        n.attach(r1);
        n.attach(r2);
        //Reader yang sudah didaftarkan sebagai subscriber akan menerima pesan dibawah
        n.notifyUpdate(new Message("New Newspaper just update !!! click link below to read \nhttps://Newspaper.com/updateNews"));
    }
}
