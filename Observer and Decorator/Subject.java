public interface Subject 
{
    public void attach(Observer o); //method ini akan menyimpan pembaruan notifikasi
    public void notifyUpdate(Message m); //method ini digunakan untuk melakukan update notifikasi dari admin
}