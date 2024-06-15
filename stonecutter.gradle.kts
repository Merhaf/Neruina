plugins {
    id("dev.kikugie.stonecutter")
}
stonecutter active "1.20.6-neoforge" /* [SC] DO NOT EDIT */

stonecutter registerChiseled tasks.register("chiseledBuildAndCollect", stonecutter.chiseled) {
    group = "project"
    ofTask("buildAndCollect")
}

stonecutter registerChiseled tasks.register("chiseledPublishMods", stonecutter.chiseled) {
    group = "project"
    ofTask("publishMods")
}

stonecutter configureEach {
    val current = project.property("loom.platform")
    val platforms = listOf("fabric", "forge", "neoforge").map { it to (it == current) }
    consts(platforms)
}
