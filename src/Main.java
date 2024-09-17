public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1");
        Author mishaBulgakov = new Author("Михаил", "Булгаков");
        Book masterAndMargarita = new Book("Мастер и Маргарита", mishaBulgakov, 1968);
        masterAndMargarita.setDatePublication(1967);
        // Метод toString
        System.out.println(masterAndMargarita);
        // Книга 2
        System.out.println();
        System.out.println("Книга 2");
        Author fedyaDostoevky = new Author("Федор", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", fedyaDostoevky, 1890);
        crimeAndPunishment.setDatePublication(1866);
        System.out.println(crimeAndPunishment);
        // Реализация метода equals
        System.out.println(crimeAndPunishment.equals(masterAndMargarita));
        // Реализация метода hashCode
        System.out.println(crimeAndPunishment.hashCode());
        System.out.println();
        // Третья книга для сравнения
        System.out.println("Книга 3");
        Book book1 = new Book("Мастер и Маргарита", mishaBulgakov);
        System.out.println(book1);
        // Реализация метода equals
        System.out.println(masterAndMargarita.equals(book1));
        System.out.println(book1.equals(crimeAndPunishment));
       // рефлизация метода hashcode
        System.out.println(book1.hashCode());
        System.out.println(masterAndMargarita.hashCode());

    }
}