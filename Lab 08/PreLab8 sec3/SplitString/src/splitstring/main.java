/*
run:
Somsak is 20 years old and grade is 3.5
Somchai is 19 years old and grade is 2.89
Narong is 20 years old and grade is 3.15
 */
package splitstring;

/**
 *
 * @author All User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[]s = {"Somsak:20:3.50",
                     "Somchai:19:2.89",
                     "Narong:20:3.15"};
        Student[]st = new Student[s.length];
        addData(st,s);
        printData(st);
        
    }

    private static void addData(Student[] st, String[] s) {
        for(int i=0;i<s.length;i++){
            String[]t = s[i].split(":");
            st[i] = new Student();
            st[i].setName(t[0]);
            st[i].setAge(Integer.valueOf(t[1]));
            st[i].setGrade(Float.valueOf(t[2]));
        }
    }

    private static void printData(Student[] st) {
        for(Student s : st){
            System.out.println(s);
        }
    }
    
}
