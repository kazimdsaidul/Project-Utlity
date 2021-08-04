package com.sundarban.pickndrop.utils.validation

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Created by Kazi Md. Saidul Email: Kazimdsaidul@gmail.com  Mobile: +8801675349882 on 8/3/21.
 */
class ValidatorTest {

    @Test
    fun NID_10_13_17check() {
        assertEquals(Validator.nidValidation("0123456789"), true)
        assertEquals(Validator.nidValidation("0123456789123"), true)
        assertEquals(Validator.nidValidation("01234567891234567"), true)

        assertEquals(Validator.nidValidation("343434345dfdff"), false)
        assertEquals(Validator.nidValidation("3e33343434343434343434343443"), false)
        assertEquals(Validator.nidValidation("34343434"), false)
        assertEquals(Validator.nidValidation("assdfdssdf"), false)
    }

}