package com.frogobox.keyboard.ui.keyboard.main

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.frogobox.keyboard.common.base.BaseKeyboard
import com.frogobox.keyboard.databinding.KeyboardMainHeaderBinding

/**
 * Created by Faisal Amir on 10/11/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class MainHeaderKeyboard(
    context: Context,
    attrs: AttributeSet?,
) : BaseKeyboard<KeyboardMainHeaderBinding>(context, attrs) {

    override fun setupViewBinding(): KeyboardMainHeaderBinding {
        return KeyboardMainHeaderBinding.inflate(LayoutInflater.from(context), this, true)
    }

    override fun onCreate() {

    }

}