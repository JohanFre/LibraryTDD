import static java.util.Comparator.comparing;

public class Library {


    public void main(String[] args) {

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

    }

    // Search for title and check if book is available.
    public static boolean searchTitleAndCheckIfAvailable(String title) {

        boolean inOrOut = false;

        for (int i = 0; i < Book.books.size(); i++) {

            if (title.equals(Book.books.get(i).getTitle()) && Book.books.get(i).isNotBorrowed() == true) {
                inOrOut = true;
                System.out.println(title + " is in our system and it's available.");
                return inOrOut;
            }

        }
        System.out.println(title + " is not available!");

        return inOrOut;
    }

    // Search for author and check if book is available.
    public static boolean searchAuthorAndCheckIfAvailable(String author) {

        boolean inOrOut = false;

        for (int i = 0; i < Book.books.size(); i++) {

            if (author.equals(Book.books.get(i).getAuthor()) && Book.books.get(i).isNotBorrowed() == true) {
                inOrOut = true;
                System.out.println(author + " is in our system and it's available.");
                return inOrOut;
            }

        }
        System.out.println(author + " is not available!");

        return inOrOut;

    }

    // Search for genre and check if book is available.
    public static boolean searchGenreAndCheckIfAvailable(String genre) {

        boolean inOrOut = false;

        for (int i = 0; i < Book.books.size(); i++) {

            if (genre.equals(Book.books.get(i).getGenre()) && Book.books.get(i).isNotBorrowed() == true) {
                inOrOut = true;
                System.out.println(Book.books.get(i).getTitle() + " Written by: " + Book.books.get(i).getAuthor() + " is in our system and it's available.");
                return inOrOut;
            }

        }
        System.out.println(genre + " is not available!");

        return inOrOut;
    }

    // Search for release date and check if book is available.
    public static boolean searchReleaseDateAndCheckIfAvailable(String date) {

        boolean inOrOut = false;

        for (int i = 0; i < Book.books.size(); i++) {

            if (date.equals(Book.books.get(i).getReleased()) && Book.books.get(i).isNotBorrowed() == true) {
                inOrOut = true;
                System.out.println("'" + Book.books.get(i).getTitle() + "'" + " released in " + date + " is in our system and it's available.");
                return inOrOut;
            }

        }
        System.out.println(date + " is not available!");

        return inOrOut;

    }

    // Borrow a book.
    public static boolean borrowABook() {

        // Check title and set isNotBorrowed() = false.
        String bookTest = "Harry Potter";

        for (int i = 0; i < Book.books.size(); i++) {

            if (bookTest.equals(Book.books.get(i).getTitle()) && Book.books.get(i).isNotBorrowed() == true){
                Book.books.get(i).setIsNotBorrowed(false);
                /*
                Add method for payment system when book is borrowed.
                 */
                System.out.println(Book.books.get(i).getTitle() + " is now borrowed.");
                return true;
            }
            else {
                System.out.println("The book is not in store.");
            }

        }

        return false;

    }

    public static void leaveCommentAndScore() {

        String bookTest = "Harry Potter";
        int newScore = 5;
        String newComment = "New comment!";

        for (int i = 0; i < Book.books.size(); i++) {

            if (bookTest.equals(Book.books.get(i).getTitle())){
                Book.books.get(i).setScore(newScore);
                Book.books.get(i).setComments(newComment);
                System.out.println(Book.books.get(i).getScore() + " out of 10!");
                System.out.println(Book.books.get(i).getComments());
                break;
            }
            else {
                System.out.println("Something went wrong.");
            }

        }

    }

    public static int searchForHighestScore() {

        // Alternative for getting the highest score of the books.
        //int maxScore = Book.books.stream().map(e -> e.getScore()).max(Integer::compare).get();

        int maxScore = -2;
        String y="";

        for (int j=0; j< Book.books.size(); j++){
            if (Book.books.get(j).getScore()>maxScore) {
                maxScore=Book.books.get(j).getScore();
                y=Book.books.get(j).getTitle();
            }
        }

        System.out.println("The highest scored book is "+ "'" + y + "'" + " with a score of: " + maxScore);

        return maxScore;

    }



}
