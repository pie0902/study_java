# Stream 연습
------------------------------------
#### 🟢 간단 설명

안녕하세요. Stream을 학습하면서 간단하게 콘솔창에 시간을 출력하는 프로그램을 제작해봤습니다.


*****************************
#### 🟢 진행 기간
##### 2024.01.09

****************************

#### 🟢 진행 과정
##### 1. Book class를 만들어서 책 객체 생성
##### 2. Book List class를 만들어서 책 객체들로 이루어진 리스트를 생성
##### 3. Search 클래스에서 book의 카테고리를 입력받아서 원하는 책의 제목을 출력 (stream 사용)
##### 4. Main 방법에서 Search를 호출


****************************
#### 🟢 어려웠던 문제와 해결책
##### 1.Stream과의 첫만남
* 고민: 바로 전에 공부한 예외 처리도 어려웠지만 stream은 더 복잡했습니다.
* 해결: 다양한 자료형을 입력받아서 다양한 조건으로 stream을 사용하면서 이해하려 노력했습니다.

###### 예시)
```
public class Search {
    String input;
    //스트림을 사용합시다.
    Scanner sc = new Scanner(System.in);
    public Search() {
        // 새로운 리스트를 만든다
        BookList filterBook = new BookList();
        //입력을 받는다
        System.out.println("찾으시려는 카테고리를 입력하세요 ) 경제 , IT");
        input = sc.nextLine();
        //스트림을 사용해서 입력값이 포함되어있는지 검사하고 원하는 결과를 받아온다.
        List<Book> searchBook = filterBook.getBookList().stream().filter(book -> 
        book.getCategory().contains(input)).collect(Collectors.toList());
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
```

***************************
#### ✏️ 느낀점
> Stream을 공부하면서 람다 식도 알게 됐고 아직은 더 익숙해져야겠지만 정말 유용한 기능을 알게 되어서 뿌듯합니다.
> 더 많은 기능들을 실습해봐야겠다는 생각을 갖게 되는 기회였습니다.

