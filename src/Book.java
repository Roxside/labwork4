public class Book{

	private String BookID;
	private String ISBN;
        private String Author;
        private String Title;
	private String Status;

    public Book(String BookID, String ISBN, String Author, String Title, String Status) {
        this.BookID = BookID;
        this.ISBN = ISBN;
        this.Author = Author;
        this.Title = Title;
        this.Status = Status;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    public String [] toArray() {
     String [] arr  = new String[5];
     arr[0] = this.BookID;
     arr[1] = this.ISBN;
     arr[2] = this.Title;
     arr[3] = this.Author;
     return arr;
    }   
        
        

}