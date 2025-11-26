package model;

import java.util.List;

import static model.BankService.ACCOUNT;

public class AccountWallet extends Wallet{

    private final List<String> pix;

    public AccountWallet(final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
    }

    public AccountWallet(final long amount, final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
        var moneyList = generateMoney(amount, "valor de criação da conta");
        this.money.addAll(moneyList);
    }

    public void addMoney(final long amount, final String description){
        var moneyList = generateMoney(amount, description);
        this.money.addAll(moneyList);
    }

    public List<String> getPix(){
        return this.pix;
    }

    @Override
    public String toString() {
        return super.toString() + "AccountWallet{" +
                "pix=" + pix +
                '}';
    }
}