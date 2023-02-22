plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:common-lang3:3.12.0")
}



//java {
//    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
//}