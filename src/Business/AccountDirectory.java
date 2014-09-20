/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public class AccountDirectory {
    private ArrayList<Account> accountDirectory;
    public AccountDirectory() {
        this.accountDirectory = new ArrayList<>();
    }

    public ArrayList<Account> getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(ArrayList<Account> accountDirectory) {
        this.accountDirectory = accountDirectory;
    }
    
    
}
