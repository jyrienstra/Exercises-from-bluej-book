/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private boolean courseText; //Check if the book is used for a course

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        this.courseText = courseText;
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }
    
    // Add the methods here ...
    
    /**
     * Return the author of the book
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * Return the title of the book
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Return the ammount of pages of the book
     */
    public int getPages(){
        return pages;
    }
    
    /**
     * Print the author the book
     */
    public void printAuthor(){
        System.out.println("The author of te the book is " + author);
    }
    
    /**
     * Print the title of the book
     */
    public void printTitle(){
        System.out.println("The title of the book is " + title);
    }
    
    /**
     * Print the details of the book
     */
    public void printDetails(){
        System.out.println("Title= " + title + ", Author " + author + ", Amount of pages " + pages);
        System.out.println("The book is borrowed " + borrowed + " times");
        
        if(refNumber.length() > 0){
           System.out.println("Refnumber= " + refNumber);
        }else{
           System.out.println("No refnumber");
        }
    }
    
    /**
     * Set a referencenumber for a library
     */
    public void setRefNumber(String ref){
        if(ref != null && ref.length() >= 3){
            refNumber = ref;
        }else{
            System.out.println("Refnumber must be equal or bigger than 3 and can't be null");
        }
    }
    
    /**
     * Print the referencenumber of a library
     */
    public String getRefNumber(){
        return refNumber;
    }
    
    /**
     * Return the ammount of the times the book is borrowed
     */
     public int getBorrowed(){
        return borrowed;
    }
    
    /**
     * Set the borrowed +1 
     */
    public void setBorrowed(){
        borrowed += 1;
    }
    
    /**
     * Return true/false if the book is used for a course
     */
    public boolean isCourseText(){
        return courseText;
    }
}