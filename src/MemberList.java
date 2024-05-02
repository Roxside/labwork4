
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import javax.swing.JOptionPane;

public class MemberList {

	public static List<Member> MemberList = new ArrayList<>();

	
	public static List<Member> Search(String Name, String Surname) {
            ArrayList<String> memberIDs = new ArrayList<>();
            for (int i = 0; i <MemberList.size(); i++) {
                if(MemberList.get(i).getName().contains(Name)) {
                    memberIDs.add(MemberList.get(i).getMemberID());
                }
                else if(MemberList.get(i).getSurname().contains(Surname)) {
                     memberIDs.add(MemberList.get(i).getMemberID());
                }
            }
          return CreateMatchList(memberIDs);
	}

	
	public static List<Member> CreateMatchList(List<String> memberIDs) {
            ArrayList<Member> requestedMembers = new ArrayList<>();
            for (int i = 0; i < memberIDs.size(); i++) {
                for (Member e : MemberList) {
                    if(e.getMemberID().equals(memberIDs.get(i))) {
                       requestedMembers.add(e);
                    }
                }
            }
            return requestedMembers;
	}

	
	public static boolean Remove(Member m,Book b) {
             for (int i = 0; i < m.getLoanList().size(); i++) {
                if(m.getLoanList().get(i).getBookID().equals(b.getBookID())){
                   m.getLoanList().remove(i);
                   return true;
                }
            }
          return false;
	}
        
        public static void SaveChanges() {
            try {
                Formatter f = new Formatter(new File("files/Loans.txt"));
                String output = "";
                for (int i = 0; i <MemberList.size(); i++) {
                    for (int j = 0; j < MemberList.get(i).getLoanList().size(); j++) {
                        output+= MemberList.get(i).getMemberID()+"##"+MemberList.get(i).getLoanList().get(i).getBookID()+"\n";
                    }
                }
                f.format(output);
                f.close();
            } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Error While Saving!","Error!",JOptionPane.ERROR_MESSAGE);
            }
        }

}