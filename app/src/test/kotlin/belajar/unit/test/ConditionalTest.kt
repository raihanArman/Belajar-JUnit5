package belajar.unit.test

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.condition.*

class ConditionalTest {

    @Test
    @EnabledOnOs(value = [OS.WINDOWS, OS.LINUX])
    fun enabledOnWindows(){
        // only run on Windows and Linux
    }

    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun disabledOnWindows(){
        // can not run on Windows
    }

    @Test
    @EnabledOnJre(value = [JRE.JAVA_14])
    fun onlyRunOnJava14(){

    }

    @Test
    @DisabledOnJre(value = [JRE.JAVA_14])
    fun disabledRunOnJava14(){

    }

}