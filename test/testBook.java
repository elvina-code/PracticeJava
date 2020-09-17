import com.company.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testBook {

        @Test

        public void testPrice(){
            Book book = new Book(3, "helloJava");

            assertEquals(3, book.getPrice());



        }
    }

