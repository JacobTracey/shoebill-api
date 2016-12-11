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

package net.gtaun.shoebill.event.sampobject

import net.gtaun.shoebill.entities.SampObject
import net.gtaun.util.event.Event

/**
 * This class is the base class for all testing-related events.
 *
 * @author MK124
 * @author Marvin Haschker
 */
open class ObjectEvent(open val `object`: SampObject) : Event() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectEvent) return false

        if (`object` != other.`object`) return false

        return true
    }

    override fun hashCode(): Int {
        return `object`.hashCode()
    }


}
