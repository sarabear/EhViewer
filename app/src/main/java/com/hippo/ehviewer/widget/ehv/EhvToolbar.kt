/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.widget.ehv

import android.content.Context
import android.support.v7.widget.Toolbar
import android.util.AttributeSet
import android.view.MotionEvent

/*
 * Created by Hippo on 2017/8/8.
 */

class EhvToolbar : Toolbar {

  constructor(context: Context): super(context)
  constructor(context: Context, attrs: AttributeSet?): super(context, attrs)

  private var isTouchEnabled = true

  fun setTouchEnabled(isTouchEnabled: Boolean) {
    this.isTouchEnabled = isTouchEnabled
  }

  override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
    // FIXME It breaks MotionEvent sequence, it's bad.
    return if (!isTouchEnabled) false else super.dispatchTouchEvent(ev)
  }
}
