package com.richmondjava.intro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BankAccountValidationTests {

    private BankAccount bankAccount;

    @Before
    public void setUpContext(){
        bankAccount = new BankAccount();
    }

    @Test
    public void shouldValidateSuccessfullyForSixCharactersInSortCode(){
        bankAccount.setSortCode("124578");
        assertTrue(bankAccount.isSortCodeValid());
    }

    @Test
    public void shouldNotBeValidIfSortCodeHasLessThanSixCharacters(){
        bankAccount.setSortCode("124");
        assertFalse(bankAccount.isSortCodeValid());
    }

    @Test
    public void shouldNotBeValidIfSortCodeHasLetters(){
        bankAccount.setSortCode("ABC123");
        assertFalse(bankAccount.isSortCodeValid());
    }

    @Test
    public void shouldValidateSuccessfullyForNineCharactersInAccountNumber(){
        bankAccount.setAccountNumber("123456789");
        assertTrue(bankAccount.isAccountNumberValid());
    }

    @Test
    public void shouldNotBeValidIfAccountNumberHasLessThanNineCharacters(){
        bankAccount.setAccountNumber("123");
        assertFalse(bankAccount.isAccountNumberValid());
    }

    @Test
    public void shouldNotBeValidIfAccountNumbersHasLetters(){
        bankAccount.setAccountNumber("ABC456789");
        assertFalse(bankAccount.isAccountNumberValid());
    }
}
