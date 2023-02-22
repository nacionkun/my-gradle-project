plugins {
    id("my-application")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}

//java {
//    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
//}