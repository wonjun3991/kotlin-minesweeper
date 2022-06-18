package minesweeper.domain

enum class SearchDirection(val addX: Int, val addY: Int) {
    UP(0, 1),
    UP_RIGHT(-1, 1),
    UP_LEFT(1, 1),
    DOWN(0, -1),
    DOWN_RIGHT(1, -1),
    DOWN_LEFT(-1, -1),
    RIGHT(1, 0),
    LEFT(-1, 0),
}
