package belajar.unit.test

import belajar.unit.test.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assumptions.*
import org.opentest4j.TestAbortedException
import java.lang.IllegalArgumentException

@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
class CalculatorTest {

    companion object{
        @BeforeAll
        @JvmStatic
        fun beforeAll(){
            println("Sebelum semua unit test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll(){
            println("Setelah semua unit test")
        }

    }

    val calculator = Calculator()

    @BeforeEach
    fun beforeEach(){
        println("Sebelum unit test")
    }

    @AfterEach
    fun afterEach(){
        println("Setelah unit test")
    }

    @Test
    fun testAddSuccess(){
        println("Unit test testAddSuccess")
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Harusnya 20")
    }

    @Test
    fun testAddSuccess2(){
        println("Unit test testAddSuccess2")
        val result = calculator.add(20, 20)
        assertEquals(40, result, "Harus 40")
    }

    @Test
    fun testDivideSucces(){
        println("Unit test testDivideSucces")
        val result = calculator.divide(100, 10)
        assertEquals(10, result)
    }

    @Test
    fun testDivideError(){
        println("Unit test testDivideError")
        assertThrows<IllegalArgumentException>{
            calculator.divide(20, 0)
        }
    }

    @Disabled("Sedang Diperbaiki")
    @Test
    fun testCominSoon(){

    }

    @Test
    fun testAborted(){
        val profile = System.getenv()["PROFILE"]
        if("DEV" != profile){
            throw TestAbortedException()
        }
        println("Test Not Aborted because Dev Profile")
    }

    @Test
    fun testAssumptions(){
        assumeTrue("DEV" == System.getenv()["PROFILE"])

        println("Test Not Aborted Because Dev Profile")

    }

}