/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

public class AlarmBeraksi {
    public static void main(String[] args){
        Alarmsebelum AlarmIndah = new Alarmsebelum();
            
        AlarmIndah.hidupkan();
        AlarmIndah.alarmNyala();
        AlarmIndah.matikan();
    }
}