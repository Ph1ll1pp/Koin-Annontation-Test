package de.test.koinannontationtest

import de.test.module1.Module1
import de.test.module2.Module2
import org.koin.core.annotation.Module

@Module(includes = [Module1::class, Module2::class])
class ModuleApp