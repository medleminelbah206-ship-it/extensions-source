import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "HentaiMilfToon"
    versionCode = 2
    contentWarning = ContentWarning.MIXED
    libVersion = "1.5"
    theme = "madara"

    source {
        lang = "en"
        baseUrl = "https://www.hentaimilftoon.com"
    }
}
