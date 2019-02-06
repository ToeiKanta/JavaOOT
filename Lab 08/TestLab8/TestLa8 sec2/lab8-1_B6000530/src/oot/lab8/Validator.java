/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab8;

public abstract class Validator {
    private String username, password; 
    public Validator(String username, String password) {         
        this.username = username;         
        this.password = password;     
    } 
    public boolean checkPasswordIsLongerThanEightChars() {         
        return password.length()>8 ? true:false;    //3  password.length()>8 ? true:false
        // 3 เอาไว้เช็คว่ารหัสมีความยาวเกิน 8 ตัวอักษรหรือไม่ ถ้าใช่ ส่งค่า true ถ้าไม่ใช่ ส่ง false
    } 
    public boolean checkPasswordIsDigitOnly() {         
        for (int i=0; i < password.length(); i++) {             
            if(!Character.isDigit(password.charAt(i)))      //4  !Character.isDigit(password.charAt(i))   
            return false;         
        }         
        return true;     
    } 
    public boolean checkUsernameIsLowercase() {      
        return username.toLowerCase() == username ? true : false;    //5  temp.toLowerCase() == username ? true : false
        // ฟังก์ชัน toLowerCase() เอาไว้ดูค่าสตริงที่เป็นตัวพิมพ์เล็กเท่านั้น โดยค่าในตัวแปรเดิมไม่เปลี่ยนแปลง
        // หากสตริงพิมพ์เล็ก เท่ากับ ค่าตัวแปรเดิมของมัน แสดงว่าค่าเดิมของมันเป็นพิมพ์เล็กอยู่แล้ว จึงส่งค่ากลับเป็น true
    }
}
