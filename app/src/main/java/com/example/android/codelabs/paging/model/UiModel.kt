package com.example.android.codelabs.paging.model

sealed class UiModel {
    data class RepoItem (val repo: Repo) : UiModel()
    data class SeparatorItem (val description: String) : UiModel()
}

val UiModel.RepoItem.roundedStarCount: Int
    get() = this.repo.stars / 10_000
