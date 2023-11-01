enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

val spaceUsername="vadwwxz"
val spacePassword="eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiI0NzJlaEQyazQxcXUiLCJhdWQiOiJjaXJjbGV0LXdlYi11aSIsIm9yZ0RvbWFpbiI6InZhZHltaHJ5bnlrIiwibmFtZSI6InZhZHd3eHoiLCJpc3MiOiJodHRwczpcL1wvdmFkeW1ocnlueWsuamV0YnJhaW5zLnNwYWNlIiwicGVybV90b2tlbiI6IjRkVXQ5eTRLSDVzaSIsInByaW5jaXBhbF90eXBlIjoiVVNFUiIsImlhdCI6MTY5ODc3NDI1MH0.QtygIg8QIa7PJ2eFs1fmIpT_6lFdlOd6qmqQ3BJIG8FkRg0QGt72oKZgLVf7qiAMz2O8WEAnp3uAQ260IKMMoJUXAHEZP5BPsmI17LTy59Elxqfe26RpNorbaFe_VDA8BUCkueAGWI9fjLOAWNT9MsHBXbTKX14Vtaw7QJhZ1FE"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/vadymhrynyk/p/main/cinematica-library") {
            credentials {
                username = "vadwwxz"
                password = "eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiI0NzJlaEQyazQxcXUiLCJhdWQiOiJjaXJjbGV0LXdlYi11aSIsIm9yZ0RvbWFpbiI6InZhZHltaHJ5bnlrIiwibmFtZSI6InZhZHd3eHoiLCJpc3MiOiJodHRwczpcL1wvdmFkeW1ocnlueWsuamV0YnJhaW5zLnNwYWNlIiwicGVybV90b2tlbiI6IjRkVXQ5eTRLSDVzaSIsInByaW5jaXBhbF90eXBlIjoiVVNFUiIsImlhdCI6MTY5ODc3NDI1MH0.QtygIg8QIa7PJ2eFs1fmIpT_6lFdlOd6qmqQ3BJIG8FkRg0QGt72oKZgLVf7qiAMz2O8WEAnp3uAQ260IKMMoJUXAHEZP5BPsmI17LTy59Elxqfe26RpNorbaFe_VDA8BUCkueAGWI9fjLOAWNT9MsHBXbTKX14Vtaw7QJhZ1FE"
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.pkg.jetbrains.space/vadymhrynyk/p/main/cinematica-library") {
            credentials {
                username = spaceUsername
                password = spacePassword
            }
        }
//        maven {
//            url = uri("https://maven.pkg.jetbrains.space/vadymhrynyk/p/main/cinematica")
//            credentials {
//                username = spaceUsername
//                password = spacePassword
//            }
//        }
    }
}

rootProject.name = "cinematica-client"

includeBuild("build-plugins/configurations")

include(
    ":preview",
)

include(
    ":navigation",
)

include(
    ":style-system",
)

include(
    ":localization",
    ":localization:compose",
)

include(
    ":platform:android",
    ":platform:desktop",
)