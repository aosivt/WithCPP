package aos.mediator;

import org.junit.*;

public class TestChatMediator {
    ChatMediator mediator = new ChatMediatorImpl();
    User user1 = new UserImpl(mediator,"Pankaj");
    User user2 = new UserImpl(mediator,"Lisa");
    User user3 = new UserImpl(mediator,"Saurabh");
    User user4 = new UserImpl(mediator,"David");
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
//        mediator.addUser(user1);
//        mediator.addUser(user2);
//        mediator.addUser(user3);
//        mediator.addUser(user4);
    }

    @After
    public void afterTest() {
        mediator = null;
        user1 = null;
        user2 = null;
        user3 = null;
        user4 = null;
    }

    @Test
    public void testGetSum() throws Exception {
        user1.send("Hi All");
        user2.sendTo("Hi user3",3);
    }
}
