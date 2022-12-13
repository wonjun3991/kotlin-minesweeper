package minesweeper

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test


internal class MapTest {
    @Test
    fun `지도는 높이와 너비를 가진다`() {
        val map = Map(Position(10, 10))

        map.maxSize.height shouldBe 10
        map.maxSize.width shouldBe 10
    }
}