/**
 * Created by swm on 2018-5-12
 */

package com.universal.demo.di

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject


// ============================================================
class Ship @Inject constructor(val engine: Engine, val sail: Sail, @Inject val rudder: Rudder) {
    @Inject
    lateinit var captain: Crew
}

class Crew @Inject constructor(val name: String)


// ============================================================
interface Engine {
    fun start()
    fun stop()

    fun forward()
    fun backward()
}

class ElectronicEngine @Inject constructor (val battery: Battery) : Engine {
    override fun start() {
    }

    override fun stop() {
    }

    override fun forward() {
    }

    override fun backward() {
    }
}

class Battery @Inject constructor()

class CombustionEngine: Engine {
    override fun start() {
    }

    override fun stop() {
    }

    override fun forward() {
    }

    override fun backward() {
    }
}


// ============================================================
interface Sail {
    fun raise()
    fun lower()
}

class LateenSail : Sail {
    override fun raise() {
    }

    override fun lower() {
    }
}


// ============================================================
class Rudder @Inject constructor()


// ============================================================
@Module
class ShipAssemblyModule {
    @Provides
    fun provideEngine() : Engine {
        return CombustionEngine()
    }

    @Provides
    fun provideSail() : Sail {
        return LateenSail()
    }

    @Provides
    fun provideRudder(): Rudder {
        return Rudder()
    }
}


// ============================================================
@Component(modules = [ShipAssemblyModule::class])
internal interface ShipFactory {
    fun maker(): Ship
}

// ============================================================
fun main(args: Array<String>) {
    val ship: Ship = DaggerShipFactory.builer().build()
    ship.engine.start()
}