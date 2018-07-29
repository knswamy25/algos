package com.swamy.binary;


//Ths class converts integer to binary string
//Ex: 6 to "110"
public class IntegerToBinaryString {
    public static String intToBinaryStr(int intValue) {
        String targetStr = "";
        if (intValue == 0) {
            targetStr = "0";
            return targetStr;
        }
        while (intValue > 0) {
            int mod = intValue % 2;
            targetStr = mod + targetStr;
            intValue = intValue / 2;
        }
        return targetStr;
    }
    
    public static int binaryStrToBInt(String binStr) {
        /*int targetInt = 0;
        for (int i = binStr.length() - 1, j=0; i >= 0; i--,j++) { 
            if (binStr.charAt(i) == '1') {
                targetInt = targetInt + 1 * (int) Math.pow(2, j);
            }
        }   
        
        return targetInt; */
       // System.out.println(binaryStringToDecimal(binStr));
        return Integer.parseInt(binStr,2);
    }
    
    public static int binaryStringToDecimal(String biString){
        int n = biString.length();      
        int decimal = 0;
        for (int d = 0; d < n; d++){
          // append a bit=0 (i.e. shift left) 
          decimal = decimal << 1;
          System.out.println(d + " " + decimal);
          // if biStr[d] is 1, flip last added bit=0 to 1 
          if (biString.charAt(d) == '1'){
            decimal = decimal | 1; // e.g. dec = 110 | (00)1 = 111
            System.out.println(d + " " + decimal);
          }
        }
        return decimal;
      }
}
