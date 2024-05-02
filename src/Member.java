
import java.util.ArrayList;
import java.util.List;

public class Member {

	private String Name;
	private String Surname;
	private String MemberID;
	private List<Book> LoanList;

    public Member(String Name, String Surname, String MemberID) {
        this.Name = Name;
        this.Surname = Surname;
        this.MemberID = MemberID;
        this.LoanList = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    public List<Book> getLoanList() {
        return LoanList;
    }

    public void setLoanList(List<Book> LoanList) {
        this.LoanList = LoanList;
    }

    

    public String [] toArray() {
    String [] arr = new String[3];
    arr[0] = this.MemberID;
    arr[1] = this.Name;
    arr[2] = this.Surname;
    return arr;
    }
        
        

}