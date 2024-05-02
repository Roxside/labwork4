
import java.util.ArrayList;
import java.util.List;

public class BookList {

    public static List<Book> BookList = new ArrayList<>();

    public static Book findBook(String BookID) {
        for (int i = 0; i < BookList.size(); i++) {
            if (BookList.get(i).getBookID().equals(BookID)) {
                return BookList.get(i);
            }
        }
      return BookList.get(0);
    }

}
