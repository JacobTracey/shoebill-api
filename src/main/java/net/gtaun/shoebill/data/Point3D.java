/**
 * Copyright (C) 2011 JoJLlmAn
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

package net.gtaun.shoebill.data;

import java.io.Serializable;

import net.gtaun.shoebill.util.immutable.Immutable;
import net.gtaun.shoebill.util.immutable.Immutably;
import net.gtaun.shoebill.util.immutable.ImmutablyException;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author JoJLlmAn
 *
 */

public class Point3D extends Point2D implements Cloneable, Serializable, Immutable
{
	private static final long serialVersionUID = 8493095902831171278L;
	

	private static final class ImmutablyPoint3D extends Point3D implements Immutably
	{
		private static final long serialVersionUID = Point3D.serialVersionUID;
		
		private ImmutablyPoint3D( Point3D vector3d )
		{
			super( vector3d );
		}
		
		@Override
		public Point3D clone()
		{
			return new Point3D( this );
		}
	}
	
	
	private float z;
	
	
	public Point3D()
	{

	}

	public Point3D( float x, float y, float z )
	{
		super( x, y );
		this.z = z;
	}

	public Point3D( Point2D vec, float z )
	{
		super( vec );
		this.z = z;
	}
	
	public Point3D( Point3D vec )
	{
		super( vec );
		this.z = vec.getZ();
	}
	
	public float getZ()
	{
		return z;
	}
	
	public void setZ( float z )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		this.z = z;
	}

	public void set( float x, float y, float z )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( x, y );
		setZ( z );
	}
	
	public void set( Point2D vec, float z )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( vec );
		setZ( z );
	}
	
	public void set( Point3D vec )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( vec );
		setZ( vec.getZ() );
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(49979693, 573259433, this, false);
	}

	@Override
	public boolean equals( Object obj )
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Point3D clone()
	{
		return (Point3D) super.clone();
	}
	
	@Override
	public Point3D immure()
	{
		return new ImmutablyPoint3D(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}