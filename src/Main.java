public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Крутая книга 1", "Л.Н. Толстой", 1888);
        Book book2 = new Book("Крутая книга 2", "Дядька №2", 2022);
//        toString
        System.out.println(book1.toString());
        System.out.println(book2.toString());
//      hashCode
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
//      equals
        System.out.println(book1.equals(book2));


//        equals
        Author author1 = new Author("Степан", "Кочергин");
        Author author2 = new Author("Роман", "Степанов");
//        toString
        System.out.println(author1.toString());
        System.out.println(author2.toString());
//      hashCode
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
//      equals
        System.out.println(author1.equals(author2));

    }


}