package ServicesTest;

import org.junit.Assert;



public final class Validator {

    private Validator() {

    }

    public static void validateEquals(final String errorMessage, final Object expected, final Object actual) throws Exception {
        try {
            Assert.assertEquals(expected, actual);
        } catch (final AssertionError e) {
            throw new Exception(errorMessage);
        }
    }

} 