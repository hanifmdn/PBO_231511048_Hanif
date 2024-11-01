import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

// Class Flight
//public class AirportTest {
//    @DisplayName("Given there is an economy flight")
//    @Nested
//    class EconomyFlightTest {
//        private Flight economyFlight;
//
//        @BeforeEach
//        void setUp() {
//            economyFlight = new Flight("1", "Economy");
//        }
//
//        @Test
//        public void testEconomyFlightRegularPassenger() {
//            Passenger mike = new Passenger("Mike", false);
//            assertEquals("1", economyFlight.getId());
//            assertTrue(economyFlight.addPassenger(mike));
//            assertEquals(1, economyFlight.getPassengersList().size());
//            assertEquals("Mike", economyFlight.getPassengersList().getFirst().getName());
//            assertTrue(economyFlight.removePassenger(mike));
//            assertEquals(0, economyFlight.getPassengersList().size());
//        }
//
//        @Test
//        public void testEconomyFlightVipPassenger() {
//            Passenger james = new Passenger("James", true);
//            assertEquals("1", economyFlight.getId());
//            assertTrue(economyFlight.addPassenger(james));
//            assertEquals(1, economyFlight.getPassengersList().size());
//            assertEquals("James", economyFlight.getPassengersList().getFirst().getName());
//            assertFalse(economyFlight.removePassenger(james));
//            assertEquals(1, economyFlight.getPassengersList().size());
//        }
//    }
//
//    @DisplayName("Given there is a business flight")
//    @Nested
//    class BusinessFlightTest {
//        private Flight businessFlight;
//
//        @BeforeEach
//        void setUp() {
//            businessFlight = new Flight("2", "Business");
//        }
//
//        @Test
//        public void testBusinessFlightRegularPassenger() {
//            Passenger mike = new Passenger("Mike", false);
//            assertFalse(businessFlight.addPassenger(mike));
//            assertEquals(0, businessFlight.getPassengersList().size());
//            assertFalse(businessFlight.removePassenger(mike));
//            assertEquals(0, businessFlight.getPassengersList().size());
//        }
//
//        @Test
//        public void testBusinessFlightVipPassenger() {
//            Passenger james = new Passenger("James", true);
//            assertTrue(businessFlight.addPassenger(james));
//            assertEquals(1, businessFlight.getPassengersList().size());
//            assertFalse(businessFlight.removePassenger(james));
//            assertEquals(1, businessFlight.getPassengersList().size());
//        }
//    }
//}


// Abstract class Flight
public class AirportTest {
    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;
        private Passenger mike;
        private Passenger james;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
            mike = new Passenger("Mike", false);
            james = new Passenger("James", true);
        }

        @Nested
        @DisplayName("When we have a regular passenger")
        class RegularPassenger {
            @Test
            @DisplayName("Then you can add and remove him from an economy flight")
            public void testEconomyFlightRegularPassenger() {
                assertAll(
                        "Verify all conditions for a regular passenger and an economy flight",
                        () -> assertEquals("1", economyFlight.getId()),
                        () -> assertTrue(economyFlight.addPassenger(mike)),
                        () -> assertEquals(1, economyFlight.getPassengersList().size()),
                        () -> assertEquals("Mike", economyFlight.getPassengersList().getFirst().getName()),
                        () -> assertTrue(economyFlight.removePassenger(mike)),
                        () -> assertEquals(0, economyFlight.getPassengersList().size())
                );
            }
        }

        @Nested
        @DisplayName("When we have a VIP passenger")
        class VipPassenger {
            @Test
            @DisplayName("Then you can add him but cannot remove him from an economy flight")
            public void testEconomyFlightVipPassenger() {
                assertAll(
                        "Verify all conditions for a VIP passenger and an economy flight",
                        () -> assertEquals("1", economyFlight.getId()),
                        () -> assertTrue(economyFlight.addPassenger(james)),
                        () -> assertEquals(1, economyFlight.getPassengersList().size()),
                        () -> assertEquals("James", economyFlight.getPassengersList().getFirst().getName()),
                        () -> assertFalse(economyFlight.removePassenger(james)),
                        () -> assertEquals(1, economyFlight.getPassengersList().size())
                );
            }
        }
    }

    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        private Passenger mike;
        private Passenger james;

        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
            mike = new Passenger("Mike", false);
            james = new Passenger("James", true);
        }

        @Nested
        @DisplayName("When we have a regular passenger")
        class RegularPassenger {
            @Test
            @DisplayName("Then you cannot add or remove him from a business flight")
            public void testBusinessFlightRegularPassenger() {
                assertAll(
                        "Verify all conditions for a regular passenger and a business flight",
                        () -> assertFalse(businessFlight.addPassenger(mike)),
                        () -> assertEquals(0, businessFlight.getPassengersList().size()),
                        () -> assertFalse(businessFlight.removePassenger(mike)),
                        () -> assertEquals(0, businessFlight.getPassengersList().size())
                );
            }
        }

        @Nested
        @DisplayName("When we have a VIP passenger")
        class VipPassenger {
            @Test
            @DisplayName("Then you can add him but cannot remove him from a business flight")
            public void testBusinessFlightVipPassenger() {
                assertAll(
                        "Verify all conditions for a VIP passenger and a business flight",
                        () -> assertTrue(businessFlight.addPassenger(james)),
                        () -> assertEquals(1, businessFlight.getPassengersList().size()),
                        () -> assertFalse(businessFlight.removePassenger(james)),
                        () -> assertEquals(1, businessFlight.getPassengersList().size())
                );
            }
        }
    }
}


