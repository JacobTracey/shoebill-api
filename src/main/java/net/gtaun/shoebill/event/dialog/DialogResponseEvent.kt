/**
 * Copyright (C) 2011 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.event.dialog

import net.gtaun.shoebill.entities.DialogId
import net.gtaun.shoebill.entities.Player

/**
 * This event will be called when the [dialog] responded.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class DialogResponseEvent(dialog: DialogId, player: Player, val dialogResponse: Int, val listItem: Int,
                          val inputText: String) : DialogEvent(dialog, player) {
    var response = 0
        private set

    /**
     * This method is an alias for the [interrupt] method.
     */
    fun setProcessed() {
        this.response = this.response or 1
        interrupt()
    }
}
