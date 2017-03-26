import org.junit.Test

class PalPermTest extends GroovyTestCase {


    @Test
    void testIsPalindromePermutation() {

        assertEquals(false, PalPerm.isPalindromePermutation("hi"))
        assertEquals(true,  PalPerm.isPalindromePermutation("i"))
        assertEquals(true,  PalPerm.isPalindromePermutation("abcab"))

    }
}
