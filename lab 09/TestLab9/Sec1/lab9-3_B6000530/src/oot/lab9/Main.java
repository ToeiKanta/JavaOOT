/*
run:
Valid: 1413401458013
Contain not digits : 205410a109128
Length not match : 9901501790
Valid: 1411500012547
Length not match : 20a
 */
package oot.lab9;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonalID[] personal = new PersonalID[5];
        personal[0] = new PersonalID("1413401458013");
        personal[1] = new PersonalID("205410a109128");
        personal[2] = new PersonalID("9901501790");
        personal[3] = new PersonalID("1411500012547");
        personal[4] = new PersonalID("20a");
        for(PersonalID p : personal){
            try{
                String id = p.getId();
                validate(id);
            }catch(NonDigitException | LengthNotMatchException e){
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    private static void validate(String id) throws LengthNotMatchException,NonDigitException{
        if(id.length() != 13){
            throw new LengthNotMatchException("Length not match : " + id);
        }
        for(int i = 0;i<id.length();i++){
            if(!Character.isDigit(id.charAt(i))){
                throw new NonDigitException("Contain not digits : " + id);
            }
        }
        System.out.println("Valid: " + id);
    }
    
}
