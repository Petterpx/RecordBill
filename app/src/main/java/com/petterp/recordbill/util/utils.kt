package com.petterp.recordbill.util

import androidx.annotation.StringRes
import com.petterp.recordbill.BillApplication

/**
 *
 * @author petterp
 */

fun getString(@StringRes res: Int) =
    BillApplication.context.getString(res)
