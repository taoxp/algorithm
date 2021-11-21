package com.taoxp.jike.homework.week1;

/**
 * @author: taoxp
 * @create: 2021-11-21 18:19
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] newDigits = digits;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                return newDigits;
            }
            if(i==0&&digits[i]==9){
                newDigits = new int[digits.length+1];
                newDigits[0]=1;
            }
            if(digits[i]==9){
                digits[i]=0;
            }
        }

        return newDigits;
    }
}
