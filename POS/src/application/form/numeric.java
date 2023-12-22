/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.application.form;

/**
 *
 * @author BilalSahi
 */
public class numeric {
    
     public static boolean isNumeric(String text) {
    if (text == null || text.trim().equals("")) {
        return false;
    }
    for (int iCount = 0; iCount < text.length(); iCount++) {
        if (!Character.isDigit(text.charAt(iCount))) {
            return false;
        }
    }
    return true;
}
    
    
}
