/* 
 * The contents of this file are subject to the Mozilla Public
 * License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * The Original Code is mozilla.org code.
 *
 * The Initial Developer of the Original Code is Sun Microsystems,
 * Inc. Portions created by Sun are
 * Copyright (C) 1999 Sun Microsystems, Inc. All
 * Rights Reserved.
 *
 * Contributor(s): 
 */
package org.mozilla.pluglet.mozilla;

/**
 * This interface is for setting up a range of bytes.
 */
public interface ByteRanges {
    /**
     * Sets a range of bytes, given an offset and a length. If offset is negative,
     * then the offset is from the end.<p>
     * @param offset This is the offset for the range of bytes -- from the 
     * beginning if offset is positive, from the end if offset is negative.<p>
     * @param length This is the length of the range of bytes; i.e., the number
     * of bytes.
     */
    public void addRange(int offset, int length);
}
