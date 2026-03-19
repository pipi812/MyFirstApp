package com.zhenya.myfirstapp.util
import java.text.DecimalFormat

class FormatUtils {
    companion object {
        fun formatCount(count: Int): String {
            return when {
                count >= 1_000_000 -> {
                    val millions = count / 1_000_000.0
                    // Округляем до целого числа, если возможно
                    if ((millions * 10) % 10 <= 0.5) {
                        "${Math.round(millions)}M"
                    } else {
                        "%.1fM".format(millions)
                    }
                }
                count >= 10_000 -> {
                    // Не показывать дробные части от 10K до 999K
                    "${count / 1000}K"
                }
                count >= 1_000 -> {
                    val thousands = count / 1000.0
                    // Проверяем, целая тысяча или нет
                    if ((thousands * 10) % 10 <= 0.5) {
                        "${Math.round(thousands)}K"
                    } else {
                        "%.1fK".format(thousands)
                    }
                }
                else -> "$count"
            }
        }
    }
}
