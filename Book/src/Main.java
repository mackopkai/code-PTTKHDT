import java.util.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        Author author1 = new Author("Truong","123@gmail.com",'N');
        Author author2 = new Author("Nghia","123@gmail.com",'N');
        Author author3 = new Author("Phuc cc","123@gmail.com",'N');
        Author author4 = new Author("Minh ban","123@gmail.com",'N');
        Author[] authors = {author1, author2, author3, author4};
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("toi la be de",authors,123));
        Map<String,Integer> map = new HashMap<>();

    }
    public static void findingBookOfAuthor(ArrayList<Book> books, Author author){
        for(Book book: books){
            if(book.getAuthorsName().contains(author.getName())) System.out.println(book.getName() + " ");
        }

    }
    public static void findingAuthorInBook(ArrayList<Book> books, Author[] authors, Map<String,Integer> map){
        String name = "";
        for (Author author : authors) {
            int count = 0;
            for (Book book : books) {
                if (book.getAuthorsName().contains(author.getName())) {
                    count++;
                }
            } 
            map.put(author.getName(), count);
        }

        String topAuthor = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                topAuthor = entry.getKey();
            }
        }

        // In ra tác giả có số lần xuất hiện nhiều nhất
        if (topAuthor != null) {
            System.out.println("Author with the most appearances: " + topAuthor + " - " + maxCount + " appearances");
        } else {
            System.out.println("No authors found.");
        }
    }
}