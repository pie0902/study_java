package bookData;
import java.util.List;
import java.util.ArrayList;

public class BookList{
    private List<Book> booklist;
    public BookList() {

    }
    private void addList(){
        booklist = new ArrayList<>();
        booklist.add(new Book("경제를 배워요", "경제", 10000));
        booklist.add(new Book("경제를 배워요2", "경제", 15000));
        booklist.add(new Book("자바를 배워요", "IT", 20000));
        booklist.add(new Book("자바를 배워요2", "IT", 25000));
    }
    public List<Book> getBookList(){
        addList();
        return booklist;
    }
    @Override
    public String toString() {
        return toString();
    }

}
