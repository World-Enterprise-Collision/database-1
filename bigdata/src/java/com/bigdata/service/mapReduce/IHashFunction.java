/*

Copyright (C) SYSTAP, LLC 2006-2007.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

*/
package com.bigdata.service.mapReduce;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Interface for a hash function to be applied to the keys generated by an
 * {@link IMapTask}. The hash function (modulo the #of reduce tasks) is
 * used to assign the key-value pairs generated by an {@link IMapTask} to a
 * reduce task.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id$
 */
public interface IHashFunction extends Serializable {

    /**
     * The hash function used to assign map output keys to reduce tasks.
     * This is normally <code>hash(key) mod R</code>, where hash(key) is
     * {@link Arrays#hashCode(byte[])} and R is the #of reduce tasks.
     * 
     * @param key
     *            The key produced by an {@link IMapTask}.
     * 
     * @return The index of the reduce service on which the key-value pair
     *         will be written.
     */
    public int hashCode(byte[] key);
    
}