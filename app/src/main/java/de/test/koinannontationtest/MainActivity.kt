package de.test.koinannontationtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.test.module1.FooA
import de.test.module2.FooB
import org.koin.android.ext.android.get
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startKoin {
            modules(ModuleApp().module)
        }
        val fooA = get<FooA>()
        println(fooA.text)
        val fooB = get<FooB>()
        println(fooB.text)
    }

}