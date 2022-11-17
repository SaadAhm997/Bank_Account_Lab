import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTests {

    @Test
    public void testDeposit() {
        BankAccount accountTest = new BankAccount("Saad", "Ahmed", "24 Sep 1997", 1, 100000);
        accountTest.deposit(1);
        assertThat(accountTest.getBalance()).isEqualTo(100001);

    }
    @Test
    public void testWithdrawal() {
        BankAccount accountTest = new BankAccount("Saad", "Ahmed", "24 Sep 1997", 1, 100000);
        accountTest.withdawal(100000);
        assertThat(accountTest.getBalance()).isEqualTo(0);

    }

}


