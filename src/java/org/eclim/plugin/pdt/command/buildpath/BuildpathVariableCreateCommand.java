/**
 * Copyright (C) 2005 - 2009  Eric Van Dewoestine
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.eclim.plugin.pdt.command.buildpath;

import org.eclim.Services;

import org.eclim.command.AbstractCommand;
import org.eclim.command.CommandLine;
import org.eclim.command.Options;

import org.eclipse.core.runtime.Path;

import org.eclipse.dltk.core.DLTKCore;

/**
 * Command to create an build path variable.
 *
 * @author Eric Van Dewoestine
 */
public class BuildpathVariableCreateCommand
  extends AbstractCommand
{
  /**
   * {@inheritDoc}
   */
  public String execute(CommandLine commandLine)
    throws Exception
  {
    String name = commandLine.getValue(Options.NAME_OPTION);
    String path = commandLine.getValue(Options.PATH_OPTION);

    DLTKCore.setBuildpathVariable(name, new Path(path), null);

    return Services.getMessage("buildpath.variable.created", name);
  }
}