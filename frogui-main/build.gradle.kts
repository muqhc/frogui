plugins {
    id("org.jetbrains.dokka") version "1.5.0"
    `maven-publish`
    signing
}

group = project.properties["group"]!! as String
version = project.properties["version"]!! as String

tasks {
    create<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }

    create<Jar>("dokkaJar") {
        archiveClassifier.set("javadoc")
        dependsOn("dokkaHtml")

        from("$buildDir/dokka/html/") {
            include("**")
        }
    }
}

publishing {
    repositories {
        mavenLocal()

        maven {
            name = "debug"
            url = rootProject.uri(".debug/libraries")
        }

        maven {
            name = "OSSRH"

            credentials {
                username = project.properties["ossrhUsername"]!! as String
                password = project.properties["ossrhPassword"]!! as String
            }

            url = uri(
                if ("SNAPSHOT" in version as String) {
                    "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                } else {
                    "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                }
            )
        }


    }

    publications {
        create<MavenPublication>(rootProject.name) {

            groupId = project.properties["group"]!! as String
            artifactId = rootProject.name

            from(components["java"])
            artifact(tasks["sourcesJar"])
            artifact(tasks["dokkaJar"])

            pom {
                name.set(rootProject.name)
                description.set("the kotlin library providing DSL for Swing.")
                url.set("https://github.com/muqhc/${rootProject.name}")

                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/mit-license.php")
                    }
                }

                developers {
                    developer {
                        id.set("muqhc")
                        name.set("Muqhc")
                        email.set("muqhc07@gmail.com")
                        url.set("https://github.com/muqhc")
                        roles.addAll("developer")
                        timezone.set("Asia/Seoul")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/muqhc/${rootProject.name}.git")
                    developerConnection.set("scm:git:ssh://github.com:muqhc/${rootProject.name}.git")
                    url.set("https://github.com/muqhc/${rootProject.name}")
                }
            }
        }
    }
}

signing {
    isRequired = true
    useGpgCmd()
    sign(publishing.publications[rootProject.name])
}