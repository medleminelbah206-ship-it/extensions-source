package eu.kanade.tachiyomi.extension.en.hentaimilftoon

import eu.kanade.tachiyomi.multisrc.madara.Madara
import keiyoushi.annotation.Source

@Source
abstract class HentaiMilfToon : Madara() {
    override val chapterMode = ChapterMode.MangaAjax
}
