/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (c) 2002-2007 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with muCommander; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package com.mucommander.ant.macosx;

import com.mucommander.xml.writer.XmlWriter;
import org.apache.tools.ant.BuildException;

/**
 *
 */
class BooleanValue implements InfoElement {
    public static final String ELEMENT_TRUE      = "true";
    public static final String ELEMENT_FALSE     = "false";
    private boolean value;

    public BooleanValue() {}
    public BooleanValue(boolean b) {setValue(b);}
    public void setValue(boolean b) {value = b;}

    public void write(XmlWriter out) throws BuildException {
        if(value)
            out.writeStandAloneElement(ELEMENT_TRUE);
        else
            out.writeStandAloneElement(ELEMENT_FALSE);
    }
}
