package com.sundarban.pickndrop.utils.validation

import java.util.regex.Pattern

/**
 * Created by Kazi Md. Saidul Email: Kazimdsaidul@gmail.com  Mobile: +8801675349882 on 8/3/21.
 */
class Validator {
    companion object {
        fun nidValidation(nid: String): Boolean {
            val testPattern: Pattern = Pattern.compile("^(\\d{10}|\\d{13}|\\d{17})\$")
            return testPattern.matcher(nid).matches()
        }
    }
}