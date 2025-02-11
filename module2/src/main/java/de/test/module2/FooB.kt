package de.test.module2

import de.test.module3.FooBase
import org.koin.core.annotation.Factory

@Factory
class FooB : FooBase() {
    val text  = "text B"
}