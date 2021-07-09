package belajar.unit.test

import belajar.unit.test.resolver.RandomParameterResolver
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import java.util.*
import kotlin.test.assertEquals

@Extensions(value = [
    ExtendWith(RandomParameterResolver::class)
])
class RandomCalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testRandom(random: Random){
        val first = random.nextInt(1000)
        val second = random.nextInt(1000)
        val result = calculator.add(first, second)

        assertEquals(first+second, result)

    }

}