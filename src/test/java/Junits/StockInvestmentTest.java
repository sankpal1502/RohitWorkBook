/*
package Junits;

import com.main.classes.Broker;
import com.main.classes.Exchange;
import com.main.classes.StockInvestment;
import com.main.classes.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("StockInvestmentTest")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StockInvestmentTest {
    User user;
    StockInvestment stockInvestment;
    Exchange exchange;
    Broker broker;

    @BeforeAll
    public void createStart() {
        System.out.println("StockInvestmentTest :: Initialized");
        stockInvestment = new StockInvestment();
        //Testing TestInstance scope
        stockInvestment.setId("1_instance");
    }

    @BeforeEach
    public void createUser() {
        user = new User();
        user.setName("Rohit");
        user.setCashBalance(100000);
        stockInvestment.getUserList().add(user);
        exchange = Mockito.mock(Exchange.class);
        broker = Mockito.spy(Broker.class);

    }

    @Test
    @Order(2)
    @Tag("Production")
    public void buyTicker() {
        var x = 10;
        var y = "Rohit";
        System.out.println("Printing VAR variables" + x + " " + y);
        //Connect Client to Exchange , mock it is always true
        Mockito.when(exchange.getConnection()).thenReturn(true);

        //Executing Trade on common Utility class
        boolean result = stockInvestment.buyStock("APPL", 50, 100);

        //Based on above result adapting changes in Client Demat Account
        if (result) {
            user.addInventory("APPL", 50, 100);
            user.addInventory("PayPal", 50, 100);
            user.addInventory("AMAZON", 50, 100);
            //Based on changes in Inventory , adjust the price
            long newbalance = Math.subtractExact(user.getCashBalance(), Math.multiplyExact(150, 100));
            user.setCashBalance(newbalance);
            System.out.println("User Account Details" + user.toString());
            System.out.println("Mock method exchange.getConnection() :: " + exchange.getConnection());
            assertEquals(85000, user.getCashBalance());
            assertEquals(true, exchange.getConnection());
        } else {
            System.out.println("Trade not Executed on Exchange");
        }
        System.out.println("buyTicker() executed");
    }

    @RepeatedTest(1)
    @DisplayName("Selling Ticker")
    @Order(1)
    public void sellTicker() {

        //Testing TestInstance
        System.out.println("TestInstance ID across test methods()" + stockInvestment.getId());
        //Connect To Exchange
        Mockito.when(exchange.getConnection()).thenReturn(true);

        //Execute Order using Utility class
        boolean result = stockInvestment.sellStock("APPL", 25, 100);

        //add to Inventory
        user.addInventory("APPL", 50, 100);

        //Sell From Inventory
        assumeTrue(result);
        user.updateInventory("APPL", 25, 100);

        //Assert the results
        assertEquals(100, user.getStockPosition().get("APPL").getPrice());
        System.out.println("sellTicker() executed");
    }

    @Test
    @Tag("QA")
    @Order(3)
    public void mockitoTest() {

        //Need to check Broker Connection UP or Down
        Mockito.when(exchange.getConnection()).thenReturn(false);

        assumeFalse(exchange.getConnection());
        //Mockito.when(exchange.getBrokerConnection()).thenThrow(new Exception());

        // assertThrows(ArithmeticException.class, ()-> Math.floorDiv(1,0));
        int x = 2, y = 3;
        assertAll(() -> assertEquals(2, 2), () -> assertEquals(3, 3));

    }

    @ParameterizedTest
    @DisplayName("Get Customer Details Test")
    @CsvSource("Rohit")
    public void getCustomerDetails(String custName) {

        //Get Customer Details from User functionality
        long result = stockInvestment.getCustomerDetails(custName);
        assertEquals(100000, result);

    }

    @AfterAll
    public void testClose() {
        System.out.println("StockInvestmentTest :: Completed");
    }
}
*/
