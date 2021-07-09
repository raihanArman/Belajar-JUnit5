package belajar.unit.test

import org.junit.jupiter.api.*

@DisplayName("Test with TestInfo")
class InformationTest {
    @Test
    @Tags(value = [
        Tag("Contoh1"),
        Tag("Contoh2")
    ])
    @DisplayName("sample test")
    fun sampleTest(testInfo: TestInfo){
        println(testInfo.displayName)
        println(testInfo.tags)
        println(testInfo.testClass)
        println(testInfo.testMethod)
    }
}