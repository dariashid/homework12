public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1");
        Author king = new Author("Стивен", "Кинг");
        Book theShining = new Book("Сияние", 1977);
        System.out.println(theShining.getNames() + " " + king.getName() + " " + king.getLastName() + " " + theShining.getYear());
        System.out.println("Книга 2");
        Author austen = new Author("Джейн", "Остин");
        Book persuasion = new Book("Доводы рассудка", 1817);
        System.out.println(persuasion.getNames() + " " + austen.getName() + " " + austen.getLastName() + " " + persuasion.getYear());
        persuasion.setYear(1820);
        System.out.println(persuasion.getNames() + " " + austen.getName() + " " + austen.getLastName() + " " + persuasion.getYear());
    }
}