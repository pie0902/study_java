package bookData;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Search {
    String input;
    //int num;
    //스트림을 사용합시다.
    Scanner sc = new Scanner(System.in);
    public Search() {
        // 새로운 리스트를 만든다
        BookList filterBook = new BookList();
        //입력을 받는다
        System.out.println("찾으시려는 카테고리를 입력하세요 ) 경제 , IT");
        input = sc.nextLine();
        //스트림을 사용해서 입력값이 포함되어있는지 검사하고 원하는 결과를 받아온다.
        List<Book> searchBook = filterBook.getBookList().stream().filter(book -> book.getCategory().contains(input)).collect(Collectors.toList());
        for(Book book:searchBook){
            System.out.println(input + " 카테고리: " +book.getName() +" " + book.getPrice() + "원");
        }

        //세일하는 책 목록 만들기 코드
        //        List<Book> saleBook = new ArrayList<>();
        //        for(Book book: filterBook.getBookList()) {
        //            if (book.getCategory().equals("IT")) {
        //                double setBookPrice = book.getPrice() * 0.6;
        //                int bp = (int)Math.round(setBookPrice);
        //                book.setPrice(bp);
        //                saleBook.add(book);
        //            }
        //        }
    }

}
