import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    // Test for adding new Book and adding it to an arraylist.
    @BeforeEach
    public void testAddingABook(){

        Book bookOne = new Book("Harry Potter", "JK Rowling", "Novel", "1997/06/26",
                "Great book!", 1, true, 1);
        Book bookTwo = new Book("The Life of Gary Busey", "Gary Busey", "Fantasy", "2000/09/16",
                "Greatest book of all time!", 6, false, 2);
        Book bookThree = new Book("Da Vinci Code", "Dan Brown", "Novel", "1837/09/09",
                "This is not a good book!", 7, true, 3);
        Book bookFour = new Book("Lost", "This Guy", "Horror", "1957/02/11",
                "Average book!", 3, false, 4);
        Book bookFive = new Book("Like a boss", "Lonely Island", "Fantasy", "1297/11/30",
                "A good read but not as good as The life of Gary Busey.", 10, true, 5);

        Book.books.add(bookOne);
        Book.books.add(bookTwo);
        Book.books.add(bookThree);
        Book.books.add(bookFour);
        Book.books.add(bookFive);

        assertEquals("Harry Potter", bookOne.getTitle());
        assertEquals("JK Rowling", bookOne.getAuthor());
        assertEquals("Novel", bookOne.getGenre());
        assertEquals("1997/06/26", bookOne.getReleased());
        assertEquals("Great book!", bookOne.getComments());
        assertEquals(true, bookOne.isNotBorrowed());
        assertEquals(1, bookOne.getId());
        assertEquals(1, bookOne.getScore());


    }

    // Search for titles and if it is available and then returns completed if it exists and is available.
    @Test
    public void search_For_Title_And_Checks_If_It_Is_In(){
        assertTrue(Library.searchTitleAndCheckIfAvailable("Harry Potter"));
    }

    // Search for authors and if it is available and then returns completed if it exists and is available.
    @Test
    public void search_For_Author_And_Checks_If_It_Is_In(){
        assertFalse(Library.searchAuthorAndCheckIfAvailable("Gary Busey"));
    }

    // Search for genre and if it is available and then returns completed if it exists and is available.
    @Test
    public void search_For_Genre_And_Checks_If_It_Is_In(){
        assertTrue(Library.searchGenreAndCheckIfAvailable("Novel"));
    }

    // Search for release date and if it is available and then returns completed if it exists and is available.
    @Test
    public void search_For_Release_Date_And_Checks_If_It_Is_In(){
        assertTrue(Library.searchReleaseDateAndCheckIfAvailable("1297/11/30"));
    }


    // Search for highest scores and if it is available and then returns completed if it exists and is available.
    @Test
    public void search_For_Highest_Score(){
        assertEquals(10, Library.searchForHighestScore());
    }

    // Borrow a book from the library.
    @Test
    public void borrow_A_Book(){
        assertTrue(Library.borrowABook());
    }

    // Leave comment and score on borrowed book.
    @Test
    public void leave_A_Comment_And_Score(){
        Library.leaveCommentAndScore();
        assertEquals(5, Book.books.get(0).getScore());
        assertEquals("New comment!", Book.books.get(0).getComments());
    }

}