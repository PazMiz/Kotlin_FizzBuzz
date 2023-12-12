plugins {
    kotlin("multiplatform") version "1.6.10"
}

kotlin {
    jvm()
    ios {
        binaries.framework("FizzBuzzShared")
    }
}
