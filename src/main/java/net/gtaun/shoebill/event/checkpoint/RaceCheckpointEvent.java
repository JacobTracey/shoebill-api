/**
 * Copyright (C) 2012 MK124
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

package net.gtaun.shoebill.event.checkpoint;

import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.RaceCheckpoint;
import net.gtaun.util.event.Event;

/**
 * This abstract class is the base class for every RaceCheckpointEvent.
 * 
 * @author MK124
 * @author Marvin Haschker
 */
public class RaceCheckpointEvent extends Event
{
	private Player player;
	private RaceCheckpoint checkpoint;

	protected RaceCheckpointEvent(Player player, RaceCheckpoint checkpoint)
	{
		this.player = player;
		this.checkpoint = checkpoint;
	}

    /**
     * @return The associated player for this checkpoint
     */
	public Player getPlayer()
	{
		return player;
	}

    /**
     * @return The associated RaceCheckpoint for this event.
     */
	public RaceCheckpoint getCheckpoint()
	{
		return checkpoint;
	}
}
