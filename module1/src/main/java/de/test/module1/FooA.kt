package de.test.module1

import de.test.module3.FooBase
import org.koin.core.annotation.Factory

@Factory
class FooA : FooBase() {
    val text  = "text A"
}