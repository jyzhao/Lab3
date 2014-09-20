/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.Account;
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
    
    public Account createAndAddAccount() {
            Account account = new Account();
            accountDirectory.add(account);
            return account;
        }
    
    public void deleteAccount (Account account) {
        accountDirectory.remove(account);
    }
    
    public Account searchUsingAccountNumber (String accountNumber) {
        for (Account account: accountDirectory) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
}
