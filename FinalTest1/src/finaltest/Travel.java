/*
run:
What is your name : Gabriel#Uriel#Raphael#Michael
Where will you go : JP#EU#EU#NA
How many weeks will you leave? : 1#2#3#3
Please input your pocket money : 1000#2000#3000#4000

Name: Gbrl
Town: JP
Days: 7
Yens: 3000.0

Name: Url
Town: EU
Days: 14
Euro: 66.66666666666667

Name: Rphl
Town: EU
Days: 21
Euro: 100.0

Name: Mchl
Town: error
Days: error
Money : error
 */
package finaltest;

public class Travel implements TravelSetting {
    private String [] name;
    private String [] town;
    private String [] weeks;
    private String [] pocketMoney;
    private Currency [] currency;
    
    public Travel(String name, String town, String weeks, String pocketMoney,String delimit) {
        this.name = stringSeperate(name, delimit);
        this.town = stringSeperate(town, delimit);
        this.weeks = stringSeperate(weeks, delimit);
        this.pocketMoney = stringSeperate(pocketMoney, delimit);
        currency = new Currency[this.name.length];
        for(int i = 0;i<this.name.length;i++){
            switch (this.town[i]) {
            case "EU":
                this.currency[i] = new EuroCurrency(this.pocketMoney[i]);
                break;
            case "JP":
                this.currency[i] = new YenCurrency(this.pocketMoney[i]);
                break;
            default:
                this.town[i] = "error";
                this.weeks[i] = "error";
                this.currency[i] = null;
                break;
        }
        }
        
    }
    
    
    @Override
    public void printResult(){
        for(int i =0;i<name.length;i++){
            System.out.println();
            System.out.println("Name: " + getName(name[i]));
            System.out.println("Town: " + town[i]);
            System.out.println("Days: " + getDays(weeks[i]));
            if(currency[i] == null){
                System.out.println("Money : error");
            }else{
                currency[i].printCurrency();
            }
        }
       
    }
    public String getName(String name){
        String newName = "";
        for(int i =0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                newName += "";
            }else{
                newName += name.charAt(i);
            }
        }
        return newName;
    }
    
    @Override
    public void getCurrencyInfomation() {
    }

    @Override
    public String [] stringSeperate(String str , String delimit) {
        String[] t = str.split(delimit);
        return t;
    }

    @Override
    public String getDays(String weeks) {
        if(weeks == "error")
            return "error";
        return String.valueOf(Integer.valueOf(weeks)*7);
    }
}
