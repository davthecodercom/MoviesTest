import version.AndroidTestVersions
import version.TestVersions

object AndroidTestDependencies {

    const val JUnit = "androidx.test.ext:junit:${AndroidTestVersions.JUnit}"
    const val EspressoCore = "androidx.test.espresso:espresso-core:${AndroidTestVersions.EspressoCore}"
    const val Mockk = "io.mockk:mockk-android:${TestVersions.Mockk}"

}