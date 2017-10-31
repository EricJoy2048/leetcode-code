package com.learnning.leetcode.arraytag;

public class BitCharacters {
	public boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1)return true;
        if(bits.length == 2){
            if(bits[0] == 1)
                return false;
            else
                return true;
        }
        
        for(int i = 0 ; i < bits.length - 2 ; i++){
            if(bits[i] == 1){
                bits[i] = 0;
                bits[i+1] = 0;
            }
        }
        
        if(bits[bits.length-2] == 1)
            return false;
        else
            return true;
    }
}
