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

package net.gtaun.shoebill.event.`object`

import net.gtaun.shoebill.`object`.Player
import net.gtaun.shoebill.`object`.PlayerObject

/**
 * This event will be called when the [object] has been moved.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class PlayerObjectMovedEvent(playerObject: PlayerObject) : ObjectEvent(playerObject) {

    val player: Player
        get() = (`object` as PlayerObject).player

}
